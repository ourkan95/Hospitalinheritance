import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Test {
 public static void main(String[] args) {
  ArrayList < Virus > kVirusler = new ArrayList < > ();
  ArrayList < Virus > virusler = new ArrayList < > ();
  ArrayList < Canli > canlılar = new ArrayList < > ();
  ArrayList < Karinca > karincalar = new ArrayList < > ();
  Canli[] canlilar = new Canli[4];


  Insan canlı1 = new Insan("ahmet", 30);
  Insan canlı2 = new Insan("mehmet", 30);
  Karincayiyen canlı3 = new Karincayiyen("Karınca Yiyen", 10);
  Karinca canlı4 = new Karinca("Karınca", 1);
  


  Virus virus1 = new Covid19("Covid19", 40, 10);
  Virus virus2 = new Covid20("Covid20", 55, 70);
  Virus virus3 = new Covid21("Covid21", 25, 35);
  Virus virus4 = new Covid19("c19", 50, 30);
  Virus virus5 = new Covid20("c20", 30, 30);

  canlilar[0] = canlı1;
  canlilar[1] = canlı2;
  canlilar[2] = canlı3;
  canlilar[3] = canlı4;


  virusler.add(virus1);
  virusler.add(virus2);
  virusler.add(virus3);
  virusler.add(virus4);
  virusler.add(virus5);
  canlı1.kVirusler.add(virus1);
  canlı2.kVirusler.add(virus2);
  canlı3.kVirusler.add(virus3);
  canlı4.kVirusler.add(virus4);

  canlılar.add(canlı1);
  canlılar.add(canlı2);
  canlılar.add(canlı3);
  canlılar.add(canlı4);

  karincalar.add(canlı4);


  //System.out.println(virus2.compareTo(virus2));
  //System.out.println(virus1.hastaEdiyormu(canlı1));
  //virus2.mutasyonaUgra(virus4);
  //System.out.println(virus2.getGuc());
  Virus obj = new Virus(virus1) {
   @Override
   public void mutasyonaUgra(Virus other) {
    throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public boolean hastaEdiyormu(Canli other) {
    throw new UnsupportedOperationException("Not supported yet.");
   }
  };


  //canlı1.hastalıkKap(virusler);


  
 
  //canlı2.hastalıkKapv2(canlılar);
 // canlı1.hastalıkKap(canlilar);
  //canlı2.hastalıkKapv2(canlılar);
 // canlı3.karincaYe(karincalar);
  //System.out.println(canlı4.kyiyenHesapla(canlılar, canlilar));








 }

}