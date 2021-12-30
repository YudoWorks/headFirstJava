package simpleDotComGame;

import java.util.Scanner;

public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");

        Scanner s = new Scanner(System.in);
        inputLine = s.nextLine();

        return inputLine;
    }
}
