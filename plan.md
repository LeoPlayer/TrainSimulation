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