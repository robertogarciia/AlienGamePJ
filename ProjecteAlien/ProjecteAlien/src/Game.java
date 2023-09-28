import java.util.ArrayList;

public class Game {

    private ArrayList<Player> player = new ArrayList<Player>();
    private ArrayList<Rooms> room = new ArrayList<Rooms>();

    public Game(ArrayList<Player> player, ArrayList<Rooms> room) {
        this.player = player;
        this.room = room;
    }

    public ArrayList<Player> getPlayer() {
        return player;
    }

    public void setPlayer(ArrayList<Player> player) {
        this.player = player;
    }

    public ArrayList<Rooms> getRoom() {
        return room;
    }

    public void setRoom(ArrayList<Rooms> room) {
        this.room = room;
    }
 
}
