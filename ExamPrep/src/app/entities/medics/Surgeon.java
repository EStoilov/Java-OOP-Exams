package app.entities.medics;

import app.utils.Constants;

public class Surgeon extends Medic {

    protected Surgeon(String id, String familyId, int talent, int age, String sign) {
        super(id, familyId, talent, age, sign);
    }

    @Override
    public int getPotential(){
        int potential = super.getPotential();
        String sign = super.getSign();

        if(super.getAge() > 25 && super.getAge() < 35){
            potential += Constants.SURGEON_AGE_BONUS;
        }
        if("precise".equals(sign)){
            potential += Constants.SURGEON_SIGN_PRECISE_BONUS;
        }else if ("butcher".equals(sign)){
            potential += Constants.SURGEON_SIGN_BUTCHER_PENALTY;
        }
        return potential;
    }
}
