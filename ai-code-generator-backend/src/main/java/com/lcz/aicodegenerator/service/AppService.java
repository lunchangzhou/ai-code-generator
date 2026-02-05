package com.lcz.aicodegenerator.service;

import com.lcz.aicodegenerator.model.domain.App;
import com.lcz.aicodegenerator.model.domain.User;
import com.lcz.aicodegenerator.model.dto.request.app.AppQueryRequest;
import com.lcz.aicodegenerator.model.dto.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a href="https://github.com/lunchangzhou">程序员论周</a>
 */
public interface AppService extends IService<App> {

    AppVO getAppVO(App app);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    List<AppVO> getAppVOList(List<App> appList);

    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    String deployApp(Long appId, User loginUser);
}
