import factory.ElectronicStore;
import factory.LargeApliences;
import factory.impl.SamsungStore;
import factory.impl.AppleStore;
import models.ElectronicDevice;

public class Main {
    public static void main(String[] args) {
        ElectronicStore appleStore = new AppleStore();
        LargeApliences samsungStore = new SamsungStore();

        ElectronicDevice appleMobile = appleStore.getMobile();
        ElectronicDevice samsungMobile = samsungStore.getMobile();
        ElectronicDevice appleLaptop = appleStore.getLaptop();
        ElectronicDevice samsungLaptop = samsungStore.getLaptop();
        ElectronicDevice samsungWashingMachine = samsungStore.getWashingMachine();

        System.out.println(samsungMobile);
        System.out.println(appleMobile);
        System.out.println(appleLaptop);
        System.out.println(samsungLaptop);
        System.out.println(samsungWashingMachine);
    }
}