public class PegawaiSales extends Pegawai{

    private int target;
    private int penjualanSaatIni;
    private int bonus;

    public PegawaiSales(String nama, char jenisKelamin) {
        super(nama, jenisKelamin);
    }


    @Override
    public int getGaji(){
        return super.getGaji() + getBonus();
    }

    @Override
    public int getThr() {
        if (penjualanSaatIni >= target){
            return super.getThr() * 2;
        }else {
            return super.getThr();
        }
    }

    // Overloadng dan Overriding NIP
    @Override
    public void setNip(String nip) {
        if (nip.startsWith("S")){
            this.nip = nip;
        }
        else {
            this.nip = "Huruf awal NIP tidak sesuai";
        }
    }

    @Override
    public void setNip(int urutanMasuk) {
        this.nip = "S000" + urutanMasuk;
    }


    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getPenjualan() {
        return penjualanSaatIni;
    }

    public void setPenjualan(int penjualan) {
        this.penjualanSaatIni = penjualan;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


}
