package model.service;

public class Villa extends Service {
    private String standardRoom;
    private String descriptionOtherConvenience;
    private String poolArea;
    private int numOfFloor;

    public Villa() {
    }

    public Villa(String serviceName,
                 String serviceArea,
                 String serviceCost,
                 String serviceMaxPeople,
                 String rentTypeId,
                 String standardRoom,
                 String descriptionOtherConvenience,
                 String poolArea,
                 int numOfFloor) {
        super(serviceName, serviceArea, serviceCost, serviceMaxPeople, rentTypeId);
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numOfFloor = numOfFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }
}