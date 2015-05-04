package org.exoplatform.social.client.api.auth;

/**
 * Used particularly for android client requiring HTTP redirect
 */
public class RedirectException extends Exception {

  private String url;

  /**
   * Exception without any message.
   */
  public RedirectException() {
    super();
  }

  /**
   * Exception with message.
   * 
   * @param newUrl the message
   */
  public RedirectException(String newUrl) {
    super(newUrl);
    url = newUrl;
  }

  public String getUrl() {
    return url;
  }
}
