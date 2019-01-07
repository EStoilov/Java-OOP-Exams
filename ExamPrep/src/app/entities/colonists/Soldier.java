package app.entities.colonists;

public class Soldier extends Colonist {

    private static final int SOLDIER_BONUS_CLASS = 3;
    private static final int SOLDIER_BONUS_AGE = 3;

    public Soldier(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public int getPotential() {
        return super.getTalent() + SOLDIER_BONUS_CLASS + SOLDIER_BONUS_AGE ;
    }

}
