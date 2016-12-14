package dagger.coe.com.daggersample.MessageModule;

import dagger.Component;


@Component(modules = {MessageServiceModule.class})
public interface IServiceComponent {
    ProcessServices provideMessageService();
}
