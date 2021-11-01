package com.xp.mybatisplus.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

  private Integer id;
  private String studentName;
  private Integer age;
  private String address;
  private int gradeId;
  private String photo;
  private java.sql.Timestamp birthday;


}
