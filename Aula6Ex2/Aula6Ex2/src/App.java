public class App {
    public static void main(String[] args) throws Exception {
       for (int linha = 0; linha < 10; linha++){
           for(int coluna = 0; coluna < 10; coluna++){
           System.out.print(linha+"*"+coluna+" ");
           }
           System.out.println("");
       }
    //padrão 1
       for(int i = 0; i < 10; i++){
           for (int j = 0; j < 10; j++) {
            if(i>=j){
             System.out.print("*"); 
            }
           }
           System.out.println("");
       }
       System.out.println("");
       //padrão 2
       for(int i = 0; i < 10; i++){
        for (int j = 0; j < 10; j++) {
         if(i+j<10){
          System.out.print("*"); 
         }
        }
        System.out.println("");
    }
       //padrão 3
       System.out.println("");
       for(int i = 0; i < 10; i++){
        for (int j = 0; j < 10; j++) {
         if(j>=i){
          System.out.print("*"); 
         }else{
             System.out.print(" ");
         }
        }
        System.out.println("");
    }
    }
}
