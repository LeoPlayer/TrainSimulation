Classes:

Train (id, position, length, capacity, speed)
    PassengerTrain implements Passengers


Station (id, position, transfer time, lines[])
    PassengerStation implements Passengers, Trains


Track (id, fromStationId, toStationId, length)
    OneWayTrack implements Trains
    TwoWayTrack implements Trains


Line (id, route)
    TrainLine implements Trains


Load (id, position, Train or Station id, destination)
    Passenger





interfaces:

Passengers (passengers[])
Trains (trains[])