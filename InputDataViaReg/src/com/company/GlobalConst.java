package com.company;

public interface GlobalConst {
    int SURNAME_MAX_LENGTH = 30;
    int NICKNAME_MIN_LENGTH = 3;
    int NICKNAME_MAX_LENGTH = 25;

    String SURNAME_REGEX = "[A-Z]([a-z]+)?";
    String NICKNAME_REGEX = "\\w+";
}
