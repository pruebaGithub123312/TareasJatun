public class Ejercicio7{
    public String verificar(int poder, int vida){
        String res = "";
        if(vida%poder == 0){
            res = "Si";
        }else{
            res = "No";
        }
        return res;
    }
}
