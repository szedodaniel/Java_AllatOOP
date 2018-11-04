
package allatoop;


public class Emlos extends Gerinces{


    public Emlos(int labakSzama, String hang, String nev) {
        super(labakSzama, hang, nev);
        super.fut = true;
        super.rendszertaniOsztaly = "Emlős";
    }

    @Override
    public String toString() {
        String s = super.toString();
        
        return s+", hang: "+this.hang+", rendszertani osztály "+this.rendszertaniOsztaly;
    }
    

 
}
