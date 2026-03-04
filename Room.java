import java.io.Serializable;

public class Room implements Serializable {
    private static final long serialVersionUID = 1L;
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean isAvailable;
    
    public Room(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
    }
    
    public int getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public void setRoomType(String roomType) { this.roomType = roomType; }
    public double getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(double pricePerNight) { this.pricePerNight = pricePerNight; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
    
    @Override
    public String toString() {
        return "Room Number: " + roomNumber + "\nType: " + roomType + "\nPrice: $" + pricePerNight + "\nAvailable: " + isAvailable;
    }
}