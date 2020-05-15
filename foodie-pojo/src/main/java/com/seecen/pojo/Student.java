package com.seecen.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Student {
    /**
     * 主键ID 自动增长
     */
    @Id
    private Integer id;

    /**
     * 学生姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 学生年龄
     */
    private Integer age;

    /**
     * 获取主键ID 自动增长
     *
     * @return id - 主键ID 自动增长
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键ID 自动增长
     *
     * @param id 主键ID 自动增长
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取学生姓名
     *
     * @return user_name - 学生姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置学生姓名
     *
     * @param userName 学生姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取学生年龄
     *
     * @return age - 学生年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置学生年龄
     *
     * @param age 学生年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}