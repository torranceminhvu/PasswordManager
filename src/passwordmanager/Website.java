
package passwordmanager;

import java.io.Serializable;

/**
 *
 * @author Minh Vu
 * Date: 3/23/16
 */

/* Class that stores information on the url, username, and password */
public class Website implements Serializable {
    /* Information to be stored onto the password bank */
    private String url;
    private String username;
    private String password;
    
    /* Constructor to initalize information */
    public Website(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
    

 
