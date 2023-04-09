public class DrivingState {
    private TravelMode travelMode;

    public DrivingState(TravelMode travelMode){
        this.travelMode = travelMode;
    }

    public  Object getTravelMode(){
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode){
        this.travelMode = travelMode;
    }

    public  Object getArrivalTime(){
        return travelMode.getArrivalTime();
    }

    public  Object getDirection(){
        return travelMode.getDirection();
    }
}
