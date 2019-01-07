package app.core;

import app.entities.Colony;
import app.entities.Family;
import app.entities.colonists.Colonist;
import app.factories.ColonistFactory;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map<String, Family> families;
    private Colony colony;

    public Manager() {
        this.families = new HashMap<>();
    }

    public void createColony(int maxCount, int maxCapacity){
        this.colony = new Colony(maxCount, maxCapacity);
    }

    public String insert(String[] arguments){
        //ARGUMENTS -> {class} {colonistId} {familyId} {talent} {age} {sign?}
        //COLONIST -> String id, String familyId, int talent, int age

        String inputFamily = arguments[2];
        if(families.containsKey(inputFamily)){


        }

        Colonist colonist = ColonistFactory.createColonist(arguments);
        return null;
    }

}
