public class Ejercicio5{
    public String verificar(int num1, int num2){
        String res = "";
        if(num1%num2 == 0 || num2%num1 == 0){
            res = "Son numeros parientes";
        }else{
            res = "No son parientes";
        }
        return res;
    }
}
