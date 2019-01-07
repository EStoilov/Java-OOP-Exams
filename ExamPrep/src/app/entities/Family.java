package app.entities;

import app.entities.colonists.Colonist;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private String id;
    private List<Colonist> colonists;

    public Family(String id) {
        this.id = id;
        this.colonists = new ArrayList<>();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public int getCountOfColonists(){
        return this.colonists.size();
    }
}
