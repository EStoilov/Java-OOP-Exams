package app.entities.colonists;

import app.utils.Constants;

public class HardwareEngineer extends Engineer {

    public HardwareEngineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public int getPotential() {
        int potential = super.getPotential();
        if(super.getAge() < 18){
            potential += Constants.HARDWARE_ENGINEER_BONUS_AGE;
        }
        return potential;
    }
}
