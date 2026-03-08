# 🤖 基于大语言模型的 AI 代码生成平台

<div align="center">

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Vue](https://img.shields.io/badge/Vue-3.3.0-4fc08d.svg)](https://vuejs.org/)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-blue.svg)](https://www.mysql.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

**一个基于对话式大语言模型的交互式 AI 代码生成平台**

[功能特性](#-功能特性) • [技术栈](#-技术栈) • [系统架构](#-系统架构) • [项目结构](#-项目结构)

</div>

---

## 📖 项目简介

随着人工智能技术的迅猛发展，大语言模型在代码理解和生成领域展现出了巨大的应用潜力。本项目旨在设计并实现一个基于对话式大语言模型的交互式AI代码生成平台，通过自然语言交互的方式，实现从需求描述到完整应用程序生成的端到端开发流程。

本平台集成了多智能体协作、流式交互反馈、可视化编辑和一键部署功能，为企业级AI辅助开发提供完整的解决方案，显著降低了软件开发的技术门槛，提升了开发效率。

---

## ✨ 功能特性

### 🔥 核心功能

| 功能模块 | 描述 |
|---------|------|
| **智能代码生成** | 通过自然语言描述需求，系统自动理解并生成相应代码，支持Vue、React、Spring Boot等多种技术栈 |
| **可视化编辑** | 提供所见即所得的编辑体验，支持组件拖拽、属性编辑、样式调整、实时预览 |
| **一键部署** | 自动执行构建命令，生成生产环境静态文件，提供可公开访问的URL |
| **应用管理** | 项目的完整生命周期管理，包括创建、编辑、删除、版本控制、代码下载 |
| **对话历史** | AI交互记录持久化，支持多轮对话上下文管理 |
| **用户管理** | 用户注册登录、角色权限分配、会话管理 |

### 🎯 系统角色

- **普通用户**：智能代码生成、可视化编辑、一键部署、应用管理、对话历史
- **管理员**：用户管理、应用管理、对话历史管理、系统设置、数据统计

---

## 🛠 技术栈

### 后端技术

| 技术 | 版本 | 说明 |
|-----|------|------|
| Java | 21 | 核心开发语言 |
| Spring Boot | 3.2.0 | 核心框架 |
| MyBatis-Flex | - | ORM框架，简化数据库操作 |
| LangChain4j | - | 大语言模型应用开发框架 |
| MySQL | 8.0 | 关系型数据库 |
| Maven | - | 项目构建管理 |

### 前端技术

| 技术 | 版本 | 说明 |
|-----|------|------|
| Vue.js | 3.3.0 | 渐进式JavaScript框架 |
| TypeScript | - | 类型安全的JavaScript超集 |
| Ant Design Vue | - | 企业级UI组件库 |
| Vite | - | 下一代前端构建工具 |

### AI模型支持

- 通义千问 (Qwen)
- DeepSeek
- OpenAI GPT系列

---

## 🏗 系统架构

```
┌─────────────────────────────────────────────────────────────────┐
│                         前端层 (Vue 3 + TypeScript)              │
│  ┌─────────────┐ ┌─────────────┐ ┌─────────────┐ ┌───────────┐ │
│  │  代码生成   │ │  可视化编辑  │ │  应用管理   │ │  用户管理  │ │
│  └─────────────┘ └─────────────┘ └─────────────┘ └───────────┘ │
└────────────────────────────┬────────────────────────────────────┘
                             │ RESTful API
┌────────────────────────────┴────────────────────────────────────┐
│                      后端层 (Spring Boot 3)                      │
│  ┌─────────────┐ ┌─────────────┐ ┌─────────────┐ ┌───────────┐ │
│  │ Controller  │ │  Service    │ │  Repository │ │  Security │ │
│  └─────────────┘ └─────────────┘ └─────────────┘ └───────────┘ │
└────────────────────────────┬────────────────────────────────────┘
                             │
        ┌────────────────────┼────────────────────┐
        │                    │                    │
┌───────┴───────┐   ┌────────┴────────┐   ┌──────┴──────┐
│  MySQL 8.0    │   │  LangChain4j    │   │  文件系统    │
│  数据持久化    │   │  AI智能体工作流  │   │  代码存储    │
└───────────────┘   └─────────────────┘   └─────────────┘
```

---

## 📁 项目结构

```
ai-code-generation-platform/
├── src/main/java/
│   └── com/example/
│       ├── controller/          # 控制器层
│       ├── service/             # 业务逻辑层
│       ├── repository/          # 数据访问层
│       ├── entity/              # 实体类
│       ├── dto/                 # 数据传输对象
│       ├── config/              # 配置类
│       ├── security/            # 安全相关
│       └── util/                # 工具类
├── src/main/resources/
│   ├── application.yml          # 应用配置
│   └── mapper/                  # MyBatis映射文件
├── frontend/                    # 前端项目
│   ├── src/
│   │   ├── views/               # 页面组件
│   │   ├── components/          # 通用组件
│   │   ├── api/                 # API接口
│   │   ├── store/               # 状态管理
│   │   └── utils/               # 工具函数
│   └── package.json
└── pom.xml                      # Maven配置
```

---

## 💾 数据库设计

### 核心数据表

#### 用户表 (user)

| 字段 | 类型 | 说明 |
|-----|------|------|
| id | BIGINT | 主键 |
| username | VARCHAR(50) | 用户账号 |
| password | VARCHAR(100) | 密码(MD5加盐加密) |
| nickname | VARCHAR(50) | 昵称 |
| avatar | VARCHAR(255) | 头像URL |
| email | VARCHAR(100) | 邮箱 |
| role | VARCHAR(20) | 角色(user/admin) |
| create_time | DATETIME | 创建时间 |

#### 应用表 (app)

| 字段 | 类型 | 说明 |
|-----|------|------|
| id | BIGINT | 主键 |
| name | VARCHAR(100) | 应用名称 |
| cover | VARCHAR(255) | 封面图片 |
| init_prompt | TEXT | 初始化提示词 |
| code_gen_type | VARCHAR(50) | 代码生成类型 |
| is_deployed | TINYINT | 部署标识 |
| deploy_time | DATETIME | 部署时间 |
| priority | INT | 优先级 |
| user_id | BIGINT | 创建用户ID |
| create_time | DATETIME | 创建时间 |

#### 对话历史表 (chat_history)

| 字段 | 类型 | 说明 |
|-----|------|------|
| id | BIGINT | 主键 |
| content | TEXT | 消息内容 |
| message_type | VARCHAR(20) | 消息类型(user/assistant) |
| app_id | BIGINT | 关联应用ID |
| user_id | BIGINT | 创建用户ID |
| create_time | DATETIME | 创建时间 |

---

## 🔧 核心功能实现

### 智能代码生成

```java
// 流式代码生成
Flux<String> codeStream = aiCodeGeneratorFacade.generateAndSaveCodeStream(
    message, codeGenTypeEnum, appId
);
return streamHandlerExecutor.doExecute(
    codeStream, chatHistoryService, appId, loginUser, codeGenTypeEnum
);
```

### 一键部署

```java
// Vue项目构建与部署
boolean buildSuccess = vueProjectBuilder.buildProject(sourceDirPath);
File distDir = new File(sourceDirPath, "dist");
FileUtil.copyContent(distDir, new File(deployDirPath), true);
```

### 对话历史加载

```java
// 游标分页加载历史记录
QueryWrapper queryWrapper = QueryWrapper.create()
    .eq(ChatHistory::getAppId, appId)
    .orderBy(ChatHistory::getCreateTime, false)
    .limit(1, maxCount);
List<ChatHistory> historyList = this.list(queryWrapper);
```

---

## 📊 系统测试

系统经过全面的黑盒测试，涵盖功能测试、性能测试、操作便捷性测试：

| 测试项 | 测试结果 |
|-------|---------|
| 登录功能 | ✅ 通过 |
| 智能代码生成 | ✅ 通过 |
| 应用管理 | ✅ 通过 |
| 一键部署 | ✅ 通过 |
| 用户管理 | ✅ 通过 |
| 对话历史管理 | ✅ 通过 |

**测试结论**：系统不仅实现了设计的初衷，在拓展性和稳定性上也很突出，能够完全契合用户的实际使用需求。代码生成准确率达到85%以上。
