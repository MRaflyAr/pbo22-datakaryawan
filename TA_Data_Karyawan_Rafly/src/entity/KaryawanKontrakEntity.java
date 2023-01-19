package entity;

public class KaryawanKontrakEntity extends KaryawanEntity
{
    private String kTipe;

    public KaryawanKontrakEntity()
    {
        
    }
    public KaryawanKontrakEntity(String KName, String KKelamin, int KGaji ,String KTipe) {
        super(KName, KKelamin, KGaji);
        this.kTipe = KTipe;
    }

    public String getKaryawanTipe() {
        return kTipe;
    }

    public void setKaryawanTipe(String KTipe) {
        kTipe = KTipe;
    }
}