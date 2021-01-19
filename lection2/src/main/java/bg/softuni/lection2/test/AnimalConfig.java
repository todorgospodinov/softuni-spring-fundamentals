package bg.softuni.lection2.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

@Configuration
public class AnimalConfig {

  @Profile("kitty-app")
  @Bean
  @Scope("prototype")
  public Animal createCat() {
    return new Cat();
  }

  @Profile("doggy-app")
  @Bean
  public Animal createDog() {
    return new Dog();
  }
}
