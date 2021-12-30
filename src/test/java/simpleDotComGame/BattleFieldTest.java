package simpleDotComGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleFieldTest {

    @Test
    void addDotComTestExpectBattleFieldHaveDotComAndHaveExpectedArena() {
        BattleField battleField = new BattleField();
        int[] expectedArena = new int[]{0,1,1,1,0,0,0};
        DotCom dotCom = new DotCom(new int[]{1, 2, 3}, "google.com");

        battleField.addDotCom(dotCom);

        assertEquals(dotCom, battleField.dotcom);
        assertArrayEquals(expectedArena, battleField.arena);
    }

    @Test
    void hitTestExpectBattleFieldHaveExpectedArena() {
        BattleField battleField = new BattleField();
        DotCom dotCom = new DotCom(new int[]{1, 2, 3}, "google.com");
        int[] expectedArena = new int[]{0,0,1,1,0,0,0};
        battleField.addDotCom(dotCom);

        battleField.hit(1);

        assertArrayEquals(expectedArena, battleField.arena);
    }

    @Test
    void isDotComExistsTestDotComIsSunk() {
        BattleField battleField = new BattleField();
        DotCom dotCom = new DotCom(new int[]{1, 2, 3}, "google.com");
        battleField.addDotCom(dotCom);
        battleField.hit(1);
        battleField.hit(2);
        battleField.hit(3);

        assertFalse(battleField.isDotComExists());
    }

    @Test
    void isDotComExistsTestDotComIsNotSunk() {
        BattleField battleField = new BattleField();
        DotCom dotCom = new DotCom(new int[]{1, 2, 3}, "google.com");
        battleField.addDotCom(dotCom);
        battleField.hit(1);
        battleField.hit(2);

        assertTrue(battleField.isDotComExists());
    }
}