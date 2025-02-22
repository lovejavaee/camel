/*
 * Camel ApiName Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box.internal;

import org.apache.camel.support.component.ApiName;

/**
 * Camel {@link ApiName} Enumeration for Component Box
 */
public enum BoxApiName implements ApiName {

    COLLABORATIONS("collaborations"),

    COMMENTS("comments"),

    EVENT_LOGS("event-logs"),

    FILES("files"),

    FOLDERS("folders"),

    GROUPS("groups"),

    EVENTS("events"),

    SEARCH("search"),

    TASKS("tasks"),

    USERS("users");


    private final String name;

    private BoxApiName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
