public class Donuts extends Objects{

    private Boolean eaten;

    public Donuts(String name, String description, Boolean usable, Boolean eaten) {
        super(name, description, usable);

        this.eaten = eaten;
       
    }

    public Boolean getEaten() {
        return eaten;
    }

    public void setEaten(Boolean eaten) {
        this.eaten = eaten;
    }
    
}
