public class Transit implements TravelMode {
    @Override
    public Object getArrivalTime(){
        System.out.println("Calculating Arrival Time for Transit");
        return 3;
    }

    @Override
    public Object getDirection(){
        System.out.println("Calcualting Direction for Transit");
        return 3;
    }
}
