/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.hmily.tcc.spring.boot.starter.parent.config;

import com.hmily.tcc.common.config.TccFileConfig;
import com.hmily.tcc.spring.boot.starter.parent.HmilyTccStarterConstants;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuzishu
 * @version $Id TccFileConfigProperties.java, v 0.1 2018-08-05 下午5:31 wuzishu Exp $$
 */
@Configuration
@ConfigurationProperties(prefix = HmilyTccStarterConstants.CONFIG_FILE_PREFIX)
public class TccFileConfigProperties extends TccFileConfig{
}
