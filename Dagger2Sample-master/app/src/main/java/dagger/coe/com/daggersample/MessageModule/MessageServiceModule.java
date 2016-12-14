package dagger.coe.com.daggersample.MessageModule;

import dagger.Module;
import dagger.Provides;

@Module
public class MessageServiceModule {

    private IMessageService mMessageService;

    public MessageServiceModule(IMessageService messageService) {
        mMessageService = messageService;
    }

    @Provides
    IMessageService provideEmailService() {
        return mMessageService;
    }
}
