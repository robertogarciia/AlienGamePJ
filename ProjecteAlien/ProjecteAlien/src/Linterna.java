public class Linterna extends Objects{

    private Boolean On;

    public Linterna(String name, String description, Boolean usable, Boolean On) {
        super(name, description, usable);
        
        this.On = On;
    }

    public Boolean getOn() {
        return On;
    }

    public void setOn(Boolean on) {
        On = on;
    }
    
}
