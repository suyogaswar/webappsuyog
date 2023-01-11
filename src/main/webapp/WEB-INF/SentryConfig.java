package com.index.jsp.config;

@configuration
public class SentryConfig {

    @Bean
    public HandlerExceptionResolver sentryExceptionResolver(){
     return new io.sentry.java.sentryExceptionResolver();
       }
}
