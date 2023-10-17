package introduction.scopevariable;

public class VariableInstance {
    /*
     * Variavel de Instancia Vão existe na memoria enquanto a Instancia do objeto nao for Anulada
     * As Variaveis de Instancia Pertencem ao Objeto Instancias, eles que possuem acesso ao valores setados
     */
    String nome;


    public static void main(String[] args) {
        VariableInstance variableInstance = new VariableInstance();
        variableInstance.definirNome();
    }

    public void definirNome(){
        this.nome = "william";
        System.out.println("Implementando Variavel de Instancia");
        System.out.printf("Nome =%s \n",nome);
    }

    
}
