package implemetantion;

public class SupermarketArray implements Supermarket{
    private final String[] itens;

    private int lastIndex;

    public SupermarketArray(final int size) {
        itens = new String[size];
        lastIndex = -1;
    }

    @Override
    public void addElemento(String item) {
        if(lastIndex == itens.length-1){
            System.err.println("Lista cheia");
        }
        else{
            lastIndex++;
            itens[lastIndex] = item;
        }
    }

    @Override
    public void print() {
        System.out.println("###################");
        if(lastIndex<0){
            System.out.println("Lista vazia");
        }
        for(int i = 0; i <= lastIndex;i++){
            System.out.println(i + " - " + itens[i]);
        }

        System.out.println("###################");
    }

    @Override
    public void removeElemento(final int i) {
        if(i >=0 && i <= lastIndex){
            shift(i);
            lastIndex--;
        }
        else {
            System.out.println("Indice inválido:" + i);
        }
    }

    private void shift(final int index) {
        for(int i = index; i < lastIndex; i++){
            itens[i] = itens[i+1];
        }
    }
}
