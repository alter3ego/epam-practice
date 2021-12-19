package com.company;

public interface GlobalConst {
    int SURNAME_MAX_LENGTH = 30;
    int NICKNAME_MIN_LENGTH = 3;
    int NICKNAME_MAX_LENGTH = 25;

    String SURNAME_REGEX_LAT = "[A-Z]([a-z]+)?";
    String SURNAME_REGEX_UKR = "[А-ЩЬЮЯҐІЇЄ]([а-щьюяґіїє']+)?";
    String NICKNAME_REGEX = "\\w+";
}
