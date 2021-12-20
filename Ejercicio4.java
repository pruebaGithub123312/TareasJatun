public class Ejercicio4{
    public String verificarEstado(String color, int cambios){
        String res = "";
        int estadoActual;
        if(color == "verde"){
            estadoActual = 0;
        }else{
            if(color == "amarillo"){
                estadoActual = 1;
            }else{
                estadoActual = 2;
            }
        }
        
        int estadoFinal = (estadoActual+cambios)%3;
        
        if(estadoFinal == 0){
            res = "verde";
        }else{
            if(estadoFinal == 1){
                res = "amarillo";
            }else{
                res = "rojo";
            }
        }
        
        return res;
    }
}
