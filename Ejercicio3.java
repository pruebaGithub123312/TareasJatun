public class Ejercicio3{
    public String verificarDia(int dia){
        String res = "";
        if(dia<10){
            res = "Es un dia Normal";
        }else{
            int primerDig = dia/10;
            int ultimoDig = dia%10;
            
            if(primerDig%2 == 0 && ultimoDig%2 != 0){
                res = "Es cruz de Dariel";
            }else{
                if(primerDig%2 != 0 && ultimoDig%2 == 0){
                    res = "Es Cruz de Dariel";
                }else{
                    res = "Es un numero Normal";
                }
            }
        }
        return res;
    }
}
