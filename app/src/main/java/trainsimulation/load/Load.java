package trainsimulation.load;

import trainsimulation.station.Station;
import trainsimulation.utility.Position;

public class Load {
    private String id;
    private Position postition;
    private String locationId; // station or train
    private boolean isStation = true;
    private Station destination;

    public Load(String id, Position position, String locationId, Station destination) {
        this.id = id;
        this.postition = position;
        this.locationId = locationId;
        this.destination = destination;
    }
}
