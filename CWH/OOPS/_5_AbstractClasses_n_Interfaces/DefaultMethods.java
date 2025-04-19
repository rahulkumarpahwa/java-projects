package CWH.OOPS._5_AbstractClasses_n_Interfaces;

public class DefaultMethods {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone();
        samsung.takeSnap();
        samsung.recordVideo();
        samsung.callNumber(908765432);
        samsung.pickCall(12345678);
        for (int i = 0; i < samsung.getNetworks().length; i++) {
            samsung.connectToNetwork(samsung.getNetworks()[i]);
        }
        samsung.recordingIn4k(); // calling the default method. no need to implement in the SmartPhone class, but we can do it override it, if we want.

    }
}

interface Camera {
    void takeSnap();

    void recordVideo();

    default void recordingIn4k() { // default Method
        System.out.println("The recording is done in 4k from camera interface");
        greet(); // this is private method which can be called by the default method
    }

    private void greet() { // although it is private and the classes which implements the interface can't
                           // use it. but it can used in the default methods, which can call them. As when
                           // the logic of the default method become large then it can be put in the
                           // private method.
        System.out.println("Hello Good morning");
    }

}

interface Wifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class CellPhone {
    int phoneNumber;

    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall(int phoneNumber) {
        System.out.println("Connecting " + phoneNumber);
    }
}

class SmartPhone extends CellPhone implements Camera, Wifi {

    // default method Overriding:
    @Override
    public void recordingIn4k() {
        System.out.println("the default method 'recodingIn4k' calling from the smartphone, derived class.");

        // Camera.super.recordingIn4k();
    }

    @Override
    public String[] getNetworks() {
        String[] network = { "harry", "prashant", "apple" };
        return network;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to the network " + network);
    }

    @Override
    public void takeSnap() {
        System.out.println("Camera takes the snap.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Camera Records the video.");
    }

}
