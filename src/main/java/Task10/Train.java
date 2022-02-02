package Task10;

import java.util.Map;

public class Train {
    private String destinationPoint;
    private Integer trainNumber;
    private String departTime;
    private Map<String, Integer> seats;

    public Train() {
    }

    public Train(String destinationPoint, Integer trainNumber, String departTime, Map<String, Integer> seats) {
        this.destinationPoint = destinationPoint;
        this.trainNumber = trainNumber;
        this.departTime = departTime;
        this.seats = seats;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public Integer getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(Integer trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public Map<String, Integer> getSeats() {
        return seats;
    }

    public void setSeats(Map<String, Integer> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destinationPoint='" + destinationPoint + '\'' +
                ", trainNumber=" + trainNumber +
                ", departTime='" + departTime + '\'' +
                ", seats=" + seats +
                '}';
    }
}
