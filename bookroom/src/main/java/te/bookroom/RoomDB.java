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

public class RoomDB 
{
    private ArrayList<Room> room;
    private String[] roomID = {"Room1","Room2","Room3","Room4"};

    RoomDB(){

        room = new ArrayList<Room>();                     
        for(int i=0;i<roomID.length;i++)
        {
            addRoom(new Room(roomID[i]));
        }

    }

    public void addRoom(Room addRoom){
        room.add(addRoom);
    }

    public ArrayList<Room> getRoom(){
        return room;
    }
}

