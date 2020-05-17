import java.util.ArrayList;


public class Karinca extends Canli {
 Canli[] canlilar = new Canli[4];
 public int x;
 public int q;
 public Karinca(String ad, int yas) {
  super(ad, yas);
 }
 int kyiyenSayisi = 0;

 public int kyiyenHesapla(ArrayList < Canli > canlılar, Canli[] canlilar) {

  for (int i = 0; i < canlilar.length; i++) {
   if (canlilar[i] instanceof Karincayiyen) {
    x++;
   }
  }
  for (int i = 0; i < canlılar.size(); i++) {
   if (canlılar.get(i) instanceof Karincayiyen) {
    q++;
   }
  }
  return x + q;
 }






}