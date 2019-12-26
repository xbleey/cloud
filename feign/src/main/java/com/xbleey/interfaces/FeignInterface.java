/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: FeignInterface
 * Author:   11580
 * Date:     2019/12/25 0025 14:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.interfaces;

import com.xbleey.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 11580
 * @create 2019/12/25 0025
 * @since 1.0.0
 */
@FeignClient(value = "client",fallback = SchedualServiceHiHystric.class)
public interface FeignInterface {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
