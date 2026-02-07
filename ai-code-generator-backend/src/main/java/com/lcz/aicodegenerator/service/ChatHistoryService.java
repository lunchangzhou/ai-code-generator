package com.lcz.aicodegenerator.service;

import com.lcz.aicodegenerator.model.domain.ChatHistory;
import com.lcz.aicodegenerator.model.domain.User;
import com.lcz.aicodegenerator.model.dto.request.chathistory.ChatHistoryQueryRequest;
import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;

import java.time.LocalDateTime;

/**
 * 对话历史 服务层。
 *
 * @author <a href="https://github.com/lunchangzhou">程序员论周</a>
 */
public interface ChatHistoryService extends IService<ChatHistory> {

    /**
     * 添加对话消息
     * @param appId 应用 id
     * @param message 消息
     * @param messageType 消息类型
     * @param userId 创建用户 id
     * @return 是否添加成功
     */
    boolean addChatMessage(Long appId, String message, String messageType, Long userId);

    /**
     * 根据应用 id 删除对话历史
     * @param appId 应用 id
     * @return 是否删除成功
     */
    boolean deleteByAppId(Long appId);

    /**
     * 根据查询请求类获取查询包装器
     * @param chatHistoryQueryRequest 查询请求类
     * @return 查询包装器
     */
    QueryWrapper getQueryWrapper(ChatHistoryQueryRequest chatHistoryQueryRequest);

    /**
     * 根据应用 id 分页获取对话历史
     * @param appId 应用 id
     * @param pageSize 每页大小
     * @param lastCreateTime 最后创建时间
     * @param loginUser 登录用户
     * @return 对话历史分页
     */
    Page<ChatHistory> listAppChatHistoryByPage(Long appId, int pageSize,
                                               LocalDateTime lastCreateTime,
                                               User loginUser);

    /**
     * 加载对话历史到记忆
     * @param appId 应用 id
     * @param chatMemory 记忆
     * @param maxCount 最大数量
     * @return 加载数量
     */
    int loadChatHistoryToMemory(Long appId, MessageWindowChatMemory chatMemory, int maxCount);
}
