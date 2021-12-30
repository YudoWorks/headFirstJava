package simpleDotComGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DotComTest {

    @Test
    void hitTestExpectDotComExpectedPosition() {
        DotCom dotCom = new DotCom(new int[]{1,2,3}, "google.com");
        int[] ExpectedPosition = new int[]{-1,2,3};

        dotCom.hit(1);

        assertArrayEquals(ExpectedPosition, dotCom.getPosition());
    }

    @Test
    void getPositionTestExpectedPosition() {
        DotCom dotCom = new DotCom(new int[]{1,2,3}, "google.com");
        int[] ExpectedPosition = new int[]{1,2,3};

        assertArrayEquals(ExpectedPosition, dotCom.getPosition());
    }
}