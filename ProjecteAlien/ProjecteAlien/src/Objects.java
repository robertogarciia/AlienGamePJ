public class Objects {

    private String name;
    private String description;
    private Boolean usable;
    private Boolean pickable;

    public Objects(String name, String description, Boolean usable, Boolean pickable) {
        this.name = name;
        this.description = description;
        this.usable = usable;
        this.pickable = pickable;
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

    public Boolean getUsable() {
        return usable;
    }

    public void setUsable(Boolean usable) {
        this.usable = usable;
    }

    public Boolean getPickable() {
        return pickable;
    }

    public void setPickable(Boolean pickable) {
        this.pickable = pickable;
    };

    

}
