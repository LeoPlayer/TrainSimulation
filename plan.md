Classes:

Train (id, position, noCars, speed)
    PassengerTrain implements Passengers


Station (id, position, transferTime, lines[])
    PassengerStation implements Passengers, Trains


Track (id, fromStation, toStation, length)
    OneWayTrack implements Trains
    TwoWayTrack implements Trains


Line (id, route)
    TrainLine implements Trains


Load (id, position, Train or Station id, destination)
    Passenger





interfaces:

Passengers (passengers[])
Trains (trains[])