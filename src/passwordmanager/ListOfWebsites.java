/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordmanager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minh
 */
public class ListOfWebsites implements Serializable {
    
    private List<Website> list;
    
    public ListOfWebsites () {
        list = new ArrayList<>();
    }
    
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
    
    public Website search (String url) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getUrl().equals(url)) {
                return getList().get(i);
            }
        }
        return null;
    }
    
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
