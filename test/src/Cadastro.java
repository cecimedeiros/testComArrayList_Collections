import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Cadastro {

    private ArrayList<String> listaDeTudo = new ArrayList<>();

    public int getNumeroDeItens() {
        return listaDeTudo.size();
    }

    public boolean adiciona(String item) {
        if (item != null) {
            this.listaDeTudo.add(item);
            return true;
        } else {
            return false;
        }
    }

    //remove um item pelo seu nome
    public boolean remove(String item) {
        if (listaDeTudo.contains(item)) {
            listaDeTudo.remove(item);
        } else {
            return false;
        }
        return true;

    }

    //remove um item pelo seu indice
    public boolean remove(int item){
        if (listaDeTudo.contains(listaDeTudo.get(item))){
            listaDeTudo.remove(listaDeTudo.get(item));
        } else {
            return false;
        }
        return true;
    }

    //recebe o nome de um item e retorna se ele está ou não na lista
    public boolean contem(String item){
        if (listaDeTudo.contains(item)){
            return true;
        }
        if (item == null) {
            return false;
        }
        return false;
    }

    //consulta que número está no indice i
    public String recupera(int i){
        return listaDeTudo.get(i);
    }

    //consulta o indice do item
    public int recuperaIndice(String item){
        return listaDeTudo.indexOf(item);
    }

    //ordena a lista bem bonitinha com a quebra de linha /n
    public String toString(){
        String retorno =  "";
        for (String item : listaDeTudo) {
            retorno+=item+"\n";
        }
        return retorno;
    }

    //ordena a lista em ordem alfabética
    public void ordena(){
        Collections.sort(listaDeTudo);
    }
}
