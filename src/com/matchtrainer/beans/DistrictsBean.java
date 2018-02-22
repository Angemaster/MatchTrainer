package com.matchtrainer.beans;

import com.matchtrainer.models.District;
import com.matchtrainer.models.MatchTrainerService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class DistrictsBean implements Serializable {
    private MatchTrainerService service;
    private District district;

    public DistrictsBean(){
        service = new MatchTrainerService();
    }

    public List<District> getDistricts(){
        return service.findAllDistricts();
    }

    public District getDistrict() {
        return district;
    }

    public void setRegion(District district) {
        this.district = district;
    }



}
