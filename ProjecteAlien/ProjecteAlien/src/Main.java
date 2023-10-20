import java.util.*;

public class Main {

    public static  ArrayList<Rooms> rooms;
    int roomId;
    Player p;
    
    public static void main(String[] args){
        Main m = new Main();
        m.principal();
        }

public void principal(){
    Scanner sc = new Scanner(System.in);
        boolean jocacabat = false;
        int option;
       
        


        makeroomsobjectsGame();
        roomId = Rooms.getRoomId();
        Game g = new Game();
        p = new Player("eee",8,true);
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
                     g.ShowMap(p.getRoomId());
                     break;
                case 2 :
                    move();   
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
 void makeroomsobjectsGame(){
        rooms = new ArrayList<Rooms>();

        Rooms a = new Rooms(0, "a", "a");
        rooms.add(a);

        Rooms Taller = new Rooms(1, "Has entrat al taller, està tot desordenat.", "Taller");
        rooms.add(Taller);

        Rooms Vestuari = new Rooms(2, "Estàs al vestuari, hi hà un tratje d'astronauta per sortir a fora.", "Vestuari");
        rooms.add(Vestuari);

        Rooms Oficines = new Rooms(3, "Has entrat a les oficines, esta tot ple de papers.", "Oficines");
        rooms.add(Oficines);

        Rooms Banys = new Rooms(4, "Has trobat els lavabos, si vols fer algo endevant.", "Banys");
        rooms.add(Banys);

        Rooms Comandament = new Rooms(5, "Has entrat a la sala de comandament, no toquis ningún botó", "Comandament");
        rooms.add(Comandament);

        Rooms Cuina = new Rooms(6, "Has entrat a la cuina, hi han forquilles volant, cuidado.", "Cuina");
        rooms.add(Cuina);

        Rooms Menjador = new Rooms(7, "Has entrat al menjador, no menjis fins que tothom estigui a la taula per respecte.", "Menjador");
        rooms.add(Menjador);
        
        Rooms Dormitori = new Rooms(8, "Has entrat al dormitori, estan tots els llits fets.", "Dormitori");
        rooms.add(Dormitori);
        
        Rooms SalaExterior = new Rooms(9, "Has sortir a l'espai, cuidado que hi han aasteroides per aqui!", "Sala Exterior");
        rooms.add(SalaExterior);
        
        Rooms Propulsor = new Rooms(10, "Hayayay quan de fum hi ha aqui!", "Propulsor");
        rooms.add(Propulsor);

        Random rand = new Random();
        int randomRoomIndex = rand.nextInt(rooms.size()); // Elije una habitación al azar
        Rooms randomRoom = rooms.get(randomRoomIndex);
        
        
        //Afegir els objectes a cada room
        MechanicTool Mechanic_tool = new MechanicTool("Eina mecanica", "L'eina mecanica es un objecte que es pot utilitzar per arreglar coses", true);
        Taller.object.add(Mechanic_tool);

        Card card = new Card("Targeta", "Aquesta targeta la pots utilitzar per obrir portes, pero has d'anar amb compte ja que al no ser teva l'alhilal no es fiara de tu!", true);
        Oficines.object.add(card);
        
        Card mateIdcard = new Card("Targeta", "Aquesta targeta la pots utilitzar per obrir portes, pero has d'anar amb compte ja que al no ser teva l'alhilal no es fiara de tu!", true);
        Dormitori.object.add(mateIdcard);
        
        Suit Space_Suit = new Suit("Tratge Espacial", "Amb aquest tratge podras anar a la sala exterior sense perill", true, false);
        Vestuari.object.add(Space_Suit);
        
        Linterna Flash_light = new Linterna("Linterna", "T'ajuda a iluminar habitacions sense il·luminació per poder trobar objectes", true, false);
        randomRoom.object.add(Flash_light);
        
        Donuts Donuts = new Donuts("Donuts", "Si no vols morir, dona-li els donuts al gonzalin",true,false);
        Cuina.object.add(Donuts);
    }

    
    public  void DiscoverItems(){

        System.out.println("A la zona " + rooms.get(p.getRoomId()).getName() + " hay los siguientes objetos:\n");

        if (!rooms.get(p.getRoomId()).object.isEmpty()) {
            for (Objects objeto : rooms.get(p.getRoomId()).object) {
                System.out.println("- " + objeto.getName() + ": " + objeto.getDescription() + "\n");
            }
        } else {
            System.out.println("No hi han objectes a la zona.\n");
        }
       
    }
    
    //Codi per moure el personatje 
    public void move() {

        Scanner scan = new Scanner(System.in);
        int moures;
        int decisio;

        System.out.println("A quina habitacio et vols moure");
        switch(p.getRoomId()){
            case 1:
                System.out.println("Estas al "+ rooms.get(1).getName() +"Vols avançar(1) o mantenir-te(2)?, nomes pots anar cap a les oficines(2)"+rooms.get(3).getName()+".");
                System.out.println("");
                moures = scan.nextInt();

                if(moures == 1){   
                    System.out.println("Has avançat cap a la "+rooms.get(3).getName()+".");
                    p.setRoomId(3);
                    System.out.println(rooms.get(3).getDescription());
                } else if(moures == 2){
                    System.out.println("Has decidit quedarte al "+rooms.get(1).getName()+".");
                    
                } else {
                    System.out.println("Siusplau introdueix 1 per avançar o 2 per mantenir-me per poder moure't.");
                }
                break;
            case 2:
                System.out.println("Estan al "+rooms.get(2).getName()+", pots anar cap a la "+rooms.get(3).getName()+"(1) o cap a la "+rooms.get(6).getName()+"(2).");
                System.out.println("Vols avançar(1) o mantenir-te(2) al "+rooms.get(2).getName()+"?");
                moures = scan.nextInt();

                if(moures == 1) {  
                    System.out.println("cap a on vols avançar?");
                    decisio = scan.nextInt();
                    if(decisio == 1){
                        System.out.println("Has abançat cap a les "+rooms.get(3).getName()+".");
                        p.setRoomId(3);
                        System.out.println(rooms.get(3).getDescription());
                    } else if(decisio == 2){
                        System.out.println("Has abançat cap a la "+rooms.get(6).getName()+".");
                        p.setRoomId(6);
                        System.out.println(rooms.get(6).getDescription());
                    } else {
                        System.out.println("Siusplau introdueix '"+rooms.get(3).getName()+"' o '"+rooms.get(5).getName()+"' per poder avançar.");
                    }
                } else if(moures == 2){
                    System.out.println("Has decidit quedarte al "+rooms.get(2).getName()+ ".");
                } else {
                    System.out.println("Siusplau introdueix 1 per avançar o 2 per mantenir-me per poder moure't.");
                }
                break;
            case 3:
                System.out.println("Estan a l'"+rooms.get(3).getName()+", pots anar cap els "+rooms.get(1).getName()+"(1), "+rooms.get(2).getName()+"(2), "+rooms.get(4).getName()+"(3) i els "+rooms.get(5).getName()+"(4).");
                System.out.println("Vols avançar(1) o mantenir-te(2) al "+ rooms.get(2).getName()+"?");
                moures = scan.nextInt();

                if(moures == 1) {
                    System.out.println("cap a on vols avançar?");
                    decisio = scan.nextInt();

                    if(decisio == 1){
                        System.out.println("Has abançat cap al "+rooms.get(1).getName()+"");
                        p.setRoomId(1);
                        System.out.println(rooms.get(1).getDescription());
                    }else if(decisio == 2){
                        System.out.println("Has abançat cap al "+rooms.get(2).getName()+"");
                        p.setRoomId(2);
                        System.out.println(rooms.get(2).getDescription());
                    }else if(decisio == 3){
                        System.out.println("Has abançat cap als "+rooms.get(4).getName()+".");
                        p.setRoomId(4);
                        System.out.println(rooms.get(4).getDescription());
                    }else if(decisio == 4){
                        System.out.println("Has avançat cap als "+rooms.get(5).getName()+".");
                        p.setRoomId(5);
                        System.out.println(rooms.get(5).getDescription());
                    }
                }else if(moures == 2){
                    System.out.println("Has decidit quedarte al "+rooms.get(3).getName()+ ".");
                }else {
                    System.out.println("Siusplau introdueix 1 per avançar o 2 per mantenir-me per poder moure't.");
                }
                break;
            case 4:
                System.out.println("Estan als "+rooms.get(4).getName()+", pots anar cap a les "+rooms.get(3).getName()+"(1) i cap al "+rooms.get(8).getName()+"(2).");
                System.out.println("Vols avançar(1) o mantenir-te(2) al "+rooms.get(3).getName()+"?");
                moures = scan.nextInt();

                if(moures == 1){
                    System.out.println("cap a on vols avançar?");
                    decisio = scan.nextInt();

                    if(decisio == 1) {
                        System.err.println("Has avançat cap a les "+rooms.get(3).getName()+".");
                        p.setRoomId(3);
                        System.out.println(rooms.get(3).getDescription());
                    }else if( decisio == 2){
                        System.out.println("Has avançat cap al "+rooms.get(8).getName()+".");
                        p.setRoomId(8);
                        System.out.println(rooms.get(8).getDescription());
                    }else{
                        System.out.println("Sisplau introdueix "+rooms.get(3).getName()+" o "+rooms.get(8).getName()+" per poder avançar.");
                    }

                }else if(moures == 2){
                    System.out.println("Has decidit quedarte al "+rooms.get(4).getName()+ ".");
                }else{
                    System.out.println("Siusplau introdueix 1 per avançar o 2 per mantenir-me per poder moure't.");
                }
                break;
            case 5:
                System.out.println("Estan al "+rooms.get(5).getName()+", nomes pots anar cap a les "+rooms.get(3).getName()+"(1).");
                System.out.println("Vols avançar(1) o mantenir-te(2) al "+rooms.get(4).getName()+"?");
                moures = scan.nextInt();

                if(moures == 1){   
                    System.out.println("Has avançat cap a les "+rooms.get(3).getName()+".");
                    p.setRoomId(3);
                    System.out.println(rooms.get(3).getDescription());
                } else if(moures == 2){
                    System.out.println("Has decidit quedarte al "+rooms.get(5).getName()+".");
                } else {
                    System.out.println("Siusplau introdueix 1 per avançar o 2 per mantenir-me per poder moure't.");
                }
                break;
            case 6:
                System.out.println("Estan al "+rooms.get(6).getName()+", pots anar cap al "+rooms.get(2).getName()+"(1) i cap al "+rooms.get(7).getName()+"(2).");
                System.out.println("Vols avançar(1) o mantenir-te(2) al "+rooms.get(5).getName()+"?");
                moures = scan.nextInt();

                if(moures == 1){
                    System.out.println("cap a on vols avançar");
                    decisio = scan.nextInt();

                    if(decisio == 1){
                        System.out.println("Has avançat cap al "+rooms.get(2).getName()+".");
                        p.setRoomId(2);
                        System.out.println(rooms.get(2).getDescription());
                    }else if(decisio == 2){
                        System.out.println("Has avançat cap al "+rooms.get(7).getName()+".");
                        p.setRoomId(7);
                        System.out.println(rooms.get(7).getDescription());
                    }else{
                        System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                    }
                }else if(moures == 2){
                    System.out.println("Has decidit quedarte a la "+rooms.get(6).getName()+".");
                }else{
                    System.out.println("Siusplau introdueix 1 per avançar o 2 per mantenir-me per poder moure't.");
                }
                break;
            case 7:
                System.out.println("Estan al "+rooms.get(7).getName()+", pots anar cap la "+rooms.get(6).getName()+"(1), "+rooms.get(8).getName()+"(2) i al "+rooms.get(9).getName()+"(3).");
                System.out.println("Vols avançar(1) o mantenir-te(2) al "+rooms.get(6).getName()+"?");
                moures = scan.nextInt();

                if(moures == 1){
                    System.out.println("cap a on vols avançar");
                    decisio = scan.nextInt();

                    if(decisio == 1){
                        System.out.println("Has avançat cap al "+rooms.get(6).getName()+".");
                        p.setRoomId(6);
                        System.out.println(rooms.get(6).getDescription());
                    }else if(decisio == 2){
                        System.out.println("Has avançat cap al "+rooms.get(8).getName()+".");
                        p.setRoomId(8);
                        System.out.println(rooms.get(8).getDescription());
                    }else if(decisio == 3){
                        System.out.println("Has avançat cap al "+rooms.get(9).getName()+".");
                        p.setRoomId(9);
                        System.out.println(rooms.get(9).getDescription());
                    }else{
                        System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                    }
                }else if(moures == 2){
                    System.out.println("Has decidit quedarte a la "+rooms.get(7).getName()+".");
                }else{
                    System.out.println("Siusplau introdueix 1 per avançar o 2 per mantenir-me per poder moure't.");
                }
                break;
            case 8:
                System.out.println("Estan al "+rooms.get(8).getName()+", pots anar cap el "+rooms.get(7).getName()+"(1) i cap als "+rooms.get(4).getName()+"(2).");
                System.out.println("Vols avançar(1) o mantenir-te(2) al "+rooms.get(7).getName()+"?");
                moures = scan.nextInt();

                if(moures == 1){
                    System.out.println("cap a on vols avançar");
                    decisio = scan.nextInt();
                    if(decisio == 1){
                        System.out.println("Has avançat cap al "+rooms.get(7).getName()+".");
                        p.setRoomId(7);
                        System.out.println(rooms.get(7).getDescription());
                    }else if(decisio == 2){
                        System.out.println("Has avançat cap al "+rooms.get(4).getName()+".");
                        p.setRoomId(4);
                        System.out.println(rooms.get(4).getDescription());
                    }else{
                        System.out.println("Siusplau introdueix 1 per avançar o 2 per mantenir-me per poder moure't.");
                    }
                }else if(moures == 2){
                    System.out.println("Has decidit quedarte a la "+rooms.get(7).getName()+".");
                }else{
                    System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                }
                break;
            case 9:
                System.out.println("Estan al "+rooms.get(9).getName()+", pots anar cap el "+rooms.get(7).getName()+"(1) i cap al "+rooms.get(10).getName()+"(2).");
                System.out.println("Vols avançar(1) o mantenir-te(2) al "+rooms.get(9).getName()+"?");
                moures = scan.nextInt();

                if(moures == 1){  
                    System.out.println("cap a on vols avançar");
                    decisio = scan.nextInt(); 

                    if(decisio == 1){
                        System.out.println("Has abançat cap a les "+rooms.get(7).getName()+".");
                        p.setRoomId(7);
                        System.out.println(rooms.get(7).getDescription());
                    }else if(decisio == 2){
                        System.out.println("Has avançat cap al "+rooms.get(10).getName()+".");
                        p.setRoomId(10);
                        System.out.println(rooms.get(10).getDescription());
                    }else{
                        System.out.println("Siusplau introdueix 1 per avançar o 2 per mantenir-me per poder moure't.");
                    }
                } else if(moures == 2){
                    System.out.println("Has decidit quedarte al "+rooms.get(9).getName()+".");
                } else {
                    System.out.println("Siusplau introdueix 1 per avançar o 2 per mantenir-me per poder moure't.");
                }
                break; 
            case 10:
                System.out.println("Estan al "+rooms.get(10).getName()+", nomes pots anar cap el "+rooms.get(9).getName()+"(1).");
                System.out.println("Vols avançar(1) o mantenir-te(2) al "+rooms.get(10).getName()+"?");
                moures = scan.nextInt();

                if(moures == 1){  
                    System.out.println("Has abançat cap a les "+rooms.get(9).getName()+".");
                    p.setRoomId(9);
                    System.out.println(rooms.get(9).getDescription()); 
                } else if(moures == 2){
                    System.out.println("Has decidit quedarte al "+rooms.get(10).getName()+".");
                } else {
                    System.out.println("Siusplau introdueix 1 per avançar o 2 per mantenir-me per poder moure't.");
                }
                break;                 
        }

  }


        
}