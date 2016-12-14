package dagger.coe.com.daggersample.NetworkAPIModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.coe.com.daggersample.MainActivity;


@Singleton
@Component(modules = {NetworkApiModule.class})
public interface DiComponent {
    // to update the fields in your activities
    void inject(MainActivity activity);
}
