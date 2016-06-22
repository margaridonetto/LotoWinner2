package preferencias;

import java.util.ArrayList;
import helper.Utilitarios;

public class GerarCombinacaoDuasPreferencias {

    public static int[] gerarCombinacao(int quantPares, int quantRepetidos, int sorteioAnterior[], int excluir[], int priorizar[]) {
        int combinacao[] = new int[15];
        int numerosNaCombinacao = 0;
        int numSair = 0;
        boolean sair, repetido;
        int num = 0, par = 0, impar = 0, repetidos = 0;
        ArrayList paresRepetidos = new ArrayList();
        ArrayList imparesRepetidos = new ArrayList();
        ArrayList paresNaoRepetidos = new ArrayList();
        ArrayList imparesNaoRepetidos = new ArrayList();
        Utilitarios.zerarVet(combinacao);

        paresRepetidos = Utilitarios.paresUltimoSorteio(sorteioAnterior);
        imparesRepetidos = Utilitarios.imparesUltimoSorteio(sorteioAnterior);
        paresNaoRepetidos = Utilitarios.paresQueNaoSairam(sorteioAnterior);
        imparesNaoRepetidos = Utilitarios.imparesQueNaoSairam(sorteioAnterior);

        if (priorizar.length > 0) {
            for (int cont = 0; cont < priorizar.length; cont++) {
                combinacao[cont] = priorizar[cont];
                numSair = priorizar[cont];
                repetido = Utilitarios.verificarRepetido(numSair, sorteioAnterior);
                if (numSair != 0) {
                    if ((repetido) && (numSair % 2 == 0)) {
                        paresRepetidos = ParesImpares.retirarNum(paresRepetidos, numSair);
                        numerosNaCombinacao++;
                        par++;
                        repetidos++;
                    } else if ((repetido) && (numSair % 2 != 0)) {
                        imparesRepetidos = ParesImpares.retirarNum(imparesRepetidos, numSair);
                        numerosNaCombinacao++;
                        impar++;
                        repetidos++;
                    } else if ((!repetido) && (numSair % 2 == 0)) {
                        paresNaoRepetidos = ParesImpares.retirarNum(paresNaoRepetidos, numSair);
                        numerosNaCombinacao++;
                        par++;
                    } else if ((!repetido) && (numSair % 2 != 0)) {
                        imparesNaoRepetidos = ParesImpares.retirarNum(imparesNaoRepetidos, numSair);
                        numerosNaCombinacao++;
                        impar++;
                    } else {
                        System.out.println("Problemas ao priorizar números");
                    }
                }
            }
        }

        if (excluir.length > 0) {
            for (int cont = 0; cont < excluir.length; cont++) {
                numSair = excluir[cont];
                repetido = Utilitarios.verificarRepetido(numSair, sorteioAnterior);
                if (numSair != 0) {
                    if ((repetido) && (numSair % 2 == 0)) {
                        paresRepetidos = ParesImpares.retirarNum(paresRepetidos, numSair);
                    } else if ((repetido) && (numSair % 2 != 0)) {
                        imparesRepetidos = ParesImpares.retirarNum(imparesRepetidos, numSair);
                    } else if ((!repetido) && (numSair % 2 == 0)) {
                        paresNaoRepetidos = ParesImpares.retirarNum(paresNaoRepetidos, numSair);
                    } else if ((!repetido) && (numSair % 2 != 0)) {
                        imparesNaoRepetidos = ParesImpares.retirarNum(imparesNaoRepetidos, numSair);
                    } else {
                        System.out.println("Problemas ao priorizar números");
                    }
                }
            }
        }

        while (numerosNaCombinacao < 15) {

            sair = false;

            if (repetidos < quantRepetidos) {
                num = ParesImpares.gerarNumero(1, 2);
                if (par == quantPares) {
                    num = 1;
                }
                if (impar == (15 - quantPares)) {
                    num = 2;
                }
            } else if (par < quantPares) {
                num = ParesImpares.gerarNumero(3, 4);
                if ((15 - numerosNaCombinacao) == (quantPares - par)) {
                    num = 4;
                }
                if ((15 - numerosNaCombinacao) == ((15 - quantPares) - impar)) {
                    num = 3;
                }
            } else {
                num = 5;
            }
            switch (num) {
                case 1:
                    num = ParesImpares.gerarNumeroApartirArray(imparesRepetidos);
                    combinacao[numerosNaCombinacao] = num;
                    imparesRepetidos = ParesImpares.retirarNum(imparesRepetidos, num);
                    numerosNaCombinacao++;
                    impar++;
                    repetidos++;
                    break;
                case 2:
                    num = ParesImpares.gerarNumeroApartirArray(paresRepetidos);
                    combinacao[numerosNaCombinacao] = num;
                    paresRepetidos = ParesImpares.retirarNum(paresRepetidos, num);
                    numerosNaCombinacao++;
                    par++;
                    repetidos++;
                    break;
                case 3:
                    num = ParesImpares.gerarNumeroApartirArray(imparesNaoRepetidos);
                    combinacao[numerosNaCombinacao] = num;
                    imparesNaoRepetidos = ParesImpares.retirarNum(imparesNaoRepetidos, num);
                    numerosNaCombinacao++;
                    impar++;
                    break;
                case 4:
                    num = ParesImpares.gerarNumeroApartirArray(paresNaoRepetidos);
                    combinacao[numerosNaCombinacao] = num;
                    paresNaoRepetidos = ParesImpares.retirarNum(paresNaoRepetidos, num);
                    numerosNaCombinacao++;
                    par++;
                    break;
                case 5:
                    num = ParesImpares.gerarNumeroApartirArray(imparesNaoRepetidos);
                    combinacao[numerosNaCombinacao] = num;
                    imparesNaoRepetidos = ParesImpares.retirarNum(imparesNaoRepetidos, num);
                    numerosNaCombinacao++;
                    impar++;
                    break;
            }

        }
        return combinacao;
    }
}
