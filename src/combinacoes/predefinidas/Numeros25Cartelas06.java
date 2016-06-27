package combinacoes.predefinidas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import preferencias.ParesImpares;
import helper.Utilitarios;

public class Numeros25Cartelas06 {

    private int[] a = new int[5];
    private int[] b = new int[5];
    private int[] c = new int[5];
    private int[] d = new int[5];

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int[] getB() {
        return b;
    }

    public void setB(int[] b) {
        this.b = b;
    }

    public int[] getC() {
        return c;
    }

    public void setC(int[] c) {
        this.c = c;
    }

    public int[] getD() {
        return d;
    }

    public void setD(int[] d) {
        this.d = d;
    }
    private int[] todosNumerosInt = new int[25];
    private ArrayList<Integer> todosNumerosArray = new ArrayList<Integer>();

    public Numeros25Cartelas06() {
    }

    public String montarFAB(int[] fixas) {
        int[] fab = new int[15];
        String fabString = new String();
        int quantidade = 0;
        for (int quant = 0; quant < fixas.length; quant++) {
            fab[quantidade] = fixas[quant];
            quantidade++;
        }
        for (int quant = 0; quant < fixas.length; quant++) {
            fab[quantidade] = a[quant];
            quantidade++;
        }
        for (int quant = 0; quant < fixas.length; quant++) {
            fab[quantidade] = b[quant];
            quantidade++;
        }
        Utilitarios.ordenar(fab);
        fabString = Utilitarios.adicionarZero(fab);
        return fabString;
    }

    public String montarFAC(int[] fixas) {
        int[] fac = new int[15];
        String facString = new String();
        int quantidade = 0;
        for (int quant = 0; quant < fixas.length; quant++) {
            fac[quantidade] = fixas[quant];
            quantidade++;
        }
        for (int quant = 0; quant < fixas.length; quant++) {
            fac[quantidade] = a[quant];
            quantidade++;
        }
        for (int quant = 0; quant < fixas.length; quant++) {
            fac[quantidade] = c[quant];
            quantidade++;
        }
        Utilitarios.ordenar(fac);
        facString = Utilitarios.adicionarZero(fac);
        return facString;
    }

    public String montarFAD(int[] fixas) {
        int[] fad = new int[15];
        String fadString = new String();
        int quantidade = 0;
        for (int quant = 0; quant < fixas.length; quant++) {
            fad[quantidade] = fixas[quant];
            quantidade++;
        }
        for (int quant = 0; quant < fixas.length; quant++) {
            fad[quantidade] = a[quant];
            quantidade++;
        }
        for (int quant = 0; quant < fixas.length; quant++) {
            fad[quantidade] = d[quant];
            quantidade++;
        }
        Utilitarios.ordenar(fad);
        fadString = Utilitarios.adicionarZero(fad);
        return fadString;
    }

    public String montarFBC(int[] fixas) {
        int[] fbc = new int[15];
        String fbcString = new String();
        int quantidade = 0;
        for (int quant = 0; quant < fixas.length; quant++) {
            fbc[quantidade] = fixas[quant];
            quantidade++;
        }
        for (int quant = 0; quant < fixas.length; quant++) {
            fbc[quantidade] = b[quant];
            quantidade++;
        }
        for (int quant = 0; quant < fixas.length; quant++) {
            fbc[quantidade] = c[quant];
            quantidade++;
        }
        Utilitarios.ordenar(fbc);
        fbcString = Utilitarios.adicionarZero(fbc);
        return fbcString;
    }

    public String montarFBD(int[] fixas) {
        int[] fbd = new int[15];
        String fbdString = new String();
        int quantidade = 0;
        for (int quant = 0; quant < fixas.length; quant++) {
            fbd[quantidade] = fixas[quant];
            quantidade++;
        }
        for (int quant = 0; quant < fixas.length; quant++) {
            fbd[quantidade] = b[quant];
            quantidade++;
        }
        for (int quant = 0; quant < fixas.length; quant++) {
            fbd[quantidade] = d[quant];
            quantidade++;
        }
        Utilitarios.ordenar(fbd);
        fbdString = Utilitarios.adicionarZero(fbd);
        return fbdString;
    }

    public String montarFCD(int[] fixas) {
        int[] fcd = new int[15];
        String fcdString = new String();
        int quantidade = 0;
        for (int quant = 0; quant < fixas.length; quant++) {
            fcd[quantidade] = fixas[quant];
            quantidade++;
        }
        for (int quant = 0; quant < fixas.length; quant++) {
            fcd[quantidade] = c[quant];
            quantidade++;
        }
        for (int quant = 0; quant < fixas.length; quant++) {
            fcd[quantidade] = d[quant];
            quantidade++;
        }
        Utilitarios.ordenar(fcd);
        fcdString = Utilitarios.adicionarZero(fcd);
        return fcdString;
    }

    public void preencherABCD(int[] fixas) {
        int num;
        Numeros25Cartelas06 cpc = new Numeros25Cartelas06();
        int quantidade;
        int[] combinacaoInt;
        todosNumerosArray.addAll(cpc.converterIntEmArray(todosNumerosInt));
        for(quantidade = 0; quantidade < fixas.length; quantidade++){
            todosNumerosArray = ParesImpares.retirarNum(todosNumerosArray, fixas[quantidade]);
        }
        
        
        
        for(quantidade = 0; quantidade < todosNumerosArray.size(); quantidade++){
            System.out.println(" " + todosNumerosArray.get(quantidade));
        }
        
        
        
        for (quantidade = 0; quantidade < 5; quantidade++) {
            num = ParesImpares.gerarNumero(0, (todosNumerosArray.size() - 1));
            System.out.println("Posição" + num);
            a[quantidade] = todosNumerosArray.get(num);
            System.out.println("Conteudo" + a[quantidade]);
            todosNumerosArray = ParesImpares.retirarNum(todosNumerosArray, todosNumerosArray.get(num));
            System.out.println("Número a ser Retirado" + a[quantidade]);
            System.out.println("Quantidade" + quantidade);
        }
        
        for(quantidade = 0; quantidade < todosNumerosArray.size(); quantidade++){
            System.out.println(" " + todosNumerosArray.get(quantidade));
        }
        
        for (quantidade = 0; quantidade < 5; quantidade++) {
            num = ParesImpares.gerarNumero(0, (todosNumerosArray.size() - 1));
            System.out.println("Posição" + num);
            b[quantidade] = todosNumerosArray.get(num);
            System.out.println("Conteudo" + b[quantidade]);
            todosNumerosArray = ParesImpares.retirarNum(todosNumerosArray, todosNumerosArray.get(num));
            System.out.println("Número a ser Retirado" + b[quantidade]);
            System.out.println("Quantidade" + quantidade);
        }
        
        for(quantidade = 0; quantidade < todosNumerosArray.size(); quantidade++){
            System.out.println(" " + todosNumerosArray.get(quantidade));
        }
        
        for (quantidade = 0; quantidade < 5; quantidade++) {
            num = ParesImpares.gerarNumero(0, (todosNumerosArray.size() - 1));
            System.out.println("Posição" + num);
            c[quantidade] = todosNumerosArray.get(num);
            System.out.println("Conteudo" + c[quantidade]);
            todosNumerosArray = ParesImpares.retirarNum(todosNumerosArray, todosNumerosArray.get(num));
            System.out.println("Número a ser Retirado" + c[quantidade]);
            System.out.println("Quantidade" + quantidade);
        }
        
        for(quantidade = 0; quantidade < todosNumerosArray.size(); quantidade++){
            System.out.println(" " + todosNumerosArray.get(quantidade));
        }
        
        for (quantidade = 0; quantidade < 5; quantidade++) {
            num = ParesImpares.gerarNumero(0, (todosNumerosArray.size() - 1));
            System.out.println("Posição" + num);
            d[quantidade] = todosNumerosArray.get(num);
            System.out.println("Conteudo" + d[quantidade]);
            todosNumerosArray = ParesImpares.retirarNum(todosNumerosArray, todosNumerosArray.get(num));
            System.out.println("Número a ser Retirado" + d[quantidade]);
            System.out.println("Quantidade" + quantidade);
        }
        
    } //aki

    public void preencherTodosNumeros() {
        for (int cont = 0; cont < 25; cont++) {
            this.todosNumerosInt[cont] = cont + 1;
        }
    }

    public ArrayList converterIntEmArray(int[] todosNumerosInt) {
        ArrayList numerosArray = new ArrayList();
        for (int cont = 0; cont < todosNumerosInt.length; cont++) {
            numerosArray.add(todosNumerosInt[cont]);
        }
        return numerosArray;
    }

    public int[] converterArrayEmInt(ArrayList numeros) {
        int[] numerosInt = new int[numeros.size()];
        for (int cont = 0; cont < numeros.size(); cont++) {
            numerosInt[cont] = (int) numeros.get(cont);
        }
        return numerosInt;
    }
}
