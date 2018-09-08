package com.reddogsoftware.mbresnan.wakemeupwhen.Models;

import java.util.ArrayList;
import java.util.List;

public class RegisteredNumbers {
    private static List<String> numbers = new ArrayList<>();

    public static List<String> getNumbers() {
        return numbers;
    }

    public void addNumber(String number) {
        numbers.add(number);
    }

    public void removeNumber(String number) {
        numbers.add(number);
    }

}
