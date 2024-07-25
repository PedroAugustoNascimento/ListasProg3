public class ListaSEC {
    Celula head;

    public ListaSEC() {
        Celula head = new Celula(-1);
        head.prox = head;
    }

    public boolean vazia() {
        return (head.prox == head);
    }

    public void inserirAoInicio(Celula c) {
        if (vazia()) {
            head.prox = c;
            c.prox = head;
        } else {
            Celula aux = head.prox;
            while (aux.prox != head) {
                aux = aux.prox;
            }
            aux.prox = c;
            c.prox = head;
        }
    }

    public void inserirAoFinal(Celula c) {
        Celula aux = head.prox;
        head.prox = c;
        c.prox = aux;
    }
    
    public boolean removerInicio() {
        if (vazia()) {
            return false;
        } else {
            Celula aux = head.prox;
            head.prox = aux.prox;
            aux.prox = null;
            return true;
        }
    }

    public void removerFinal() {
        if (vazia()) {
            return;
        } else {
            Celula aux = head.prox;
            if (aux.prox != head) {
                while ((aux.prox).prox != head) {
                    aux = aux.prox;
                }
                Celula aux2 = aux.prox;
                aux.prox = head;
                aux2.prox = null;
            } else {
                head.prox = head;
                aux.prox = null;
            }
        }
    }
    
    public void imprimir() {
        Celula aux = head.prox;
        while (aux != head) {
            System.out.println("Valor = " + aux.valor);
            aux = aux.prox;
        }
    }
}