package com.cc.bean;

import java.util.Date;

public class Flight {
    private String id;
    private String seatsNo;
    private String totalSeatsNum;//总座位数
    private String PlaneType;//航班类型
    private String departureAirport;//出发地
    private String destinationAirPort;//目的地
    private Date departureTime;//到达时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(String seatsNo) {
        this.seatsNo = seatsNo;
    }

    public String getTotalSeatsNum() {
        return totalSeatsNum;
    }

    public void setTotalSeatsNum(String totalSeatsNum) {
        this.totalSeatsNum = totalSeatsNum;
    }
}
