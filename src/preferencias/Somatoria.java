package preferencias;

import helper.Utilitarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import preferencias.ParesImpares;

public class Somatoria {

    public static int somatoria(int combinacao[]) {
        int soma = 0;
        for (int numeros = 0; numeros < combinacao.length; numeros++) {
            soma += combinacao[numeros];
        }
        return soma;
    }

    public static int[] aplicarPreferencia(int combinacao[], int min, int max, int priorizar[], int excluir[], int sorteioAnterior[]) {
        int[] combinacaoPronta = new int[15];
        int soma = Somatoria.somatoria(combinacao);
        int grupoParaMudar;
        int menorNumero = 0, maiorNumero = 0;

        ArrayList paresRepetidos = new ArrayList();
        ArrayList imparesRepetidos = new ArrayList();
        ArrayList paresNaoRepetidos = new ArrayList();
        ArrayList imparesNaoRepetidos = new ArrayList();
        boolean repetido = false;

        ArrayList<Integer> todosNumeros = new ArrayList<Integer>();
        for (int cont = 0; cont < 25; cont++) {
            todosNumeros.add(cont + 1);
        }
        System.out.println("Tamanho da combinação " + combinacao.length);
        for (int cont = 0; cont < combinacao.length; cont++) {
            System.out.println("Combinação[" + cont + "] = " + combinacao[cont]);
        }
        for (int cont = 0; cont < combinacao.length; cont++) {
            System.out.println("combinacao " + combinacao[cont]);
            todosNumeros = ParesImpares.retirarNum(todosNumeros, combinacao[cont]);
        }
        for (int cont = 0; cont < todosNumeros.size(); cont++) {
            System.out.println("TODOS NÚMEROS SEM A COMBINAÇÃO " + todosNumeros.get(cont));
        }
        for (int cont = 0; cont < excluir.length; cont++) {
            todosNumeros = ParesImpares.retirarNum(todosNumeros, excluir[cont]);
        }
        for (int cont = 0; cont < todosNumeros.size(); cont++) {
            System.out.println("TODOS NÚMEROS APÓS EXCLUIR " + todosNumeros.get(cont));
        }
        for (int cont = 0; cont < todosNumeros.size(); cont++) {
            repetido = Utilitarios.verificarRepetido(todosNumeros.get(cont), sorteioAnterior);
            if (repetido) {
                System.out.println("Repetido deu: " + repetido + "\nNumero:" + todosNumeros.get(cont));
                if (todosNumeros.get(cont) % 2 == 0) {
                    System.out.println("Par para: " + todosNumeros.get(cont));
                    paresRepetidos.add(todosNumeros.get(cont));
                } else {
                    System.out.println("Impar para: " + todosNumeros.get(cont));
                    imparesRepetidos.add(todosNumeros.get(cont));
                }
            } else {
                System.out.println("Repetido deu: " + repetido + "\nNumero:" + todosNumeros.get(cont));
                if (todosNumeros.get(cont) % 2 == 0) {
                    System.out.println("Par para: " + todosNumeros.get(cont));
                    paresNaoRepetidos.add(todosNumeros.get(cont));
                } else {
                    System.out.println("Impar para: " + todosNumeros.get(cont));
                    imparesNaoRepetidos.add(todosNumeros.get(cont));
                }
            }
        }
        for (int cont = 0; cont < paresRepetidos.size(); cont++) {
            System.out.println("PARES REPETIDOS " + paresRepetidos.get(cont));
        }
        for (int cont = 0; cont < combinacao.length; cont++) {
            System.out.print(" " + combinacao[cont]);
        }
        for (int cont = 0; cont < imparesRepetidos.size(); cont++) {
            System.out.println("IMPARES REPETIDOS " + imparesRepetidos.get(cont));
        }
        for (int cont = 0; cont < paresNaoRepetidos.size(); cont++) {
            System.out.println("PARES NAO REPETIDOS " + paresNaoRepetidos.get(cont));
        }
        for (int cont = 0; cont < imparesNaoRepetidos.size(); cont++) {
            System.out.println("IMPARES NAO REPETIDOS " + imparesNaoRepetidos.get(cont));
        }
        System.out.println("SOMATORIA: " + soma);

        while (soma < min || soma > max) {
            if (soma < min) {
                System.out.println("SOMA DEU MENOR QUE MINIMO, \nSoma: " + soma + "\nMínimo:" + min);
                grupoParaMudar = ParesImpares.gerarNumero(1, 3);
                if (grupoParaMudar == 1) {
                    System.out.println("GRUPO PARA MUDAR FOI 1");
                    for (int cont = 0; cont < 5; cont++) {

                        if (combinacao[cont] != priorizar[0] && combinacao[cont] != priorizar[1]) {

                            repetido = Utilitarios.verificarRepetido(combinacao[cont], sorteioAnterior);
                            if (repetido) {

                                if (combinacao[cont] % 2 == 0) {

                                    if (paresRepetidos.size() > 0) {
                                        maiorNumero = Utilitarios.maiorNumero(paresRepetidos);
                                        System.out.println("MaiorNúmero ParesRepetidos: " + maiorNumero);
                                        if (maiorNumero > combinacao[cont]) {

                                            System.out.println("Foi Maior que: " + combinacao[cont]);
                                            paresRepetidos.add(combinacao[cont]);
                                            combinacao[cont] = maiorNumero;
                                            paresRepetidos = ParesImpares.retirarNum(paresRepetidos, maiorNumero);
                                        }
                                    }

                                } else if (imparesRepetidos.size() > 0) {

                                    maiorNumero = Utilitarios.maiorNumero(imparesRepetidos);
                                    System.out.println("MaiorNúmero ImparesRepetidos: " + maiorNumero);
                                    if (maiorNumero > combinacao[cont]) {
                                        System.out.println("Foi Maior que: " + combinacao[cont]);
                                        imparesRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = maiorNumero;
                                        imparesRepetidos = ParesImpares.retirarNum(imparesRepetidos, maiorNumero);
                                    }
                                }
                            } else if (combinacao[cont] % 2 == 0) {

                                if (paresNaoRepetidos.size() > 0) {
                                    maiorNumero = Utilitarios.maiorNumero(paresNaoRepetidos);
                                    System.out.println("MaiorNúmero ParesNaoRepetidos: " + maiorNumero);
                                    if (maiorNumero > combinacao[cont]) {

                                        System.out.println("Foi Maior que: " + combinacao[cont]);
                                        paresNaoRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = maiorNumero;
                                        paresNaoRepetidos = ParesImpares.retirarNum(paresNaoRepetidos, maiorNumero);
                                    }
                                }

                            } else if (imparesNaoRepetidos.size() > 0) {

                                maiorNumero = Utilitarios.maiorNumero(imparesNaoRepetidos);
                                System.out.println("MaiorNúmero ImparesNaoRepetidos: " + maiorNumero);
                                if (maiorNumero > combinacao[cont]) {
                                    System.out.println("Foi Maior que: " + combinacao[cont]);
                                    imparesNaoRepetidos.add(combinacao[cont]);
                                    combinacao[cont] = maiorNumero;
                                    imparesNaoRepetidos = ParesImpares.retirarNum(imparesNaoRepetidos, maiorNumero);
                                }
                            }
                        }
                    }
                } else if (grupoParaMudar == 2) {
                    System.out.println("GRUPO PARA MUDAR FOI 2");
                    for (int cont = 5; cont < 10; cont++) {

                        if (combinacao[cont] != priorizar[0] && combinacao[cont] != priorizar[1]) {

                            repetido = Utilitarios.verificarRepetido(combinacao[cont], sorteioAnterior);
                            if (repetido) {

                                if (combinacao[cont] % 2 == 0) {

                                    if (paresRepetidos.size() > 0) {
                                        maiorNumero = Utilitarios.maiorNumero(paresRepetidos);
                                        System.out.println("MaiorNúmero ParesRepetidos: " + maiorNumero);
                                        if (maiorNumero > combinacao[cont]) {

                                            System.out.println("Foi Maior que: " + combinacao[cont]);
                                            paresRepetidos.add(combinacao[cont]);
                                            combinacao[cont] = maiorNumero;
                                            paresRepetidos = ParesImpares.retirarNum(paresRepetidos, maiorNumero);
                                        }
                                    }

                                } else if (imparesRepetidos.size() > 0) {

                                    maiorNumero = Utilitarios.maiorNumero(imparesRepetidos);
                                    System.out.println("MaiorNúmero ImparesRepetidos: " + maiorNumero);
                                    if (maiorNumero > combinacao[cont]) {
                                        System.out.println("Foi Maior que: " + combinacao[cont]);
                                        imparesRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = maiorNumero;
                                        imparesRepetidos = ParesImpares.retirarNum(imparesRepetidos, maiorNumero);
                                    }
                                }
                            } else if (combinacao[cont] % 2 == 0) {

                                if (paresNaoRepetidos.size() > 0) {
                                    maiorNumero = Utilitarios.maiorNumero(paresNaoRepetidos);
                                    System.out.println("MaiorNúmero ParesNaoRepetidos: " + maiorNumero);
                                    if (maiorNumero > combinacao[cont]) {

                                        System.out.println("Foi Maior que: " + combinacao[cont]);
                                        paresNaoRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = maiorNumero;
                                        paresNaoRepetidos = ParesImpares.retirarNum(paresNaoRepetidos, maiorNumero);
                                    }
                                }

                            } else if (imparesNaoRepetidos.size() > 0) {

                                maiorNumero = Utilitarios.maiorNumero(imparesNaoRepetidos);
                                System.out.println("MaiorNúmero ImparesNaoRepetidos: " + maiorNumero);
                                if (maiorNumero > combinacao[cont]) {
                                    System.out.println("Foi Maior que: " + combinacao[cont]);
                                    imparesNaoRepetidos.add(combinacao[cont]);
                                    combinacao[cont] = maiorNumero;
                                    imparesNaoRepetidos = ParesImpares.retirarNum(imparesNaoRepetidos, maiorNumero);
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("GRUPO PARA MUDAR FOI 3");

                    for (int cont = 10; cont < 15; cont++) {

                        if (combinacao[cont] != priorizar[0] && combinacao[cont] != priorizar[1]) {

                            repetido = Utilitarios.verificarRepetido(combinacao[cont], sorteioAnterior);
                            if (repetido) {

                                if (combinacao[cont] % 2 == 0) {

                                    if (paresRepetidos.size() > 0) {
                                        maiorNumero = Utilitarios.maiorNumero(paresRepetidos);
                                        System.out.println("MaiorNúmero ParesRepetidos: " + maiorNumero);
                                        if (maiorNumero > combinacao[cont]) {

                                            System.out.println("Foi Maior que: " + combinacao[cont]);
                                            paresRepetidos.add(combinacao[cont]);
                                            combinacao[cont] = maiorNumero;
                                            paresRepetidos = ParesImpares.retirarNum(paresRepetidos, maiorNumero);
                                        }
                                    }

                                } else if (imparesRepetidos.size() > 0) {

                                    maiorNumero = Utilitarios.maiorNumero(imparesRepetidos);
                                    System.out.println("MaiorNúmero ImparesRepetidos: " + maiorNumero);
                                    if (maiorNumero > combinacao[cont]) {
                                        System.out.println("Foi Maior que: " + combinacao[cont]);
                                        imparesRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = maiorNumero;
                                        imparesRepetidos = ParesImpares.retirarNum(imparesRepetidos, maiorNumero);
                                    }
                                }
                            } else if (combinacao[cont] % 2 == 0) {

                                if (paresNaoRepetidos.size() > 0) {
                                    maiorNumero = Utilitarios.maiorNumero(paresNaoRepetidos);
                                    System.out.println("MaiorNúmero ParesNaoRepetidos: " + maiorNumero);
                                    if (maiorNumero > combinacao[cont]) {

                                        System.out.println("Foi Maior que: " + combinacao[cont]);
                                        paresNaoRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = maiorNumero;
                                        paresNaoRepetidos = ParesImpares.retirarNum(paresNaoRepetidos, maiorNumero);
                                    }
                                }

                            } else if (imparesNaoRepetidos.size() > 0) {

                                maiorNumero = Utilitarios.maiorNumero(imparesNaoRepetidos);
                                System.out.println("MaiorNúmero ImparesNaoRepetidos: " + maiorNumero);
                                if (maiorNumero > combinacao[cont]) {
                                    System.out.println("Foi Maior que: " + combinacao[cont]);
                                    imparesNaoRepetidos.add(combinacao[cont]);
                                    combinacao[cont] = maiorNumero;
                                    imparesNaoRepetidos = ParesImpares.retirarNum(imparesNaoRepetidos, maiorNumero);
                                }
                            }
                        }
                    }
                }
            } else if (soma > max) {
                grupoParaMudar = ParesImpares.gerarNumero(1, 3);
                if (grupoParaMudar == 1) {
                    for (int cont = 4; cont >= 0; cont--) {
                        if (combinacao[cont] != priorizar[0] && combinacao[cont] != priorizar[1]) {
                            repetido = Utilitarios.verificarRepetido(combinacao[cont], sorteioAnterior);
                            if (repetido) {

                                if (combinacao[cont] % 2 == 0) {
                                    menorNumero = Utilitarios.menorNumero(paresRepetidos);
                                    if (menorNumero < combinacao[cont]) {
                                        paresRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = menorNumero;
                                        paresRepetidos = ParesImpares.retirarNum(paresRepetidos, menorNumero);
                                    }
                                } else {
                                    menorNumero = Utilitarios.menorNumero(imparesRepetidos);
                                    if (menorNumero < combinacao[cont]) {
                                        imparesRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = menorNumero;
                                        imparesRepetidos = ParesImpares.retirarNum(imparesRepetidos, menorNumero);
                                    }
                                }
                            } else if (combinacao[cont] % 2 == 0) {
                                menorNumero = Utilitarios.menorNumero(paresNaoRepetidos);
                                if (menorNumero < combinacao[cont]) {
                                    paresNaoRepetidos.add(combinacao[cont]);
                                    combinacao[cont] = menorNumero;
                                    paresNaoRepetidos = ParesImpares.retirarNum(paresNaoRepetidos, menorNumero);
                                }
                            } else {
                                menorNumero = Utilitarios.menorNumero(imparesNaoRepetidos);
                                if (menorNumero < combinacao[cont]) {
                                    imparesNaoRepetidos.add(combinacao[cont]);
                                    combinacao[cont] = menorNumero;
                                    imparesNaoRepetidos = ParesImpares.retirarNum(imparesNaoRepetidos, menorNumero);
                                }
                            }
                        }
                    } // Aki 2
                } else if (grupoParaMudar == 2) {
                    for (int cont = 9; cont >= 5; cont--) {
                        if (combinacao[cont] != priorizar[0] && combinacao[cont] != priorizar[1]) {
                            repetido = Utilitarios.verificarRepetido(combinacao[cont], sorteioAnterior);
                            if (repetido) {

                                if (combinacao[cont] % 2 == 0) {
                                    menorNumero = Utilitarios.menorNumero(paresRepetidos);
                                    if (menorNumero < combinacao[cont]) {
                                        paresRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = menorNumero;
                                        paresRepetidos = ParesImpares.retirarNum(paresRepetidos, menorNumero);
                                    }
                                } else {
                                    menorNumero = Utilitarios.menorNumero(imparesRepetidos);
                                    if (menorNumero < combinacao[cont]) {
                                        imparesRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = menorNumero;
                                        imparesRepetidos = ParesImpares.retirarNum(imparesRepetidos, menorNumero);
                                    }
                                }
                            } else if (combinacao[cont] % 2 == 0) {
                                menorNumero = Utilitarios.menorNumero(paresNaoRepetidos);
                                if (menorNumero < combinacao[cont]) {
                                    paresNaoRepetidos.add(combinacao[cont]);
                                    combinacao[cont] = menorNumero;
                                    paresNaoRepetidos = ParesImpares.retirarNum(paresNaoRepetidos, menorNumero);
                                }
                            } else {
                                menorNumero = Utilitarios.menorNumero(imparesNaoRepetidos);
                                if (menorNumero < combinacao[cont]) {
                                    imparesNaoRepetidos.add(combinacao[cont]);
                                    combinacao[cont] = menorNumero;
                                    imparesNaoRepetidos = ParesImpares.retirarNum(imparesNaoRepetidos, menorNumero);
                                }
                            }
                        }
                    }
                } else {
                    for (int cont = 14; cont >= 10; cont--) {
                        if (combinacao[cont] != priorizar[0] && combinacao[cont] != priorizar[1]) {
                            repetido = Utilitarios.verificarRepetido(combinacao[cont], sorteioAnterior);
                            if (repetido) {
                                if (combinacao[cont] % 2 == 0) {
                                    menorNumero = Utilitarios.menorNumero(paresRepetidos);
                                    if (menorNumero < combinacao[cont]) {
                                        paresRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = menorNumero;
                                        paresRepetidos = ParesImpares.retirarNum(paresRepetidos, menorNumero);
                                    }
                                } else {
                                    menorNumero = Utilitarios.menorNumero(imparesRepetidos);
                                    if (menorNumero < combinacao[cont]) {
                                        imparesRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = menorNumero;
                                        imparesRepetidos = ParesImpares.retirarNum(imparesRepetidos, menorNumero);
                                    }
                                }
                            } else if (combinacao[cont] % 2 == 0) {
                                menorNumero = Utilitarios.menorNumero(paresNaoRepetidos);
                                if (menorNumero < combinacao[cont]) {
                                    paresNaoRepetidos.add(combinacao[cont]);
                                    combinacao[cont] = menorNumero;
                                    paresNaoRepetidos = ParesImpares.retirarNum(paresNaoRepetidos, menorNumero);
                                }
                            } else {
                                menorNumero = Utilitarios.menorNumero(imparesNaoRepetidos);
                                if (menorNumero < combinacao[cont]) {
                                    imparesNaoRepetidos.add(combinacao[cont]);
                                    combinacao[cont] = menorNumero;
                                    imparesNaoRepetidos = ParesImpares.retirarNum(imparesNaoRepetidos, menorNumero);
                                }
                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro na classe Somatoria, método aplicarPreferencias");
            }
            soma = Somatoria.somatoria(combinacao);
        }
        combinacaoPronta = combinacao;
        return combinacaoPronta;
    }
}
