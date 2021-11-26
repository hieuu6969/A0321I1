package module2.caseStudy.models;

public class Booking {
    private Integer bookingId;
    private String startDate;
    private String endDate;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(Integer bookingId,
                   String startDate,
                   String endDate,
                   Customer customer,
                   Facility facility) {
        this.bookingId = bookingId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.facility = facility;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }
}
