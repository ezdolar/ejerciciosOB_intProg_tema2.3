public class Sesion3 {
   public static void main(String[] args) {
      sumaTres(1, 2, 3);
      Coche miCoche = new Coche();
      miCoche.incrementarNroPuertas(1);
      System.out.println(miCoche.nroPuertas);
   }
   
   public static int sumaTres(int a, int b, int c){
      return a + b + c;
   }
}

class Coche {
   public int nroPuertas = 4;
   
   public void incrementarNroPuertas(int nuevasPuertas) {
      this.nroPuertas += nuevasPuertas;
   }
}