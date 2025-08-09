package trainsimulation.entities.line;

import java.util.List;

import trainsimulation.entities.Entity;
import trainsimulation.entities.station.Station;
import trainsimulation.interfaces.HoldsTrains;

public class Line extends Entity implements HoldsTrains {
    private List<Station> route;

    public Line(String id, List<Station> route) {
        super(id);
        this.route = route;
    }
}
