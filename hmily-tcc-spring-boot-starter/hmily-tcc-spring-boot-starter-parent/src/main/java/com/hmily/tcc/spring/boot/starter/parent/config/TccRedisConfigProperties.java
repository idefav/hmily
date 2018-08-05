/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.hmily.tcc.spring.boot.starter.parent.config;

import com.hmily.tcc.common.config.TccRedisConfig;
import com.hmily.tcc.spring.boot.starter.parent.HmilyTccStarterConstants;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuzishu
 * @version $Id TccRedisConfigProperties.java, v 0.1 2018-08-05 下午5:29 wuzishu Exp $$
 */
@Configuration
@ConfigurationProperties(prefix = HmilyTccStarterConstants.CONFIG_REDIS_PREFIX)
public class TccRedisConfigProperties extends TccRedisConfig{
}
