public class DosenMain {
    public static void main(String[] args) {
        Dosen d1 = new Dosen();
        d1.idDosen = "001";
        d1.nama = "lia";
        d1.statusAktif = false;
        d1.tahunBergabung = 2000;
        d1.bidangKeahlian = "Sistem informasi";
        System.out.println("== Informasi Dosen 1 ==");
        d1.tampilInformasi();
        d1.setStatusAktif(true);
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2024) + " tahun");
        d1.ubahKeahlian("Kecerdasan Buatan");
        System.out.println();

        Dosen d2 = new Dosen("D123", "Budi Santoso", true, 2010, "ALSD");
        System.out.println("== Informasi Dosen 2 ==");
        d2.tampilInformasi();
        d2.setStatusAktif(false);
        System.out.println("Masa Kerja                    : " + d2.hitungMasaKerja(2024) + " tahun");
        d2.ubahKeahlian("Basis Data");
    }
}
