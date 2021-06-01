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
import java.util.Scanner;

public class Booking {
    
    static RoomDB roomDB = new RoomDB();

    public static void main(String[] args) {
        String roomID;      
        Room room;  
        Scanner inputID = new Scanner(System.in);

        while(true){

            System.out.println("Please choose the room you want to book \n"+getRoomList(roomDB));

            while(true){
                System.out.println("Enter your Room no. : (Enter x for quite ) : ");
                roomID = inputID.nextLine();
                System.out.println("X : " + roomID.equals("x"));
                if(roomID.equals("x")){
                    System.out.println("Break");
                    break;
                }

                if(getRoom(roomID) == null){

                    System.out.println("The room ID is incorrect, please enter again or enter x to quit");

                }
                else{

                    room = getRoom(roomID);

                    if(!room.isBooked()){
                        System.out.println("Book successfully");
                        room.setBooked(true);
                        break;
                    }
                    else{
                        System.out.println("please enter the room ID again or enter x to quit");
                    }

                }

            }

        }

    }

    public static String getRoomList(RoomDB roomDB)
    {

        String roomList = "";
        for(Room r:roomDB.getRoom())
        {

            if(!r.isBooked())
            {
                roomList = roomList+r.getRoomID()+" is free"+"   ";
            }
            else
            {
                roomList = roomList+r.getRoomID()+" has been booked ";
            }

        }
        return roomList;
    }


    public static Room getRoom(String roomID){

        for(Room r:roomDB.getRoom()){

            if(r.getRoomID().equals(roomID)){
                System.out.println("r.getRoomID : " + r.getRoomID() + "  AND user.roomID :" + roomID);
                return r;
            }

        }
        return null;

    }

}