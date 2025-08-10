package trainsimulation.entities.station;

import java.util.ArrayList;
import java.util.List;

import trainsimulation.entities.load.Load;
import trainsimulation.entities.load.Passenger;
import trainsimulation.interfaces.CarriesPassengers;
import trainsimulation.utility.Position;

public class PassengerStation extends Station implements CarriesPassengers {
    public static final int PAX = 20;
    public static final int TRANSFER_TIME = 5; // in ticks
    private int pax;
    private int transferTime;
    private List<Passenger> passengers = new ArrayList<Passenger>();

    public PassengerStation(String id, Position position, int pax, int transferTime) {
        super(id, position);
        this.pax = pax;
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
        return pax;
    }

    public int transferTime() {
        return transferTime;
    }
}
