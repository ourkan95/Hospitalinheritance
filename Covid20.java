public class Covid20 extends Virus {
 public Covid20() {

 }

 public Covid20(String ad, double bulasmaMiktari, double guc) {
  super(ad, bulasmaMiktari, guc);
 }

 @Override
 public void mutasyonaUgra(Virus other) {

 }

 @Override
 public boolean hastaEdiyormu(Canli other) {
  double w = Math.random();
  w = w * 100 + 1;

  if (this.bulasmaMiktari < w) {
   return false;
  } else {
   return true;
  }
 }


}