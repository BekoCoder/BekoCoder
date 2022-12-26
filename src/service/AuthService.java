package service;

import model.User;
import java.util.UUID;

public class AuthService {
    private  User [] userList;
    private int index=0;

    public AuthService(int size){

        this.userList=new User[size];
    }


    public boolean register(String name, String  username, String password){
        if(getUser(username)!=null){
            return false;
        }
        userList[index++]=new User(name, username, password);
        return true;
    }

    public  User login (String username, String password){
        User user=getUser(username);
        if(user!=null){
            if(user.getPassword().equals(password) ){
                return user;
            }
        }
        return null;
    }

    public boolean deleteUser(UUID userId){

        for (User user : userList) {
            if(user!=null){
                if(user.getId().equals(userId)){
                    user.setActive(false);
                }
            }

        }
        return true;
    }

    public User getUser(String username){
        for ( User user: userList) {
            if(user!=null){
                if(user.getUsername().equals(username)){
                    return user;
                }
            }
        }
        return null;
    }





}
