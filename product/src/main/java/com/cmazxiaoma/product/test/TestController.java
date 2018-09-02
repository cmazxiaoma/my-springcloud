package com.cmazxiaoma.product.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cmazxiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2018/8/31 15:52
 */
@RestController
@RequestMapping("/product")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "msg: product test24234";
    }

}
