package puntoenplano;
public class PuntoEnPlano {
    public static void main(String[] args) {
        
        Punto p1=new Punto( 2, 3);
        Punto p2=new Punto(-1,1);
        
        
        
        
        System.out.println("La distacia al origen  del p1 es:"+ p1.distanciaAlOrigen());
        System.out.println("La distacia al origen  del p2 es:"+ p2.distanciaAlOrigen());
        System.out.println("La distacia entre p1 y p2 es:"+p1.diastaciaEntreDosPuntos(p2));
    }    
}
