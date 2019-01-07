package app.entities.colonists;

import app.utils.Constants;

public abstract class Engineer extends Colonist {

    protected Engineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public int getPotential() {
        int potential = super.getTalent() + Constants.ENGINEER_BONUS_CLASS;

        if(super.getAge() > 30){
            potential += Constants.ENGINEER_BONUS_AGE;
        }
        return potential;
    }
}
