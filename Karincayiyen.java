import java.util.ArrayList;


public class Karincayiyen extends Canli {

 public Karincayiyen(String ad, int yas) {
  super(ad, yas);
 }
 public void karincaYe(ArrayList < Karinca > karincalar) {
  boolean flag = true;
  for (int i = 0; i < this.kVirusler.size(); i++) {
   for (int j = 0; j < karincalar.size(); j++) {
    for (int k = 0; k < karincalar.get(j).kVirusler.size(); k++) {
     if (this.kVirusler.get(i) == karincalar.get(j).kVirusler.get(k)) {
      flag = true;
     } else {
      flag = false;
     }
     if (flag == false) {
      this.kVirusler.add(karincalar.get(j).kVirusler.get(k));
     }
    }
   }
  }

  System.out.println(this.kVirusler);
 }

}