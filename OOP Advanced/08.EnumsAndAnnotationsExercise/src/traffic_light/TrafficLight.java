package traffic_light;

public enum TrafficLight {
    RED,GREEN,YELLOW;

    private static TrafficLight[] values = values();
    public TrafficLight next(){
        TrafficLight next = values[(this.ordinal()+1)%values().length];
        return next;
    }
}
