public class Hello {
   public static void main(String[] args) {

      String vorname = "Annabell"; 
      String nachname = "Roessiger";
      int alter = 29; 
      Gruessen gruessen = new Gruessen("Annabell");
      gruessen.gruesse();
      System.out.println(vorname + nachname + alter); 
   }
}
