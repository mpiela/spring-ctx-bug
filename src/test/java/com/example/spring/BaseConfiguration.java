package com.example.spring;

import org.springframework.context.annotation.Bean;

public abstract class BaseConfiguration {

  @Bean("mySecondaryBean")
  public SecondaryBean secondaryBean() {
    return new SecondaryBean("from " + BaseConfiguration.class.getName());
  }


}
