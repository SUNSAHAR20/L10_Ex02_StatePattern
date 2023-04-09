public class Demo {
    public static void main(String[] args){
        var drivingState1 = new DrivingState(new Driving());
        drivingState1.getArrivalTime();
        drivingState1.getDirection();

        var drivingState2 = new DrivingState(new Bicycling());
        drivingState2.getArrivalTime();
        drivingState2.getDirection();

        var drivingState3 = new DrivingState(new Transit());
        drivingState3.getArrivalTime();
        drivingState3.getDirection();

        var drivingState4 = new DrivingState(new Walking());
        drivingState4.getArrivalTime();
        drivingState4.getDirection();
    }
}
