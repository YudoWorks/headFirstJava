package simpleDotComGame;

public class BattleField {
    DotCom dotcom;
    int[] arena = {0, 0, 0, 0, 0, 0, 0};

    public void addDotCom(DotCom dotCom) {
        this.dotcom = dotCom;
        this.setUpArena(this.dotcom);
    }

    private void setUpArena(DotCom dotcom) {
        int[] dotComPosition = dotcom.getPosition();
        for (int point : dotComPosition) {
            this.arena[point] = 1;
        }
    }

    public void hit(int i) {
        if (arena[i] == 1) {
            this.dotcom.hit(i);
            System.out.println("Hit");
            if (this.dotcom.isSunk) {
                System.out.println("You sunk " + dotcom.name);
            }

            arena[i] = 0;
        } else {
            System.out.println("Miss");
        }
    }

    public boolean isDotComExists() {
        if (dotcom.isSunk) {
            return false;
        }

        return true;
    }
}
