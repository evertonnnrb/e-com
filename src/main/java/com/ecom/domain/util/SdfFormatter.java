package com.ecom.domain.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SdfFormatter {

    static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public static Date frmStrToDate(String data){
        try {
            return sdf.parse(data);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
