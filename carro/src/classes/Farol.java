package classes;

public class Farol {
    private boolean acesa;

    public Farol() {
        this.acesa = false;
    }

    public void acender() {
        this.acesa = true;
        System.out.println("A lâmpada foi acesa.");
    }

    public void apagar() {
        this.acesa = false;
        System.out.println("A lâmpada foi apagada.");
    }

    public static void main(String[] args) {
        Farol minhaLampada = new Farol();
        minhaLampada.acender(); // O farol foi acesa.
        minhaLampada.apagar();  // O farol foi apagada.
    }
}

