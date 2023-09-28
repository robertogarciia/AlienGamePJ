import java.util.ArrayList;

public class Rooms {
    
    private String roomName;
    private String description;
    private Boolean lights;
    private ArrayList<Objects> object = new ArrayList<Objects>();
    private ArrayList<Npcs> npc = new ArrayList<Npcs>();
    private int doors;

    public Rooms(String roomName, String description, Boolean lights, ArrayList<Objects> object, ArrayList<Npcs> npc, int doors) {

        this.roomName = roomName;
        this.description = description;
        this.lights = lights;
        this.object = object;
        this.npc = npc;
        this.doors = doors; 

    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
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
    };
}
