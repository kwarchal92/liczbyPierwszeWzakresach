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
    private boolean czyPierwsza(int liczba)
    {
        return liczba > 1 && IntStream
                .range(2, liczba)
                .noneMatch(i -> liczba % i == 0);
    }

}

public class Main {
    public static void main(String[] args)
    {
        liczbyPierwsze p = new liczbyPierwsze();

        System.out.println("Program znajduje liczby pierwsze w okreslonych zakresach");
        System.out.println("Liczby od 2 do 100 to: " + p.pierwszaAZdo(100) +".");
        System.out.println("Liczby pierwsze od 15 do 60 to: " + p.pierwszaZakres(15, 60) + ".");

    }
}
