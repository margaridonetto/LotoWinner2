package combinacoes.predefinidas;

import java.util.ArrayList;
import helper.Utilitarios;

public class Numeros20Cartelas04 {
    public Numeros20Cartelas04() {
        
    }
    
    public  int[] gera01Cartela20Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
        int[] posicoes = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12 ,14, 15, 19};
        for(int cont = 0; cont < posicoes.length; cont++){
            cartelaPronta[cont] = numerosSelecionados.get(posicoes[cont]);
        }
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    public  int[] gera02Cartela20Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
        int[] posicoes = {0, 1, 3, 4, 5, 7, 9, 10, 11, 13, 14, 15 ,16, 17, 18};
        for(int cont = 0; cont < posicoes.length; cont++){
            cartelaPronta[cont] = numerosSelecionados.get(posicoes[cont]);
        }
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    public  int[] gera03Cartela20Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
        int[] posicoes = {0, 2, 3, 4, 5, 6, 8, 9, 11, 12, 13, 16 ,17, 18, 19};
        for(int cont = 0; cont < posicoes.length; cont++){
            cartelaPronta[cont] = numerosSelecionados.get(posicoes[cont]);
        }
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    public  int[] gera04Cartela20Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
        int[] posicoes = {1, 2, 4, 6, 7, 8, 10, 12, 13, 14, 15, 16 ,17, 18, 19};
        for(int cont = 0; cont < posicoes.length; cont++){
            cartelaPronta[cont] = numerosSelecionados.get(posicoes[cont]);
        }
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
}

