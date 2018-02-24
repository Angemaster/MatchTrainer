package com.matchtrainer.beans;
import com.matchtrainer.models.District;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import javax.faces.convert.FacesConverter;

@FacesConverter("convertDistrict")
public class DistrictsConvert implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String districtId) {
        District district = new District();
        district.setId(Integer.parseInt(districtId));
        return district;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return null;
    }
}