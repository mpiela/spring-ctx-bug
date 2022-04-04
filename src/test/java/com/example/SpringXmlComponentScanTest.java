package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.example.spring.MainBean;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
public class SpringXmlComponentScanTest {

  @Autowired
  MainBean myMainBean;

  
  @Test
  public void shouldProperlyCreateMainBean() {
    assertThat(myMainBean).isNotNull();
  }

}
