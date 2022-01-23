package model.service;

public class Service {
    private String serviceName;
    private String serviceArea;
    private String serviceCost;
    private String serviceMaxPeoplel;
    private String rentTypeId;


    public Service() {
    }

    public Service(String serviceName,
                   String serviceArea,
                   String serviceCost,
                   String serviceMaxPeople,
                   String rentTypeId) {
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeoplel = serviceMaxPeople;
        this.rentTypeId = rentTypeId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public String getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(String serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getServiceMaxPeoplel() {
        return serviceMaxPeoplel;
    }

    public void setServiceMaxPeoplel(String serviceMaxPeoplel) {
        this.serviceMaxPeoplel = serviceMaxPeoplel;
    }

    public String getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(String rentTypeId) {
        this.rentTypeId = rentTypeId;
    }
}
