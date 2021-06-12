public class Main extends ThreadP {
  public static void main(String[] args) {
   
    try {
      Thread.sleep(5000);
      System.out.println("Depois de 5 segundos");
      Main thread = new Main();
    } catch(Exception e) {
        System.out.println(e);
    }
  }
}
 