package august.clock;

public class Clock {

    private String brand;
    private Hand hand = new Hand(12);


    public Clock(String brand) {
        this.brand = brand;
    }

    public void printCurrentTime() {
       hand.printTime();
    }

    public void setTime(int hours) {
        hand.setTime(hours);
    }



    public class Hand {

        private int hours;

        public Hand(int hours) {
            this.hours = hours;
        }

        public void printTime() {
            System.out.println(brand + " is showing " + hours + " hours");
        }

        public void setTime(int hours) {
            if (hours < 0) {
                this.hours = 0;
            } else if (hours > 23) {
                this.hours = 23;
            } else {
                this.hours = hours;
            }
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock("time-HG1");
        clock.setTime(23);
        clock.printCurrentTime();
    }
}
