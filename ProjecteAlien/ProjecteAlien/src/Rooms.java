import java.util.*;

public class Rooms {
    
    private int roomId;
    private String description;
    private Boolean lights;
    private ArrayList<Objects> object = new ArrayList<Objects>();
    private ArrayList<Npcs> npc = new ArrayList<Npcs>();
    private int doors;
    private int[] rooms;

    public Rooms(int roomName, String description, Boolean lights, ArrayList<Objects> object, ArrayList<Npcs> npc, int doors, int[] rooms) {

        this.roomId = roomName;
        this.description = description;
        this.lights = lights;
        this.object = object;
        this.npc = npc;
        this.doors = doors;
        this.rooms = rooms;

    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomName) {
        this.roomId = roomName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getLights() {
        return lights;
    }

    public void setLights(Boolean lights) {
        this.lights = lights;
    }

    public ArrayList<Objects> getObject() {
        return object;
    }

    public void setObject(ArrayList<Objects> object) {
        this.object = object;
    }

    public ArrayList<Npcs> getNpc() {
        return npc;
    }

    public void setNpc(ArrayList<Npcs> npc) {
        this.npc = npc;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int[] getRooms() {
        return rooms;
    }

    public void setRooms(int[] rooms) {
        this.rooms = rooms;
    }

    public void move(int[] rooms, int roomId) {
        String[] zonas = new String[9];
        zonas[0] = "Taller";
        zonas[1] = "Vestidor"; 
        zonas[2] = "Oficines"; 
        zonas[3] = "Banys";
        zonas[4] = "Comandament";
        zonas[5] = "Cuina";
        zonas[6] = "Menjador";
        zonas[7] = "Dormitori";
        zonas[8] = "Sala exterior";

        Scanner scan = new Scanner(System.in);
        String moures;
        String decisió;

        System.out.println("A quina habitacio et vols moure");
        switch(roomId){
            case 0:
                System.out.println("Estan al "+ zonas[0] +", nomes pots anar cap a les oficines"+zonas[2]+".");
                System.out.println("Vols abançar o mantenir-te al taller?");
                moures = scan.next();

                if(moures == "abançar"){   
                    System.out.println("Has abançat cap a les "+zonas[2]+".");
                    roomId = 2;
                } else if(moures == "mantenir-me"){
                    System.out.println("Has decidit quedarte al "+zonas[0]+".");
                } else {
                    System.out.println("Siusplau introdueix 'abançar' o 'mantenir-me' per poder moure't.");
                }
            case 1:
                System.out.println("Estan al "+zonas[1]+", pots anar cap a les "+zonas[2]+" o cap a la "+zonas[5]+".");
                System.out.println("Vols abançar o mantenir-te al "+zonas[1]+"?");
                moures = scan.next();

                if(moures == "abançar") {  
                    System.out.println("cap a on vols abançar?");
                    decisió = scan.next();
                    if(decisió == "oficines"){
                        System.out.println("Has abançat cap a les "+zonas[2]+".");
                        roomId = 2;
                    } else if(decisió == "cuina"){
                        System.out.println("Has abançat cap a la "+zonas[5]+".");
                        roomId = 5;
                    } else {
                        System.out.println("Siusplau introdueix '"+zonas[2]+"' o '"+zonas[5]+"' per poder abançar.");
                    }
                } else if(moures == "mantenir-me"){
                    System.out.println("Has decidit quedarte al "+zonas[1]+ ".");
                } else {
                    System.out.println("Siusplau introdueix 'abançar' o 'mantenir-me' per poder moure't.");
                }
            case 2:
                System.out.println("Estan a l'"+zonas[2]+", pots anar cap els "+zonas[0]+", "+zonas[1]+", "+zonas[4]+" i els "+zonas[3]+".");
                System.out.println("Vols abançar o mantenir-te al "+zonas[2]+"?");
                moures = scan.next();

                if(moures == "abançar") {
                    System.out.println("cap a on vols abançar?");
                    decisió = scan.next();

                    if(decisió == "taller"){
                        System.out.println("Has abançat cap al "+zonas[0]+"");
                        roomId = 0;
                    }else if(decisió == "vestuari"){
                        System.out.println("Has abançat cap al "+zonas[1]+"");
                        roomId = 1;
                    }else if(decisió == "banys"){
                        System.out.println("Has abançat cap als "+zonas[3]+".");
                    }else if(decisió == "comandament"){
                        System.out.println("Has abançat cap als "+zonas[4]+".");
                    }

                }
                
        }
    

    };

}
