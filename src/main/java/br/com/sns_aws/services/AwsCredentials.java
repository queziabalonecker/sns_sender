package main.java.br.com.sns_aws.services;

public class AwsCredentials {
  public static AwsCredentialsProvider returnCredentials() {
      AwsCredentialsProvider credentialsProvider = new AwsCredentialsProvider() {
          @Override
          public AwsCredentials resolveCredentials() {
              return new AwsCredentials() {
                  @Override
                  public String accessKeyId() {
                      return System.getenv("AWS_ACCESS_KEY");
                  }

                  @Override
                  public String secretAccessKey() {
                      return System.getenv("AWS_SECRET_KEY");
                  }
              };
          };
      };
      return credentialsProvider;
  };
}
