package model;

import java.util.ArrayList;
import entity.KaryawanKontrakEntity;

public class KaryawanKontrak {
    
    private static ArrayList<KaryawanKontrakEntity> DB_KaryawanKontrak=new ArrayList<>();

    public static void create(Object data)
    {
        DB_KaryawanKontrak.add((KaryawanKontrakEntity)data);
    }

    public static void update(int index,Object data){
        DB_KaryawanKontrak.set(index, (KaryawanKontrakEntity)data);
    }

    public static void delete(int index){
        DB_KaryawanKontrak.remove(index);
    }

    public static void getIndexDB_KaryawanKontrak(int index)
    {
        DB_KaryawanKontrak.get(index);
    }

    public static ArrayList<KaryawanKontrakEntity> read()
    {
        return DB_KaryawanKontrak;
    }

}
