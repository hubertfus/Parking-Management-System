import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ticket {
    private double cost;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;


    public Car car;
    public String type;

    public Ticket() {
        this.type = "";
        this.cost = 0;
        this.entryTime = LocalDateTime.now();
        this.car = new Car();

    }

    public Ticket(String newType, LocalDateTime newEntryTime, Car newCar) {
        this.type = newType;
        this.entryTime = newEntryTime;
        this.car = newCar;
        this.cost = 2;

    }

    private void calculateCost() {
        double durationInHours = this.entryTime.until(this.exitTime, ChronoUnit.HOURS);
        durationInHours = Math.ceil(durationInHours);
        this.cost = durationInHours * 2;

    }

    public void setExitTime(LocalDateTime newExitTime) {
        this.exitTime = newExitTime;
        calculateCost();
    }

    public LocalDateTime getExitTime() {
        return this.exitTime;
    }

    public String toString() {
        return (this.type + " " + this.entryTime + " " + this.car + " " + this.cost + " ");
    }
}
