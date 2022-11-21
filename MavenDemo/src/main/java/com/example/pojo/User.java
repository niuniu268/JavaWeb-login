package com.example.pojo;

public class User {
    private String Name;
    private String password;
    private String tel;


    public User() {
    }

    public User(String Name, String password, String tel) {
        this.Name = Name;
        this.password = password;
        this.tel = tel;
    }

    /**
     * 获取
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 设置
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String toString() {
        return "User{Name = " + Name + ", password = " + password + ", tel = " + tel + "}";
    }
}
