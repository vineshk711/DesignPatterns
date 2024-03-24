package factory;

import factory.ElectronicStore;
import models.ElectronicDevice;

public interface LargeApliences extends ElectronicStore {
    public ElectronicDevice getWashingMachine();

}
