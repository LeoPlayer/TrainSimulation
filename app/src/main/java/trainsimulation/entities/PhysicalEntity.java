package trainsimulation.entities;

import trainsimulation.utility.Position;

public class PhysicalEntity extends Entity {
    private Position position;
    public PhysicalEntity(String id, Position position) {
        super(id);
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
