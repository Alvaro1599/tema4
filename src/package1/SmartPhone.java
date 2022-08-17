package package1;

public class SmartPhone extends SmartDevice {
    boolean wify;
    SmartPhone(boolean wify){
        super();
        this.wify=wify;
    }
    void details(){
        System.out.println("SmartPhone has wify "+ this.wify);
    }

}
