package module2.caseStudy.models;

public class Room extends Facility {
    public String freeServiceIncluded;

    public Room() {
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
}
