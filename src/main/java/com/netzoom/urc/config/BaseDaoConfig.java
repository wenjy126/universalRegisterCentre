package com.netzoom.urc.config;

import com.netzoom.common.util.BaseDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置BaseDao
 *
 * @author wenjy
 * @CreateTime 2019/9/2 15:04
 */
@Configuration
public class BaseDaoConfig {

    @Bean
    public BaseDAO getBaseDao() {
        return new BaseDAO();
    }

}
