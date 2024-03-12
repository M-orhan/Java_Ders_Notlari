import java.sql.*;
import java.util.ArrayList;

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

    ArrayList<String> personelOku(){
        ArrayList<String> veriler=new ArrayList<String>();
        Statement okumaDurumObj= null;
        try {
            okumaDurumObj = baglantiObj.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            ResultSet okumaObj=okumaDurumObj.executeQuery("select*from personel");

            while(okumaObj.next()){
                String line=okumaObj.getString(1)+" "+okumaObj.getString(2)+" "+okumaObj.getString(3)+" "+okumaObj.getString(4)+" "+okumaObj.getString(5)+" "+okumaObj.getString(6)+" "+okumaObj.getString(7)+" "+okumaObj.getString(8);
                veriler.add(line);
            }
            okumaObj.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return veriler;
    }

    int personelGuncelle(String tc, short sicilNo,
                         String adSoyad,String dogumTarihi,
                         boolean medeniDurum, String gorev,
                         boolean seyahatEngel)
    {
        int guncelleSonuc=0;
        byte guncelMedeniDurumByte=0;
        byte guncelSeyahatEngelByte=0;

        if(medeniDurum==true)
            guncelMedeniDurumByte=1;
        if(seyahatEngel==true)
            guncelSeyahatEngelByte=1;

        String updateString=
                "Update personel set sicilno=?,"
                        +" adsoyad=?, dogumtarihi=?,"
                        +" medenidurum=?, gorev=?,"
                        +" seyahatengel=? where tc=?";
        try {
            PreparedStatement guncelleDurumObj=
                    baglantiObj.
                            prepareStatement(updateString);
            guncelleDurumObj.setShort(1, sicilNo);
            guncelleDurumObj.setString(2, adSoyad);
            guncelleDurumObj.setString(3, dogumTarihi);
            guncelleDurumObj.setByte(4, guncelMedeniDurumByte);
            guncelleDurumObj.setString(5, gorev);
            guncelleDurumObj.setByte(6, guncelSeyahatEngelByte);
            guncelleDurumObj.setString(7, tc);
            guncelleSonuc=guncelleDurumObj.executeUpdate();
            baglantiObj.commit();
            guncelleDurumObj.close();
        } catch(SQLException e)
        {}
        return guncelleSonuc;

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