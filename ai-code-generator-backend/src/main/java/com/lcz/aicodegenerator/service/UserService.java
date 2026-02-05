package com.lcz.aicodegenerator.service;

import com.lcz.aicodegenerator.model.domain.User;
import com.lcz.aicodegenerator.model.dto.request.user.UserQueryRequest;
import com.lcz.aicodegenerator.model.dto.vo.LoginUserVO;
import com.lcz.aicodegenerator.model.dto.vo.UserVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * 用户 服务层。
 *
 * @author <a href="https://github.com/lunchangzhou">程序员论周</a>
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 对密码进行 md5 加盐加密
     * @param userPassword 用户密码
     * @return 加密后的结果
     */
    String getEncryptPassword(String userPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request 请求对象
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取用户登录视图对象
     *
     * @param user 实体对象
     * @return 用户登录视图对象
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取当前登录用户
     *
     * @param request 请求对象
     * @return 当前登录用户
     */
    LoginUserVO getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request 请求对象
     * @return 注销是否成功
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取用户视图对象
     * @param user 实体对象
     * @return 用户视图对象
     */
    UserVO getUserVO(User user);

    /**
     * 获取用户视图对象列表
     * @param userList 实体对象列表
     * @return 用户视图对象列表
     */
    List<UserVO> getUserVOList(List<User> userList);

    QueryWrapper getQueryWrapper(UserQueryRequest userQueryRequest);
}
