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
        for (int cont = 0; cont < combinacao.length; cont++) {
            todosNumeros = ParesImpares.retirarNum(todosNumeros, combinacao[cont]);
        }
        for (int cont = 0; cont < excluir.length; cont++) {
            todosNumeros = ParesImpares.retirarNum(todosNumeros, excluir[cont]);
        }
        for (int cont = 0; cont < todosNumeros.size(); cont++) {
            repetido = Utilitarios.verificarRepetido(todosNumeros.get(cont), sorteioAnterior);
            if (repetido) {
                if (todosNumeros.get(cont) % 2 == 0) {
                    paresRepetidos.add(todosNumeros.get(cont));
                } else {
                    imparesRepetidos.add(todosNumeros.get(cont));
                }
            } else {
                if (todosNumeros.get(cont) % 2 == 0) {
                    paresNaoRepetidos.add(todosNumeros.get(cont));
                } else {
                    imparesNaoRepetidos.add(todosNumeros.get(cont));
                }
            }
        }
        while (soma < min || soma > max) {
            if (soma < min) {
                grupoParaMudar = ParesImpares.gerarNumero(1, 3);
                if (grupoParaMudar == 1) {
                    for (int cont = 0; cont < 5; cont++) {

                        if (combinacao[cont] != priorizar[0] && combinacao[cont] != priorizar[1]) {

                            repetido = Utilitarios.verificarRepetido(combinacao[cont], sorteioAnterior);
                            if (repetido) {

                                if (combinacao[cont] % 2 == 0) {

                                    if (paresRepetidos.size() > 0) {
                                        maiorNumero = Utilitarios.maiorNumero(paresRepetidos);
                                        if (maiorNumero > combinacao[cont]) {
                                            paresRepetidos.add(combinacao[cont]);
                                            combinacao[cont] = maiorNumero;
                                            paresRepetidos = ParesImpares.retirarNum(paresRepetidos, maiorNumero);
                                        }
                                    }

                                } else if (imparesRepetidos.size() > 0) {

                                    maiorNumero = Utilitarios.maiorNumero(imparesRepetidos);
                                    if (maiorNumero > combinacao[cont]) {
                                        imparesRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = maiorNumero;
                                        imparesRepetidos = ParesImpares.retirarNum(imparesRepetidos, maiorNumero);
                                    }
                                }
                            } else if (combinacao[cont] % 2 == 0) {

                                if (paresNaoRepetidos.size() > 0) {
                                    maiorNumero = Utilitarios.maiorNumero(paresNaoRepetidos);
                                    if (maiorNumero > combinacao[cont]) {
                                        paresNaoRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = maiorNumero;
                                        paresNaoRepetidos = ParesImpares.retirarNum(paresNaoRepetidos, maiorNumero);
                                    }
                                }

                            } else if (imparesNaoRepetidos.size() > 0) {

                                maiorNumero = Utilitarios.maiorNumero(imparesNaoRepetidos);
                                if (maiorNumero > combinacao[cont]) {
                                    imparesNaoRepetidos.add(combinacao[cont]);
                                    combinacao[cont] = maiorNumero;
                                    imparesNaoRepetidos = ParesImpares.retirarNum(imparesNaoRepetidos, maiorNumero);
                                }
                            }
                        }
                    }
                } else if (grupoParaMudar == 2) {
                    for (int cont = 5; cont < 10; cont++) {
                        if (combinacao[cont] != priorizar[0] && combinacao[cont] != priorizar[1]) {
                            repetido = Utilitarios.verificarRepetido(combinacao[cont], sorteioAnterior);
                            if (repetido) {
                                if (combinacao[cont] % 2 == 0) {
                                    if (paresRepetidos.size() > 0) {
                                        maiorNumero = Utilitarios.maiorNumero(paresRepetidos);
                                        if (maiorNumero > combinacao[cont]) {
                                            paresRepetidos.add(combinacao[cont]);
                                            combinacao[cont] = maiorNumero;
                                            paresRepetidos = ParesImpares.retirarNum(paresRepetidos, maiorNumero);
                                        }
                                    }
                                } else if (imparesRepetidos.size() > 0) {
                                    maiorNumero = Utilitarios.maiorNumero(imparesRepetidos);
                                    if (maiorNumero > combinacao[cont]) {
                                        imparesRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = maiorNumero;
                                        imparesRepetidos = ParesImpares.retirarNum(imparesRepetidos, maiorNumero);
                                    }
                                }
                            } else if (combinacao[cont] % 2 == 0) {
                                if (paresNaoRepetidos.size() > 0) {
                                    maiorNumero = Utilitarios.maiorNumero(paresNaoRepetidos);
                                    if (maiorNumero > combinacao[cont]) {
                                        paresNaoRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = maiorNumero;
                                        paresNaoRepetidos = ParesImpares.retirarNum(paresNaoRepetidos, maiorNumero);
                                    }
                                }

                            } else if (imparesNaoRepetidos.size() > 0) {

                                maiorNumero = Utilitarios.maiorNumero(imparesNaoRepetidos);
                                if (maiorNumero > combinacao[cont]) {
                                    imparesNaoRepetidos.add(combinacao[cont]);
                                    combinacao[cont] = maiorNumero;
                                    imparesNaoRepetidos = ParesImpares.retirarNum(imparesNaoRepetidos, maiorNumero);
                                }
                            }
                        }
                    }
                } else {
                    for (int cont = 10; cont < 15; cont++) {
                        if (combinacao[cont] != priorizar[0] && combinacao[cont] != priorizar[1]) {
                            repetido = Utilitarios.verificarRepetido(combinacao[cont], sorteioAnterior);
                            if (repetido) {
                                if (combinacao[cont] % 2 == 0) {
                                    if (paresRepetidos.size() > 0) {
                                        maiorNumero = Utilitarios.maiorNumero(paresRepetidos);
                                        if (maiorNumero > combinacao[cont]) {
                                            paresRepetidos.add(combinacao[cont]);
                                            combinacao[cont] = maiorNumero;
                                            paresRepetidos = ParesImpares.retirarNum(paresRepetidos, maiorNumero);
                                        }
                                    }

                                } else if (imparesRepetidos.size() > 0) {

                                    maiorNumero = Utilitarios.maiorNumero(imparesRepetidos);
                                    if (maiorNumero > combinacao[cont]) {
                                        imparesRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = maiorNumero;
                                        imparesRepetidos = ParesImpares.retirarNum(imparesRepetidos, maiorNumero);
                                    }
                                }
                            } else if (combinacao[cont] % 2 == 0) {

                                if (paresNaoRepetidos.size() > 0) {
                                    maiorNumero = Utilitarios.maiorNumero(paresNaoRepetidos);
                                    if (maiorNumero > combinacao[cont]) {
                                        paresNaoRepetidos.add(combinacao[cont]);
                                        combinacao[cont] = maiorNumero;
                                        paresNaoRepetidos = ParesImpares.retirarNum(paresNaoRepetidos, maiorNumero);
                                    }
                                }

                            } else if (imparesNaoRepetidos.size() > 0) {

                                maiorNumero = Utilitarios.maiorNumero(imparesNaoRepetidos);
                                if (maiorNumero > combinacao[cont]) {
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
