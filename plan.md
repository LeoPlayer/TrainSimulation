Classes:

Train (id, position, noCars, speed)
    PassengerTrain implements Passengers


Station implements HoldsTrains (id, position, transferTime, lines[])
    PassengerStation implements Passengers


Track implements HoldsTrains (id, fromStation, toStation, length)
    OneWayTrack
    TwoWayTrack


Line (id, route)
    TrainLine implements HoldsTrains


Load (id, position, Train or Station id, destination)
    Passenger





interfaces:

CarriesLoad ()
CarriesPassengers (passengers[])
HoldsTrains (trains[])




### Functionality:

Station
 - set at any position (x,y), with any transfer time (ticks)

Track
 - connects any two stations
 - length calculated from position of stations

Line
 - Set of stations that have tracks between
 - Can choose which stations to stop at
 - Can choose to be loop line

Load
 - Choose destination, and best route decided by shortest distance

Train
 - Capacity can be increased by number of carriages
 - Speed can be decided on creation


### Scheme