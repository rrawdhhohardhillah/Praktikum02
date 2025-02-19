public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK= "IF001";
        mk1.nama = "AlSD";
        mk1.sks = 2;
        mk1.jumlahJam = 8;
        System.out.println("== Informasi Mata Kuliah 1 ==");
        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        System.out.println();

        MataKuliah mk2 = new MataKuliah("IF123", "Basis Data", 4, 6);
        System.out.println("== Informasi Mata Kuliah 2 ==");
        mk2.tampilInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(3);
        mk2.kurangiJam(2);
    }
}
