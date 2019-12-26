/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: RegisterController
 * Author:   11580
 * Date:     2019/5/29 0029 22:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.cloudproviderdept8001.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/5/29 0029
 * @since 1.0.0
 */
@RestController
public class RegisterController {

    @Autowired
    DiscoveryClient discoveryClient;
    @GetMapping(value ="/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}
 

