/**
 *
 *  @author Nowak Piotr PD3023
 *
 */

/**
 *
Wyobraźmy sobie, że z sieci przychodzą i zapisywane są na nasz dysk jakieś dane. Każdą kolejną porcję przychodzących danych nazwiemy pakietem.
Każdy kolejny przychodzący pakiet (licząc od drugiego do piątego włącznie) ma rozmiar dwa razy większy niż poprzedni, a poczynając od szóstego - ma rozmiar 3 razy większy niż poprzedni.
Program ma określić i podać  ile pakietów zmieści się na dysku,  dla każdego mieszczącego się pakietu wypisać informację o jego numerze i wielkości oraz podać zajmowaną przez pakiety przestrzeń dyskową.
Dane (pobierane z pliku {user.home}/pakiety.txt):
•	rozmiar pierwszego pakietu w bajtach,
•	rozmiar dostępnej przestrzeni dyskowej w megabajtach.
Dane są zapisane jako liczby całkowite rozdzielone białymi znakami.
Wyniki (wypisywane na konsolę w kolejnych wierszach):
•	liczba pakietów mieszczących się w dostępnej przestrzeni dyskowej,
•	dla każdego zaakceptowanego (mieszczącego się jeszcze na dysku) pakietu jego numer i wielkość w bajtach.
•	rozmiar zajmowanej przez pakiety przestrzeni dyskowej
Przykładowo, jeśli w pliku {user.home}/pakiety.txt mamy następujące dane:
100 1
to wynik na konsoli winien wyglądać tak:
10
1 100
2 200
3 400
4 800
5 1600
6 4800
7 14400
8 43200
9 129600
10 388800
583900
W przypadku wystąpienia błędów (np. brak pliku, wadliwe dane) należy wypisać na konsoli TYLKO trzy gwiazdki:
***
i zakończyć działanie programu.
Nazwa pliku, jego umiejscowienie i postać oraz postać wyniku na konsoli jest obowiązkowa. Rozwiązanie nie spełniające tych wymagań otrzymują 0 punktów.
Uwaga: proszę w żadnym razie nie linkować pliku jako zasobu do projektu Eclipse.
Utworzona przez generator projektów klasa Main zawiera fragment pomocny dla uzyskania wymaganej nazwy pliku.
Klasę Main należy uzupełnić, tak, aby uzyskać właściwe rozwiązanie.
 *
 */


package zad3;


public class Main {

  public static void main(String[] args) {
    String fname = System.getProperty("user.home") + "/pakiety.txt";            

  }
}
