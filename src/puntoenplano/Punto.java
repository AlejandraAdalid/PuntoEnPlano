package puntoenplano;
public class Punto {
    // defini los 2 atributos de mi clase
    private float x=0;
    private float y=0;
    
    // metodos
    // constructores
    public Punto(){  //constructor sin parametros
        x=0;
        y=0;
    }
    public Punto(float x, float y  ){  //constructor con parametros
        this.x=x;   // al atributo x le asigno el parametro x
        this.y=y;
    }
    // resto metodos
    public float distanciaAlOrigen(){
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
    public float diastaciaEntreDosPuntos(Punto  p ){
        
        return (float) Math.sqrt(Math.pow(x - p.x , 2) + Math.pow(y - p.y,2));
   
        
     }
           
    
    
    
}
