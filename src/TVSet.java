public class TVSet {
    boolean tvOn;

    TVSet() {
        tvOn = false;
    }

    void turnOn() {
        tvOn = true;
    }

    void turnOff() {
        tvOn = false;
    }

    void showStatus() {
        System.out.println("tvOn: " + tvOn);
    }
}
