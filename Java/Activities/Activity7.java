package activities;

public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(4, 10, 30);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}