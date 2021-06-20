package com.mousumi.consuldemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ApplicationConfig {

  @Value("${spring.consul.test}")     
  private String testKey;
  
}
