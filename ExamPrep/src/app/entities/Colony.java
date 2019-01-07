package app.entities;

import app.entities.colonists.Colonist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colony {

    private int maxFamilyCount;
    private int maxFamilyCapacity;
    private List<Colonist> colonistsByFamilyId;

    public Colony(int maxFamilyCount, int maxFamilyCapacity) {
        this.maxFamilyCount = maxFamilyCount;
        this.maxFamilyCapacity = maxFamilyCapacity;
        this.colonistsByFamilyId = new ArrayList<>();
    }

    public List<Colonist> getColonistsByFamilyId(String familyId){
        return Collections.unmodifiableList(this.colonistsByFamilyId);
    }

    public int getMaxFamilyCount() {
        return this.maxFamilyCount;
    }

    public int getMaxFamilyCapacity() {
        return this.maxFamilyCapacity;
    }

    void addColonist(Colonist colonist){
        this.colonistsByFamilyId.add(colonist);
    }

    void removeColonist(String familyId, String memberId){}

    void removeFamily(String id){}

    void grow(int years){}

    int getPotential(){return 0;}

    String getCapacity(){return null;}

}
