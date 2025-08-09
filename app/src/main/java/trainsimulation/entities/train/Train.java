package trainsimulation.entities.train;

import trainsimulation.entities.Entity;
import trainsimulation.utility.Position;

public class Train extends Entity {
    private String id;
    private Position position;
    private int noCars;
    private int speed;

    public Train(String id, Position position, int noCars, int speed) {
        super(id);
        this.position = position;
        this.noCars = noCars;
        this.speed = speed;
    }
}
