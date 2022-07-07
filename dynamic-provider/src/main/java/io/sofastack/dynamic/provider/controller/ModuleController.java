package io.sofastack.dynamic.provider.controller;

import cn.hutool.core.lang.id.NanoId;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guolei.sgl (glmapper_2018@163.com) 2020/6/13 2:36 PM
 * @since:
 **/
@RestController
// please add biz webContextPath which defined in sofa-ark-maven-plugin ahead of this
// for example: this can be accessed by 'provider/api/module'
@RequestMapping("api")
public class ModuleController {
    @RequestMapping("module")
    public String master(){
        return NanoId.randomNanoId() + "SUCCESS FROM MODULE";
    }
}
