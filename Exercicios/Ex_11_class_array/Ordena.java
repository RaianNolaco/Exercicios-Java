public class Ordena{   
       
    public void ordint(int...vetor) {   
           
           
        Arrays.sort(vetor);   
        int vtamanho = vetor.length;   
           
        for (int i = 0; i < vtamanho; i++) {   
               
            System.out.println(vetor[i]);   
               
        }   
           
    }   
       
}