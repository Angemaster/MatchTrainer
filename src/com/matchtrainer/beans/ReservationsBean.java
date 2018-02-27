package com.matchtrainer.beans;

import com.matchtrainer.models.MatchTrainerService;
import com.matchtrainer.models.Reservation;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
@Named
@SessionScoped
public class ReservationsBean implements Serializable {
    private MatchTrainerService service;
    public ReservationsBean(){
        service = new MatchTrainerService();
    }
    public List<Reservation> getReservation(int visitorId){
        return service.findAllReservationsByVisitor(visitorId);
    }
}
