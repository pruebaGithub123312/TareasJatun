public class Ejercicio2{
    public int calcularPrecioMenor(int precioA, int precioB, int precioC){
        int res = 0;
        int suma1 = precioA+precioB;
        int suma2 = precioA+precioC;
        int suma3 = precioB+precioC;
        
        res = (suma1<suma2 && suma1<suma3) ? suma1: (suma2<suma3) ? suma2:suma3;
        
        return res;
    }
}
