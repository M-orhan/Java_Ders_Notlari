public class Daire {

    double pi,yaricap;

    Daire(){
        pi=3;
        yaricap=1;
    }

    Daire(double pi,double yaricap){
        this.yaricap=yaricap;
        this.pi=pi;
    }

    Daire(double yaricap){
        this.yaricap=yaricap;
        pi=3;
    }

    Double alanHesapla(){
        return pi*yaricap*yaricap;
    }
}
