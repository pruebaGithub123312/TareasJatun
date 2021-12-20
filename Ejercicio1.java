public class Ejercicio1{
    public String verificar(int numero){
        String res = "";
        int ultimoDigito = numero%10;
        int primerDigito = numero/100;

        res = (ultimoDigito == primerDigito) ? "Si": "No";

        return res;
    }
}
