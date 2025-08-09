package trainsimulation.entities.station;

import java.util.ArrayList;
import java.util.List;

import trainsimulation.entities.load.Load;
import trainsimulation.entities.load.Passenger;
import trainsimulation.interfaces.CarriesPassengers;
import trainsimulation.utility.Position;

public class PassengerStation extends Station implements CarriesPassengers {
    private static final int PAX = 20;
    private int transferTime;
    private List<Passenger> passengers = new ArrayList<Passenger>();

    public PassengerStation(String id, Position position, int transferTime) {
        super(id, position);
        this.transferTime = transferTime;
    }

    public int getTransferTime() {
        return transferTime;
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
