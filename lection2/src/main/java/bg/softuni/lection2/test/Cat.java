package bg.softuni.lection2.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Cat implements Animal {
  @Override
  public String makeNoise() {
    return "meeew";
  }
}
