package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        AbstractGame nGame;

        while(true){
            System.out.print("Выберите тип игры: \n" +
                    "1 - Игра на русском \n" +
                    "2 - Игра на английском");
            if(scanner.nextLine().equals("1")){
                nGame = new RuGame();
                break;
            }
            if(scanner.nextLine().equals("2")){
                nGame = new EnGame();
                break;
            }
        }
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