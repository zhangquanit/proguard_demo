package com.proguard.demo.bean;

/**
 * @author 张全
 */

public class Child2 extends Person {
    private String like;
    private String couse;

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getCouse() {
        return couse;
    }

    public void setCouse(String couse) {
        this.couse = couse;
    }

    @Override
    public String toString() {
        return "Child2{" +
                "like='" + like + '\'' +
                ", couse='" + couse + '\'' +
                '}';
    }
}
