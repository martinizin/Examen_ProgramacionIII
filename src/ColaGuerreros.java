import java.util.LinkedList;
import java.util.Queue;

public class ColaGuerreros  {
    private Queue <Guerrero>cola;

    public ColaGuerreros(Queue<Guerrero> cola) {
        cola = new LinkedList<>();
        encolarGuerreros();
    }

    private void encolarGuerreros() {
        cola.add(new Guerrero());
    }


}
