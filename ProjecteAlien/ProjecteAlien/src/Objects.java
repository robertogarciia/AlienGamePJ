public class Objects {

    private String name;
    private String description;
    private Boolean take;
    

    public Objects(String name, String description, Boolean take) {
        this.name = name;
        this.description = description;
        this.take = take;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getTake() {
        return take;
    }

    public void setTake(Boolean usable) {
        this.take = usable;
    }    

}
