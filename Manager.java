import java.util.List;

public class Manager  extends  Pegawai{

    private List<Pegawai> anakBuah;
    private Pegawai sekretaris;
    private String ruangan;

    public Manager(String nama, char jenisKelamin) {
        super(nama, jenisKelamin);
    }

    public List<Pegawai> getAnakBuah() {
        return anakBuah;
    }

    public void setAnakBuah(List<Pegawai> anakBuah) {
        this.anakBuah = anakBuah;
    }

    public Pegawai getSekretaris() {
        return sekretaris;
    }

    public void setSekretaris(Pegawai sekretaris) {
        this.sekretaris = sekretaris;
    }

    public  void  setSekretaris(String nip, char kelamin){
        Pegawai p = new Pegawai(nip,kelamin);
        p.setNip(nip);
        this.sekretaris = p;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    @Override
    public int getThr() {
        return super.getThr() * 2;
    }

    // Overloadng dan Overriding NIP
    @Override
    public void setNip(String nip) {
        if (nip.startsWith("M")){
            this.nip = nip;
        }
        else {
            this.nip = "Huruf awal tersebut NIP tidak sesuai";
        }
    }

    @Override
    public void setNip(int urutanMasuk) {
        this.nip = "M000" + urutanMasuk;
    }
}
