package com.cc.bll;

import com.cc.bean.Flight;

import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirport(String departureAirport);
    Flight getFlightByDestinationAirport(String destinationAirport);
    void updateFlight(Flight flight);
}
