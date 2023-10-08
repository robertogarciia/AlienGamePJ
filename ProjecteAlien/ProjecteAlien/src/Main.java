import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Rooms.establirRoomsGame();
        
        Scanner sc = new Scanner(System.in);
        boolean jocacabat = false;
        int option;

        int roomId = Rooms.getRoomId();
        Rooms rooms;

        do{
            System.out.println("MENÚ JOC");
            System.out.println("1.- SHOW MAP");
            System.out.println("2.- MOVE");
            System.out.println("3.- SHOW INVENTORY");
            System.out.println("4.- EXIT GAME");
            option = sc.nextInt();
            switch(option){
                case 1 :
                     Game.ShowMap();
                     break;
                case 2 :
                    Rooms.move();   
                    break;
                case 3 : 
                    break;
                case 4 : 
                jocacabat = true;
            

            }

        }while(jocacabat != true);

        }


        
}


    
    

