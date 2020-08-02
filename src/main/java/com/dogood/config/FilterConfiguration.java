package com.dogood.config;

import com.dogood.filter.UserFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<UserFilter> registrationBean(){
        FilterRegistrationBean<UserFilter> filterFilterRegistrationBean=new FilterRegistrationBean<>();

        filterFilterRegistrationBean.setFilter(new UserFilter());
        filterFilterRegistrationBean.addUrlPatterns("/users/*");
        return filterFilterRegistrationBean;
    }

}
