package factory.impl;

import factory.ElectronicStore;
import models.ElectronicDevice;
import models.concretModels.Laptop;
import models.concretModels.Mobile;

public class AppleStore implements ElectronicStore {
    @Override
    public ElectronicDevice getMobile() {
        ElectronicDevice mobile = new Mobile();
        mobile.createDevice(50000, "Apple");
        return mobile;
    }

    @Override
    public ElectronicDevice getLaptop() {
        ElectronicDevice laptop = new Laptop();
        laptop.createDevice(100000, "Apple");
        return laptop;
    }
}
