package com.matchtrainer.beans;

import com.matchtrainer.models.Customer;
import com.matchtrainer.models.MatchTrainerService;
import com.matchtrainer.models.Reservation;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Named
@SessionScoped
public class ReservationsBean implements Serializable {
    private MatchTrainerService service;
    private Reservation reservation;

    public ReservationsBean(){
        service = new MatchTrainerService();
    }

    public Reservation getReservation(){return reservation; }

    public void setReservation(Reservation reservation){this.reservation = reservation;}
    public List<Reservation> getReservation(int visitorId){
        return service.findAllReservationsByVisitor(visitorId);
    }

   public int getCustomerId(){return this.getReservation().getCustomerId();}
   public void setCustomerId(int customerId){this.getReservation().setCustomerId(customerId);}
   public int getTrainerId(){return this.getReservation().getTrainerId();}
   public void setTrainerId(int trainerId){this.getReservation().setTrainerId(trainerId);}
   public int getVisitorId(){return this.getReservation().getVisitorId();}
   public void setVisitorId(int visitorId){this.getReservation().setVisitorId(visitorId);}
   public String getTrainingPurpose(){return this.getReservation().getTrainingPurpose();}
   public void setTrainingPurpose(String  trainingPurpose){this.getReservation().setTrainingPurpose(trainingPurpose);}
   public String getTraininGlevel(){return this.getReservation().getTraininGlevel();}
   public void setTraininGlevel(String traininGlevel){this.getReservation().setTraininGlevel(traininGlevel);}
   public String getTrainingPlace(){return this.getReservation().getTraininPlace();}
   public void setTrainingPlace(String trainingPlace){this.getReservation().setTraininGlevel(trainingPlace);}
   public Date getMeetingDate(){return this.getReservation().getMeetingDate();}
   public void setMeetingDate(Date meetingDate){this.getReservation().setMeetingDate(meetingDate);}
   public String getAddress(){return this.getReservation().getAddress();}
   public void setAddress(String address){this.getReservation().setAddress(address);}
   public Date getHour(){return this.getReservation().getHour();}
   public void setHour(Date hour){this.getReservation().setHour(hour);}
   public String getState(){return this.getReservation().getState();}
   public void setState(String state){this.getReservation().setState(state);}
   public String getCommentary(){return this.getReservation().getCommentary();}
   public void setCommentary(String commentary){this.getReservation().setCommentary(commentary);}
   public boolean isEnable(){return this.getReservation().isEnabled();}
   public void setEnable(boolean enable){this.getReservation().setEnabled(enable);}

   public String viewReservation(Reservation reservation){setReservation(reservation); return "Sucess";}

}
