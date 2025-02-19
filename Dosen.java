public class Dosen {
    String bidangKeahlian;
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    public Dosen(){
        
    }

    public Dosen(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen                      : " + idDosen);
        System.out.println("Nama                          : " + nama);
        System.out.println("Status Aktif                  : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung               : " + tahunBergabung);
        System.out.println("Bidang Keahlian               : " + bidangKeahlian);
    }

    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status aktif diubah menjadi   : " + (status ? "Aktif" : "Tidak Aktif"));
    }

    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian diubah menjadi: " + bidang);
    }
}
