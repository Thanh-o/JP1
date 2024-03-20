public class FlashLight {
    public static void main(String []args){
        Battery battery;
        FlashLamp flashLamp;
        battery=new Battery();
        flashLamp=new FlashLamp();
        flashLamp.setBattery(battery);
        for(int i = 0; i<10; i++){
            flashLamp.turnOn();
            flashLamp.turnOff();
        }
        System.out.println("Remaining battery power: " + battery.getEnergy());

    }
}
