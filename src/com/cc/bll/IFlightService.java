package com.cc.bll;

import com.cc.bean.Flight;
import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight var1) throws SQLException;
    Set<Flight> getAllFlights() throws SQLException;
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirport(String departureAirport);
    Flight getFlightByDestinationAirport(String destinationAirport);
    void updateFlight(Flight var1);
}
