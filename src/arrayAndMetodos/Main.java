package arrayAndMetodos;


public class Main {
    public static void main(String[] args) {
        DeckDeCartas meuDeck = new DeckDeCartas();

        for (int i = 0; i < 52; i++) {
            System.out.printf("%s",meuDeck.distribuirCartas().descricao());
            if (i%4 ==0)
                System.out.println();
        }
    }
}
