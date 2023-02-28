package br.com.bcoder;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
  private final String name;
  private final LocalDate birthDate;

  public Person ( String name, LocalDate birthDate ) {
    this.name = name;
    this.birthDate = birthDate;
  }

  public String getName () {
    return name;
  }

  public LocalDate getBirthDate() {
    return this.birthDate;
  }

  public int getAge() {
    return (int) ChronoUnit.YEARS.between(this.birthDate, LocalDate.now());
  }

}