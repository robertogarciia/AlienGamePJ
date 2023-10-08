import java.util.*;

public class Rooms {
    static public ArrayList<Rooms> rooms;
    private static int roomId = 7;
    private String description;
    String name = "";

    public Rooms(int roomid, String description,String name) {
        this.roomId = roomid;
        this.description = description;
        this.name = name;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    static void establirRoomsGame(){
        rooms = new ArrayList<Rooms>();

        Rooms Taller = new Rooms(0, "Has entrat al taller, està tot desordenat.", "Taller");
        Rooms Vestuari = new Rooms(1, "Estàs al vestuari, hi hà un tratje d'astronauta per sortir a fora.", "Vestuari");
        Rooms Oficines = new Rooms(2, "Has entrat a les oficines, esta tot ple de papers.", "Oficines");
        Rooms Banys = new Rooms(3, "Has trobat els lavabos, si vols fer algo endevant.", "Banys");
        Rooms Comandament = new Rooms(4, "Has entrat a la sala de comandament, no toquis ningún botó", "Comandament");
        Rooms Cuina = new Rooms(5, "Has entrat a la cuina, hi han forquilles volant, cuidado.", "Cuina");
        Rooms Menjador = new Rooms(6, "Has entrat al menjador, no menjis fins que tothom estigui a la taula per respecte.", "Menjador");
        Rooms Dormitori = new Rooms(7, "Has entrat al dormitori, estan tots els llits fets.", "Dormitori");
        Rooms SalaExterior = new Rooms(8, "Has sortir a l'espai, cuidado que hi han aasteroides per aqui!", "Sala Exterior");

        rooms.add(Taller);
        rooms.add(Vestuari);
        rooms.add(Oficines);
        rooms.add(Banys);
        rooms.add(Comandament);
        rooms.add(Cuina);
        rooms.add(Menjador);
        rooms.add(Dormitori);
        rooms.add(SalaExterior);
    }

    public static void move( int roomId) {

        Scanner scan = new Scanner(System.in);
        String moures;
        String decisio;

        Rooms room0 = rooms.get(7);

        System.out.println("A quina habitacio et vols moure");
        switch(roomId){
            case 0:
                System.out.println("Estan al "+ rooms.get(0).getName() +", nomes pots anar cap a les oficines"+rooms.get(2).getName()+".");
                System.out.println("Vols avançar o mantenir-te al taller?");
                moures = scan.next();

                if(moures == "avansar"){   
                    System.out.println("Has abançat cap a les "+rooms.get(2).getName()+".");
                    
                    roomId = 2;
                } else if(moures == "mantenir-me"){
                    System.out.println("Has decidit quedarte al "+rooms.get(0).getName()+".");
                } else {
                    System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                }
            case 1:
                System.out.println("Estan al "+rooms.get(1).getName()+", pots anar cap a les "+rooms.get(2).getName()+" o cap a la "+rooms.get(5).getName()+".");
                System.out.println("Vols avançar o mantenir-te al "+rooms.get(1).getName()+"?");
                moures = scan.next();

                if(moures == "avançar") {  
                    System.out.println("cap a on vols avançar?");
                    decisio = scan.next();
                    if(decisio == "oficines"){
                        System.out.println("Has abançat cap a les "+rooms.get(2).getName()+".");
                        roomId = 2;
                    } else if(decisio == "cuina"){
                        System.out.println("Has abançat cap a la "+rooms.get(5).getName()+".");
                        roomId = 5;
                    } else {
                        System.out.println("Siusplau introdueix '"+rooms.get(2).getName()+"' o '"+rooms.get(5).getName()+"' per poder avançar.");
                    }
                } else if(moures == "mantenir-me"){
                    System.out.println("Has decidit quedarte al "+rooms.get(1).getName()+ ".");
                } else {
                    System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                }
            case 2:
                System.out.println("Estan a l'"+rooms.get(2).getName()+", pots anar cap els "+rooms.get(0).getName()+", "+rooms.get(1).getName()+", "+rooms.get(4).getName()+" i els "+rooms.get(3).getName()+".");
                System.out.println("Vols avançar o mantenir-te al "+ rooms.get(2).getName()+"?");
                moures = scan.next();

                if(moures == "avançar") {
                    System.out.println("cap a on vols avançar?");
                    decisio = scan.next();

                    if(decisio == "taller"){
                        System.out.println("Has abançat cap al "+rooms.get(0).getName()+"");
                        roomId = 0;
                    }else if(decisio == "vestuari"){
                        System.out.println("Has abançat cap al "+rooms.get(1).getName()+"");
                        roomId = 1;
                    }else if(decisio == "banys"){
                        System.out.println("Has abançat cap als "+rooms.get(3).getName()+".");
                        roomId = 3;
                    }else if(decisio == "comandament"){
                        System.out.println("Has avançat cap als "+rooms.get(4).getName()+".");
                    }

                }else if(moures == "mantenir-se"){
                    System.out.println("Has decidit quedarte al "+rooms.get(2).getName()+ ".");
                }else {
                    System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                }
            case 3:
                System.out.println("Estan als "+rooms.get(3).getName()+", pots anar cap a les "+rooms.get(2).getName()+" i cap al "+rooms.get(7).getName()+".");
                System.out.println("Vols avançar o mantenir-te al "+rooms.get(3).getName()+"?");
                moures = scan.next();

                if(moures == "avançar"){
                    System.out.println("cap a on vols avançar?");
                    decisio = scan.next();

                    if(decisio == "oficines") {
                        System.err.println("Has avançat cap a les "+rooms.get(2).getName()+".");
                        roomId = 2;
                    }else if( decisio == "dormitori"){
                        System.out.println("Has avançat cap al "+rooms.get(7).getName()+".");
                        roomId = 7;
                    }else{
                        System.out.println("Sisplau introdueix "+rooms.get(2).getName()+" o "+rooms.get(7).getName()+" per poder avançar.");
                    }

                }else if(moures == "mantenir-se"){
                    System.out.println("Has decidit quedarte al "+rooms.get(2).getName()+ ".");
                }else{
                    System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                }
            case 4:
                System.out.println("Estan al "+rooms.get(4).getName()+", nomes pots anar cap a les "+rooms.get(2).getName()+".");
                System.out.println("Vols avançar o mantenir-te al "+rooms.get(4).getName()+"?");
                moures = scan.next();

                if(moures == "avançar"){   
                    System.out.println("Has abançat cap a les "+rooms.get(2).getName()+".");
                    roomId = 2;
                } else if(moures == "mantenir-me"){
                    System.out.println("Has decidit quedarte al "+rooms.get(4).getName()+".");
                } else {
                    System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                }
            case 5:
                System.out.println("Estan al "+rooms.get(5).getName()+", pots anar cap al "+rooms.get(1).getName()+" i cap al "+rooms.get(6).getName()+".");
                System.out.println("Vols avançar o mantenir-te al "+rooms.get(5).getName()+"?");
                moures = scan.next();

                if(moures == "avançar"){
                    System.out.println("cap a on vols avançar");
                    decisio = scan.next();

                    if(decisio == "vestidor"){
                        System.out.println("Has avançat cap al "+rooms.get(1).getName()+".");
                        roomId = 1;
                    }else if(decisio == "menjador"){
                        System.out.println("Has avançat cap al "+rooms.get(6).getName()+".");
                        roomId = 6;
                    }else{
                        System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                    }
                }else if(moures == "mantenir-me"){
                    System.out.println("Has decidit quedarte a la "+rooms.get(5).getName()+".");
                }else{
                    System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                }
            case 6:
                System.out.println("Estan al "+rooms.get(6).getName()+", pots anar cap la "+rooms.get(5).getName()+", "+rooms.get(8).getName()+" i al "+rooms.get(7).getName()+".");
                System.out.println("Vols avançar o mantenir-te al "+rooms.get(6).getName()+"?");
                moures = scan.next();

                if(moures == "avançar"){
                    System.out.println("cap a on vols avançar");
                    decisio = scan.next();

                    if(decisio == "cuina"){
                        System.out.println("Has avançat cap al "+rooms.get(5).getName()+".");
                        roomId = 5;
                    }else if(decisio == "sortida exterior"){
                        System.out.println("Has avançat cap al "+rooms.get(8).getName()+".");
                        roomId = 8;
                    }else if(decisio == "dormitori"){
                        System.out.println("Has avançat cap al "+rooms.get(7).getName()+".");
                        roomId = 7;
                    }else{
                        System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                    }
                }else if(moures == "mantenir-me"){
                    System.out.println("Has decidit quedarte a la "+rooms.get(6).getName()+".");
                }else{
                    System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                }
            case 7:
                System.out.println("Estan al "+rooms.get(7).getName()+", pots anar cap el "+rooms.get(6).getName()+" i cap als "+rooms.get(3).getName()+".");
                System.out.println("Vols avançar o mantenir-te al "+rooms.get(7).getName()+"?");
                moures = scan.next();

                if(moures == "avansar"){
                    System.out.println("cap a on vols avançar");
                    decisio = scan.next();

                    if(decisio == "menjador"){
                        System.out.println("Has avançat cap al "+rooms.get(6).getName()+".");
                        roomId = 5;
                    }else if(decisio == "sortida exterior"){
                        System.out.println("Has avançat cap al "+rooms.get(3).getName()+".");
                        roomId = 3;
                    }else{
                        System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                    }
                }else if(moures == "mantenir-me"){
                    System.out.println("Has decidit quedarte a la "+rooms.get(7).getName()+".");
                }else{
                    System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                }
            case 8:
                System.out.println("Estan al "+rooms.get(8).getName()+", nomes pots anar cap el "+rooms.get(6).getName()+".");
                System.out.println("Vols avançar o mantenir-te al "+rooms.get(8).getName()+"?");
                moures = scan.next();

                if(moures == "avançar"){   
                    System.out.println("Has abançat cap a les "+rooms.get(6).getName()+".");
                    roomId = 6;
                } else if(moures == "mantenir-me"){
                    System.out.println("Has decidit quedarte al "+rooms.get(8).getName()+".");
                } else {
                    System.out.println("Siusplau introdueix 'avançar' o 'mantenir-me' per poder moure't.");
                }
                
                
                


                
                
        }
    


      
        

  }
    };


