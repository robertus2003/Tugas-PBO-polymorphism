public class Pegawai {

    private String nama;
    String nip;
    private String departemen;

    private char jenisKelamin;
    private int gaji;
    private  int cuti = 12;

    public Pegawai(String nama, char jenisKelamin) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    // Overloading Gaji
    public void setGaji(int gaji, int tunjangan){
        this.gaji =  gaji + tunjangan;
    }

    public void setGaji( int gaji, int tunjangan, int potongan){
        this.gaji =  gaji + tunjangan - potongan;
    }

    // Overloading NIP
    public void setNip(String nip) {
        if (nip.startsWith("P")){
            this.nip = nip;
        }
        else {
            this.nip = "Huruf awal NIP tidak sesuai";
        }
    }

    public void setNip(int urutanMasuk) {
        this.nip = "P000" + urutanMasuk;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getThr() {
        return gaji;
    }

    public int getCuti() {
        return cuti;
    }

    public void setCuti(int cuti) {
        this.cuti = this.cuti + cuti;
    }

    public void setCuti(String tipeCuti){
        if (tipeCuti == "pernikahan"){
            cuti = cuti + 2;
        }
        else if (tipeCuti == "persalinan"){
            if (jenisKelamin == 'L' || jenisKelamin == 'l'){
                cuti = cuti + 3;
            }
            else if(jenisKelamin == 'P' || jenisKelamin == 'p'){
                cuti = cuti + 90;
            }
        }
        else if (tipeCuti == "sakit") {
            cuti = cuti + 5;
        }
        else if (tipeCuti == "mudik") {
            cuti = cuti + 14;
        }
    }


}
