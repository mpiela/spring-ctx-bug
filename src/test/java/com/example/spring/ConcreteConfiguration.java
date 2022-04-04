package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConcreteConfiguration extends BaseConfiguration {

  @Override
  @Bean
  public SecondaryBean secondaryBean() {
    return new SecondaryBean("from " + ConcreteConfiguration.class.getName());
  }

}
