package trainsimulation.interfaces;

import java.util.List;

import trainsimulation.entities.load.Load;

public interface CarriesLoad {
    // returns all types of loads
    public List<Load> getLoad();
}
