package controller;

import java.util.ArrayList;

import abstraction.KaryawanTetapInterface;
import entity.KaryawanTetapEntity;
import model.KaryawanTetap;

public class KaryawanTetapController extends KaryawanTetapInterface {

    @Override
    public ArrayList<KaryawanTetapEntity> read() {
        return KaryawanTetap.read();
    } 

    @Override
    public void create(String KName, String Kkelamin, int KGaji, int KAge) {
      KaryawanTetapEntity krEntity=new KaryawanTetapEntity();
      krEntity.setKaryawanName(KName);
      krEntity.setKaryawanGen(Kkelamin);
      krEntity.setGajiKaryawan(KGaji);
      krEntity.setKaryawanAge(KAge);
      KaryawanTetap.create(krEntity);
    }

    @Override
    public void update(int index, String KName, String KKelamin, int KGaji,int KAge) {
      KaryawanTetapEntity krEntity=new KaryawanTetapEntity();
        krEntity.setKaryawanName(KName);
        krEntity.setKaryawanGen(KKelamin);
        krEntity.setGajiKaryawan(KGaji);
        krEntity.setKaryawanAge(KAge);
        KaryawanTetap.update(index, krEntity);
    }

    @Override
    public void delete(int index) {
    KaryawanTetap.delete(index);
    }

    @Override
    public KaryawanTetapEntity getIndexDB_ShoesHiking(int index) {
      return KaryawanTetap.read().get(index);
    }
    
}
