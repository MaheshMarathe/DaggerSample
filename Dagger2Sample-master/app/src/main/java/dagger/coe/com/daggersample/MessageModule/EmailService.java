package dagger.coe.com.daggersample.MessageModule;

import android.util.Log;

import javax.inject.Inject;


public class EmailService implements IMessageService{

    @Inject
    public EmailService() {
    }

    @Override
    public void sendMessage(String msg, String rec) {
        //logic to send email
        Log.v("EmailService","Email sent to "+rec+ " with Message="+msg);
    }
}
