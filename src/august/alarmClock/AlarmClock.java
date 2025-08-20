package august.alarmClock;

public class AlarmClock {

    private String brand;
    private String model;
    private String creationDate;
    private Alarm[] alarms = new Alarm[0];

    public AlarmClock(String brand, String model, String creationDate) {
        this.brand = brand;
        this.model = model;
        this.creationDate = creationDate;
    }

    public void addAlarm(Alarm alarm) {
        int alarmsLength = alarms.length;
        Alarm[] alarms = new Alarm[alarmsLength + 1];
        for (int i = 0; i < alarmsLength; i++) {
            alarms[i] = this.alarms[i];
        }
        this.alarms = alarms;
        this.alarms[alarms.length - 1] = alarm;
    }

    public boolean trigger() {
        if (this.alarms == null || alarms.length <= 0) {
            System.out.println("set an alarm");
            return false;
        }
        int alarmsLength = this.alarms.length;
        System.out.println("AlarmClock " + alarms[0].message + " is worked in " + alarms[0].time);
        Alarm[] alarms = new Alarm[alarmsLength - 1];
        for (int i = 0; i < alarms.length; i++) {
            alarms[i] = this.alarms[i + 1];
        }
        this.alarms = alarms;
        return true;
    }

    public static class Alarm {

        private String time;
        private String message;

        public Alarm(String time, String message) {
            this.time = time;
            this.message = message;
        }
    }

    public static void main(String[] args) {
        AlarmClock alarmClock = new AlarmClock("VisOp", "ret-17", "19.12.2020");
        AlarmClock.Alarm alarm = new AlarmClock.Alarm("17", "running");
        AlarmClock.Alarm alarm2 = new AlarmClock.Alarm("19", "jumping");
        alarmClock.addAlarm(alarm);
        alarmClock.addAlarm(alarm2);
        alarmClock.trigger();
        alarmClock.trigger();
        alarmClock.trigger();
    }
}
