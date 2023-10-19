public class Alien extends Npcs{

    private Boolean alive;

    public Alien(String name, int roomId, String dialogue, boolean alive) {
        super(name, roomId, dialogue);
        
        this.alive = alive;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }
    
}
