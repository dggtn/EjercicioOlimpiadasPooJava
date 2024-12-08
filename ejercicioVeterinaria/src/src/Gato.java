import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal {

    private ArrayList<String >cuidados;
    public Gato(String negrita) {
        super();
        cuidados = new ArrayList<>();
    }


    @Override
    public List<String> mostrarCuidados() {
        return cuidados;
    }

    @Override
    public void asignarCuidados(String s) {
        cuidados.add(s);

    }

}
