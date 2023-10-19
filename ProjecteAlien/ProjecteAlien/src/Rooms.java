import java.util.*;

public class Rooms {
   
    public static int roomId = 8;
    private String description;
    String name = "";
    public  ArrayList<Objects> object;

    public Rooms(int roomId, String description,String name) {
        this.roomId = roomId;
        this.description = description;
        this.name = name;
        object = new ArrayList<Objects>();
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
};


