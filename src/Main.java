import jdk.internal.icu.impl.NormalizerImpl;

public class Main {
    public static void main(String[] args) {


    }

    public static Boolean validarCliente(Cliente c) {

        if (c.nome == null || c.nome.isEmpty()) {
            System.out.println("Nome inválido.");
            return false;
        }

        if (c.idade <= 0 || c.idade > 120) {
            System.out.println("Idade inválida.");
            return false;
        }

        if (c.endereco == null || c.endereco.isEmpty()) {
            System.out.println("Endereço inválido.");
            return false;
        }

        if (c.telefone == null || c.telefone.isEmpty()) {
            System.out.println("Telefone inválido.");
            return false;
        }

        if (c.cpf == null || c.cpf.length() != 11) {
            System.out.println("CPF inválido.");
            return false;
        }

        if (c.profissao == null || c.profissao.isEmpty()) {
            System.out.println("Profissão inválida.");
            return false;
        }

        if (c.estadoCivil == null || c.estadoCivil.isEmpty()) {
            System.out.println("Estado civil inválido.");
            return false;
        }

        if (c.nacionalidade == null || c.nacionalidade.isEmpty()) {
            System.out.println("Nacionalidade inválida.");
            return false;
        }

        if (c.enderecoTrabalho == null || c.enderecoTrabalho.isEmpty()) {
            System.out.println("Endereço de trabalho inválido.");
            return false;
        }

        return true;
    }
}