package service;

import model.Accident;

import java.math.BigDecimal;
import java.util.Date;

public class AccidentService {
    /**
     *     private Date accidentDate;
     *     private String description;
     *     private BigDecimal damagePrice;
     *     private int failureRate;
     * @return
     */
    public Accident createAccident(Date accidentDate, String description, BigDecimal damagePrice, int failureRate){
        return new Accident(accidentDate, description, damagePrice, failureRate);
    }
}
