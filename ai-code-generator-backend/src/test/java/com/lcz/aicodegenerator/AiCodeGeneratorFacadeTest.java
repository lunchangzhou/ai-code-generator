package com.lcz.aicodegenerator;

import com.lcz.aicodegenerator.core.AiCodeGeneratorFacade;
import com.lcz.aicodegenerator.model.dto.enums.CodeGenTypeEnum;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class AiCodeGeneratorFacadeTest {

    @Resource
    private AiCodeGeneratorFacade aiCodeGeneratorFacade;

    @Test
    void generateAndSaveCode() {
        File file = aiCodeGeneratorFacade.generateAndSaveCode("实现登录页, 不超过 20 行代码", CodeGenTypeEnum.HTML);
        Assertions.assertNotNull(file);
    }
}
