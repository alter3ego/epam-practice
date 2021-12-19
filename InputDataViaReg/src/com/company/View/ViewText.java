package com.company.View;

import com.company.GlobalConst;

import static com.company.GlobalConst.*;

public interface ViewText {
    String SURNAME_ENTER = "input.surname";
    String SURNAME_ADD = "{1," + SURNAME_MAX_LENGTH + "}";
    String NICKNAME_ENTER = "input.login";
    String NICKNAME_ADD = "{" + NICKNAME_MIN_LENGTH + ", " + NICKNAME_MAX_LENGTH + "}";
    String SURNAME_CONTAIN_ERROR = "input.wrong.surname";
    String NICKNAME_CONTAIN_ERROR = "input.wrong.login";
    String YOUR_SURNAME = "output.surname";
    String YOUR_NICKNAME = "output.login";
}
