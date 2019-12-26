/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: RestController
 * Author:   11580
 * Date:     2019/11/24 0024 18:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/11/24 0024
 * @since 1.0.0
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
 

