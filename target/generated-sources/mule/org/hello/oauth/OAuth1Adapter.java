
package org.hello.oauth;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-05-09T10:36:55+08:00", comments = "Build 3.4.3.1620.30ea288")
public interface OAuth1Adapter extends OAuthAdapter
{

        public String authorize(java.util.Map<String, String> extraParameters, String requestTokenUrl, String accessTokenUrl, String authorizationUrl, String redirectUri)
        throws UnableToAcquireRequestTokenException
    ;

    public void fetchAccessToken(String requestTokenUrl, String accessTokenUrl, String authorizationUrl, String redirectUri)
        throws UnableToAcquireAccessTokenException
    ;

    public String getAccessTokenSecret();

    public void setAccessTokenSecret(String value);
}
