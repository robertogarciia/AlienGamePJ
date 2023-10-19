import java.util.*;

public class Rooms {
    static public ArrayList<Rooms> rooms;
    public static int roomId = 8;
    private String description;
    String name = "";
    public ArrayList<Objects> objeto;

    public Rooms(int roomid, String description,String name) {
        this.roomId = roomId;
        this.description = description;
        this.name = name;
        objeto = new ArrayList<Objects>();
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

    //Crear i Inicialitzar les Rooms
    static void makeroomsobjectsGame(){
        Random rand = new Random(roomId);
        
        rooms = new ArrayList<Rooms>();

        Rooms Taller = new Rooms(1, "Has entrat al taller, està tot desordenat.", "Taller");
        Rooms Vestuari = new Rooms(2, "Estàs al vestuari, hi hà un tratje d'astronauta per sortir a fora.", "Vestuari");
        Rooms Oficines = new Rooms(3, "Has entrat a les oficines, esta tot ple de papers.", "Oficines");
        Rooms Banys = new Rooms(4, "Has trobat els lavabos, si vols fer algo endevant.", "Banys");
        Rooms Comandament = new Rooms(5, "Has entrat a la sala de comandament, no toquis ningún botó", "Comandament");
        Rooms Cuina = new Rooms(6, "Has entrat a la cuina, hi han forquilles volant, cuidado.", "Cuina");
        Rooms Menjador = new Rooms(7, "Has entrat al menjador, no menjis fins que tothom estigui a la taula per respecte.", "Menjador");
        Rooms Dormitori = new Rooms(8, "Has entrat al dormitori, estan tots els llits fets.", "Dormitori");
        Rooms SalaExterior = new Rooms(9, "Has sortir a l'espai, cuidado que hi han aasteroides per aqui!", "Sala Exterior");
        Rooms Propulsor = new Rooms(10, "Hayayay quan de fum hi ha aqui!", "Propulsor");

        rooms.add(Propulsor);
        rooms.add(Taller);
        rooms.add(Vestuari);
        rooms.add(Oficines);
        rooms.add(Banys);
        rooms.add(Comandament);
        rooms.add(Cuina);
        rooms.add(Menjador);
        rooms.add(Dormitori);
        rooms.add(SalaExterior);

        //Afegir els objectes a cada room
        MechanicTool Mechanic_tool = new MechanicTool("Eina mecanica", "L'eina mecanica es un objecte que es pot utilitzar per arreglar coses", true);
        Taller.objeto.add(Mechanic_tool);

        Card card = new Card("Targeta", "Aquesta targeta la pots utilitzar per obrir portes, pero has d'anar amb compte ja que al no ser teva l'alhilal no es fiara de tu!", true);
        Oficines.objeto.add(card);
        
        Card mateIdcard = new Card("Targeta", "Aquesta targeta la pots utilitzar per obrir portes, pero has d'anar amb compte ja que al no ser teva l'alhilal no es fiara de tu!", true);
        Dormitori.objeto.add(mateIdcard);
        
        Suit Space_Suit = new Suit("Tratge Espacial", "Amb aquest tratge podras anar a la sala exterior sense perill", true, false);
        Vestuari.objeto.add(Space_Suit);
        
        Linterna Flash_light = new Linterna("Linterna", "T'ajuda a iluminar habitacions sense iluminacio per poder trobar objectes", true, false);
        //Rooms.(rand).objeto.add(Flash_light);
        
        Donuts Donuts = new Donuts("Donuts", "Si no vols morir, dona-li els donuts al gonzalin",true,false);
        Cuina.objeto.add(Donuts);
    }

    
    //Codi per moure el personatje 
    public static void move() {

        Scanner scan = new Scanner(System.in);
        int moures;
        int decisio;

        System.out.println("A quina habitacio et vols moure");
        switch(roomId){
            case 1:
                System.out.println("Estan al "+ rooms.get(1).getName() +", nomes pots anar cap a les oficines(2)"+rooms.get(3).getName()+".");
                System.out.println("Vols avançar(1) o mantenir-te(2) al taller?");
                moures = scan.nextInt();

                if(moures == 1){   
                    System.out.println("Has avançat cap a la "+rooms.get(3).getName()+".");
                    roomId = 3;
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
                        roomId = 3;
                        System.out.println(rooms.get(3).getDescription());
                    } else if(decisio == 2){
                        System.out.println("Has abançat cap a la "+rooms.get(6).getName()+".");
                        roomId = 6;
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
                        roomId = 1;
                        System.out.println(rooms.get(1).getDescription());
                    }else if(decisio == 2){
                        System.out.println("Has abançat cap al "+rooms.get(2).getName()+"");
                        roomId = 2;
                        System.out.println(rooms.get(2).getDescription());
                    }else if(decisio == 3){
                        System.out.println("Has abançat cap als "+rooms.get(4).getName()+".");
                        roomId = 4;
                        System.out.println(rooms.get(4).getDescription());
                    }else if(decisio == 4){
                        System.out.println("Has avançat cap als "+rooms.get(5).getName()+".");
                        roomId = 5;
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
                        roomId = 3;
                        System.out.println(rooms.get(3).getDescription());
                    }else if( decisio == 2){
                        System.out.println("Has avançat cap al "+rooms.get(8).getName()+".");
                        roomId = 8;
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
                    roomId = 3;
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
                        roomId = 2;
                        System.out.println(rooms.get(2).getDescription());
                    }else if(decisio == 2){
                        System.out.println("Has avançat cap al "+rooms.get(7).getName()+".");
                        roomId = 7;
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
                        roomId = 6;
                        System.out.println(rooms.get(6).getDescription());
                    }else if(decisio == 2){
                        System.out.println("Has avançat cap al "+rooms.get(8).getName()+".");
                        roomId = 8;
                        System.out.println(rooms.get(8).getDescription());
                    }else if(decisio == 3){
                        System.out.println("Has avançat cap al "+rooms.get(9).getName()+".");
                        roomId = 9;
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
                        roomId = 7;
                        System.out.println(rooms.get(7).getDescription());
                    }else if(decisio == 2){
                        System.out.println("Has avançat cap al "+rooms.get(4).getName()+".");
                        roomId = 4;
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
                        roomId = 7;
                        System.out.println(rooms.get(7).getDescription());
                    }else if(decisio == 2){
                        System.out.println("Has avançat cap al "+rooms.get(10).getName()+".");
                        roomId = 10;
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
                        roomId = 9;
                        System.out.println(rooms.get(9).getDescription()); 
                    } else if(moures == 2){
                        System.out.println("Has decidit quedarte al "+rooms.get(10).getName()+".");
                    } else {
                        System.out.println("Siusplau introdueix 1 per avançar o 2 per mantenir-me per poder moure't.");
                    }
                    break;                 
        }

  }
    };


