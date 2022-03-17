import strategy.Comportamento;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Test {

    public static void main(String[] args) {
        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();

        //Strategy
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        //Facade



    }
}
