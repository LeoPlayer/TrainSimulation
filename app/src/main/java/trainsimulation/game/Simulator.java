package trainsimulation.game;

import java.util.List;

import trainsimulation.entities.station.PassengerStation;
import trainsimulation.entities.station.Station;
import trainsimulation.entities.line.Line;
import trainsimulation.utility.Position;

public class Simulator {
    private Map map;

    public Simulator() {
        map = new Map();
    }

    public void createPassengerStation(String id, Position position, int transferTime) {
        map.addEntity(new PassengerStation(id, position, transferTime));
     };

    public void createTrack(String id, Station fromStation, Station toStation, int length) { };

    public void createLine(String id, List<String> route) { };

    public void modifyLine(String id, List<String> newRoute) { };

    public void removeLine(String id) { };

    public void createTrain(String id, Position position, Line line, int length, String model) { };

    public void removeTrain(String id) { };

    public void simulate(int seconds) { };

    public void breakTrain(String id, int seconds) { };

    public void removeEntity(String id) {
        map.removeEntity(id);
     };

    // Getters
    public Map getMap() {
        return map;
    }
}
