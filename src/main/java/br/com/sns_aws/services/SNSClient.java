package br.com.sns_aws.services;

import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sns.SnsClient;

public class SNSClient {
	private AwsCredentialsProvider credentialsProvider;
	
	SnsClient snsClient = SnsClient.builder()
            .region(Region.US_EAST_1)
            .credentialsProvider(credentialsProvider)
            .build();
}
