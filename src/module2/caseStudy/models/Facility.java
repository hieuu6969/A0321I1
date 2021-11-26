package module2.caseStudy.models;

public abstract class Facility {
    private String name;
    private double usedArea;
    private double rentExpense;
    private int maxPeople;
    private String rentType;

    public Facility() {
    }

    public Facility(String name, double usedArea, double rentExpense, int maxPeople, String rentType) {
        this.name = name;
        this.usedArea = usedArea;
        this.rentExpense = rentExpense;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(double usedArea) {
        this.usedArea = usedArea;
    }

    public double getRentExpense() {
        return rentExpense;
    }

    public void setRentExpense(double rentExpense) {
        this.rentExpense = rentExpense;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", usedArea=" + usedArea +
                ", rentExpense=" + rentExpense +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
