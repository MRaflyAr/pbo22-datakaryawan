package entity;

public abstract class KaryawanEntity {

    private String kName;
    private String kKelamin;
    private int kGaji;

    public KaryawanEntity(String KName, String KKelamin, int KGaji) {
        kName = KName;
        kKelamin = KKelamin;
        kGaji = KGaji;
    }

    public KaryawanEntity() {

    }

    public String getKaryawanName() {
        return kName;
    }

    public String getKaryawanGen() {
        return kKelamin;
    }

    public int getGajiKaryawan() {
        return kGaji;
    }

    public void setKaryawanName(String KName) {
        this.kName = KName;
    }

    public void setKaryawanGen(String KKelamin) {
        this.kKelamin = KKelamin;
    }

    public void setGajiKaryawan(int KGaji) {
        this.kGaji = KGaji;
    }

}
