package com.company.Model;

public enum BD {
    ACCOUNT_ONE("Ivanov", "ivan6455"),
    ACCOUNT_TWO("Petrov", "zero333"),
    ACCOUNT_THREE("Someone", "someone33");

    private final String surname;
    private final String nickname;

    BD(String surname, String nickname ){
        this.surname = surname;
        this.nickname =nickname;

    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }

    public static boolean checkNicknameRepeat(String nickname){
        for (BD data:BD.values()) {
            if (data.getNickname().equals(nickname)) return true;
        }
        return false;
    }
}

