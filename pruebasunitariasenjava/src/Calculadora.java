/* Las pruebas unitarias son un tipo de prueba de software que se centra en verificar el funcionamiento
individual de componentes o unidades de código, por lo general, funciones, métodos o clases específicas.
Estas pruebas se realizan de forma aislada, lo que significa que se prueban las unidades de código de manera
independiente de otras partes del sistema. Las pruebas unitarias son una práctica fundamental en el desarrollo
de software orientado a objetos. Al realizar pruebas unitarias de manera continua durante el proceso de desarrollo,
los equipos pueden detectar y corregir errores de manera temprana, lo que ayuda a mejorar la calidad del software y
a reducir el tiempo y el costo asociados con la corrección de errores más adelante en el ciclo de desarrollo.*/
public class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }
    public int resta(int a, int b) {
        return a - b;
    }
    public int multiplicacion(int a, int b) {
        return a * b;
    }
    public int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }
}
