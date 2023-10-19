public class Npcs extends Character{

    private String dialogue;

    public Npcs(String name, int roomId, String dialogue) {
        super(name, roomId);
       
        this.dialogue = dialogue;
    }

    public String getDialogue() {
        return dialogue;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }

    

}
