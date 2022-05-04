package br.com.sns_aws.services;

import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;
import software.amazon.awssdk.services.sns.model.PublishResponse;

public class SNSSendMessage {
	
	 static SnsClient snsClient = SNSClient.returnSQSClient(CredentialsProvider.returnCredentials());

	public static void sendMessage(String message) {
			
		String topicArn = System.getenv("TOPIC_ARN");
		
		PublishRequest request = PublishRequest.builder()
                .messageStructure("Um envio de SNS")
                .message(message)
                .topicArn(topicArn )
                .build();

        PublishResponse result = snsClient.publish(request);
        
        System.out.println("Message sent, Status was " + result.sdkHttpResponse().statusCode());
        
        snsClient.close();
	}
}
