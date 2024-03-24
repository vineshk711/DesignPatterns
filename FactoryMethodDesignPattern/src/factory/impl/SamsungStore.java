package factory.impl;

import factory.LargeApliences;
import models.ElectronicDevice;
import models.concretModels.Laptop;
import models.concretModels.Mobile;
import models.concretModels.WashingMachine;

public class SamsungStore implements LargeApliences {
    @Override
    public ElectronicDevice getMobile() {
        ElectronicDevice laptop = new Laptop();
        laptop.createDevice(50000, "Samsung");
        return laptop;
    }

    @Override
    public ElectronicDevice getLaptop() {
        ElectronicDevice mobile = new Mobile();
        mobile.createDevice(20000, "Samsung");
        return mobile;
    }

    @Override
    public ElectronicDevice getWashingMachine() {
        ElectronicDevice washingMachine = new WashingMachine();
        washingMachine.createDevice(25000, "Samsung");
        return washingMachine;
    }
}
