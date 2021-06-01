/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.bookroom;

/**
 *
 * @author ROG
 */

import java.util.ArrayList;
import java.util.Scanner;

class Room 
{
    private String roomID  = null;
    private boolean booked = false;

    Room(String roomID)
    {
        this.roomID = roomID;
    }

    String getRoomID()
    {
        return roomID;
    }

    void cancel()
    {
        booked = false;
    }


    boolean isBooked()
    {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }


}