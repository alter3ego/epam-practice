package com.company.View;

import com.company.GlobalConst;

public interface ViewText {
    String SURNAME_ENTER = "Please enter your surname: ";
    String NICKNAME_ENTER = "Please enter your nickname: ";
    String SURNAME_CONTAIN_ERROR = "Wrong surname, surname must contain only" +
            " letters A-Z of the English alphabet," +
            " and start with a capital letter.";
    String NICKNAME_CONTAIN_ERROR = "Wrong nickname, nickname may contain" +
            " letters A-Z of the English alphabet," +
            " numbers and a lower dash.";
    String SURNAME_LENGTH_ERROR = "The length surname is limited to " + GlobalConst.SURNAME_MAX_LENGTH +
            " characters.";
    String NICKNAME_LENGTH_ERROR = "Nickname length must be in the range from " +
            GlobalConst.NICKNAME_MIN_LENGTH + " to " + GlobalConst.NICKNAME_MAX_LENGTH + ".";
}
