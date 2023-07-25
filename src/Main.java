// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) public class Cliente {

        public boolean validarCliente() {

            if (nome != null && !nome.isEmpty()) {
                if (idade > 0 && idade <= 120) {
                    if (email != null && email.contains("@")) {
                        if (endereco != null && !endereco.isEmpty()) {
                            if (telefone != null && !telefone.isEmpty()) {
                                if (cpf != null && cpf.length() == 11) {
                                    if (profissao != null && !profissao.isEmpty()) {
                                        if (estadoCivil != null && !estadoCivil.isEmpty()) {
                                            if (nacionalidade != null && !nacionalidade.isEmpty()) {
                                                if (enderecoTrabalho != null && !enderecoTrabalho.isEmpty()) {
                                                    return true;
                                                } else {
                                                    System.out.println("Endereço de trabalho inválido.");
                                                }
                                            } else {
                                                System.out.println("Nacionalidade inválida.");
                                            }
                                        } else {
                                            System.out.println("Estado civil inválido.");
                                        }
                                    } else {
                                        System.out.println("Profissão inválida.");
                                    }
                                } else {
                                    System.out.println("CPF inválido.");
                                }
                            } else {
                                System.out.println("Telefone inválido.");
                            }
                        } else {
                            System.out.println("Endereço inválido.");
                        }
                    } else {
                        System.out.println("E-mail inválido.");
                    }
                } else {
                    System.out.println("Idade inválida.");
                }
            } else {
                System.out.println("Nome inválido.");
            }

            return false;

        }
    }
}