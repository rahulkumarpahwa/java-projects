package CWH.OOPS._5_AbstractClasses_n_Interfaces;

public class PolymorphismInInterfaces {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        sm.calling(); // basic phone features
        sm.PickingCall(); // basic phone features.
        sm.Capture();
        sm.Record();
        sm.PlaysMusic();
        sm.ShowSongs();

        // Now when we want the particular feature of the smartphone say the camera to
        // be the main features means we want to use the smartphone as camera then
        // we can take the camera as the reference and smartphone as the object and this
        // will make the SmartPhone act as the camera.
        Camera c = new SmartPhone(); // similar to dynamic method in dispatch. can only use the methods which are in
                                     // the Camera interface can be accessed.
        // this is a smartphone but used it as camera.
        c.Record();
        c.Capture();

        // c.PlayMusic(); // not allowed // The method PlayMusic() is undefined for the
        // type Camera
        // c.sampleMethod(); // not allowed // The method sampleMethod() is undefined
        // for the type Camera

        // when we create a new instance of the smartPhone then it can access all the
        // methods.
        SmartPhone s2 = new SmartPhone();
        s2.Capture();
        s2.PickingCall();
        s2.PlaysMusic();
        s2.Record();
        s2.ShowSongs();
        // when we implement an interface then we have to implement all the methods. but
        // when we take the reference of any Interface then only we can access and
        // implement those methods provide by the Interface. This is called polymorphism in Interface.
    }
}

interface Camera {
    void Capture(); // captures photos

    private void OptimizerCamera() {
        System.out.println("this is the Optimizer Private method of the camera Interface.");
    }

    default void Record() {
        OptimizerCamera(); // the above private method can be accessed only by the default method. this is
                           // used when we have extra logic which we want to put somewhere else. (refer
                           // to 2nd last lecture)
        System.out.println("this is the default method 'Record' of the camera interface ");
    } // record Videos
}

interface MediaPlayer {
    void PlaysMusic(); // music can be played with it.

    void ShowSongs(); // shows list of the songs
}

class Phone { // the basic class which makes the SmartPhone class.

    void calling() {
        System.out.println("Call the Number");
    }

    void PickingCall() {
        System.out.println("Picking the Call");
    }

}

class SmartPhone extends Phone implements MediaPlayer, Camera {
    // now this smartphone not only call and pick the call but can click pic with
    // the camera, record videos and also it can play music ans show songs as well,
    // which a normal phone can't do.

    @Override
    public void Capture() {
        System.out.println("Implementing the capture method in the Smartphone");
    }

    @Override
    public void Record() {
        Camera.super.Record(); // calling the default Record method first.
        System.out.println("Implementing the Record Method in the Smartphone");
    }

    @Override
    public void PlaysMusic() {
        System.out.println("Implement the PlayMusic method in the SmartPhone");
    }

    @Override
    public void ShowSongs() {
        System.out.println("implementing the Show Songs in the SmartPhone");
    }

    void sampleMethod() {
        System.out.println("the Sample Method of the smartphone class");
    }
}