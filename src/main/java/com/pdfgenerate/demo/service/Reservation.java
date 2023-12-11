package com.pdfgenerate.demo.service;

import java.util.Date;

public class Reservation {

    private String departureCity;
    private String arrivalCity;
    private String flightNumber;
    private Date dateOfDeparture;

    // Constructors, getters, and setters

    public Reservation() {
    }

    public Reservation(String departureCity, String arrivalCity, String flightNumber, Date dateOfDeparture) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.flightNumber = flightNumber;
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(Date dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }
}
