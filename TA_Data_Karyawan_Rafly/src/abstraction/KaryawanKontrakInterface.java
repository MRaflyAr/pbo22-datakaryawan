package abstraction;

import java.security.PublicKey;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import entity.KaryawanKontrakEntity;

public abstract class KaryawanKontrakInterface {
    public abstract ArrayList<KaryawanKontrakEntity> read();
    public abstract void create(String KName, String KKelamin, int KGaji ,String KAge);
    public abstract void update(int index,String KName, String KKelamin, int KGaji ,String KTipe);
    public abstract void delete(int index);
    public abstract KaryawanKontrakEntity getIndexDB_ShoesWalking(int index);
}
