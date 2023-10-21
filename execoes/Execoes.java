package execoes;

import pessoa.Pessoa;

public class Execoes {

    //checked exceptions

    //Unchecked exceptions

    public static void main(String[] args) throws Exception {
        // try / cath
        //  try    {
        //        validarnumero();
        //  } catch (Exception e) {
        //        System.out.println("Deu mt ruim");
        //        e.printStackTrace();       
        //  }
        Pessoa p = null;
        p = new Pessoa();
        p.getCpf();       
    
    }
    public static void validarnumero() throws Exception{
         int numero = 10;
        if (numero < 100) {
            throw new Exception("O numero é menor que 100");
        }

    }
    
}
