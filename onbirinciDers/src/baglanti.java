import java.sql.*;

public class baglanti {

    Connection baglantiObj;

    baglanti()
    {
        try {
            baglantiObj= DriverManager.getConnection("jdbc:mysql://localhost:3306/intellideneme?"+"useTimezone=true&serverTimezone=UTC","root","");
            System.out.println("Bağlantı başarılı");
        } catch (SQLException e)
        {
            System.out.println("Bağlantı başarısız");
            System.out.println(e.toString());
        }
    }

    public int personelEkle(String tc,short sicilNo,String adSoyad,String dogumTarihi,boolean medeniDurum,String gorev,boolean seyahatEngel)
    {
        int kayitSonuc=0;

        byte medeniDurumByte=0;
        byte seyahatEngelByte=0;

        if(medeniDurum==true)
            medeniDurumByte = 1;
        if(seyahatEngel==true)
            seyahatEngelByte = 1;

        String sorgu="insert into personel" + "(tc,sicilno,adsoyad,dogumtarihi" + ",medenidurum,gorev,seyahatengel)" + " values" + "('"+tc+"','"+sicilNo+"','" +adSoyad+"','"+dogumTarihi+"','" +medeniDurumByte+"','"+gorev+ "','"+seyahatEngelByte+"')";
        Statement durumObj= null;
        try {
            durumObj = baglantiObj.createStatement();
            kayitSonuc=durumObj.executeUpdate(sorgu);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            durumObj.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return kayitSonuc;

    }

    int personelSil(String tc){
        int sonuc=0;
        String deleteString="Delete from personel where tc=?";

        try {
            PreparedStatement silmeDurumObj=baglantiObj.prepareStatement(deleteString);
            silmeDurumObj.setString(1,tc);
            sonuc=silmeDurumObj.executeUpdate();
            baglantiObj.commit();
            silmeDurumObj.close();
        } catch (Exception e) {

        }
        return sonuc;
    }

    void baglantiyiKapat()
    {
        try {
            baglantiObj.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
