package com.geo.tmt.regioncross.regioncross;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Log4j2
@RestController
public class DemoController {

    // 该接口提供给A项目进行ajax调用
    @RequestMapping(value = "/getBInfo", method = RequestMethod.GET)
    public Map<String, Object> getBInfo(HttpServletResponse response) {
        log.info("~~~~~~~~已经进入B项目~~~~~~~~~~~~");

        // 1、告诉客户端（浏览器 ）允许跨域访问 *表示所有域名都是可以 在公司中正常的代码应该放入在过滤器中 response.setHeader("Access-Control-Allow-Origin", "*");
        // 2、

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("retCode", "200");
        result.put("retMsg", "登陆成功");
        return result;
    }
}
