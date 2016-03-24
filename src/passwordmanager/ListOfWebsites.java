
package passwordmanager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minh Vu
 * Date: 3/23/16
 */
public class ListOfWebsites implements Serializable {
    
    /* List of websites that will be used to populate the table in the GUI */
    private List<Website> list;
    
    /* initialize the list */
    public ListOfWebsites () {
        list = new ArrayList<>();
    }
    
    /* method to insert website into the list, also checks for incorrect inputs 
       like empty strings
    */
    public void insert (String url, String username, String password) {
        if ("".equals(url) || "".equals(username) || "".equals(password)) {
            return;
        }
        
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getUrl().equals(url)) {
                return;
            }
        }
        
        Website w = new Website(url, username, password);
        getList().add(w);
    }
    
    /* method to delete, also checks for incorrect input like empty strings */
    public boolean delete (String url) {
        boolean removed = false;
        
        if ("".equals(url)) {
            throw new IllegalArgumentException ("Illegal inputs for delete.");
        }
        
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getUrl().equals(url)) {
                getList().remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }
    
    /* method to search for a specific url in the list */
    public Website search (String url) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getUrl().equals(url)) {
                return getList().get(i);
            }
        }
        return null;
    }
    
    /* method to update existing website in the list */
    public Website update (String url, String username, String password) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getUrl().equals(url)) {
                getList().get(i).setUsername(username);
                getList().get(i).setPassword(password);
                return getList().get(i);
            }
        }
        return null;
    }
    
    /* clear the list */
    public void clear () {
        getList().clear();
    }

    /**
     * @return the list
     */
    public List<Website> getList() {
        return list;
    }

}
