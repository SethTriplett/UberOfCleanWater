package team30.cs2340.test.Model;

import java.util.Hashtable;

/**
 * Created by Seth Triplett on 2/11/2017.
 */

public class UserData {
    public static Hashtable<String, String> userBase;

    public boolean addUser(String name, String pass) {
        if (!userBase.containsKey(name)) {
            userBase.put(name, pass);
            return true;
        }
        else {return false;}
    }

    public void removeUser(String name) {
        userBase.remove(name);
    }

    public boolean login(String name, String pass) {
        if (userBase.containsKey(name)) {
            if (userBase.get(name).equals(pass)) {
                return true;
            }
        }
        else {return false;}
    }
}
