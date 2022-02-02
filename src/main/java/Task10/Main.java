package Task10;

import java.util.*;

import static Task10.SeatsName.STANDARD_SEAT;

public class Main {

    public static void main(String[] args) {
        Train train1 = new Train();
        Map<String, Integer> train1Seats = new LinkedHashMap<>();
        train1Seats.put(STANDARD_SEAT.getSeatName(), 200);
        train1Seats.put(SeatsName.COUPE_SEAT.getSeatName(), 50);
        train1Seats.put(SeatsName.COMFORT_SEAT.getSeatName(), 100);
        train1Seats.put(SeatsName.LUX_SEAT.getSeatName(), 10);
        train1.setDestinationPoint("Lviv");
        train1.setTrainNumber(517);
        train1.setDepartTime("14:15");
        train1.setSeats(train1Seats);
        Train train2 = new Train();
        Map<String, Integer> train2Seats = new LinkedHashMap<>();
        train2Seats.put(STANDARD_SEAT.getSeatName(), 150);
        train2Seats.put(SeatsName.COUPE_SEAT.getSeatName(), 30);
        train2Seats.put(SeatsName.COMFORT_SEAT.getSeatName(), 70);
        train2Seats.put(SeatsName.LUX_SEAT.getSeatName(), 25);
        train2.setDestinationPoint("Kyev");
        train2.setTrainNumber(125);
        train2.setDepartTime("23:45");
        train2.setSeats(train2Seats);
        Train train3 = new Train();
        Map<String, Integer> train3Seats = new LinkedHashMap<>();
        train3Seats.put(STANDARD_SEAT.getSeatName(), 250);
        train3Seats.put(SeatsName.COUPE_SEAT.getSeatName(), 70);
        train3Seats.put(SeatsName.COMFORT_SEAT.getSeatName(), 120);
        train3Seats.put(SeatsName.LUX_SEAT.getSeatName(), 15);
        train3.setDestinationPoint("Odessa");
        train3.setTrainNumber(200);
        train3.setDepartTime("14:35");
        train3.setSeats(train3Seats);
        Train train4 = new Train();
        Map<String, Integer> train4Seats = new LinkedHashMap<>();
        train4Seats.put(STANDARD_SEAT.getSeatName(), 200);
        train4Seats.put(SeatsName.COUPE_SEAT.getSeatName(), 50);
        train4Seats.put(SeatsName.COMFORT_SEAT.getSeatName(), 100);
        train4Seats.put(SeatsName.LUX_SEAT.getSeatName(), 10);
        train4.setDestinationPoint("Lviv");
        train4.setTrainNumber(507);
        train4.setDepartTime("19:55");
        train4.setSeats(train4Seats);
        Train train5 = new Train();
        Map<String, Integer> train5Seats = new LinkedHashMap<>();
        train5Seats.put(STANDARD_SEAT.getSeatName(), 100);
        train5Seats.put(SeatsName.COUPE_SEAT.getSeatName(), 20);
        train5Seats.put(SeatsName.COMFORT_SEAT.getSeatName(), 50);
        train5Seats.put(SeatsName.LUX_SEAT.getSeatName(), 8);
        train5.setDestinationPoint("Lviv");
        train5.setTrainNumber(537);
        train5.setDepartTime("06:25");
        train5.setSeats(train5Seats);
        // for test c
        Train train41 = new Train();
        Map<String, Integer> train41Seats = new LinkedHashMap<>();
        train41Seats.put(STANDARD_SEAT.getSeatName(), 200);
        train41Seats.put(SeatsName.COUPE_SEAT.getSeatName(), 50);
        train41Seats.put(SeatsName.COMFORT_SEAT.getSeatName(), 100);
        train41Seats.put(SeatsName.LUX_SEAT.getSeatName(), 10);
        train41.setDestinationPoint("Kyev");
        train41.setTrainNumber(507);
        train41.setDepartTime("19:55");
        train41.setSeats(train41Seats);

        Set<Train> trainList = new HashSet<>();
        trainList.add(train1);
        trainList.add(train2);
        trainList.add(train3);
        trainList.add(train4);
        trainList.add(train5);
        trainList.add(train41);
        System.out.println(trainList);
        //a) список поездов, следующих до заданного пункта назначения;
        foundTrainToSomeCity(trainList);
        //b) список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа;
        foundTrainToSomeCityAfterSomeTime(trainList);
        //c) список поездов, отправляющихся до заданного пункта назначения и имеющих общие места.
        foundTrainToSomeCityWitchHasEqualsSeats(trainList);
    }

    private static void foundTrainToSomeCity(Set<Train> trainList) {
        String someCity = "lviv";
        System.out.println("trains to some city");
        for (Train train : trainList) {
            if (train.getDestinationPoint().equalsIgnoreCase(someCity)) {
                System.out.println(train);
            }
        }
    }

    private static Double convertToInt(String str) {
        return Double.parseDouble(str.replace(":", "."));
    }

    private static void foundTrainToSomeCityAfterSomeTime(Set<Train> trainList) {
        String someCity = "lviv";
        String someTime = "15:00";
        System.out.println("trains to some city after some time");
        for (Train train : trainList) {
            if (train.getDestinationPoint().equalsIgnoreCase(someCity) && convertToInt(train.getDepartTime()) > convertToInt(someTime)) {
                System.out.println(train);
            }
        }
    }

    private static void foundTrainToSomeCityWitchHasEqualsSeats(Set<Train> trainList) {
        String someCity = "lviv";
        Set<Train> equalSeats = new LinkedHashSet<>();
        System.out.println("trains to some city witch have equals seats");
        isSeatsUnique(trainList, equalSeats);
//        createSetWithEqualsSeatsInTheTrain(trainList, equalSeats);
        for (Train train : equalSeats) {
            if (train.getDestinationPoint().equalsIgnoreCase(someCity)) {
                System.out.println(train);
            }
        }
    }

    private static void isSeatsUnique(Set<Train> trainList, Set<Train> equalSeats) {
        Set<Map<String, Integer>> trainHasDuplicateSeats = new LinkedHashSet<>();
        for (Train train : trainList) {
            if (!trainHasDuplicateSeats.add(train.getSeats())) {
                equalSeats.add(train);
            }
        }
    }

    private static void createSetWithEqualsSeatsInTheTrain(Set<Train> trainList, Set<Train> equalSeats) {
        for (Train train : trainList) {
            for (Train t : equalSeats) {
                if (t.getSeats().equals(train.getSeats())) {
                    equalSeats.add(train);
                }
            }
        }
    }
}


