package dagger.coe.com.daggersample.MessageModule;

import javax.inject.Inject;


public class ProcessServices {

    protected IMessageService mMessageService;

    @Inject
    public ProcessServices(IMessageService messageService) {
        this.mMessageService = messageService;
    }

    public void processMessage(String message,String recipent){
        mMessageService.sendMessage(message,recipent);
    }
}
