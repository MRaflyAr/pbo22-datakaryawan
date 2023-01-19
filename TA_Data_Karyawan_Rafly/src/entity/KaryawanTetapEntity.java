package entity;

public class KaryawanTetapEntity extends KaryawanEntity{
    
    private int KAge;

    public KaryawanTetapEntity()
    {
        
    }

    public KaryawanTetapEntity(String KName, String KKelamin, int KGaji, int KAge) {
        super(KName, KKelamin, KGaji);
        this.KAge = KAge;
    }

    public int getKaryawanAge() {
        return KAge;
    }

    public void setKaryawanAge(int KAge) {
        this.KAge = KAge;
    }
}
