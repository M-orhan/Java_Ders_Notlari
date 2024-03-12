package DersOrnegi;

public class dersYonetimi
{
    void minimumOgrenciSayisiKontrol(int sinifMevcudu,int silinecekOgrenciSayisi)
    throws minimumOgrenciSayisi
    {
        if(sinifMevcudu-silinecekOgrenciSayisi<10)
            throw new minimumOgrenciSayisi("Bu dersi alan öğrenci sayısı 10'dan az olamaz");
    }

    void maksimumOgrenciSayisiKontrol(int sinifMevcudu,int eklenecekOgrenciSayisi)
            throws maksimumOgrenciSayisi, minimumOgrenciSayisi {
        if(sinifMevcudu+eklenecekOgrenciSayisi>40)
            throw new minimumOgrenciSayisi("Bu dersi alan öğrenci sayısı 40'dan fazla olamaz");
    }
}
