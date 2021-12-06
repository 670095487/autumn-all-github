package com.example.dockerdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author yunN
 * @date 2021/10/27
 */
@Entity(name = "T_USER")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

   private String name;
   private int age;
   private String address;

   public User() {
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }
}
