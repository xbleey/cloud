/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: HiController
 * Author:   11580
 * Date:     2019/12/25 0025 14:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.controller;

import com.xbleey.interfaces.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/12/25 0025
 * @since 1.0.0
 */
@RestController
public class HiController {


    @Autowired
    FeignInterface feignInterface;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return feignInterface.sayHiFromClientOne(name);
    }
}
