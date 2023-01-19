package controller;
import entity.AdminEntity;
import model.Admin;

public class AdminController {
    
    public AdminEntity findData(String username){
        for (AdminEntity list : Admin.read()){
            if (username.equals(list.getUsername())){
                return list;
            }
        }
        return null;
    }

    public boolean tambahData(String nama,String username,String password){
        if (findData(username)==null){
            Admin.create(new AdminEntity(username, password, username));
            return true;
        }
        return false;
    }
}
