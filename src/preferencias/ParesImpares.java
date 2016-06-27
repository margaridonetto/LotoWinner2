package preferencias;

import java.util.ArrayList;
import java.util.Random;

public class ParesImpares {
    
    private int quantPares;

    public ParesImpares() {
    }

    public ParesImpares(int quantPares) {
        this.quantPares = quantPares;
    }

    public int getQuantPares() {
        return quantPares;
    }

    public void setQuantPares(int quantPares) {
        this.quantPares = quantPares;
    }

    public static int quantidadePares(int combinacao[]) {
        int quantidade = 0;
        for (int quant = 0; quant < combinacao.length; quant++) {
            if (combinacao[quant] % 2 == 0) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static int gerarPares(int num) {
        while ((num % 2 != 0) || (num == 0)) {
            num = gerarNumero(1, 25);
        }
        return num;
    }
    
    public static int gerarRepetidosPares(int num, int[] sorteioAnterior) {
        boolean contem = false;
        num = 1;
        while ((num % 2 != 0) || (!contem)) {
            num = gerarNumero(1, 25);
           contem = ParesImpares.verificarRepetido(num, sorteioAnterior);
        }
        return num;
    }
    
    public static int gerarNaoRepetidosPares(int num, int[] sorteioAnterior) {
        boolean contem = true;
        num = 2;
        while ((num % 2 != 0) || (contem)) {
           num = gerarNumero(1, 25);
           contem = ParesImpares.verificarRepetido(num, sorteioAnterior);
        }
        return num;
    }
    
    public static int gerarImpares(int num) {
        while ((num % 2 == 0) || (num == 0)) {
            num = gerarNumero(1, 25);
        }
        return num;
    }
    
    public static int gerarRepetidosImpares(int num, int[] sorteioAnterior) {
        boolean contem = false;
        num = 1;
        while ((num % 2 == 0) || (!contem)) {
            num = gerarNumero(1, 25);
           contem = ParesImpares.verificarRepetido(num, sorteioAnterior);
        }
        return num;
    }
    
    public static int gerarNaoRepetidosImpares(int num, int[] sorteioAnterior) {
        boolean contem = true;
        num = 1;
        while ((num % 2 == 0) || (contem)) {
            num = gerarNumero(1, 25);
           contem = ParesImpares.verificarRepetido(num, sorteioAnterior);
        }
        return num;
    }
     
    public static int gerarNumero(int min, int max) {
        int numero;
        Random rand = new Random();
        numero = rand.nextInt((max - min) + 1) + min; //VERIFICAR AKI
        return numero;
    }
    
    public static int gerarNumeroApartirArray(ArrayList arrayParaAtualizar){
        int num = 0;
        int posicao = gerarNumero(0, (arrayParaAtualizar.size() - 1));
        num = (int) arrayParaAtualizar.get(posicao);
        return num;
    }
    
    public static boolean verificarRepetidoPar(int[] sorteioAnterior, int num){
        boolean repetidoPar = false;
        if(num % 2 == 0){
            repetidoPar = ParesImpares.verificarRepetido(num, sorteioAnterior);
        }
        return repetidoPar;
    }
    
    public static boolean verificarRepetidoImpar(int[] sorteioAnterior, int num){
        boolean repetidoImpar = false;
        if(num % 2 != 0){
            repetidoImpar = ParesImpares.verificarRepetido(num, sorteioAnterior);
        }
        return repetidoImpar;
    }
    
    public static boolean verificarNaoRepetidoPar(int[] sorteioAnterior, int num){
        boolean naoRepetidoPar = false;
        if(num % 2 == 0){
            naoRepetidoPar = ParesImpares.verificarRepetido(num, sorteioAnterior);
        }
        return naoRepetidoPar;
    }
    
    public static boolean verificarNaoRepetidoImpar(int[] sorteioAnterior, int num){
        boolean naoRepetidoImpar = false;
        if(num % 2 == 0){
            naoRepetidoImpar = ParesImpares.verificarRepetido(num, sorteioAnterior);
        }
        return naoRepetidoImpar;
    }
    
    public static boolean verificarRepetido(int num, int[] combinacao) {
        boolean repetido = false;
        for (int numeros = 0; numeros < combinacao.length; numeros++) {
            if (combinacao[numeros] == num) {
                repetido = true;
            }
        }
        return repetido;
    }
    
    public static ArrayList retirarNum(ArrayList array, int num){
        ArrayList arrayAtualizado = new ArrayList();
        for(int cont = 0; cont < array.size(); cont++){
            int numeroArray = (int) array.get(cont);
            if(numeroArray != num){
                arrayAtualizado.add(array.get(cont));
            }
        }
        
        return arrayAtualizado;
    }

}
