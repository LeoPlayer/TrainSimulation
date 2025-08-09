package trainsimulation.entities.train;

import java.util.ArrayList;
import java.util.List;

import trainsimulation.entities.load.Load;
import trainsimulation.entities.load.Passenger;
import trainsimulation.interfaces.CarriesPassengers;
import trainsimulation.utility.Position;

public class PassengerTrain extends Train implements CarriesPassengers {
    private static final int PAX = 4;
    private List<Passenger> passengers = new ArrayList<Passenger>();

    public PassengerTrain(String id, Position position, int noCars, int speed) {
        super(id, position, noCars, speed);
    }

    @Override
    public List<Load> getLoad() {
        return passengers.stream().map(p -> (Load) p).toList();
    }

    @Override
    public List<Passenger> getPassengers() {
        return passengers;
    }

    @Override
    public int pax() {
        return PAX;
    }

}
