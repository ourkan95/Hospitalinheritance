import java.util.ArrayList;
import java.util.Random;


public class Insan extends Canli {

 public Insan(String ad, int yas) {
  super(ad, yas);
 }

 @Override
 public void hastalıkKapv2(ArrayList < Canli > canlilar) {
  Random random = new Random();
  int w = random.nextInt(101);
  double c19 = 0;
  double w19 = 0;
  double c20 = 0;
  double w20 = 0;
  double c21 = 0;
  double w21 = 0;

  for (int i = 0; i < canlilar.size(); i++) {

   for (int j = 0; j < canlilar.get(i).kVirusler.size(); j++) {


    if (canlilar.get(i).kVirusler.get(j) instanceof Covid19) {
     c19++;
     w19 = w19 + canlilar.get(i).kVirusler.get(j).bulasmaMiktari;

    } else if (canlilar.get(i).kVirusler.get(j) instanceof Covid20) {
     c20++;
     w20 = w20 + canlilar.get(i).kVirusler.get(j).bulasmaMiktari;
    } else {
     c21++;
     w21 = w21 + canlilar.get(i).kVirusler.get(j).bulasmaMiktari;
    }

   }
  }
  for (int i = 0; i < canlilar.size(); i++) {
   boolean x = canlilar.get(i) instanceof Insan;
   if (x != true) {
    for (int j = 0; j < canlilar.get(i).kVirusler.size(); j++) {

     if (this.kVirusler.size() <= 0) {
      if (canlilar.get(i).kVirusler.get(j).bulasmaMiktari > w) {
       if (canlilar.get(i).kVirusler.get(j) instanceof Covid19) {
        if (c19 > 1) {
         Virus tempp = new Covid19();
         tempp = canlilar.get(i).kVirusler.get(j);
         tempp.setBulasmaMiktari(w19 / c19);
         this.kVirusler.add(tempp);

        } else {
         Virus tempp = new Covid19();
         tempp = canlilar.get(i).kVirusler.get(j);
         this.kVirusler.add(tempp);
        }
       }
      }


     } else {
      for (int k = 0; k < this.kVirusler.size(); k++) {
       if (this.kVirusler.get(k).getClass() != canlilar.get(i).kVirusler.get(j).getClass()) {
        if (canlilar.get(i).kVirusler.get(j).bulasmaMiktari > w) {
         if (canlilar.get(i).kVirusler.get(j) instanceof Covid19) {
          if (c19 > 1) {
           Virus tempp = new Covid19();
           tempp = canlilar.get(i).kVirusler.get(j);
           tempp.setBulasmaMiktari(w19 / c19);
           this.kVirusler.add(tempp);

          } else {
           Virus tempp = new Covid19();
           tempp = canlilar.get(i).kVirusler.get(j);
           this.kVirusler.add(tempp);
          }
         }
        }
       }
      }

     }
     if (this.kVirusler.size() <= 0) {
      if (canlilar.get(i).kVirusler.get(j).bulasmaMiktari > w) {
       if (canlilar.get(i).kVirusler.get(j) instanceof Covid20) {
        if (c20 > 1) {
         Virus tempp = new Covid20();
         tempp = canlilar.get(i).kVirusler.get(j);
         tempp.setBulasmaMiktari(w20 / c20);
         this.kVirusler.add(tempp);

        } else {
         Virus tempp = new Covid20();
         tempp = canlilar.get(i).kVirusler.get(j);
         this.kVirusler.add(tempp);
        }
       }
      }


     } else {
      for (int k = 0; k < this.kVirusler.size(); k++) {
       if (this.kVirusler.get(k).getClass() != canlilar.get(i).kVirusler.get(j).getClass()) {
        if (canlilar.get(i).kVirusler.get(j).bulasmaMiktari > w) {
         if (canlilar.get(i).kVirusler.get(j) instanceof Covid20) {
          if (c20 > 1) {
           Virus tempp = new Covid20();
           tempp = canlilar.get(i).kVirusler.get(j);
           tempp.setBulasmaMiktari(w20 / c20);
           this.kVirusler.add(tempp);

          } else {
           Virus tempp = new Covid20();
           tempp = canlilar.get(i).kVirusler.get(j);
           this.kVirusler.add(tempp);
          }
         }
        }
       }
      }

     }
     if (this.kVirusler.size() <= 0) {
      if (canlilar.get(i).kVirusler.get(j).bulasmaMiktari > w) {
       if (canlilar.get(i).kVirusler.get(j) instanceof Covid21) {
        if (c21 > 1) {
         Virus tempp = new Covid21();
         tempp = canlilar.get(i).kVirusler.get(j);
         tempp.setBulasmaMiktari(w21 / c21);
         this.kVirusler.add(tempp);

        } else {
         Virus tempp = new Covid21();
         tempp = canlilar.get(i).kVirusler.get(j);
         this.kVirusler.add(tempp);
        }
       }
      }


     } else {
      for (int k = 0; k < this.kVirusler.size(); k++) {
       if (this.kVirusler.get(k).getClass() != canlilar.get(i).kVirusler.get(j).getClass()) {
        if (canlilar.get(i).kVirusler.get(j).bulasmaMiktari > w) {
         if (canlilar.get(i).kVirusler.get(j) instanceof Covid21) {
          if (c21 > 1) {
           Virus tempp = new Covid21();
           tempp = canlilar.get(i).kVirusler.get(j);
           tempp.setBulasmaMiktari(w21 / c21);
           this.kVirusler.add(tempp);

          } else {
           Virus tempp = new Covid21();
           tempp = canlilar.get(i).kVirusler.get(j);
           this.kVirusler.add(tempp);
          }
         }
        }
       }
      }

     }
    }
   }
  }




  for (int q = 0; q < kVirusler.size() + 1; q++) {


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
}