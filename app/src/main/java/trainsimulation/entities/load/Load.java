package trainsimulation.entities.load;

import trainsimulation.entities.Entity;
import trainsimulation.entities.station.Station;
import trainsimulation.utility.Position;

public class Load extends Entity {
    private Position postition;
    private String locationId; // station or train
    private boolean isStation = true;
    private Station destination;

    public Load(String id, Position position, String locationId, Station destination) {
        super(id);
        this.postition = position;
        this.locationId = locationId;
        this.destination = destination;
    }
}
