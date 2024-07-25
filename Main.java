public class Main {
    public static void main(String[] args) {
    Celula c1 = new Celula(2);    
    Celula c2 = new Celula(3);
    Celula c3 = new Celula(4);
    Celula c4 = new Celula(5);
    
    ListaDEC circularD = new ListaDEC();

    circularD.inserirAoInicio(c1);
    circularD.inserirAoFinal(c2);
    circularD.inserirAoFinal(c3);
    circularD.inserirAoFinal(c4);
    /*circularD.imprimir();*/
    /*circularD.imprimirRecursivoD(c1);*/
    /*circularD.imprimirRecursivoE(c1);*/
    circularD.pesquisar(7);
    }
}
