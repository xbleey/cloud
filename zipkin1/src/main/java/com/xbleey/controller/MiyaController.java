/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: MiyaController
 * Author:   11580
 * Date:     2019/12/26 0026 16:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.controller;

import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/12/26 0026
 * @since 1.0.0
 */
@RestController
public class MiyaController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MiyaController.class);
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String home() {
        LOGGER.info("hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info() {
        LOGGER.info("info is being called");
        return restTemplate.getForObject("http://localhost:8007/info", String.class);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
 

