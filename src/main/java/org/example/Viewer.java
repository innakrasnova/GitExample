package org.example;

import java.util.ArrayList;

public class Viewer {
    private String nickname;
    private int age;
    private ArrayList<Cinema> cinemas;
    private int count = cinemas.size();

    public Viewer(String nickname, int age, int count) {
        this.nickname = nickname;
        this.age = age;
        this.count = count;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
