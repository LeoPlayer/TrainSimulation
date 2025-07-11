package trainsimulation.simulator;

import java.util.List;

import trainsimulation.line.Line;
import trainsimulation.station.Station;
import trainsimulation.utility.Position;

public class Simulator {
    public static Position newPosition(int x, int y) {return new Position(x, y);};

    // __________________________________________________________________________

    public static void createStation(String id, Position position, int transferTime) {};

    public static void removeStation(String id) {};

    public static void createTrack(String id, Station fromStation, Station toStation, int length) {};

    public static void removeTrack(String id) {};

    public static void createLine(String id, List<String> route) {};

    public static void modifyLine(String id, List<String> newRoute) {};

    public static void removeLine(String id) {};

    public static void createTrain(String id, Position position, Line line, int length, String model) {};

    public static void removeTrain(String id) {};

    public static void simulate(int seconds) {};

    public static void breakTrain(String id, int seconds) {};
}
