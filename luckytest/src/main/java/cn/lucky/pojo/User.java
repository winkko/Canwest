package cn.lucky.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private  Integer id;
    private String username;
    private String password;
    private Integer juId;

  /*  public User(){}

    public User(String username, String password, Integer juId) {
        this.username = username;
        this.password = password;
        this.juId = juId;
    }*/

    public User(){}

    public User(String username, String password, Integer juId){
        this.username = username;
        this.password = password;
        this.juId = juId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getJuId() {
        return juId;
    }

    public void setJuId(Integer juId) {
        this.juId = juId;
    }

}
