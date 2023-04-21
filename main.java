public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================" + "\n");
        System.out.println("Tugas Pegawai(1)");

        Pegawai pegawaiBiasa = new Pegawai("pegawaiBiasa",'P');
        pegawaiBiasa.setGaji(2000000);
        System.out.println("THR " + pegawaiBiasa.getNama() + ": " + pegawaiBiasa.getThr());

        PegawaiSales salesman1 =  new PegawaiSales("salesman1",'L');
        salesman1.setGaji(2500000);
        salesman1.setTarget(5);
        salesman1.setPenjualan(7);
        System.out.println("THR " + salesman1.getNama() + ": " + salesman1.getThr());

        Manager manager1 = new Manager("manager1",'P');
        manager1.setGaji(5000000);
        System.out.println("THR " + manager1.getNama() + ": " + manager1.getThr() + "\n");
        System.out.println("=========================================" + "\n");


        System.out.println("Tugas Pegawai(2)");

        Pegawai yodhim = new Pegawai("yodhim",'L');
        Pegawai robert = new Pegawai("robert",'P');
        Pegawai bima = new Pegawai("bima", 'L');

        yodhim.setCuti(7);
        System.out.println("Jumlah Cuti " + yodhim.getNama() + ": " + yodhim.getCuti());
        robert.setCuti("persalinan");
        System.out.println("Jumlah Cuti " + robert.getNama() + ": " + robert.getCuti());
        bima.setCuti("mudik");
        System.out.println("Jumlah Cuti " + bima.getNama() + ": " + bima.getCuti() + "\n");
        System.out.println("=========================================" + "\n");

        System.out.println("Tugas Pegawai(3)");

        Pegawai pegawai1 = new Pegawai("pegawai1",'L');
        Pegawai pegawai2 = new Pegawai("pegawai2",'P');
        Pegawai pegawai3 = new Pegawai("pegawai3", 'L');
        pegawai1.setNip("P0001");
        pegawai2.setNip("S0001");
        pegawai3.setNip(2);

        System.out.println("NIP Pegawai Biasa:");
        System.out.println(pegawai1.getNip());
        System.out.println(pegawai2.getNip() + "\n");

        PegawaiSales PegawaiSales2 = new PegawaiSales("salesman2",'L');
        PegawaiSales salesman3 = new PegawaiSales("salesman3",'L');
        PegawaiSales2.setNip("650505");
        salesman3.setNip(3);

        System.out.println("NIP Salesman:");
        System.out.println(PegawaiSales2.getNip());
        System.out.println(salesman3.getNip() + "\n");


        Manager manager2 = new Manager("manager1",'L');
        Manager manager3 = new Manager("manager1",'P');
        manager2.setNip("M0001");
        manager3.setNip(4);

        System.out.println("NIP Manager:");
        System.out.println(manager2.getNip());
        System.out.println(manager3.getNip() + "\n");
        System.out.println("=========================================" + "\n");
    }
}
