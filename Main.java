import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        HashMap<String,Cadastrar> Cadastro = new HashMap<>();
        Scanner Option = new Scanner(System.in);
        while (true){
            System.out.println("""
                    ==== MENU ====
                    1. Cadastrar usuário
                    2. Listar todos
                    3. Remover usuário
                    4. Sair
                    """);

            String Options = Option.nextLine();

            System.out.println();
            switch (Options){
                case "1":
                    System.out.println("Nome: ");
                    String Nome = Option.nextLine();
                    System.out.println("CPF: ");
                    String CPF = Option.nextLine();
                    System.out.println("Idade: ");
                    String Idade = Option.nextLine();
                    try {
                        Cadastro.put(Nome + "_" + CPF,new Cadastrar(Nome,CPF,Integer.parseInt(Idade)));
                    }catch (Exception e){
                        System.out.println("Desculpe-nos mas algo venho a falhar.");
                        return;
                    }
                    System.out.println("Usuário: "+Nome+" Cadastrado!");
                    break;
                case "2":

                    for (Cadastrar pessoas : Cadastro.values()){
                        System.out.println("Nome: " + pessoas.Nome + " Idade: " + pessoas.Idade + " CPF: " + pessoas.CPF);
                    }
                    System.out.println("""
                            =============================
                                       1. Sair
                            =============================
                            
                            """);
                    String Exit = Option.nextLine();
                    if (Objects.equals(Exit, "1")){
                        break;
                    }else{
                        System.out.println("Desculpe-nos mas algo falhou!");
                        return;
                    }

                case "3":
                    Cadastro.forEach((b,v)->{
                        System.out.println(b + ": {" + "Nome: " + v.Nome + " CPF: " + v.CPF + " Idade: " + v.Idade + "}");
                    });

                    System.out.println("Escolha um dos Usuários a cima para remover");
                    String Remove = Option.nextLine();
                    try {
                        Cadastro.remove(Remove);
                    }catch (Exception e){
                        System.out.println("Desculpe-nos mas algo falhou, ao tentar Remover tal usuário.");
                    }
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Desculpe-nos mas tal opção não existe.");
                    return;

            }

        }

    }

}
