package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("myMainBean")
public class MainBean {

  private SecondaryBean secondaryBean;

  @Autowired
  public MainBean(@Qualifier("mySecondaryBean") SecondaryBean secondaryBean) {
    this.secondaryBean = secondaryBean;
  }
}
