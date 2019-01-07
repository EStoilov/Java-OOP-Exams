package callofduty.core.agents;

import callofduty.core.BaseModel;
import callofduty.interfaces.Agent;
import callofduty.interfaces.Mission;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseAgent extends BaseModel implements Agent {

    private String name;
    private Double rating;
    private List<Mission> missions;

    protected BaseAgent(String id, Double rating, String name) {
        super(id);
        this.setRating(rating);
        this.name = name;
        this.missions = new ArrayList<>();
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public void acceptMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public void completeMissions() {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getRating() {
        return this.rating;
    }
}
