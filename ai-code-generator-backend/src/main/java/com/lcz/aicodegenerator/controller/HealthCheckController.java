package com.lcz.aicodegenerator.controller;

import com.lcz.aicodegenerator.common.BaseResponse;
import com.lcz.aicodegenerator.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 1onetw
 * @version 1.0
 * @Description: 检查项目是否正常启动
 */
@RestController
@RequestMapping("/health")
public class HealthCheckController {
    @GetMapping()
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("ok");
    }
}
