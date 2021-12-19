package com.company.Controller;


import com.company.Model.Model;
import com.company.Model.Subscriber;
import com.company.View.View;


import java.util.Scanner;

import static com.company.View.ViewText.*;
import static com.company.GlobalConst.*;

public class Controller {
    private final View view;
    private final Model model;
    private String surname;
    private String nickname;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        view.printMessage(SURNAME_ENTER);
        checkSurname(scanner);
        view.printMessage(NICKNAME_ENTER);
        checkNickname(scanner);
        model.setSubscriber(surname, nickname);
        Subscriber subscriber = model.getSubscriber();
        view.printResultRegistration(subscriber.getSurname(), subscriber.getNickname());
    }

    private void checkSurname(Scanner scanner) {
        while (!scanner.hasNext() || !((surname = scanner.nextLine()).matches(actualRegex())) ||
                !checkSurnameLength(surname)) {
            view.printMessage(SURNAME_CONTAIN_ERROR);
            view.printMessage(SURNAME_ENTER);
        }
    }

    private boolean checkSurnameLength(String surname) {
        return surname.length() <= SURNAME_MAX_LENGTH;
    }

    private void checkNickname(Scanner scanner) {
        while (!scanner.hasNext() || !((nickname = scanner.nextLine()).matches(NICKNAME_REGEX)) ||
                !checkNicknameLength(nickname)) {
            view.printMessage(NICKNAME_CONTAIN_ERROR);
            view.printMessage(NICKNAME_ENTER);
        }
    }

    private boolean checkNicknameLength(String nickname) {
        return nickname.length() <= NICKNAME_MAX_LENGTH && nickname.length() >= NICKNAME_MIN_LENGTH;
    }

    private String actualRegex() {
        return (String.valueOf(View.bundle.getLocale()).equals("ua") ? SURNAME_REGEX_UKR : SURNAME_REGEX_LAT);
    }
}
