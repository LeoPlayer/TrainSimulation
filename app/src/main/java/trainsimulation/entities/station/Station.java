package trainsimulation.entities.station;

import trainsimulation.entities.PhysicalEntity;
import trainsimulation.interfaces.HoldsTrains;
import trainsimulation.utility.Position;

public abstract class Station extends PhysicalEntity implements HoldsTrains {
    public Station(String id, Position position) {
        super(id, position);
    }
}
