public class Tema_2_3 {
   public static void main(String[] args) {
      
      /*Paso 1.2: Llamar a la función en el main y darle valores.*/
      sumaTres(1, 2, 3);
      
      /*Paso 2.4: Crear un objeto miCoche en el main y añadirle una puerta*/
      Coche miCoche = new Coche();
      miCoche.incrementarNroPuertas(1);
     
      /*Paso 2.5: Mostrar el número de puertas que tiene el objeto*/
      System.out.println(miCoche.nroPuertas);
   }
   
   /*Paso 1.1: Crear una función con tres parámetros que sean números que se suman entre sí*/
   public static int sumaTres(int a, int b, int c){
      return a + b + c;
   }
}

/*Paso 2.1: Crear una clase coche*/
class Coche {
   
   /*Paso 2.2: Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene*/
   public int nroPuertas = 4;
   
   /*Paso 2.3: Una función que incremente el número de puertas que tiene el coche*/
   public void incrementarNroPuertas(int nuevasPuertas) {
      this.nroPuertas += nuevasPuertas;
   }
}
