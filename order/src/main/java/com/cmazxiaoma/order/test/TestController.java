package com.cmazxiaoma.order.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cmazxiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2018/8/31 15:51
 */
@RestController
@RequestMapping("/order")
public class TestController {

    @GetMapping("/getMsgForProduct")
    public String getMsgForProduct() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:9000/product/test", String.class);
    }
}
