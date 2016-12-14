package dagger.coe.com.daggersample.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {VehicleModule.class})
public interface  IVehicleComponent {
    Vehicle provideVehicle();
}
