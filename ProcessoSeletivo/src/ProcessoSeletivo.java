import java.util.Random;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        Scanner leia = new Scanner(System.in);
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;
        double salarioPretendido;

        System.out.println("Digite o valor pretendido: ");
        salarioPretendido = leia.nextDouble();

        
        for (int candidatosAtual = 0; candidatosAtual < candidatos.length; candidatosAtual++) {
            String candidato = candidatos[candidatosAtual];
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            if (candidatosSelecionados >= 5) {
                break; 
            }
        }

        
        System.out.println("Imprimindo a lista de selecionados informando o índice do elemento:");
        for (int indice = 0; indice < candidatosSelecionados; indice++) {
            System.out.println("O candidato de nº " + indice + " é " + candidatos[indice]);
        }

        
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
        
        
        int tentativasRealizadas = 1;
        boolean atendeu = false;
        boolean continuarTentando;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidatos[candidatosSelecionados - 1] + " NA " + tentativasRealizadas + "ª TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidatos[candidatosSelecionados - 1] + ", NÚMERO MÁXIMO DE TENTATIVAS (" + tentativasRealizadas + ") REALIZADAS");
        }

        // Fechando o scanner
        leia.close();
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}

       
    

