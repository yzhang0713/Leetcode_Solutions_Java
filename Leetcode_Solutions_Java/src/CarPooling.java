import java.util.PriorityQueue;
import java.util.Comparator;

/**
 * Problem 1094. Car Pooling
 */
public class CarPooling {

    public CarPooling() {

    }

    private class Passenger {
        public int numPassengers;
        public int from;
        public int to;
        public Passenger(int[] passengerInfo) {
            this.numPassengers = passengerInfo[0];
            this.from = passengerInfo[1];
            this.to = passengerInfo[2];
        }
    }

    private class PassengerByToComparator implements Comparator<Passenger> {
        @Override
        public int compare(Passenger p1, Passenger p2) {
            return p1.to - p2.to;
        }
    }

    private class PassengerByFromComparator implements Comparator<Passenger> {
        @Override
        public int compare(Passenger p1, Passenger p2) {
            return p1.from - p2.from;
        }
    }

    public boolean carPooling(int[][] trips, int capacity) {
        int remainingCapacity = capacity;
        PriorityQueue<Passenger> passengersToPickup = new PriorityQueue(8, new PassengerByFromComparator());
        PriorityQueue<Passenger> passengersToDrop = new PriorityQueue(8, new PassengerByToComparator());
        for (int i = 0; i < trips.length; i++) {
            passengersToPickup.add(new Passenger(trips[i]));
        }
        while (passengersToPickup.size() > 0) {
            Passenger nextPassenger = passengersToPickup.poll();
            int nextPassengerLocation = nextPassenger.from;
            while (passengersToDrop.size() > 0 && passengersToDrop.peek().to <= nextPassengerLocation) {
                remainingCapacity += passengersToDrop.poll().numPassengers;
            }
            if (nextPassenger.numPassengers > remainingCapacity) {
                return false;
            }
            passengersToDrop.add(nextPassenger);
            remainingCapacity -= nextPassenger.numPassengers;
        }
        return true;
    }
}