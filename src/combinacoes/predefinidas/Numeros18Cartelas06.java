package combinacoes.predefinidas;

import helper.Utilitarios;
import java.util.ArrayList;
import preferencias.ParesImpares;

public class Numeros18Cartelas06 {
    
    
    private int[] a = new int[3];
    private int[] b = new int[3];
    private int[] c = new int[3];
    private int[] d = new int[3];
    private int[] e = new int[3];
    private int[] f = new int[3];

    public void preencherABCDEF(ArrayList todosNum) {
        int num;

        for (int cont = 0; cont < 3; cont++) {
            a[cont] = ParesImpares.gerarNumero(0, (todosNum.size() - 1));
            todosNum = ParesImpares.retirarNum(todosNum, a[cont]);
        }
        for (int cont = 0; cont < 3; cont++) {
            b[cont] = ParesImpares.gerarNumero(0, (todosNum.size() - 1));
            todosNum = ParesImpares.retirarNum(todosNum, b[cont]);
        }
        for (int cont = 0; cont < 3; cont++) {
            c[cont] = ParesImpares.gerarNumero(0, (todosNum.size() - 1));
            todosNum = ParesImpares.retirarNum(todosNum, c[cont]);
        }
        for (int cont = 0; cont < 3; cont++) {
            d[cont] = ParesImpares.gerarNumero(0, (todosNum.size() - 1));
            todosNum = ParesImpares.retirarNum(todosNum, d[cont]);
        }   
        for (int cont = 0; cont < 3; cont++) {
            e[cont] = ParesImpares.gerarNumero(0, (todosNum.size() - 1));
            todosNum = ParesImpares.retirarNum(todosNum, e[cont]);
        }
        for (int cont = 0; cont < 3; cont++) {
            f[cont] = ParesImpares.gerarNumero(0, (todosNum.size() - 1));
            todosNum = ParesImpares.retirarNum(todosNum, f[cont]);
        }

    }
    
    public String gerarABCDE(){
        String abcde;
        int[] combInt = new int[15];
        int quantidade = 0;
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=a[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=b[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=c[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=d[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=e[cont1];
            quantidade++;
        }
        combInt = Utilitarios.ordenarCartela(combInt);
        abcde = Utilitarios.adicionarZero(combInt);
        return abcde;
    }
    
    public String gerarABCDF(){
        String abcdf;
        int[] combInt = new int[15];
        int quantidade = 0;
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=a[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=b[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=c[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=d[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=f[cont1];
            quantidade++;
        }
        combInt = Utilitarios.ordenarCartela(combInt);
        abcdf = Utilitarios.adicionarZero(combInt);
        return abcdf;
    }
    
    public String gerarABCEF(){
        String abcef;
        int[] combInt = new int[15];
        int quantidade = 0;
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=a[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=b[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=c[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=e[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=f[cont1];
            quantidade++;
        }
        combInt = Utilitarios.ordenarCartela(combInt);
        abcef = Utilitarios.adicionarZero(combInt);
        return abcef;
    }
    
    public String gerarABDEF(){
        String abdef;
        int[] combInt = new int[15];
        int quantidade = 0;
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=a[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=b[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=d[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=e[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=f[cont1];
            quantidade++;
        }
        combInt = Utilitarios.ordenarCartela(combInt);
        abdef = Utilitarios.adicionarZero(combInt);
        return abdef;
    }
    
    public String gerarACDEF(){
        String acdef;
        int[] combInt = new int[15];
        int quantidade = 0;
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=a[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=c[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=d[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=e[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=f[cont1];
            quantidade++;
        }
        combInt = Utilitarios.ordenarCartela(combInt);
        acdef = Utilitarios.adicionarZero(combInt);
        return acdef;
    }
    public String gerarBCDEF(){
        String bcdef;
        int[] combInt = new int[15];
        int quantidade = 0;
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=b[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=c[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=d[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=e[cont1];
            quantidade++;
        }
        for (int cont1 = 0; cont1 < 3; cont1++) {
            combInt[quantidade]=f[cont1];
            quantidade++;
        }
        combInt = Utilitarios.ordenarCartela(combInt);
        bcdef = Utilitarios.adicionarZero(combInt);
        return bcdef;
    }
}
