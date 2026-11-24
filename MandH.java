class Device {
    String powerSource;

    void turnOn() {
        System.out.println("Device powered on");
    }
}

class Mobile extends Device {
    double screenSize;

    void makeCall() {
        System.out.println("Making a call");
    }
}

class Android extends Mobile {
    void openPlayStore() {
        System.out.println("Opening Play Store");
    }
}

class iPhone extends Mobile {
    void openAppStore() {
        System.out.println("Opening App Store");
    }
}

class MandH {
    public static void main(String[] args) {

        Android a = new Android();

        a.powerSource = "Battery";
        a.screenSize = 6.5;

        System.out.println("Android Details:");
        a.turnOn();
        a.makeCall();
        a.openPlayStore();

        System.out.println();

        iPhone i = new iPhone();

        i.powerSource = "Battery";
        i.screenSize = 6.1;

        System.out.println("iPhone Details:");
        i.turnOn();
        i.makeCall();
        i.openAppStore();
    }
}