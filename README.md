# 🧾 Java - Cadastro de Usuários

Projeto simples em Java para cadastro, listagem e remoção de usuários via terminal. Criado em 1 dia, com foco em praticar conceitos de:

- Estrutura de dados com `HashMap`
- Orientação a objetos com classes (`Cadastrar`)
- Manipulação de entrada de dados com `Scanner`
- Laços de repetição e controle de fluxo (`while`, `switch`)

---

## 🚀 Funcionalidades

✔️ Cadastrar usuário (Nome, CPF e Idade)  
✔️ Listar todos os usuários cadastrados  
✔️ Remover um usuário com base em sua chave (Nome_CPF)  
✔️ Menu interativo no terminal  
✔️ Tratamento básico de erros com `try/catch`

---

## 🛠️ Tecnologias utilizadas

- Java 17+ (requer suporte a `"""` text blocks)
- `HashMap` para armazenamento em memória
- Entrada via terminal (`Scanner`)

---

## 📦 Estrutura do código

### Classe `Cadastrar`

```java
public class Cadastrar {
    public String Nome;
    public String CPF;
    public int Idade;

    public Cadastrar(String nome, String cpf, int idade) {
        this.Nome = nome;
        this.CPF = cpf;
        this.Idade = idade;
    }
}

```


## Execução do programa
O programa roda em loop até o usuário escolher a opção de sair. O menu permite interações simples e diretas, sem a necessidade de banco de dados ou arquivos externos.


## 📌 Observações
* Os dados são armazenados apenas em memória (não persistem após fechar o programa).

* A chave usada no HashMap é Nome e CPF, garantindo uma certa unicidade.

* Projeto criado para fins de aprendizado — pode ser expandido com gravação em arquivos, validações ou interface gráfica.
