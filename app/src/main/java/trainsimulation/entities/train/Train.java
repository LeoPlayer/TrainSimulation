package trainsimulation.entities.train;

import trainsimulation.entities.PhysicalEntity;
import trainsimulation.utility.Position;

public class Train extends PhysicalEntity {
    private String id;
    private int noCars;
    private int speed;

    public Train(String id, Position position, int noCars, int speed) {
        super(id, position);
        this.noCars = noCars;
        this.speed = speed;
    }
}
