import java.util.ArrayList;
import java.util.List;

public class Ogrenciler<T> {  //TİPİNİ T OLARAK GİRDİĞİMİZDE SONRADAN TİP BELİRTMESİ(INT,STRING) YAPABİLİRİZ

    ArrayList<T> liste= new ArrayList<>();

    List<Integer> generic=new ArrayList();

    void listeyeEkle(T eklenecekVeri)
    {

        liste.add(eklenecekVeri);
    }

    ArrayList<T>listeyiGetir()
    {
        return liste;
    }
}
