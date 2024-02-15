package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractGame nGame = new RuGame();
        Scanner scanner = new Scanner(System.in);

        nGame.start(4, 10);
        while(nGame.getGameStatus().equals(GameStatus.START)){
            System.out.print("Ваш ход: ");
            String value = scanner.nextLine();

            Answer answer = nGame.inputValue(value);
            System.out.println(answer);
        }

        System.out.println(nGame.getGameStatus().getDescription());
    }
}