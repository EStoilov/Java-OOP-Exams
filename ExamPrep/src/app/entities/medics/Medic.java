package app.entities.medics;

import app.entities.colonists.Colonist;
import app.utils.Constants;

public abstract class Medic extends Colonist {

    private String sign;

    protected Medic(String id, String familyId, int talent, int age, String sign) {
        super(id, familyId, talent, age);
        this.sign = sign;
    }

    public String getSign() {
        return this.sign;
    }

    protected void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public int getPotential() {
        int potential = super.getTalent() + Constants.MEDIC_BONUS;

        return potential;
    }
}
