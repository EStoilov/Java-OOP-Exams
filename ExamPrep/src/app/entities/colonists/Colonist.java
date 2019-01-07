package app.entities.colonists;

public abstract class Colonist {

    private String id;
    private String familyId;
    private int talent;
    private int age;

    protected Colonist(String id, String familyId, int talent, int age) {
        this.id = id;
        this.familyId = familyId;
        this.talent = talent;
        this.age = age;
    }

    protected void setId(String id) {
        this.id = id;
    }

    protected void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    protected void setTalent(int talent) {
        this.talent = talent;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return this.id;
    }

    public String getFamilyId() {
        return this.familyId;
    }
    void grow(int years){}

    public int getTalent() {
        return this.talent;
    }

    public int getAge() {
        return this.age;
    }

    public abstract int getPotential();
}
