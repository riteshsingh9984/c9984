package com.mkyong.common;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.SmsFactory;
import com.twilio.sdk.resource.instance.Account;
 
import java.util.HashMap;
 
/*URI : https://www.twilio.com/
UserName : shivritesh9984@gmail.com
Password : _ShivPassword_*/


public class HelloTwilio {
    public static void main(String[] args) throws TwilioRestException {
        TwilioRestClient client = new TwilioRestClient("AC850146fd4bacf5d50db4e9be22745b7e", "2db476d5bb62b312ba043017865df811");
 
        Account account = client.getAccount();
 
        SmsFactory factory = account.getSmsFactory();
 
        HashMap<String, String> message = new HashMap<>();
 
        message.put("To", "+918010327919");
        message.put("From", "+12566458725");
        message.put("Body", "Hello ! Ritesh Rocks.");
 
        factory.create(message);
    }
}