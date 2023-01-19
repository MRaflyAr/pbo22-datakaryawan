import view.admin.DasBoardRegister;
import view.admin.DashBordLogin;
import controller.View_Controller;
import model.Admin;
public class App {
    public static void main(String[] args) throws Exception {
        dataAdm();
      
        new View_Controller().toLogin();
    }
    public static void dataAdm()
    {
        Admin.InisialData();
    }
}