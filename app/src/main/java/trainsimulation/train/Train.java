package trainsimulation.train;

import trainsimulation.utility.Position;

public class Train {
    private String id;
    private Position position;
    private int noCars;
    private int speed;

    public Train(String id, Position position, int noCars, int speed) {
        this.id = id;
        this.position = position;
        this.noCars = noCars;
        this.speed = speed;
    }
}
