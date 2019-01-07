package app.entities.colonists;

import app.utils.Constants;

public class SoftwareEngineer extends Engineer {

    public SoftwareEngineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public int getPotential(){
        return super.getPotential() + Constants.SOFTWARE_ENGINEER_BONUS;
    }
}
