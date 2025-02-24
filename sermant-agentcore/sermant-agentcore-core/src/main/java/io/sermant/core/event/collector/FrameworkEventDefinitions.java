/*
 * Copyright (C) 2023-2023 Huawei Technologies Co., Ltd. All rights reserved.
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

package io.sermant.core.event.collector;

import io.sermant.core.event.EventLevel;
import io.sermant.core.event.EventType;

/**
 * Event definition for framework events
 *
 * @author luanwenfei
 * @since 2023-03-04
 */
public enum FrameworkEventDefinitions {
    /**
     * Sermant startup event definition
     */
    SERMANT_START("SERMANT_START", EventType.OPERATION, EventLevel.NORMAL),

    /**
     * Sermant transform success event definition
     */
    SERMANT_TRANSFORM_SUCCESS("SERMANT_TRANSFORM_SUCCESS", EventType.OPERATION, EventLevel.NORMAL),

    /**
     * Sermant transform failure event definition
     */
    SERMANT_TRANSFORM_FAILURE("SERMANT_TRANSFORM_FAILURE", EventType.OPERATION, EventLevel.NORMAL),

    /**
     * Sermant service startup event definition
     */
    SERMANT_SERVICE_START("SERMANT_SERVICE_START", EventType.OPERATION, EventLevel.NORMAL),

    /**
     * Sermant service stop event definition
     */
    SERMANT_SERVICE_STOP("SERMANT_SERVICE_STOP", EventType.OPERATION, EventLevel.NORMAL),

    /**
     * Sermant plugin load event definition
     */
    SERMANT_PLUGIN_LOAD("SERMANT_PLUGIN_LOAD", EventType.OPERATION, EventLevel.NORMAL),

    /**
     * Sermant stop event definition
     */
    SERMANT_STOP("SERMANT_STOP", EventType.OPERATION, EventLevel.NORMAL),

    /**
     * Sermant plugin installation event definition
     */
    SERMANT_PLUGIN_INSTALL("SERMANT_PLUGIN_INSTALL", EventType.OPERATION, EventLevel.NORMAL),

    /**
     * Sermant plugin uninstallation event definition
     */
    SERMANT_PLUGIN_UNINSTALL("SERMANT_PLUGIN_UNINSTALL", EventType.OPERATION, EventLevel.NORMAL),

    /**
     * Sermant plugin update event definition
     */
    SERMANT_PLUGIN_UPDATE("SERMANT_PLUGIN_UPDATE", EventType.OPERATION, EventLevel.NORMAL);

    /**
     * event name
     */
    private final String name;

    private final EventType eventType;

    private final EventLevel eventLevel;

    FrameworkEventDefinitions(String name, EventType eventType, EventLevel eventLevel) {
        this.name = name;
        this.eventType = eventType;
        this.eventLevel = eventLevel;
    }

    public String getName() {
        return name;
    }

    public EventType getEventType() {
        return eventType;
    }

    public EventLevel getEventLevel() {
        return eventLevel;
    }

    /**
     * get event scope
     *
     * @return framework
     */
    public String getScope() {
        return "framework";
    }
}
