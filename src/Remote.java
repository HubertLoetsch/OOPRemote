public class RemoteControl {

    private boolean isOn;

    private Battery battery1;
    private Battery battery2;

    public RemoteControl() {
    }

    public void setBattery1(Battery battery1) {
        this.battery1 = battery1;
    }

    public void setBattery2(Battery battery2) {
        this.battery2 = battery2;
    }

    public void setBatteries(Battery battery1, Battery battery2) {
        this.battery1 = battery1;
        this.battery2 = battery2;
    }

    public int selectChannel(int channel) {
        double voltageB1 = battery1.getVoltage();
        double voltageB2 = battery2.getVoltage();

        battery1.setVoltage(voltageB1 - 0.3);
        battery2.setVoltage(voltageB2 - 0.3);

        if (getStatus() < 3.2) {
            System.out.println("Please check batteries!");
        }

        return channel;
    }


    public double getStatus() {
        double voltageBattery1 = battery1.getVoltage();
        double voltageBattery2 = battery2.getVoltage();
        return (voltageBattery1 + voltageBattery2) / 2;
    }


    public void setOn(boolean on) {
        double voltageB1 = battery1.getVoltage();
        double voltageB2 = battery2.getVoltage();

        battery1.setVoltage(voltageB1 - 0.01);
        battery2.setVoltage(voltageB2 - 0.01);

        this.isOn = on;
    }
}