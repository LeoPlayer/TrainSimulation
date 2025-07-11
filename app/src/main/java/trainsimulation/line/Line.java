package trainsimulation.line;

import java.util.List;

import trainsimulation.station.Station;

public class Line {
    private String id;
    private List<Station> route;

    public Line(String id, List<Station> route) {
        this.id = id;
        this.route = route;
    }
}
