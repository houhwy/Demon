package yuqian.wang07USB;

public class Computer {
    public void powerOn() {
        System.out.println("电脑开机");
    }

    public void powerOff() {
        System.out.println("电脑关机");
    }

    public void useDevice(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            ((Keyboard) usb).beat();
        }
        usb.close();
    }
}
