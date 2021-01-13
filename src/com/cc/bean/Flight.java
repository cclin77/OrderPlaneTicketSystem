package com.cc.bean;

import java.util.Date;

public class Flight {
    private String id;
    private String flightId;//航班号
    private String planeType;//航班类型
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

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
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

    public Flight(String id, String flightId, String planeType, int currentSeatsNum, String departureAirport, String destinationAirPort, String departureTime) {
        this.id = id;
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirport = departureAirport;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                ", 航班ID='" + flightId + '\'' +
                ", 机型='" + planeType + '\'' +
                ", 座位数=" + currentSeatsNum +
                ", 起飞机场='" + departureAirport + '\'' +
                ", 目的机场='" + destinationAirPort + '\'' +
                ", 出发时间='" + departureTime + '\'' +
                '}';
    }


    //    @Override
//    public String toString() {
//        return "Flight{" +
//                ", 航班ID='" + flightId + '\'' +
//                ", 机型='" + PlaneType + '\'' +
//                ", 座位数=" + currentSeatsNum +
//                ", 起飞机场='" + departureAirport + '\'' +
//                ", 目的机场='" + destinationAirPort + '\'' +
//                ", 出发时间='" + departureTime + '\'' +
//                '}';
//    }
}
