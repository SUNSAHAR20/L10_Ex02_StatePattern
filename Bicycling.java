public class Bicycling implements TravelMode {
    @Override
    public Object getArrivalTime(){
        System.out.println("Calculating Arrival Time for Bicycling");
        return 2;
    }

    @Override
    public Object getDirection(){
        System.out.println("Calcualting Direction for Bicycling");
        return 2;
    }
}
