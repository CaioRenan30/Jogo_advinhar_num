import java.util.Scanner;
import java.util.Random;

public class Jogo {
    
    public static void main (String [] args) {
        
        Scanner scan = new Scanner(System.in);
        Random sorteio = new Random();
        
        int opcao;
        int aleat_comp;
        int tent_us;
        
        System.out.println(" Olá! Qual seu nome? ");
        String nome= scan.nextLine();
        System.out.println(" Olá " + nome + " muito bom conhece-ló ");
        System.out.println(" Você quer jogar comigo " + nome + "?");
        System.out.println(" \n Digite a sua opção. (1 - sim ) e (2- não) \n ");
        opcao = scan.nextInt();
        
        
        if (opcao == 2) {
            System.out.println("Ok, outra hora nós jogamos ");
        }
        
        else if (opcao == 1) {
            
            System.out.println("Vamos jogar agora");
            
            System.out.println("O jogo vai funcionar assim ");
            System.out.println("Escolherei um numero de 0 a 20 ");
            System.out.println("Você tem que advinhar para ser o vencedor");
            
            aleat_comp = sorteio.nextInt(21);
            
            System.out.println("Pronto " + nome + " já fiz minha escolha");
            System.out.println("Agora é sua vez de advinhar");
            
            do {
                tent_us = scan.nextInt();
                if (tent_us != aleat_comp) {
                    System.out.println(" Resposta errada ");
                }
                else if (tent_us == aleat_comp) {
                    System.out.println(" Parabéns você ganhou!!! ");
                }
            
            } while (aleat_comp != tent_us);
            
        }
            

        }
        
        
    }
    