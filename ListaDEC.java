import java.util.Scanner;
public class ListaDEC {
    Celula head;

    public ListaDEC() {
        head = new Celula(-1);   
        head.prox = head;
        head.ant = head;
    }

    public boolean vazia(){
        return (head.prox == head);
    }

    public void inserirAoFinal(Celula c){
        if(vazia()){
            head.prox = c;
            c.prox = head;
            head.ant = c;
            c.ant = head;
        } else {
            Celula aux = head.ant;
            aux.prox = c;
            c.prox = head;
            c.ant = aux;
            head.ant = c;
        }
    }

    public void inserirAoInicio(Celula c){
        if(vazia()){
            head.prox = c;
            c.ant = head;
            head.ant = c;
            c.prox = head;
        } else {
            Celula aux = head.prox;
            head.prox = c;
            aux.ant = c;
            c.prox = aux;
            c.ant = head;
        }
    }

    public Celula pesquisar(int valor){
        if(vazia()){
            return null;
        } else {
            Celula aux = head;
            int difprox = valor - (head.ant).valor;
            int difant = valor - (head.prox).valor;
            if (difprox > difant){
                while (aux.ant != head && aux.valor != valor){
                    aux.ant = aux;
                }
                return aux;
            } else {
                while (aux.prox != head && aux.valor != valor){
                    aux.prox = aux;
                }
                return aux;
            }
        }
    }

    public void removerInicio(){
        if (vazia()){
            return;
        } else {
            Celula aux = head.prox;
            (aux.prox).ant = head;
             head.prox = (aux.prox).prox;
             aux.ant = null;
             aux.prox = null;
        }
    }

    public void removerFinal(){
        if(vazia()){
            return;
        } else {
            Celula aux = head.ant;
            (aux.ant).prox = head;
            head.ant = aux.ant;
            aux.prox = null;
            aux.ant = null;
        }
    }

    public void imprimir(){
        Scanner ler = new Scanner(System.in);
        if(vazia()){
            return;
        } else {
            Celula aux = head;
            System.out.println("Direita - 1 / Esquerda - 0\n");
            int resposta = ler.nextInt();
            if (resposta == 1){
                while(aux.prox!= head){
                    System.out.println("Valor: "+aux.valor);
                    aux = aux.prox;
                }
                System.out.println("Valor: "+aux.valor);
            } else if (resposta == 0) {
                while(aux.ant != head){
                    System.out.println("Valor: "+aux.valor);
                    aux = aux.ant;
                }
                System.out.println("Valor: "+aux.valor);
            } else {
                System.out.println("INVÁLIDO");
            }
        }
    }

    public void imprimirRecursivo(Celula aux){
        if (aux == head && aux != null){
            System.out.println("Valor: "+aux.valor);
            return;
        }
        System.out.println("Valor: "+aux.valor);
        imprimirRecursivo(aux.prox);
    }
}