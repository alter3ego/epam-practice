package com.company.View;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.company.View.ViewText.*;

public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));  // Ukrainian
                    // new Locale("en"));        // English

    public void printMessage(String message) {
        String print = getFromBundle(message);
        if (message.equals(SURNAME_ENTER)) {
            System.out.println(print + SURNAME_ADD);
        } else if (message.equals(NICKNAME_ENTER)) {
            System.out.println(print + NICKNAME_ADD);
        } else System.out.println(print);
    }

    public void printResultRegistration(String surname, String nickname) {
        System.out.println(getFromBundle(YOUR_SURNAME) + surname + "\n" +
                getFromBundle(YOUR_NICKNAME) + nickname);
    }

    String getFromBundle(String str) {
        return View.bundle.getString(str);
    }

}
