package trainsimulation.entities.track;

import trainsimulation.entities.Entity;
import trainsimulation.entities.station.Station;
import trainsimulation.interfaces.HoldsTrains;

public abstract class Track extends Entity implements HoldsTrains {
    private String id;
    private Station fromStation;
    private Station toStation;
    private int length;

    public Track(String id, Station fromStation, Station toStation, int length) {
        super(id);
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.length = length;
    }
}
