package excecao;

public class ChecadaxNaochecada {
    public static void main(String[] args) {

       try {
           error1();
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }

       try {
           error2();
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }

        System.out.println("Fim :)");
    }

    //Não checada ou não verficada
    static void error1 (){
       throw  new RuntimeException("Ocorreu um erro #1");
    }

    //exeção checada ou verificada
    static void error2() throws Exception{
        throw new Exception("Ocorreu um erro #2");
    }
}
