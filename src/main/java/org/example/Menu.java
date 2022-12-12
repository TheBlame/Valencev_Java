package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    private void numberListener(int number) {
        int minNumber = 7;
        if (number > minNumber) {
            System.out.println("Привет");
        }
    }

    private void nameListener(String name) {
        String requiredName = "Вячеслав";
        if (name.equals(requiredName)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    private void arrayListener(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (i % 3 == 0) {
                result.add(i);
            }
        }

        for (int i : result) {
            System.out.println(i);
        }
    }

    public void start() {
        String input = scanner.nextLine();
        if(input.matches("^[а-яА-я].+$")) {
            nameListener(input);
        } else if (input.matches("^[\\d]$")) {
            numberListener(Integer.parseInt(input));
        } else if (input.matches("^[\\d]\\s.+$")) {
            List<Integer> list = Arrays.stream(input.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            arrayListener(list);
        }
    }
}
