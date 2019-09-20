package com.example.remote.services;

import javax.ejb.Remote;
import java.util.TimeZone;

@Remote
public interface TimeBean {

    TimeZone getTimeZone();
}
