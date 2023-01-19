package controller;

import view.admin.DasBoardRegister;
import view.admin.DashBoardCRUD;
import view.admin.DashBordLogin;

public class View_Controller {
    
    public void toLogin()
    {
        new DashBordLogin();
    }

    public void toRegister()
    {
        new DasBoardRegister();
    }
    
    public void toMenuCrud()
    {
        new DashBoardCRUD();
    }
}
