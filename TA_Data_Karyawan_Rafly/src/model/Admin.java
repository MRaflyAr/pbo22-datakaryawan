package model;

import java.util.ArrayList;
import entity.AdminEntity;

public class Admin
{
    private static ArrayList<AdminEntity> DBcasshier = new ArrayList<>();
   
    public static void InisialData()
    {
        DBcasshier.add(new AdminEntity("Rafly","123", "Rafly"));
    }

    public static void create(AdminEntity newAdmin)
    {
        DBcasshier.add(newAdmin);
    }

    public static ArrayList<AdminEntity> read(){
        return DBcasshier;
    }

    public static AdminEntity findUsername(String username)
    {
        for (AdminEntity list : read()){
            if (username.equals(list.getUsername())){
                return list;
            }
        }
        return null;
    }
}