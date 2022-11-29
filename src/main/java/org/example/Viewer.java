package org.example;

public class Viewer {
    private String nickname;
    private int age;
    private int count;
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
