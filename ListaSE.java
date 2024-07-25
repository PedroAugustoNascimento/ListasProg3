public class ListaSE{
    Celula first;

    ListaSE() {
        first = null;
    }

    public boolean vazia() {
        return (first == null);
    }

    public void inserirAoInicio(Celula c) {
        c.prox = first;
        first = c;
    }

    public void imprimir() {
        Celula aux = first;
        while (aux != null) {
            System.out.println("Valor: " + aux.valor);
            aux = aux.prox;
        }

    }

    public void inserirAoFinal(Celula c) {
        if(vazia()){
            first = c;
        }
        else{
            Celula aux = first;
            while(aux.prox != null){
                aux = aux.prox;
            }
            aux.prox = c;
        }
    }
       

    public void inserirNoMeio(Celula c) {
        Celula aux = first;
    }

    public void removerFinal() {
        Celula aux = first;
        if (vazia()) {
            if (aux.prox == null) {
                first= null;
            } else {
                while ((aux.prox).prox == null) {
                    aux = aux.prox;
                }
                aux.prox = null;
            }
        }
    }

    public void removerInicio(){
        Celula aux = first;
        if(!vazia()){
            if(aux.prox != null){
                first = aux.prox;
                aux = null;
            }
            else{
                first = null;
            }
        }
    }

    public boolean pesquisar(int v){
        Celula aux = first;
        if(!vazia()){
           if(aux.valor == v){
            System.out.println("");
            return true;
           } else {
                while(aux.prox != null){
                    if(aux.valor == v){
                        System.out.println("encontrou");
                        return true;
                    }
                    aux = aux.prox;
                }
           }
        }
        System.out.println("não encontrou");
        return false;
    }
}