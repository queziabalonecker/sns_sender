package main;

import br.com.sns_aws.services.SNSSendMessage;

public class App 
{
    public static void main( String[] args )
    {
    	SNSSendMessage.sendMessage("Uma mensagem SNS");
    }
}

