package callofduty.core;

import callofduty.interfaces.Identifiable;
import callofduty.interfaces.Rateable;

public abstract class BaseModel implements Identifiable {

    private String id;

    protected BaseModel(String id) {
        this.setId(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
