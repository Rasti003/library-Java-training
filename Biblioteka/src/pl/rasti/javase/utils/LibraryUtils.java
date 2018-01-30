package pl.rasti.javase.utils;
;import pl.rasti.javase.data.Book;
import pl.rasti.javase.data.Library;
import pl.rasti.javase.data.Magazine;
import pl.rasti.javase.data.Publication;

public class LibraryUtils {

    public static void printBooks(Library lib) {
        Publication[] publications = lib.getPublications();
        int publicationsNumber = lib.getPublicationsNumber();
        int countBooks = 0;
        for(int i=0; i<publicationsNumber; i++) {
            if(publications[i] instanceof Book) {
                System.out.println(publications[i]);
                countBooks++;
            }
        }

        if(countBooks == 0) {
            System.out.println("Brak książek w bibliotece");
        }
    }

    public static void printMagazines(Library lib) {
        Publication[] publications = lib.getPublications();
        int publicationsNumber = lib.getPublicationsNumber();
        int countMagazines = 0;
        for(int i=0; i<publicationsNumber; i++) {
            if(publications[i] instanceof Magazine) {
                System.out.println(publications[i]);
                countMagazines++;
            }
        }

        if(countMagazines == 0) {
            System.out.println("Brak magazynów w bibliotece");
        }
    }
}