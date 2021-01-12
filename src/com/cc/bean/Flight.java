package com.cc.bean;

import java.util.Date;

public class Flight {
    private String id;
    private String flightId;//航班号
    private String PlaneType;//航班类型
    private int currentSeatsNum;//当前座位数
    private String departureAirport;//出发地
    private String destinationAirPort;//目的地
    private String departureTime;//到达时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    public String getPlaneType() {
        return PlaneType;
    }

    public void setPlaneType(String planeType) {
        PlaneType = planeType;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", currentSeatsNum=" + currentSeatsNum +
                ", PlaneType='" + PlaneType + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", destinationAirPort='" + destinationAirPort + '\'' +
                ", departureTime=" + departureTime +
                '}';
    }

    public Flight(String id, String flightId, int currentSeatsNum, String planeType, String departureAirport, String destinationAirPort, String departureTime) {
        this.id = id;
        this.flightId = flightId;
        this.currentSeatsNum = currentSeatsNum;
        PlaneType = planeType;
        this.departureAirport = departureAirport;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
    }

}
