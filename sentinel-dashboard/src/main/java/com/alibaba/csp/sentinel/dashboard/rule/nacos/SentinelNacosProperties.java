package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Projectname: jxcc_sentinel_dashboard
 * @Filename: SentinelNacosProperties
 * @Author: raohongbin
 * @Data:2023/8/18 10:01
 * @Description: TODO
 */

@Component
@ConfigurationProperties(prefix = "sentinel.nacos")
public class SentinelNacosProperties {

    private String serverAddr;

    private String namespace;

    private String username;

    private String password;

    private String groupId = "DEFAULT_GROUP";

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}