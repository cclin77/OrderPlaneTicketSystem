package com.cc.bll.impl;

import com.cc.bean.Flight;
import com.cc.bll.IFlightService;
import com.cc.dao.IFlightDao;
import com.cc.dao.impl.FlightDaoIml;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl implements IFlightService {
    IFlightDao iFlightDao = new FlightDaoIml();

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        this.iFlightDao.insertFlight(flight);
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {
        return this.iFlightDao.getAllFlights();
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
    public void updateFlight(Flight var1) {

    }
}
