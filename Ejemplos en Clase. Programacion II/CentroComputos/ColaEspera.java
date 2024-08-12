package CentroComputos;

import java.util.ArrayList;

public class ColaEspera {

    private ArrayList<ItemOrdenable> items;

    public ColaEspera() {
        this.items = new ArrayList<>();
    }


    public void addItem(ItemOrdenable item) {
        if (!this.items.contains(item)) {
            int i = 0;
            boolean encontrado = false;
            while (i < this.items.size() && !encontrado ) {
                if (item.esMayor(this.items.get(i))) {
                    encontrado = true;
                } else {
                    i++;
                }
            }
            if (encontrado) {
                this.items.add(i, item);
            } else {
                this.items.add(item);
            }
        }
    }

    public ItemOrdenable remove() {
        return this.items.remove(0);
    }

}
