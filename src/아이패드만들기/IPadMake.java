package 아이패드만들기;

public class IPadMake {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IPadPro iPad = new IPadPro("iPad Pro");
            if(!iPad.continueOrder()) break;
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetwork();
            iPad.setName();
            iPad.setSerialNum();
            iPad.inProductionPad();
            iPad.viewProductPad();
        }
    }
}
