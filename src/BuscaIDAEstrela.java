import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

class BuscaIDAEstrela extends Busca{


    BuscaIDAEstrela(No inicial, No objetivo) {
        super(inicial, objetivo);
    }

    @Override
    protected boolean busca(No atual) {
        return false;
    }

    @Override
    protected void caminho() {

    }
}