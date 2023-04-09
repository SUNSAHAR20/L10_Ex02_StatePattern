public class Walking implements TravelMode {
    @Override
    public Object getArrivalTime(){
        System.out.println("Calculating Arrival Time for Walking");
        return 4;
    }

    @Override
    public Object getDirection(){
        System.out.println("Calcualting Direction for Walking");
        return 4;
    }
}
