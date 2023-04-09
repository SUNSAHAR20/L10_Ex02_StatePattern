public class Driving implements TravelMode {
    @Override
    public Object getArrivalTime(){
        System.out.println("Calculating Arrival Time for Driving");
        return 1;
    }

    @Override
    public Object getDirection(){
        System.out.println("Calcualting Direction for Driving");
        return 1;
    }
}
