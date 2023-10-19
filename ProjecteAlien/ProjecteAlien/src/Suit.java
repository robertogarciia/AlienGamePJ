public class Suit extends Objects {
    
    private Boolean suitOn;

    public Suit(String name, String description, Boolean usable, Boolean suitOn) {
        super(name, description, usable);
        
        this.suitOn = suitOn;
    }

    public Boolean getSuitOn() {
        return suitOn;
    }

    public void setSuitOn(Boolean suitOn) {
        this.suitOn = suitOn;
    }

    

   
    
}
