package july._31_07_25_classes.camera;

import java.util.Random;

public class Camera {

    private Lens lens;
    private MemoryCard memoryCard;
    private Battery battery;

    public Camera(Lens lens, MemoryCard memoryCard, Battery battery) {
        this.lens = lens;
        this.memoryCard = memoryCard;
        this.battery = battery;
    }

    public void takePhoto() {
        battery.setCurrentPercentage(battery.getCurrentPercentage() - 1);
        Random randomNum = new Random();
        int low = 5;
        int high = 8;
        int photoSize = randomNum.nextInt(high + 1 - low) + low;
        if (memoryCard.getFreeMb() >= photoSize) {
            memoryCard.setFreeMb(memoryCard.getFreeMb() - photoSize);
            System.out.println("Photo taken, takes up: " + photoSize);
        } else {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Lens lens = new Lens("mediaPhoto", "Samsung");
        MemoryCard memoryCard = new MemoryCard(32,32);
        Battery battery = new Battery(1500);
        Camera camera = new Camera(lens,memoryCard,battery);
        camera.takePhoto();
    }
}
