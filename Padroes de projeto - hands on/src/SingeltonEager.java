/**
 * Singleton Eager
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingeltonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
          return instancia;
    }
}
