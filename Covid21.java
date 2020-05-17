public class Covid21 extends Virus {
 public Covid21() {

 }
 public Covid21(String ad, double bulasmaMiktari, double guc) {
  super(ad, bulasmaMiktari, guc);
 }

 @Override
 public void mutasyonaUgra(Virus other) {
  if (other instanceof Covid21) {
   this.setGuc(guc * 3);

  }
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