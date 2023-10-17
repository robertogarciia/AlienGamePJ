import java.util.ArrayList;

import javax.management.ObjectName;

public class Objects {

    private String name;
    private String description;
    private Boolean usable;
    static public ArrayList<Objects> objeto;

    public Objects(String name, String description, Boolean usable) {
        this.name = name;
        this.description = description;
        this.usable = usable;
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

    static void establirObjectes(){
        objeto = new ArrayList<Objects>();

        Objects Mechanic_tool = new Objects("Eina mecanica", "L'eina mecanica es un objecte que es pot utilitzar per arreglar coses", true);
        Objects Card_id = new Objects("Targeta Personal", "La pots utilitzar per obrir portes que estiguin tancades.", true);
        Objects Card_id_mate = new Objects("Targeta del Company", "Aquesta targeta la pots utilitzar per obrir portes, pero has d'anar amb compte ja que al no ser teva l'alhilal no es fiara de tu!", true);
        Objects Space_Suit = new Objects("Tratge Espacial", "Amb aquest tratge podras anar a la sala exterior sense perill", true);

        objeto.add(Mechanic_tool);
        objeto.add(Card_id);
        objeto.add(Card_id_mate);

    }
    

}
