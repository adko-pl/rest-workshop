package com.workshop.rest;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static com.stormpath.spring.config.StormpathWebSecurityConfigurer.stormpath;

/**
 * @since 1.0.RC6
 */
@Configuration
public class SpringSecurityWebAppConfig extends WebSecurityConfigurerAdapter {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .apply(stormpath()).and()
                .authorizeRequests()
                .antMatchers("/restricted").fullyAuthenticated()
                .antMatchers("/**").permitAll();
    }

}