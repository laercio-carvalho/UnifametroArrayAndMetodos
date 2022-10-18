package arrayAndMetodos;

import java.security.SecureRandom;

public class DeckDeCartas {
    private Cartas[] deck;
    private int indiceCarta;
    private static final int NUMERO_DE_CARTAS = 52;

    //GERADOR DE NUMEROS ALEATORIOS
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    //Construtor
    public DeckDeCartas() {
        String[] faces = {"As", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Reis"};
        String[] naipes = {"Paus", "Espadas", "Copas", "Ouro"};

        deck = new Cartas[NUMERO_DE_CARTAS];
        indiceCarta = 0;

        //Preencher o baralho com as cartas
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Cartas(faces[i % 13], naipes[i / 13]);
        }
    }
            //Distribuir Cartas
            public Cartas distribuirCartas(){
                if (indiceCarta < deck.length)
                    return deck[indiceCarta++];

                else
                    return null;

            }
        }

