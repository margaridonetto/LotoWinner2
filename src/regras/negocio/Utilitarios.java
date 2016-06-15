package regras.negocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Utilitarios {
    
    

    public static void zerarVet(int vetor[]) { //BOM
        for (int cont = 0; cont < vetor.length; cont++) {
            vetor[cont] = 0;
        }
    }
    
    public static int verificarQuantNumeros(int[] combinacao){ //BOM
        int quant = 0;
        for(int numeros = 0; numeros < combinacao.length; numeros++){
            if(combinacao[numeros] != 0)
                quant++;
        }
        return quant;
    }
    //Duplicado fala com margarido como remover !!
    public static void ordenar(int vetor[]) { //BOM

        ArrayList<Integer> jogo = new ArrayList<Integer>();
        for (int cont1 = 0; cont1 < vetor.length; cont1++) {
            jogo.add(vetor[cont1]);
        }
        Collections.sort(jogo);
        for (int cont1 = 0; cont1 < vetor.length; cont1++) {
            vetor[cont1] = jogo.get(cont1);
        }
    }
    
    public static boolean verificarRepetido(int num, int[] combinacao){ //BOM
        boolean repetido = false;
        for(int numeros = 0; numeros < combinacao.length; numeros++){
            if(combinacao[numeros] == num)
                repetido = true;
        }
        return repetido;    
    }
    
    public static boolean verificarRepetidoArray(int num, ArrayList combinacao){ //BOM
        boolean repetido = false;
        if(combinacao.equals(num))
            repetido = true;
        return repetido;    
    }
    
     public static int[] carregarUltimoSorteio(int ultimoSorteio[]){ //BOM
        ultimoSorteio[0] = 1;
        ultimoSorteio[1] = 2;
        ultimoSorteio[2] = 3;
        ultimoSorteio[3] = 4;
        ultimoSorteio[4] = 6;
        ultimoSorteio[5] = 8;
        ultimoSorteio[6] = 9;
        ultimoSorteio[7] = 13;
        ultimoSorteio[8] = 15;
        ultimoSorteio[9] = 17;
        ultimoSorteio[10] = 18;
        ultimoSorteio[11] = 19;
        ultimoSorteio[12] = 20;
        ultimoSorteio[13] = 22;
        ultimoSorteio[14] = 23;
       
        return ultimoSorteio;
        
    }
     
    public static ArrayList paresUltimoSorteio(int sorteioAnterior[]){
        ArrayList paresRepetidos = new ArrayList();
        for(int cont = 0; cont < sorteioAnterior.length; cont++){
            if(sorteioAnterior[cont] % 2 == 0)
                paresRepetidos.add(sorteioAnterior[cont]);
        }
        return paresRepetidos;
    }
    
    public static ArrayList imparesUltimoSorteio(int sorteioAnterior[]){
        ArrayList imparesRepetidos = new ArrayList();
        for(int cont = 0; cont < sorteioAnterior.length; cont++){
            if(sorteioAnterior[cont] % 2 != 0)
                imparesRepetidos.add(sorteioAnterior[cont]);
        }
        return imparesRepetidos;
    }
    
    public static ArrayList paresQueNaoSairam(int sorteioAnterior[]){
        ArrayList paresNaoRepetidos = new ArrayList();
        for(int cont = 1; cont <= 25; cont++){
            boolean contem = verificarRepetido(cont, sorteioAnterior);
            if(!contem){
                if(cont % 2 == 0)
                    paresNaoRepetidos.add(cont);
            }
        }
        return paresNaoRepetidos;
    }
    
    public static ArrayList imparesQueNaoSairam(int sorteioAnterior[]){
        ArrayList imparesNaoRepetidos = new ArrayList();
        for(int cont = 1; cont <= 25; cont++){
            boolean contem = verificarRepetido(cont, sorteioAnterior);
            if(!contem){
                if(cont % 2 != 0)
                    imparesNaoRepetidos.add(cont);
            }
        }
        return imparesNaoRepetidos;
    }
    
    public static String adicionarZero(int combinacoes[]){
        String combinacao = new String();
        for(int cont = 0; cont < combinacoes.length; cont++){
                if((combinacoes[cont] >= 1) && (combinacoes[cont] <= 9)){
                    combinacao += " 0" + combinacoes[cont];
                }else{
                    combinacao += " " + combinacoes[cont];
                }
            }
        return combinacao;
    }
    
    //Ordena cartela por ordem crescente
    public static int[] ordenarCartela(int vetor[]) {

        ArrayList<Integer> jogo = new ArrayList<Integer>();
        for (int cont1 = 0; cont1 < vetor.length; cont1++) {
            jogo.add(vetor[cont1]);
        }
        Collections.sort(jogo);
        for (int cont1 = 0; cont1 < vetor.length; cont1++) {
            vetor[cont1] = jogo.get(cont1);
        }
        
        return vetor;
    }
    
    //Recebe o minimo o maximo e a quantidade de números que quer.
    public static int[] gerarRandom(int min, int max, int qntNumerosGerados){
        
	Vector<Integer> numbers = new Vector<Integer>();
	int[] result = new int[qntNumerosGerados];

	while(numbers.size() < qntNumerosGerados){
            
            int rand = (int) (Math.floor(Math.random() * (max - min)) + min);
            if(! numbers.contains(rand)){
                
                numbers.add(rand);
            }
        }
        
        Collections.sort(numbers);
        
        for (int number = 0; number < numbers.size(); number++){
            result[number] = numbers.get(number);
        }
        return result;
    }

}
