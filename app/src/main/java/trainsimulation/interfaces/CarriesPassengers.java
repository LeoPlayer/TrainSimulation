package trainsimulation.interfaces;

import java.util.List;

import trainsimulation.entities.load.Passenger;

public interface CarriesPassengers extends CarriesLoad {
    public List<Passenger> getPassengers();
    public int pax();
}
