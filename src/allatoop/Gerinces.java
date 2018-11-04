
package allatoop;

import java.util.ArrayList;
import java.util.List;


public abstract class Gerinces {
    protected List<Gerinces> allatok;
    protected int allatokSzama;
    protected String torzs;
    protected String rendszertaniOsztaly;
    protected int labakSzama;
    protected String hang;
    protected String nev;
    protected boolean ragadozo;
    protected boolean repul;
    protected boolean fut;
    

    public Gerinces(String torzs, String rendszertaniOsztaly, int labakSzama, String hang, String nev) {
        this.torzs = torzs;
        this.rendszertaniOsztaly = rendszertaniOsztaly;
        this.labakSzama = labakSzama;
        this.hang = hang;
        this.nev = nev;
    }

    public Gerinces(int labakSzama, String hang, String nev) {
        this.labakSzama = labakSzama;
        this.hang = hang;
        this.nev = nev;
    }

    public Gerinces(String rendszertaniOsztaly, int labakSzama) {
        this.rendszertaniOsztaly = rendszertaniOsztaly;
        this.labakSzama = labakSzama;
    }

    public void setRendszertaniOsztaly(String rendszertaniOsztaly) {
        this.rendszertaniOsztaly = rendszertaniOsztaly;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNev() {
        return nev;
    }
    

    public void Eszik(Gerinces allat){
         if (this.ragadozo != true)
            {

                //String.format("A/az %s nem ragadozó", this.nev);
                System.out.println("A/az "+this.nev+" nem ragadozó");
            }
            else
            {         
                 //String.format("A/az %s ragadozó megedte a/az %s-t", this.nev,allat);
                 System.out.println("A/az "+this.nev+" ragadozó megedte a/az"+allat.getNev()+"-t");
            }
    }
    public void hozzaad(){
        this.allatok  = new ArrayList<>();
        this.allatok.add(this);
    }
    public void  allatMegSzamol(){
        System.out.println(this.allatok.size());
        
    }
    

    public String hangotAd() {
        return hang;
    }

    @Override
    public String toString() {
        return "név: " + nev;
    }

    

   

   
    

    
    
    
    
}
