import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private List<String> elementos;


    public Cadastro() {
        this.elementos = new ArrayList<>();
    }

    public void cadastrarElemento(String elemento) {
        elementos.add(elemento);
    }

    public List<String> getElementos() {
        return elementos;
    }

    public void editarElemento(int indice, String novoElemento){
        if (indice >= 0 && indice < elementos.size()) {
            elementos.set(indice, novoElemento);
        } else {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
    }

    public void excluirElemento(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            elementos.remove(indice);
        } else {
            throw new IndexOutOfBoundsException("Indice inválido");
        }
    }
}
