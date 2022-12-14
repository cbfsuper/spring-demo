package com.cbf.controller;

import com.cbf.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * @Author yingge
 * @Date 2022/9/10 14:55
 */
@Controller
public class AysncController {
    @Autowired
    PushService pushService; // 1.定时任务,定时更新DeferredResult

    /**
     * 2.使用 DeferredResult 作为返回值,DeferredResult值的更新在另一个线程
     * ,所以当 /defer接口实际计算很耗时 时,同时多个request就不会阻塞
     * @return
     */
    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String > deferredCall(){ // 2.返回给客户端 DeferredResult
        return pushService.getAsyncUpdate();
    }
}
