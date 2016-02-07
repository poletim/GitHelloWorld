package com.travel.corporation;

import com.sun.xml.internal.ws.util.StreamUtils;

/**
 * Created by poletim on 10/29/2015.
 */
public class Agency {

    private final Staff staff;

    public Agency(Staff st) {
        this.staff = st;

        System.out.println("Hello world");

    }


    @Override
    public String toString() {
        return staff.toString2();
    }

}
