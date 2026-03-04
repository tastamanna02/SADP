import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable {
    private static final long serialVersionUID = 1L;
    private int reservationId;
    private int roomNumber;
    private int customerId;
    private Date checkInDate;
    private Date checkOutDate;
    private double totalAmount;
    private String status;
    
    public Reservation(int reservationId, int roomNumber, int customerId, Date checkInDate, Date checkOutDate, double totalAmount) {
        this.reservationId = reservationId;
        this.roomNumber = roomNumber;
        this.customerId = customerId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalAmount = totalAmount;
        this.status = "Active";
    }
    
    public int getReservationId() { return reservationId; }
    public int getRoomNumber() { return roomNumber; }
    public int getCustomerId() { return customerId; }
    public Date getCheckInDate() { return checkInDate; }
    public Date getCheckOutDate() { return checkOutDate; }
    public double getTotalAmount() { return totalAmount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public void setCheckInDate(Date checkInDate) {this.checkInDate = checkInDate; }
    public void setCheckOutDate(Date checkOutDate) { this.checkOutDate = checkOutDate; }
}