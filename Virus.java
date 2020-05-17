
public abstract  class Virus{
    public String ad;
    public double bulasmaMiktari;
    public double guc;
    public Virus(){
        
    }

    public Virus(String ad, double bulasmaMiktari, double guc) {
        this.ad = ad;
        this.bulasmaMiktari = bulasmaMiktari;
        this.guc = guc;
    }


    public String getAd() {
        return ad;
    }


    public void setAd(String ad) {
        this.ad = ad;
    }


    public double getBulasmaMiktari() {
        return bulasmaMiktari;
    }


    public void setBulasmaMiktari(double bulasmaMiktari) {
        this.bulasmaMiktari = bulasmaMiktari;
    }


    public double getGuc() {
        return guc;
    }


    public void setGuc(double guc) {
        this.guc = guc;
    }
    
     public Virus (Virus virusObj) {
         this(virusObj.getAd(),virusObj.getBulasmaMiktari(),virusObj.getGuc());
     }
     public int compareTo (Virus virusObj){
        
         
         if (this==virusObj) {
             return 1;
         }
         else {
             return 0;
         }
     }
     public abstract void mutasyonaUgra(Virus other);
     public abstract boolean hastaEdiyormu(Canli other);
   
}
