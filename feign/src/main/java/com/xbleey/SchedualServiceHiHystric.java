/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: SchedualServiceHiHystric
 * Author:   11580
 * Date:     2019/12/25 0025 15:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey;

import com.xbleey.interfaces.FeignInterface;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/12/25 0025
 * @since 1.0.0
 */
@Component
public class SchedualServiceHiHystric implements FeignInterface {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry! My Dear," + name;
    }
}
