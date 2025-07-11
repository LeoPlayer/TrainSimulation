package trainsimulation.station;

import java.util.List;

import trainsimulation.line.Line;
import trainsimulation.utility.Position;

public class Station {
    private String id;
    private Position position;
    private int transferTime;
    private List<Line> lines;

    public Station(String id, Position position, List<Line> lines) {
        this.id = id;
        this.position = position;
        this.lines = lines;
    }

    public Station(String id, Position position, int transferTime, List<Line> lines) {
        this(id, position, lines);
        this.transferTime = transferTime;
    }
}
