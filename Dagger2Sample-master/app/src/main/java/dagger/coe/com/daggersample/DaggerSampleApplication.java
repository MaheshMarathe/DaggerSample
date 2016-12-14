package dagger.coe.com.daggersample;

import android.app.Application;

import dagger.coe.com.daggersample.NetworkAPIModule.DaggerDiComponent;
import dagger.coe.com.daggersample.NetworkAPIModule.DiComponent;


public class DaggerSampleApplication extends Application {
    DiComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDiComponent.builder().build();
    }

    public DiComponent getComponent() {
        return component;
    }
}
