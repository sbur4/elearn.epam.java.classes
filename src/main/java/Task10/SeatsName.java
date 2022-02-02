package Task10;

public enum SeatsName {
    STANDARD_SEAT("standard"),
    COUPE_SEAT("coupe"),
    COMFORT_SEAT("plazcart"),
    LUX_SEAT("lux");

    private final String seatName;

    SeatsName(String seatName) {
        this.seatName = seatName;
    }

    public String getSeatName() {
        return seatName;
    }
}
