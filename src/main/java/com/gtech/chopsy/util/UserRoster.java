package com.gtech.chopsy.util;

import com.gtech.chopsy.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRoster {


  public static List<User> getAllUser(){
      List<User> userList = new ArrayList<>();
      userList.add(new User(1,"Chang","Dang","cd@gmail.com","909090","abc"));
      userList.add(new User(2,"Wick","Tic","wick@gmail.com","9092290","abc12"));
      userList.add(new User(3,"Poul","Gol","po@gmail.com","90909022","ab1223"));
      userList.add(new User(4,"Nick","Millen","nick@gmail.com","909323090","rbc465"));
      userList.add(new User(5,"John","Charter","john@gmail.com","90909210","ac433455"));
      return userList;
  }
}
