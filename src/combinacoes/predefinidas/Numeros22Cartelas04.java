package combinacoes.predefinidas;

import java.util.ArrayList;
import helper.Utilitarios;

public class Numeros22Cartelas04 {
    public Numeros22Cartelas04() {
        
    }
    
    public  int[] gera01Cartela22Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
        int[] posicoes = {0, 1, 3, 5, 7, 10, 11, 12, 13, 14, 15, 16, 17 ,18, 19};
        for(int cont = 0; cont < posicoes.length; cont++){
            cartelaPronta[cont] = numerosSelecionados.get(posicoes[cont]);
        }
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    public  int[] gera02Cartela22Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
        int[] posicoes = {2, 4, 6, 8, 9, 10, 12, 13, 14, 15, 16, 17 ,18, 19, 20};
        for(int cont = 0; cont < posicoes.length; cont++){
            cartelaPronta[cont] = numerosSelecionados.get(posicoes[cont]);
        }
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    public  int[] gera03Cartela22Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
        int[] posicoes = {0, 1, 3, 5, 7, 11, 13, 14, 15, 16, 17 ,18, 19, 20, 21};
        for(int cont = 0; cont < posicoes.length; cont++){
            cartelaPronta[cont] = numerosSelecionados.get(posicoes[cont]);
        }
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    public  int[] gera04Cartela22Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
        int[] posicoes = {2, 4, 6, 8, 9, 12, 13, 14, 15, 16, 17 ,18, 19, 20, 21};
        for(int cont = 0; cont < posicoes.length; cont++){
            cartelaPronta[cont] = numerosSelecionados.get(posicoes[cont]);
        }        
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
}
