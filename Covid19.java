import java.util.Random;


public class Covid19 extends Virus {
 public Covid19() {

 }

 public Covid19(String ad, double bulasmaMiktari, double guc) {
  super(ad, bulasmaMiktari, guc);

 }

 @Override
 public void mutasyonaUgra(Virus other) {
  if (other instanceof Covid21) {
   this.setGuc(guc * 2);

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