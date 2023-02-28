package br.com.bcoder;

import java.util.logging.Logger;

public class DataBase {
  private static final Logger LOGGER = Logger.getLogger(DataBase.class.getName());

  public static void connectDb(){
    LOGGER.info("Connection Started");
  }

  public static void disconnectDb(){
    LOGGER.info("Connection finished");
  }

  public static void insertUser(Person user){
    LOGGER.info("User created");
  }

  public static void removeUser(Person user){
    LOGGER.info("User removed");
  }



}
