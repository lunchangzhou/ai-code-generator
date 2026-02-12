package com.lcz.aicodegenerator.service;

import jakarta.servlet.http.HttpServletResponse;

/**
 * @author 1onetw
 * @version 1.0
 * @Description:
 */
public interface ProjectDownloadService {
    /**
     * 下载项目为ZIP文件
     * @param projectPath 项目路径
     * @param downloadFileName 下载的文件名
     * @param response HTTP响应对象
     */
    void downloadProjectAsZip(String projectPath, String downloadFileName, HttpServletResponse response);
}
