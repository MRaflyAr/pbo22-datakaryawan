package controller;
import model.Admin;
import entity.AdminEntity;
import abstraction.AdminInterface;

public class LoginController implements AdminInterface 
{ 
    @Override
    public boolean loginProcces(String username, String password) {
      AdminEntity find=Admin.findUsername(username);

      if (find!=null){
        if (password.equals(find.getPassword())){
            return true;
        }
      }
      return false;
    }

    
}
