package com.cc.bll.impl;

import com.cc.bean.Flight;
import com.cc.bll.IFlightService;
import com.cc.dao.IFlightDao;
import com.cc.dao.impl.FlightDaoIml;

import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    @Override
    public void insertFlight(Flight flight) {
        System.out.println(flight);
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirport(String departureAirport) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirport(String destinationAirport) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
