public class Alhilal extends Npcs{

    private int tellthetruth;

    public Alhilal(String name, int roomId, String dialogue, int tellthetruth) {
        super(name, roomId, dialogue);
        
        this.tellthetruth = tellthetruth;
    }

    public int getTellthetruth() {
        return tellthetruth;
    }

    public void setTellthetruth(int tellthetruth) {
        this.tellthetruth = tellthetruth;
    }
    
}
