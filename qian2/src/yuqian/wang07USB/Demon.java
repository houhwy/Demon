package yuqian.wang07USB;

public class Demon {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        USB mouse = new Mouse();
        USB keyboard = new Keyboard();

        computer.useDevice(mouse);

        computer.useDevice(keyboard);

        computer.powerOff();
    }
}
