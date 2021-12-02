package com.example.dockerdemo.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author yunN
 * @date 2021/10/27
 */
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

   @Id
   @GeneratedValue
   private int id;

   private String name;
   private int age;
   private String address;

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
      User user = (User) o;
      return Objects.equals(id, user.id);
   }

   @Override
   public int hashCode() {
      return 0;
   }
}
