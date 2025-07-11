package trainsimulation.track;

import trainsimulation.station.Station;

public class Track {
    private String id;
    private Station fromStation;
    private Station toStation;
    private int length;

    public Track(String id, Station fromStation, Station toStation, int length) {
        this.id = id;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.length = length;
    }
}
