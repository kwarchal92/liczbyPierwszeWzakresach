package liczbyPierwszeWzakresach;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

class liczbyPierwsze
{
    //generowanie liczb pierwszych dla zadanej liczby
    public List <Integer> pierwszaAZdo(int n)
    {
        return IntStream
                .rangeClosed(2, n)
                .filter(x -> czyPierwsza(x))
                .boxed()
                .collect(Collectors.toList());
    }

    //generowanie liczb pierwszych z okreslonego zakresu
    public List <Integer> pierwszaZakres(int poczatek, int koniec)
    {
        return IntStream
                .rangeClosed(poczatek, koniec)
                .filter(x -> czyPierwsza(x))
                .boxed()
                .collect(Collectors.toList());

    }

    //sprawdzamy czy dana liczba jest liczba pierwsza

}



public class Main {
    public static void main(String[] args)
    {

    }
}
