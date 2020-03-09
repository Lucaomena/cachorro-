package cachorro;
public class Cachorro {
 String nome;
 int idade;
 float peso;
 String raca;
 
 public void latir(String raca){
     switch(raca){
         case "Beagle" : System.out.println("AUUHAHUSAUHAHAHUUA");
         break;
         case "Golden" : System.out.println("auauauauauaauauaua");
         break;
         default : System.out.println("Miau");
     }
 }
 public void imprimir(Cachorro obj){
     System.out.println(obj.nome +" "+ obj.idade+" Anos "+obj.peso+" kg" +" "+obj.raca);
 }
 public static void main (String [] args){
     Cachorro beagle = new Cachorro();
     beagle.nome = "Totó";
     beagle.idade = 7;
     beagle.peso = 12;
     beagle.raca = "Beagle";
     beagle.imprimir(beagle);
     beagle.latir(beagle.raca);

     Cachorro golden = new Cachorro();
     golden.nome = "Gold";
     golden.idade = 5;
     golden.peso = 10;
     golden.raca = "Golden";
     golden.imprimir(golden);
     beagle.latir(golden.raca);
     
     
     
 }
 
 
 
}
