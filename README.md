# 基于大语言模型的 AI 代码生成平台

---

## 一、项目简介

随着人工智能技术的迅猛发展，大语言模型在代码理解和生成领域展现出了巨大的应用潜力。本项目旨在设计并实现一个基于对话式大语言模型的交互式 AI 代码生成平台，通过自然语言交互的方式，实现从需求描述到完整应用程序生成的端到端开发流程。

本平台集成了多智能体协作、流式交互反馈、可视化编辑和一键部署功能，为企业级 AI 辅助开发提供完整的解决方案，显著降低了软件开发的技术门槛，提升了开发效率。

---

## 二、技术选型
![1772952286439.png](https://wp-cdn.4ce.cn/v2/xUNsWNc.png)

### 后端
核心：
- SpringBoot 3.x 框架
- Java 21 虚拟线程
- MyBatis Flex 数据访问

AI 技术：
- LangChain4j 框架
- Tool Calling 工具调用
- Guardrails 护轨
- DeepSeek Chat/Reasoner 大模型
- Open AI ChatModel 接入

数据存储：
- MySQL 数据库
- Redis 分布式缓存
- COS 对象存储
- Caffeine 本地缓存

设计模式：
- 实战：门面模式、模板方法模式、策略模式、工厂模式、执行器模式

工具库：
- Redisson 流量保护 + 分布式 Session
- Selenium + WebDriver 浏览器自动化
- jsoup 解析库
- Hutool 工具库
- Lombok 注解库
- Knife4j + Swagger 接口文档

### 前端
核心：
- Vue3 + Composition API
- Ant Design Vue 组件库
- Markdown 渲染 + 代码高亮
- Pinia 全局状态管理
- Axios 请求库

工程化：
- Vite 构建工具
- TypeScript 类型安全
- ESLint 代码校验
- Prettier 代码美化
- OpenAPI 代码生成

### 工具
部署工具
- Nginx Web 服务器

开发工具
- Cursor 编辑器 AI Vibe Coding
- JetBrains IDEA 后端
- JetBrains WebStorm 前端

---

## 三、业务流程
### 核心业务流程
从用户注册登录 => 创建应用 => 修改应用 => 部署应用

![1772953050152.png](https://wp-cdn.4ce.cn/v2/gzkFLMG.png)

### 应用管理流程
普通用户管理自己的应用：

![1772953108073.png](https://wp-cdn.4ce.cn/v2/JNj5K8N.png)
管理员可以后台管理业务数据和监控系统状态：

![1772954374172.png](https://wp-cdn.4ce.cn/v2/3FeOUrD.png)

### 解决方案实战
AI 技术实战：
- LangChain4j AI 智能体开发
- AI 代码生成 Vibe Coding
- AI 智能路由
- AI 提示词编写及优化技巧
- AI 工具调用
- AI 流式输出
- AI 结构化输出
- AI 对话记忆持久化（基于 Redis）
- AI 对话记忆隔离
- AI 护轨

系统架构设计：
- 多层缓存架构实战
- 响应式编程实战
- 实战 5 大设计模式
- 多角度系统优化
- Nginx 静态网站服务及反向代理

经典业务：
- 后端代码生成
- 前端代码生成
- 动态部署服务设计实现
- Java 命令哈那个调用
- 数据管理能力
- 游标分页查询设计
- 数据库索引优化实战
- COS 对象存储实战
- 截图服务设计开发

安全与权限：
- 用户模块与 AOP 权限校验
- 流量保护

监控与可视化：
- ARMS 系统性能监控和可视化
- Prometheus + Grafana 业务指标监控和可视化

---

## 四、功能模块

### 用户模块
- 用户注册
- 用户登录
- 用户注销
- 获取当前登录用户信息
- 用户权限控制
- 【管理员】管理用户

### AI 代码生成模块
- 原生 HTML 项目生成
- 原生多文件项目生成
- Vue 工程项目生成
- AI 智能选择生成方案

### 应用模块
- 用户基础功能
  - 创建应用
  - 编辑应用信息
  - 删除自己的应用
  - 查看应用详情
  - 分页查询自己的应用列表
  - 查看精选应用列表
- 用户高级功能
  - 实时查看应用效果
  - 应用部署
  - 应用封面生成
  - 可视化编辑应用
  - 应用代码下载
- 管理功能
  - 管理所有引用
  - 设置精选应用
### 对话历史模块
- 对话管理
  - 保存用户消息
  - 保存 AI 回复消息
  - 游标分页查询对话历史
  - 删除对话记录
- 对话记忆
  - Redis 持久化会话记忆
  - 多轮对话上下文保持
  - 按应用隔离对话记忆
  - 从数据库加载历史对话
  - 对话记忆 TTL

---

## 五、架构设计
![1772954410487.png](https://wp-cdn.4ce.cn/v2/6jhSlHt.png)


