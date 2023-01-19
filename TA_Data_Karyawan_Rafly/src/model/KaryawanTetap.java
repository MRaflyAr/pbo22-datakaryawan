package model;

import java.util.ArrayList;
import entity.KaryawanTetapEntity;


public class KaryawanTetap {
    
    private static ArrayList<KaryawanTetapEntity> DB_KaryawanTetap=new ArrayList<>();

    public static void create(Object data)
    {
        DB_KaryawanTetap.add((KaryawanTetapEntity)data);
    }

    public static void update(int index,Object data){
        DB_KaryawanTetap.set(index, (KaryawanTetapEntity)data);
    }

    public static void delete(int index){
        DB_KaryawanTetap.remove(index);
    }

    public static void getIndexDB_KaryawanKontrak(int index)
    {
        DB_KaryawanTetap.get(index);
    }

    public static ArrayList<KaryawanTetapEntity> read()
    {
        return DB_KaryawanTetap;
    }
}
