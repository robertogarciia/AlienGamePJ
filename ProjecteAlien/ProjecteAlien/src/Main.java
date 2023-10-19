import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Rooms.makeroomsobjectsGame();
        
        Scanner sc = new Scanner(System.in);
        boolean jocacabat = false;
        int option;

        int roomId = Rooms.getRoomId();
        Rooms rooms;

        do{
            System.out.println("---------------------------------------------");
            System.out.println("|                 MENÚ JOC                  |");
            System.out.println("---------------------------------------------");
            System.out.println("|   1.- MOSTRAR MAPA                        |");
            System.out.println("|   2.- MOURE PERSONATGE                    |");
            System.out.println("|   3.- DESCUBRIR OBJECTES A LA ZONA        |");
            System.out.println("|   4.- MOSTRAR INVENTARI                   |");
            System.out.println("|   5.- EXIT GAME                           |");
            System.out.println("---------------------------------------------");


            option = sc.nextInt();
            switch(option){
                case 1 :
                     Game.ShowMap();
                     break;
                case 2 :
                    Rooms.move();   
                    break;
                case 3 : 
                    DiscoverItems();
                    break;
                case 4 : 
                
                case 5:
                    jocacabat = true;
                break;

            }

        }while(jocacabat != true);

        }


    public static void DiscoverItems(){
        int roomId = Rooms.getRoomId();
        switch(roomId){
            case 1:
                    System.out.println();
                break;
            case 2:
                    System.out.println();
                break;
            case 3:
                    System.out.println();
                break;
            case 4:
                    System.out.println();
                break;
            case 5:
                    System.out.println();
                break;
            case 6:
                    System.out.println();
                break;
            case 7:
                    System.out.println();
                break;
            case 8:
                    System.out.println();
                break;
            case 9:
                    System.out.println();
                break;
            
        }
    }
        
}