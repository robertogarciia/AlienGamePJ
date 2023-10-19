public class Player extends Character{

    private Boolean life;

    public Player(String name, int roomId, Boolean life) {
        super(name, roomId);
        
        this.life = life;
    }

    public Boolean getLife() {
        return life;
    }

    public void setLife(Boolean life) {
        this.life = life;
    }

}
