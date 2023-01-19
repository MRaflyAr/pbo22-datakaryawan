package controller;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import abstraction.KaryawanKontrakInterface;
import entity.KaryawanKontrakEntity;
import model.KaryawanKontrak;

public class KaryawanKontrakController extends KaryawanKontrakInterface {
   

   @Override
   public ArrayList<KaryawanKontrakEntity> read() {
      return KaryawanKontrak.read();
   } 

   @Override
   public void create(String KName, String KKelamin, int KGaji ,String KTipe) {
      KaryawanKontrakEntity krEntity=new KaryawanKontrakEntity();
      krEntity.setKaryawanName(KName);
      krEntity.setKaryawanGen(KKelamin);
      krEntity.setGajiKaryawan(KGaji);
      krEntity.setKaryawanTipe(KTipe);
      KaryawanKontrak.create(krEntity);
   }

   @Override
   public void update(int index,String KName, String KKelamin, int KGaji ,String KTipe) {
      KaryawanKontrakEntity krEntity=new KaryawanKontrakEntity();
      krEntity.setKaryawanName(KName);
      krEntity.setKaryawanGen(KKelamin);
      krEntity.setGajiKaryawan(KGaji);
      krEntity.setKaryawanTipe(KTipe);
      KaryawanKontrak.update(index, krEntity);
   }

   @Override
   public void delete(int index) {
      KaryawanKontrak.delete(index);
   }


   @Override
   public KaryawanKontrakEntity getIndexDB_ShoesWalking(int index) {
     return KaryawanKontrak.read().get(index);
   }
}
