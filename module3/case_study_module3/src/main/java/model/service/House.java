package model.service;

public class House extends Service {
    private String standardRoom;
    private String descriptionOtherConvenience;
    private int numOfFloor;

    public House() {
    }

    public House(String serviceName,
                 String serviceArea,
                 String serviceCost,
                 String serviceMaxPeople,
                 String rentTypeId,
                 String standardRoom,
                 String descriptionOtherConvenience,
                 int numOfFloor) {
        super(serviceName, serviceArea, serviceCost, serviceMaxPeople, rentTypeId);
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
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

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }
}