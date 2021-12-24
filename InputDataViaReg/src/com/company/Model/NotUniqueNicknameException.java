package com.company.Model;

public class NotUniqueNicknameException extends Exception {
    private String nickname;

    public String getNickname() {
        return nickname;
    }
    public NotUniqueNicknameException(String message, String nickname) {
        super(message);
        this.nickname = nickname;
    }
}
