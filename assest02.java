import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pasien {
    int urutanMasuk;
    String namaPasien;
    String kodePasien;
    int usiaPasien;

    public Pasien(int urutanMasuk,  String namaPasien, String kodePasien,  int usiaPasien) {
        this.urutanMasuk = urutanMasuk;
        this.namaPasien = namaPasien;
        this.usiaPasien = usiaPasien;
        this.kodePasien = kodePasien;
    }
}

public class assest02 {
    List<Pasien> pEr= new ArrayList<>();

    public void antrianPasien(int urutanMasuk,  String namaPasien, String kodePasien,  int usiaPasien)  {
        Pasien pasien = new Pasien(urutanMasuk, namaPasien, kodePasien, usiaPasien) ;
        pEr.add(pasien);
    }

    public void urutanPasien() {
        Collections.sort(pEr, new Comparator<Pasien>() {
            @Override
            public int compare(Pasien p1, Pasien p2) {
                if (p1.urutanMasuk < p2.urutanMasuk) {
                    return -1;
                } else if (p1.urutanMasuk > p2.urutanMasuk) {
                    return 1;
                } else {
                    if (p1.kodePasien.equals("diizinkan pulang")) {
                        return -1;
                    } else if (p1.kodePasien.equals("tidak diizinkan pulang")) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });

        for (Pasien pasien: pEr) {
            System.out.println("Urutan penangana pasien: Nama pasien = " + pasien.namaPasien + ", Usia = " + pasien.usiaPasien);
        }
    }

    public static void assest02(String[] args) {
        Pasien pasien = new ();
        pEr.antrianPasien(1, "Nur Aisyah","Biru", 30);
        pEr.antrianPasien(2, "Rima", "Merah", 20);
        pEr.antrianPasien(3, "Kira", "Hijau", 10);
        pEr.antrianPasien(4, "Didi", "Kuning", 5);
        pEr.antrianPasien(5, "Mila", "BIru", 65);
        pEr.cetakDataPasien();
    }
}
