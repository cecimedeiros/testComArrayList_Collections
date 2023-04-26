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

    public boolean remove(String item) {
        if (listaDeTudo.contains(item)) {
            listaDeTudo.remove(item);
        } else {
            return false;
        }
        return true;

    }

    public boolean remove(int item){
        if (listaDeTudo.contains(listaDeTudo.get(item))){
            listaDeTudo.remove(listaDeTudo.get(item));
        } else {
            return false;
        }
        return true;
    }

    public boolean contem(String item){
        if (listaDeTudo.contains(item)){
            return true;
        }
        if (item == null) {
            return false;
        }
        return false;
    }

    public String recupera(int i){
        return listaDeTudo.get(i);
    }

    public int recuperaIndice(String item){
        return listaDeTudo.indexOf(item);
    }

    public String toString(){
        String retorno =  "";
        for (String item : listaDeTudo) {
            retorno+=item+"\n";
        }
        return retorno;
    }

    public void ordena(){
        Collections.sort(listaDeTudo);
    }
}