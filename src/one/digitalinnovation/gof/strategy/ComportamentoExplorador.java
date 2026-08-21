package one.digitalinnovation.gof.strategy;

public class ComportamentoExplorador implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se de forma exploradora...");
    }
}
