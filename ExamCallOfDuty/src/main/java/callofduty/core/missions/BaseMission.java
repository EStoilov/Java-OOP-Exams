package callofduty.core.missions;

import callofduty.core.BaseModel;
import callofduty.interfaces.Mission;

public abstract class BaseMission extends BaseModel implements Mission {

    private Double bounty;
    private Double rating;

    protected BaseMission(String id, Double rating, Double bounty) {
        super(id);
        this.setRating(rating);
        this.setBounty(bounty);
    }

    protected void setRating(Double rating) {
        this.rating = rating;
    }

    protected void setBounty(Double bounty){
        this.bounty = bounty;
    }

    @Override
    public Double getBounty() {
        return this.bounty;
    }

    @Override
    public Double getRating() {
        return this.rating;
    }
}
