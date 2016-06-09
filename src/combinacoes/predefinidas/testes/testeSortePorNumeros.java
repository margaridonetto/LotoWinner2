package combinacoes.predefinidas.testes;

import java.util.ArrayList;
import regras.negocio.Utilitarios;

public class testeSortePorNumeros {
     public testeSortePorNumeros() {
        
    }
    
    public  int[] geraCartela20Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
        int[] numerosAleatorios = Utilitarios.gerarRandom(0, 20, 15); //Gera 15  numeros rand de 0 a 19
        
        for (int i = 0; i < 15; i++) {
            cartelaPronta[i] = numerosSelecionados.get(numerosAleatorios[i]); // Pega os números rand sorteando nos números do usuario  
        }
        
        return Utilitarios.ordenarCartela(cartelaPronta); //Retorna a cartela pronta
    }
    
    public  int[] geraCartela22Numeros(ArrayList<Integer> numerosSelecionados){
        int[] cartelaPronta = new int[15];
        int[] numerosAleatorios = Utilitarios.gerarRandom(0, 22, 15);
        
        for (int i = 0; i < 15; i++) {
            cartelaPronta[i] = numerosSelecionados.get(numerosAleatorios[i]);     
        }
        
        return Utilitarios.ordenarCartela(cartelaPronta);
    }
}
