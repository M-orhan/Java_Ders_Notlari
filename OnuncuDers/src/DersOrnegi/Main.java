package DersOrnegi;

public class Main {
    public static void main(String[] args) {
        dersYonetimi dersYonetimiObj = new dersYonetimi();
        int sinifMevcudu = 25;
        int eklenecekOgrenci = 20;
        int cikacakOgrenciSayisi = 20;

        try {
            dersYonetimiObj.minimumOgrenciSayisiKontrol(sinifMevcudu, cikacakOgrenciSayisi);
            dersYonetimiObj.maksimumOgrenciSayisiKontrol(sinifMevcudu, eklenecekOgrenci);

        } catch (maksimumOgrenciSayisi | minimumOgrenciSayisi e){
            System.out.println(e.toString());
        }
    }
}

