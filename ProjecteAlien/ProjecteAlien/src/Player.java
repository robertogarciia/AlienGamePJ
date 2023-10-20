import java.util.ArrayList;

public class Player extends Character{

    private Boolean life;
    public  ArrayList<Player> Inventari;

    public Player(String name, int roomId, Boolean life) {
        super(name, roomId);
        
        this.life = life;
        Inventari = new ArrayList<Player>();
    }

    public Boolean getLife() {
        return life;
    }

    public void setLife(Boolean life) {
        this.life = life;
    }

}
