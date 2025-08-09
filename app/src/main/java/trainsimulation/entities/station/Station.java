package trainsimulation.entities.station;

import java.util.ArrayList;
import java.util.List;

import trainsimulation.entities.Entity;
import trainsimulation.entities.line.Line;
import trainsimulation.interfaces.HoldsTrains;
import trainsimulation.utility.Position;

public abstract class Station extends Entity implements HoldsTrains {
    private Position position;
    private List<Line> lines = new ArrayList<Line>();

    public Station(String id, Position position) {
        super(id);
        this.position = position;
    }
}
