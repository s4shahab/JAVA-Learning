interface Camera{
    void takesnap();
    default void record4kvideo(){
        System.out.println("Recording in 4k:");
    }
}

interface wifinetworks{
    String [] getnetworks();
    void connectToNetworks(String network);
}

class MycellPhone{
    void cellphone(int phonenumber){
        System.out.println("calling "+phonenumber);
    }

    void pickCall(){
        System.out.println("Connecting...");
    }
}

class SmartPhone extends MycellPhone implements Camera,wifinetworks{
    public void takesnap(){
        System.out.println("Taking snap");
    }

    public void recordvideo(){
        System.out.println("recording video");
    }

    public String []getnetworks(){
        System.out.println("Getting list of networks");
        String[] networkList={"aa","bb","cc"};
        return networkList;
    }
    public void connectToNetworks(String network){
        System.out.println("connecting to "+network);
    }

    public void record4kvideo(){
        System.out.println("This has preference");
    }
}



public class cwh_57_default_methods {
    public static void main(String[] args) {
        SmartPhone sm=new SmartPhone();
        String [] ar=sm.getnetworks();
        for (String item:ar) {
            System.out.println(item);
            
        }
        sm.record4kvideo();

    }
}
