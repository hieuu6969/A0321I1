package module2.caseStudy.models;

public class Villa extends Facility {
    public String roomStandard;
    public double poolSquare;
    public int numOfFloor;

    public Villa() {
    }

    public Villa(String name,
                 double usedArea,
                 double rentExpense,
                 int maxPeople,
                 String rentType,
                 String roomStandard,
                 double poolSquare,
                 int numOfFloor) {
        super(name,usedArea,rentExpense,maxPeople,rentType);
        this.roomStandard = roomStandard;
        this.poolSquare = poolSquare;
        this.numOfFloor = numOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolSquare() {
        return poolSquare;
    }

    public void setPoolSquare(double poolSquare) {
        this.poolSquare = poolSquare;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }
}
