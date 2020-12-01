package ColasConArreglos;
public class Cola {
    
    private NodoCola ini,fiin;
    String cola = "";
    
    public Cola(){
        ini = null;
        fiin = null;
    }
    
    public boolean ColaV(){
        if(ini == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void Insertar(String palabra){
        NodoCola nod = new NodoCola();
        nod.palabra = palabra;
        nod.sig = null;
        
        if (ColaV()) {
            ini = nod;
            fiin = nod;
        } else {
            fiin.sig = nod;
            fiin = nod;
        }   
    }
    
    public String Eliminar(){
        if (!ColaV()) {
            String palabra = ini.palabra;
            
            if (ini == fiin) {
                ini = null;
                fiin = null;
            } else {
                ini = ini.sig;
            }
            return palabra;
        } else {
            return null;
        }
    }
    
    public void Mostrar(){
        NodoCola recorrer = ini;
        String colainv = " ";
        while(recorrer != null){
            cola += recorrer.palabra + " " ;
            recorrer = recorrer.sig;
        }
        String cadena[] = cola.split(" ");
        
        for (int i = cadena.length -1; i >= 0; i--) {
        colainv += " "+cadena[i];
        }
          System.out.println(colainv);  
          cola = "";
        
    }
}
