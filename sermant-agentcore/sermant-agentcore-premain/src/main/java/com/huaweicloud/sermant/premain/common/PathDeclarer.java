/*
 * Copyright (C) 2021-2021 Huawei Technologies Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huaweicloud.sermant.premain.common;

import java.io.File;

/**
 * 路径声明器，其中定义agent core中各个组成部分的位置
 *
 * @author HapThorin
 * @version 1.0.0
 * @since 2021-11-12
 */
public class PathDeclarer {
    private PathDeclarer() {
    }

    /**
     * 获取agent包所在目录
     *
     * @return agent包所在目录
     */
    public static String getAgentPath() {
        return new File(PathDeclarer.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent();
    }

    /**
     * 获取核心功能包目录
     *
     * @param agentPath agent路径
     * @return 核心功能包目录
     */
    public static String getCorePath(String agentPath) {
        return agentPath + File.separatorChar + "core";
    }

    /**
     * 获取引导包目录
     *
     * @param agentPath agent路径
     * @return 引导包目录
     */
    public static String getGodLibPath(String agentPath) {
        return agentPath + File.separatorChar + "god";
    }

    /**
     * 获取核心功能实现包目录
     *
     * @param agentPath agent路径
     * @return 核心功能实现包目录
     */
    public static String getImplementPath(String agentPath) {
        return agentPath + File.separatorChar + "implement";
    }

    /**
     * 获取公共第三方依赖目录
     *
     * @param agentPath agent路径
     * @return 核心功能实现包目录
     */
    public static String getCommonLibPath(String agentPath) {
        return agentPath + File.separatorChar + "common";
    }

    /**
     * 获取配置存储目录
     *
     * @param agentPath agent路径
     * @return 配置存储目录
     */
    public static String getPluginPackagePath(String agentPath) {
        return agentPath + File.separatorChar + "pluginPackage";
    }

    /**
     * 配置文件夹
     *
     * @param agentPath agent路径
     * @return 配置文件夹
     */
    private static String getConfigDirPath(String agentPath) {
        return agentPath + File.separatorChar + "config";
    }

    /**
     * 获取启动配置路径
     *
     * @param agentPath agent路径
     * @return 启动配置路径
     */
    public static String getBootConfigPath(String agentPath) {
        return getConfigDirPath(agentPath) + File.separatorChar + BootConstant.BOOTSTRAP_CONFIG_FILE_NAME;
    }

    /**
     * 获取agent core的统一配置
     *
     * @param agentPath agent路径
     * @return agent core的统一配置
     */
    public static String getConfigPath(String agentPath) {
        return getConfigDirPath(agentPath) + File.separatorChar + BootConstant.CORE_CONFIG_FILE_NAME;
    }

    /**
     * 获取插件设置配置
     *
     * @param agentPath agent路径
     * @return 插件设置配置
     */
    public static String getPluginSettingPath(String agentPath) {
        return getConfigDirPath(agentPath) + File.separatorChar + BootConstant.PLUGIN_SETTING_FILE_NAME;
    }

    /**
     * 获取logback日志配置
     *
     * @param agentPath agent路径
     * @return logback日志配置
     */
    public static String getLogbackSettingPath(String agentPath) {
        return getConfigDirPath(agentPath) + File.separatorChar + BootConstant.LOG_SETTING_FILE_NAME;
    }
}
