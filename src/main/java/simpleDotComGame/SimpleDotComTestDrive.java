package simpleDotComGame;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        DotCom dotCom = new DotCom(new int[]{1, 2, 3}, "google.com");
        BattleField battleField = new BattleField();
        battleField.addDotCom(dotCom);
        GameHelper helper = new GameHelper();
        int numberOfGuess = 0;

        while(battleField.isDotComExists()){
            int playerGuessNumber = Integer.parseInt(helper.getUserInput("enter a number"));

            battleField.hit(playerGuessNumber);
            numberOfGuess++;
        }

        System.out.println("You took " + numberOfGuess + " guess");
    }
}
