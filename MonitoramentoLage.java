import java.util.Scanner;

public class MonitoramentoLage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cargaProjeto = 15.0;
        double limiteSeguranca = cargaProjeto * 0.8; //80% da carga máxima

        System.out.println("--- Sistema safeBuild: Monitoramento de carga ---");
        System.out.println("digite a leitura atual do sensor (kN/m²): ");
        double cargaAtual = sc.nextDouble();

        if (cargaAtual < limiteSeguranca) {
            System.out.println("Status: VERDE");
            System.out.println("Desiçao: Operaçao normal. Carga dentro dos parametros de sugurança");
        } else if (cargaAtual >= limiteSeguranca && cargaAtual <= cargaProjeto) {
            System.out.println("Status: AMARELO (ALERTA)");
            System.out.println("Desiçao: Reduzir velocidade de concretagem e evacuar o pessoal não essencial.");
        } else {
            System.out.println("Status: VERMELHO (CRÍTICO)");
            System.out.println("Deciçao: INTERROMPER IMEDIATAMENTE! Risco de colapso das escoras.");
        }

        if (cargaAtual > (cargaProjeto * 1.2)) {
            System.out.println("ALERTA ADICIONAL: Possivel falha catastrofica iminente. Evacuar área total.");
            
        }
    }
    
}
