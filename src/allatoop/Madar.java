
package allatoop;


public class Madar extends Gerinces {
    protected boolean szarny;
    public Madar(String rendszertaniOsztaly, int labakSzama) {
        super("madár", 2);
        this.szarny = true;
        super.ragadozo = false;
        
       
    }
    @Override
    public String toString() {
        String s = super.toString();
        
        return s+", hang: "+this.hang+", rendszertani osztály "+this.rendszertaniOsztaly;
    }
    
    
}
