package introduction.scopevariable;

public class VariableClass {
    static String nome;

    public static void main(String[] args) {
        VariableClass.nome = "william";
        System.out.println("Implementação Variavel Class, (Variavel Static)");
        System.out.printf("Nome: %s \n", VariableClass.nome);
    }
}
