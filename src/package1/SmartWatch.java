package package1;

public  class SmartWatch  extends  SmartDevice{
    boolean internet;
    SmartWatch(boolean internet){
        super();
        this.internet=internet;
    };

    void details(){
        System.out.println("SmartWatch has internet "+this.internet );
    }

}
