package app.user;

import java.util.ArrayList;
import java.util.List;

public class UserBase {
    private UserBase() {}
    
    public static UserBase getInstance() {
        if (instance == null) {
            instance = new UserBase();
            userList = new ArrayList<User>();
        }
        return instance;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void add(User user) {
        userList.add(user);
    }

    private static UserBase instance;
    private static List<User> userList;
}