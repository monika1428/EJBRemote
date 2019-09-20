package com.example.remote.services;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.TimeZone;


@Remote(TimeBean.class)
@Stateless(name="timeBean")
public class TimeBeanImpl implements TimeBean{

    public TimeZone getTimeZone() {
        return TimeZone.getDefault();
    }
}
