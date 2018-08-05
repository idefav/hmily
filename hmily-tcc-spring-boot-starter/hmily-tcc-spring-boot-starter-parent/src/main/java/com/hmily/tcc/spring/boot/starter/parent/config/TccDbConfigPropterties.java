/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.hmily.tcc.spring.boot.starter.parent.config;

import com.hmily.tcc.common.config.TccDbConfig;
import com.hmily.tcc.spring.boot.starter.parent.HmilyTccStarterConstants;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuzishu
 * @version $Id TccDbConfigPropterties.java, v 0.1 2018-08-05 下午5:27 wuzishu Exp $$
 */
@ConfigurationProperties(prefix = HmilyTccStarterConstants.CONFIG_DB_PREFIX)
@Configuration
public class TccDbConfigPropterties extends TccDbConfig{
}
