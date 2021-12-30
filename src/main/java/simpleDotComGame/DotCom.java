package simpleDotComGame;

public class DotCom {
    private final int[] position;
    public String name;
    public boolean isSunk = false;

    public DotCom(int[] ints, String s) {
        this.position = ints;
        this.name = s;
    }

    public void hit(int i) {
        for (int j = 0; j < position.length; j++) {
            if(position[j] == i){
                position[j] = -1;
            }
        }

        this.checkSunkStatus();
    }

    private void checkSunkStatus() {
        int counter = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] < 0){
                counter++;
            }
        }

        if (counter == position.length){
            isSunk = true;
        }
    }

    public int[] getPosition() {
        return position;
    }
}
