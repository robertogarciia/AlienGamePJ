import java.util.*;

public class Game {
    private static Rooms rooms;

    public Game(ArrayList<Rooms> room, Rooms rooms) {
        this.rooms = rooms;
    }

    

public static void ShowMap(){
    int currentRoomId = Rooms.getRoomId();
    char x = 'X';
switch(currentRoomId){
    case 1: 
    System.out.println("                    |-------------------|\n"+
                        "                   |                   |\n"+
    "                                       |       "+x+"       |\n"+
    "                                       |                   |\n"+
    "                    ___________________|_______     _______|____________________\n" +
                       "|                   |                   |                    |\n" +
                       "|                   |                   |                    |\n" +
                       "|                                                            |\n" +
                       "|                        ___     ___                         |\n" +
                       "|                   |   |           |   |                    |\n" +
                       "|______      _______|___|           |___|_______      _______|\n" +
                       "|                   |   |___________|   |                    |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                   |                   |                    |\n" +
                       "|___________________|_______     _______|____________________|\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |-------------------|\n" +
                       "                         ___________     \n" +                          
                       "                        |           |\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" 
                       
                       );
                       
        break;
    case 2:
    System.out.println("                    |-------------------|\n"+
                        "                   |                   |\n"+
    "                                       |                   |\n"+
    "                                       |                   |\n"+
    "                    ___________________|_______     _______|____________________\n" +
                       "|                   |                   |                    |\n" +
                       "|                   |                   |                    |\n" +
                       "|                                                            |\n" +
                       "|      "+x+"             ___     ___                         |\n" +
                       "|                   |   |           |   |                    |\n" +
                       "|______      _______|___|           |___|_______      _______|\n" +
                       "|                   |   |___________|   |                    |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                   |                   |                    |\n" +
                       "|___________________|_______     _______|____________________|\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |-------------------|\n" +
                       "                         ___________     \n" +                          
                       "                        |           |\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" 
                       
                       );
         break;              
    case 3:
    System.out.println("                    |-------------------|\n"+
                        "                   |                   |\n"+
    "                                       |                   |\n"+
    "                                       |                   |\n"+
    "                    ___________________|_______     _______|____________________\n" +
                       "|                   |                   |                    |\n" +
                       "|                   |       "+x+"       |                    |\n" +
                       "|                                                            |\n" +
                       "|                        ___     ___                         |\n" +
                       "|                   |   |           |   |                    |\n" +
                       "|______      _______|___|           |___|_______      _______|\n" +
                       "|                   |   |___________|   |                    |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                   |                   |                    |\n" +
                       "|___________________|_______     _______|____________________|\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |-------------------|\n" +
                       "                         ___________     \n" +                          
                       "                        |           |\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" 
                       
                       );
        break;             
    case 4:
    System.out.println("                    |-------------------|\n"+
                        "                   |                   |\n"+
    "                                       |                   |\n"+
    "                                       |                   |\n"+
    "                    ___________________|_______     _______|____________________\n" +
                       "|                   |                   |                    |\n" +
                       "|                   |                   |                    |\n" +
                       "|                                                            |\n" +
                       "|                        ___     ___             "+x+"       |\n" +
                       "|                   |   |           |   |                    |\n" +
                       "|______      _______|___|           |___|_______      _______|\n" +
                       "|                   |   |___________|   |                    |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                   |                   |                    |\n" +
                       "|___________________|_______     _______|____________________|\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |-------------------|\n" +
                       "                         ___________     \n" +                          
                       "                        |           |\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" 
                       
                       );
        break;              
    case 5:
    System.out.println("                    |-------------------|\n"+
                        "                   |                   |\n"+
    "                                       |                   |\n"+
    "                                       |                   |\n"+
    "                    ___________________|_______     _______|____________________\n" +
                       "|                   |                   |                    |\n" +
                       "|                   |                   |                    |\n" +
                       "|                                                            |\n" +
                       "|                        ___     ___                         |\n" +
                       "|                   |   |           |   |                    |\n" +
                       "|______      _______|___|   "+x+"   |___|_______      _______|\n" +
                       "|                   |   |___________|   |                    |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                   |                   |                    |\n" +
                       "|___________________|_______     _______|____________________|\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |-------------------|\n" +
                       "                         ___________     \n" +                          
                       "                        |           |\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" 
                       
                       );
        break;              
    case 6:
    System.out.println("                    |-------------------|\n"+
                        "                   |                   |\n"+
    "                                       |                   |\n"+
    "                                       |                   |\n"+
    "                    ___________________|_______     _______|____________________\n" +
                       "|                   |                   |                    |\n" +
                       "|                   |                   |                    |\n" +
                       "|                                                            |\n" +
                       "|                        ___     ___                         |\n" +
                       "|                   |   |           |   |                    |\n" +
                       "|______      _______|___|           |___|_______      _______|\n" +
                       "|                   |   |___________|   |                    |\n" +
                       "|                                                            |\n" +
                       "|       "+x+"                                                |\n" +
                       "|                                                            |\n" +
                       "|                   |                   |                    |\n" +
                       "|___________________|_______     _______|____________________|\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |-------------------|\n" +
                       "                         ___________     \n" +                          
                       "                        |           |\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" 
                       
                       );
        break;               
    case 7:
    System.out.println("                    |-------------------|\n"+
                        "                   |                   |\n"+
    "                                       |                   |\n"+
    "                                       |                   |\n"+
    "                    ___________________|_______     _______|____________________\n" +
                       "|                   |                   |                    |\n" +
                       "|                   |                   |                    |\n" +
                       "|                                                            |\n" +
                       "|                        ___     ___                         |\n" +
                       "|                   |   |           |   |                    |\n" +
                       "|______      _______|___|           |___|_______      _______|\n" +
                       "|                   |   |___________|   |                    |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                           "+x+"                            |\n" +
                       "|                   |                   |                    |\n" +
                       "|___________________|_______     _______|____________________|\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |-------------------|\n" +
                       "                         ___________     \n" +                          
                       "                        |           |\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" 
                       
                       );
        break;               
    case 8:
    System.out.println("                    |-------------------|\n"+
                        "                   |                   |\n"+
    "                                       |                   |\n"+
    "                                       |                   |\n"+
    "                    ___________________|_______     _______|____________________\n" +
                       "|                   |                   |                    |\n" +
                       "|                   |                   |                    |\n" +
                       "|                                                            |\n" +
                       "|                        ___     ___                         |\n" +
                       "|                   |   |           |   |                    |\n" +
                       "|______      _______|___|           |___|_______      _______|\n" +
                       "|                   |   |___________|   |                    |\n" +
                       "|                                                            |\n" +
                       "|                                                "+x+"       |\n" +
                       "|                                                            |\n" +
                       "|                   |                   |                    |\n" +
                       "|___________________|_______     _______|____________________|\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |-------------------|\n" +
                       "                         ___________     \n" +                          
                       "                        |           |\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" 
                       
                       );
        break;               
    case 9:
    System.out.println("                    |-------------------|\n"+
                        "                   |                   |\n"+
    "                                       |                   |\n"+
    "                                       |                   |\n"+
    "                    ___________________|_______     _______|____________________\n" +
                       "|                   |                   |                    |\n" +
                       "|                   |                   |                    |\n" +
                       "|                                                            |\n" +
                       "|                        ___     ___                         |\n" +
                       "|                   |   |           |   |                    |\n" +
                       "|______      _______|___|           |___|_______      _______|\n" +
                       "|                   |   |___________|   |                    |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                   |                   |                    |\n" +
                       "|___________________|_______     _______|____________________|\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |       "+x+"       |\n" +
                       "                    |                   |\n" +
                       "                    |-------------------|\n" +
                       "                         ___________     \n" +                          
                       "                        |           |\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" 
                       
                       );
        break;

    case 10: 
    System.out.println("                    |-------------------|\n"+
                        "                   |                   |\n"+
    "                                       |                   |\n"+
    "                                       |                   |\n"+
    "                    ___________________|_______     _______|____________________\n" +
                       "|                   |                   |                    |\n" +
                       "|                   |                   |                    |\n" +
                       "|                                                            |\n" +
                       "|                        ___     ___                         |\n" +
                       "|                   |   |           |   |                    |\n" +
                       "|______      _______|___|           |___|_______      _______|\n" +
                       "|                   |   |___________|   |                    |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                                                            |\n" +
                       "|                   |                   |                    |\n" +
                       "|___________________|_______     _______|____________________|\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |                   |\n" +
                       "                    |-------------------|\n" +
                       "                         ___________     \n" +                          
                       "                        |   "+x+"   |\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" +
                       "                        |___________|\n" 
                       
                       );
    
                }
            }
        }

