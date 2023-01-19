package abstraction;
import entity.KaryawanTetapEntity;
import java.util.ArrayList;
public abstract class KaryawanTetapInterface {
    public abstract ArrayList<KaryawanTetapEntity> read();
    public abstract void create(String KName, String KKelamin, int KGaji ,int KAge);
    public abstract void update(int index,String KName, String KKelamin, int KGaji ,int KAge);
    public abstract void delete(int index);
    public abstract KaryawanTetapEntity getIndexDB_ShoesHiking(int index);
}
