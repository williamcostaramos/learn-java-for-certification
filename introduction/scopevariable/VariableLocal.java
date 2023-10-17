package introduction.scopevariable;

public class VariableLocal {
    /*
     * Variavel de escopo local sao criada apenas dentro de metodos 
     * Ou dentro de Blocos de Instrução como IF e IF/ELSE, WHILE/FOR
     */
    public static void main(String[] args) {
        int x = 10;
        if(x <11){
            int y = 2;
            int resultado = x+y;
            System.out.println("Implementando Variavel Local");
            System.out.printf("X + Y e igual a: %d \n", resultado);
        }
    }
    
}
