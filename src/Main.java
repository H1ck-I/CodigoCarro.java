
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
    
    int opcao = 0;
    Scanner sc = new Scanner(System.in);
    carro carro = new carro();
    
         System.out.println("1. Ligar carro;\n\n2. Subir marcha;\n\n3. Descer marcha;\n\n4. Almentar velocidade;\n\n5. Diminuir velocidade;\n\n6. verificar velocidade e marcha;\n\n7. Virar a esquerda;\n\n8. Virar a direita;\n\n9. Desligar carro;\n\n10. Sair.\n");

    while(opcao != 10){
    
    opcao=sc.nextInt();

    switch(opcao){
        
        case 1:
            carro.ligar();
            break;
        case 2:
            carro.subirMarcha();
            break;
        case 3:
            carro.descerMarcha();
            break;
        case 4:
            carro.acelerar();
            break;
        case 5:
            carro.diminuirVelocidade();
            break;
        case 6:
            carro.verificarVelocidade();
            break;
        case 7:
            carro.virarEsquerda();
            break;
        case 8:
            carro.virarDireita();
            break;
        case 9:
            carro.desligar();
            break;
        case 10:
            System.out.println("Saindo do carro!");
            break;
        }   
    
    }
    }
}



