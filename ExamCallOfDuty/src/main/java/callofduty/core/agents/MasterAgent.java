package callofduty.core.agents;

public class MasterAgent extends BaseAgent{

    private Double bounty;

    protected MasterAgent(String id, Double rating, String name, Double bounty) {
        super(id, rating, name);
        this.setBounty(bounty);
    }

    public Double getBounty() {
        return this.bounty;
    }

    protected void setBounty(Double bounty) {
        this.bounty = bounty;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
