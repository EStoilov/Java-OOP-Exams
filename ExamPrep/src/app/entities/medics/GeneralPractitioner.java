package app.entities.medics;

import app.utils.Constants;

public class GeneralPractitioner extends Medic {

    protected GeneralPractitioner(String id, String familyId, int talent, int age, String sign) {
        super(id, familyId, talent, age, sign);
    }
    @Override
    public int getPotential(){
        int potential = super.getPotential();
        String sign = super.getSign();

        if(super.getAge() > 15){
            potential += Constants.GENERAL_PRACTITIONER_AGE_BONUS;
        }
        if("caring".equals(sign)){
            potential += Constants.GENERAL_PRACTITIONER_SIGN_CARING_BONUS;
        }else if ("careless".equals(sign)){
            potential += Constants.GENERAL_PRACTITIONER_SIGN_CARELESS_BONUS;
        }
        return potential;
    }

}
