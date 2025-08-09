package trainsimulation.entities.load;

import trainsimulation.entities.station.Station;
import trainsimulation.utility.Position;

public class Passenger extends Load {
    public Passenger(String id, Position position, String locationId, Station destination) {
        super(id, position, locationId, destination);
    }

}
