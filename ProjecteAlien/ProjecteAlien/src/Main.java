import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Rooms.establirRoomsGame();
        
        Scanner sc = new Scanner(System.in);
        boolean jocacabat = false;
        int option = 0;

        int roomId = Rooms.getRoomId();
        Rooms rooms;

        do{
            System.out.println("MENÚ JOC");
            System.out.println("1.- SHOW MAP");
            System.out.println("2.- MOVE    ");
            System.out.println("3.- SHOW INVENTORY");
            option = sc.nextInt();
            switch(option){
                case 1 :
                     Game.ShowMap();
                     
                    
                case 2 :
                    Rooms.move(roomId);   

            }

        }while(jocacabat = false);

        }


        
}


    
    

