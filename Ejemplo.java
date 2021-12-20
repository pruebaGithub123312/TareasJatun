public class Ejemplo{
    public String verificador(int edad){
        String res = "";
        if(edad >= 18){
            res = "Puedes ingresar al Concierto";
        }else{
            res = "No puedes pasar, no eres mayor de edad";
        }
        return res;
    }
}
