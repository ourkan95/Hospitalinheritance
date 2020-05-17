import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.*;
import java.util.stream.Collectors;


public class Canli {
 public String ad;
 public int yas;
 public ArrayList < Virus > kVirusler = new ArrayList < > ();
 public ArrayList < Virus > virusler = new ArrayList < > ();
 public ArrayList < Canli > canlılar = new ArrayList < > ();
 List < Double > bulastempp = new ArrayList < Double > ();
 private Canli[] canlilar_2 = new Canli[4];



 public Canli(String ad, int yas) {
  this.ad = ad;
  this.yas = yas;
 }
 public Canli() {

 }


 public String getAd() {
  return ad;
 }


 public void setAd(String ad) {
  this.ad = ad;
 }

 public int getYas() {
  return yas;
 }


 public void setYas(int yas) {
  this.yas = yas;
 }


 public ArrayList < Virus > getkVirusler() {
  return kVirusler;
 }




 public void setkVirusler(ArrayList < Virus > kVirusler) {
  this.kVirusler = kVirusler;
 }

 public int compareTo(Canli canliObj) {
  //int i = this.ad.compareTo(canliObj.ad);
  if (this == canliObj) {
   return 1;
  } else {
   return 0;
  }

 }
 public void hastalıkKap(ArrayList < Virus > virusler) {

  Random random = new Random();
  int w = random.nextInt(101);

  double c19 = 0;
  double w19 = 0;
  double c20 = 0;
  double w20 = 0;
  double c21 = 0;
  double w21 = 0;
  for (int j = 0; j < virusler.size(); j++) {
   if (virusler.get(j) instanceof Covid19) {
    c19++;
    w19 = w19 + virusler.get(j).bulasmaMiktari;

   } else if (virusler.get(j) instanceof Covid20) {
    c20++;
    w20 = w20 + virusler.get(j).bulasmaMiktari;
   } else {
    c21++;
    w21 = w21 + virusler.get(j).bulasmaMiktari;
   }

  }
  for (int i = 0; i < kVirusler.size(); i++) {
   if (kVirusler.get(i) instanceof Covid19) {
    c19++;
    w19 = w19 + kVirusler.get(i).bulasmaMiktari;

   } else if (kVirusler.get(i) instanceof Covid20) {
    c20++;
    w20 = w20 + kVirusler.get(i).bulasmaMiktari;
   } else {
    c21++;
    w21 = w21 + kVirusler.get(i).bulasmaMiktari;
   }

  }


  kVirusler.clear();
  for (int i = 0; i < virusler.size(); i++) {
   int flag = 1;
   for (int j = 0; j < kVirusler.size(); j++) {
    if (kVirusler.get(j) instanceof Covid19) {
     flag = flag * 2;
    } else if ( /*kVirusler.get(j) instanceof Covid19 || */ kVirusler.get(j) instanceof Covid20) {
     flag = flag * 3;
    } else /* (kVirusler.get(j) instanceof Covid19 || kVirusler.get(j) instanceof Covid20|| kVirusler.get(j) instanceof Covid21 )*/ {
     flag = flag * 5;
    }

   }

   if (virusler.get(i).bulasmaMiktari > w) {

    if (virusler.get(i) instanceof Covid19) {
     if (flag % 2 != 0) {
      if (c19 > 1) {
       Virus temp = new Covid19();
       temp = virusler.get(i);
       temp.setBulasmaMiktari(w19 / c19);
       kVirusler.add(temp);
      } else {

       Virus temp = new Covid19();
       temp = virusler.get(i);
       kVirusler.add(temp);
      }

     }
    }
    if (virusler.get(i) instanceof Covid20) {
     if (flag % 3 != 0) {
      if (c20 > 1) {
       Virus temp = new Covid20();
       temp = virusler.get(i);
       temp.setBulasmaMiktari(w20 / c20);
       kVirusler.add(temp);
      } else {

       Virus temp = new Covid20();
       temp = virusler.get(i);
       kVirusler.add(temp);
      }



     }

    }
    if (virusler.get(i) instanceof Covid21) {

     if (flag % 5 != 0) {

      if (c21 > 1) {

       Virus temp = new Covid21();
       temp = virusler.get(i);
       temp.setBulasmaMiktari(w21 / c21);
       kVirusler.add(temp);
      } else {

       Virus temp = new Covid21();
       temp = virusler.get(i);
       kVirusler.add(temp);
      }


     }

    }

   }
  }

     System.out.println(this.kVirusler);
 }
 public void hastalıkKapv2(ArrayList < Canli > canlılar) {
  Random random = new Random();
  int w = random.nextInt(101);
  double c19 = 0;
  double w19 = 0;
  double c20 = 0;
  double w20 = 0;
  double c21 = 0;
  double w21 = 0;
  w = 1;
  for (int i = 0; i < canlılar.size(); i++) {

   for (int j = 0; j < canlılar.get(i).kVirusler.size(); j++) {

    if (canlılar.get(i).kVirusler.get(j) instanceof Covid19) {
     c19++;
     w19 = w19 + canlılar.get(i).kVirusler.get(j).bulasmaMiktari;

    } else if (canlılar.get(i).kVirusler.get(j) instanceof Covid20) {
     c20++;
     w20 = w20 + canlılar.get(i).kVirusler.get(j).bulasmaMiktari;
    } else {
     c21++;
     w21 = w21 + canlılar.get(i).kVirusler.get(j).bulasmaMiktari;
    }

   }
  }
  for (int i = 0; i < canlılar.size(); i++) {
   for (int j = 0; j < canlılar.get(i).kVirusler.size(); j++) {

    if (this.kVirusler.size() <= 0) {
     if (canlılar.get(i).kVirusler.get(j).bulasmaMiktari > w) {
      if (canlılar.get(i).kVirusler.get(j) instanceof Covid19) {
       if (c19 > 1) {
        Virus tempp = new Covid19();
        tempp = canlılar.get(i).kVirusler.get(j);
        tempp.setBulasmaMiktari(w19 / c19);
        this.kVirusler.add(tempp);

       } else {
        Virus tempp = new Covid19();
        tempp = canlılar.get(i).kVirusler.get(j);
        this.kVirusler.add(tempp);
       }
      }
     }


    } else {
     for (int k = 0; k < this.kVirusler.size(); k++) {
      if (this.kVirusler.get(k).getClass() != canlılar.get(i).kVirusler.get(j).getClass()) {
       if (canlılar.get(i).kVirusler.get(j).bulasmaMiktari > w) {
        if (canlılar.get(i).kVirusler.get(j) instanceof Covid19) {
         if (c19 > 1) {
          Virus tempp = new Covid19();
          tempp = canlılar.get(i).kVirusler.get(j);
          tempp.setBulasmaMiktari(w19 / c19);
          this.kVirusler.add(tempp);

         } else {
          Virus tempp = new Covid19();
          tempp = canlılar.get(i).kVirusler.get(j);
          this.kVirusler.add(tempp);
         }
        }
       }
      }
     }

    }
    if (this.kVirusler.size() <= 0) {
     if (canlılar.get(i).kVirusler.get(j).bulasmaMiktari > w) {
      if (canlılar.get(i).kVirusler.get(j) instanceof Covid20) {
       if (c20 > 1) {
        Virus tempp = new Covid20();
        tempp = canlılar.get(i).kVirusler.get(j);
        tempp.setBulasmaMiktari(w20 / c20);
        this.kVirusler.add(tempp);

       } else {
        Virus tempp = new Covid20();
        tempp = canlılar.get(i).kVirusler.get(j);
        this.kVirusler.add(tempp);
       }
      }
     }


    } else {
     for (int k = 0; k < this.kVirusler.size(); k++) {
      if (this.kVirusler.get(k).getClass() != canlılar.get(i).kVirusler.get(j).getClass()) {
       if (canlılar.get(i).kVirusler.get(j).bulasmaMiktari > w) {
        if (canlılar.get(i).kVirusler.get(j) instanceof Covid20) {
         if (c20 > 1) {
          Virus tempp = new Covid20();
          tempp = canlılar.get(i).kVirusler.get(j);
          tempp.setBulasmaMiktari(w20 / c20);
          this.kVirusler.add(tempp);

         } else {
          Virus tempp = new Covid20();
          tempp = canlılar.get(i).kVirusler.get(j);
          this.kVirusler.add(tempp);
         }
        }
       }
      }
     }

    }
    if (this.kVirusler.size() <= 0) {
     if (canlılar.get(i).kVirusler.get(j).bulasmaMiktari > w) {
      if (canlılar.get(i).kVirusler.get(j) instanceof Covid21) {
       if (c21 > 1) {
        Virus tempp = new Covid21();
        tempp = canlılar.get(i).kVirusler.get(j);
        tempp.setBulasmaMiktari(w21 / c21);
        this.kVirusler.add(tempp);

       } else {
        Virus tempp = new Covid21();
        tempp = canlılar.get(i).kVirusler.get(j);
        this.kVirusler.add(tempp);
       }
      }
     }


    } else {
     for (int k = 0; k < this.kVirusler.size(); k++) {
      if (this.kVirusler.get(k).getClass() != canlılar.get(i).kVirusler.get(j).getClass()) {
       if (canlılar.get(i).kVirusler.get(j).bulasmaMiktari > w) {
        if (canlılar.get(i).kVirusler.get(j) instanceof Covid21) {
         if (c21 > 1) {
          Virus tempp = new Covid21();
          tempp = canlılar.get(i).kVirusler.get(j);
          tempp.setBulasmaMiktari(w21 / c21);
          this.kVirusler.add(tempp);

         } else {
          Virus tempp = new Covid21();
          tempp = canlılar.get(i).kVirusler.get(j);
          this.kVirusler.add(tempp);
         }
        }
       }
      }
     }

    }
   }
  }


System.out.println(this.kVirusler);

  for (int q = 0; q < kVirusler.size(); q++) {


   for (int i = 0; i < this.kVirusler.size(); i++) {
    for (int j = 0; j < this.kVirusler.size(); j++) {
     if (this.kVirusler.get(i) == this.kVirusler.get(j)) {
      if (i != j) {
       this.kVirusler.remove(j);

      }
     }
    }
   }
  }

  System.out.println(this.kVirusler);

 }
 public void hastalıkKap(Canli[] canlilar) {
  Random rnd = new Random();



  for (int q = 0; q < canlilar.length; q++) {
   canlilar_2[q] = canlilar[q];

  }
  for (int qw = 0; qw < canlilar_2.length; qw++) {



  }
  for (int i = 0; i < canlilar.length; i++) {
   int j = i + 1;
   if (i == canlilar.length - 1) {
    j = 0;
   }

   while (j != i && j < canlilar.length) {
    boolean flag = false;

    for (int k = 0; k < canlilar[j].kVirusler.size(); k++) {

     for (int q = 0; q < canlilar[i].kVirusler.size(); q++) {

      if (canlilar[i].kVirusler.get(q).getClass() == canlilar[j].kVirusler.get(k).getClass()) {
       flag = true;
       canlilar[i].kVirusler.get(q).setBulasmaMiktari((canlilar[i].kVirusler.get(q).getBulasmaMiktari() + canlilar[j].kVirusler.get(k).getBulasmaMiktari()) / 2);
      }
     }
     int w = rnd.nextInt(101);


     if (flag == false && canlilar[j].kVirusler.get(k).bulasmaMiktari > w) {
      canlilar_2[i].kVirusler.add(canlilar[j].kVirusler.get(k));
     }
    }







    j++;
    if (j >= canlilar.length) {
     j = 0;
    }


   }

  }
  for (int qw = 0; qw < canlilar_2.length; qw++) {


   canlilar[qw] = canlilar_2[qw];

  }

  for (int i = 0; i < canlilar.length; i++) {
   for (int j = 0; j < canlilar[i].kVirusler.size(); j++) {
    for (int k = 0; k < canlilar[i].kVirusler.size(); k++) {
     if (canlilar[i].kVirusler.get(j).getClass() == canlilar[i].kVirusler.get(k).getClass()) {
      if (j != k) {
       canlilar[i].kVirusler.remove(j);
      }
     }
    }
   }
  }

  for (int qwe = 0; qwe < canlilar.length; qwe++) {
   System.out.println(canlilar[qwe].kVirusler);
  }
 }

}