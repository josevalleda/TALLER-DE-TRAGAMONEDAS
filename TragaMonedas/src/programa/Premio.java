
package programa;

import java.util.ArrayList;
import java.util.Collections;

class Premio {

    private int cantidad;
    private ArrayList<Programa.Fruta> combinaciones;
    
    Premio(int i, Programa.Fruta fruta, Programa.Fruta fruta0, Programa.Fruta fruta1) {
        cantidad = i;
        combinaciones = new ArrayList<Programa.Fruta>();
        Collections.addAll(combinaciones, fruta , fruta0,fruta1);
    }
    
    public ArrayList<Programa.Fruta> getCombinaciones (){
        return combinaciones;
    }
    public int getCantidad(){
        return cantidad;
    }
    
}
