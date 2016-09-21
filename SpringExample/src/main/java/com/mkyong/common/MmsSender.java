package com.mkyong.common;

/*/ Download the twilio-java library from http://twilio.com/docs/libraries
*/
import java.util.Map;
import java.util.HashMap;

import com.twilio.sdk.resource.instance.Account;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class MmsSender {

    /* Find your sid and token at twilio.com/user/account */
    public static final String ACCOUNT_SID = "AC850146fd4bacf5d50db4e9be22745b7e";
    public static final String AUTH_TOKEN = "2db476d5bb62b312ba043017865df811";

    public static void main(String[] args) throws TwilioRestException {

        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

        Account account = client.getAccount();

        MessageFactory messageFactory = account.getMessageFactory();
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("To", "+918010327919")); // Replace with a valid phone number for your account.
        params.add(new BasicNameValuePair("From", "+12566458725")); // Replace with a valid phone number for your account.
        params.add(new BasicNameValuePair("Body", "RiteshRock here..!"));
        params.add(new BasicNameValuePair("MediaUrl", "https://static0.twilio.com/recources/logos/twilio-loco-circle-50x50.png"));
        Message mms = messageFactory.create(params);
    }
}