public class ListaDE {
    
    Celula first;

    public ListaDE() {
        first = null;
    }

    public boolean vazia() {
        return (first == null);
    }

    public void inserirAoFinal(Celula c) {
        if (vazia()) {
            first = c;
        } else {
            Celula aux = first;
            while (aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = c;
            c.ant = aux;
        }
    }
    
    public void inserirAoInicio(Celula c) {
        if (!vazia()) {
            c.prox = first;
            first.ant = c;
        } else {
            first = c;
        }
    }
    
    Celula pesquisar(int valor) {
        if (vazia()) {
            return null;
        } else {
            Celula aux = first;
            while (aux.prox != null && aux.valor != valor) {
                aux = aux.prox;
            }
            return aux;
        }
    }
    
    public void removerInicio() {
        if (vazia()) {
            return;
        } else {
            Celula aux = first;
            if (aux.prox == null) {
                first = null;
            } else {
                first = aux.prox;
                first.ant = null;
                aux.prox = null;
            }
            return;
        }
    }
    
    public void removerFinal() {
        if (vazia()) {
            return;
        } else {
            Celula aux = first;
            while (aux.prox != null) {
                aux = aux.prox;
            }

            if (aux.ant != null) {
                (aux.ant).prox = null;
            }
            aux.ant = null;
            return;
        }
    }
    
    public void imprimir() {
        Celula aux = first;
        while (aux.prox != null) {
            System.out.println("Valor: " + aux.valor);
            aux = aux.prox;
        }
    }
}
