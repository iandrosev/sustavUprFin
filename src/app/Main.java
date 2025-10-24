package app;
import java.util.Scanner;
import java.math.BigDecimal;
import entities.*;
import entities.Record;

public class Main {
    public static void main(String[] args) {


        Scanner unos= new Scanner(System.in);

        User[] users = new User[5];
        Booking[] bookings = new Booking[5];
        Record[] records = new Record[5];
        Item[] items = new Item[5];


        //Unos 5 korisnika
        System.out.println("Unos korisnika: ");
        for(int i=0;i<5;i++){
            System.out.println("Unesi ime " + (i+1) + ". korisnika: ");
            String ime = unos.nextLine();

            System.out.println("Unesi prezime " + (i+1) + ". korisnika: ");
            String prezime= unos.nextLine();

            System.out.println("Unesi OIB " + (i+1) + ". korisnika: ");
            String oib = unos.nextLine();

            users[i]= new User(ime,prezime,oib);
        }

        //Unos 5 rezervacija
        System.out.println("Unos rezervacija: ");
        for(int i=0;i<5;i++){
            System.out.println("Unesi datum " + (i+1) + ". rezervacije: ");
            String datum = unos.nextLine();

            System.out.println("Unesi id " + (i+1) + ". rezervacije: ");
            String id= unos.nextLine();

            System.out.println("Unesi korisnika " + (i+1) + ". rezervacije: ");
            int userIndex= unos.nextInt();
            User korisnik = users[userIndex-1];
            unos.nextLine();

            bookings[i] = new Booking(datum, korisnik, id);
        }

        //Unos 5 faktura
        System.out.println("Unos faktura ");
        for(int i=0;i<5;i++){
            System.out.println("Unesi opis " + (i+1) + ". fakture: ");
            String opis = unos.nextLine();

            System.out.println("Unesi iznos " + (i+1) + ". fakture: ");
            BigDecimal iznos= unos.nextBigDecimal();
            unos.nextLine();

            System.out.println("Unesi id " + (i+1) + ". fakture: ");
            String id= unos.nextLine();

            System.out.println("Unesi korisnika " + (i+1) + ". fakture: ");
            int userIndex= unos.nextInt()-1;
            User korisnik = users[userIndex];
            unos.nextLine();

            records[i] = new Record(iznos, korisnik, id, opis);
        }

        //Unos 5 artikala
        System.out.println("Unos artikala:");
        for(int i=0;i<5;i++){
            System.out.println("Unesi ime " + (i+1) + ". artikla:");
            String imeArtikla = unos.nextLine();

            System.out.println("Unesi cijenu " + (i+1) + ". artikla");
            BigDecimal cijena = unos.nextBigDecimal();
            unos.nextLine();

            items[i] = new Item(imeArtikla, cijena);
        }

        System.out.println("Unesi prezime za pretragu:");
        String prezimeS = unos.nextLine();
        if(searchByPrez(users, prezimeS)!=null){
            System.out.println("Pronađen je korinik: " + searchByPrez(users, prezimeS).toString());
        }
        else{
            System.out.println("Nema korisnika s tim prezimenom.");
        }

        System.out.println("Faktura s najvecim iznosom je: " + findMaxRecordIznos(records).toString());

        unos.close();

        System.out.println("\n");


        int indeks= 3;
        System.out.println(users[indeks].toString());
        System.out.println(bookings[indeks].toString());
        System.out.println(records[indeks].toString());
        System.out.println(items[indeks].toString());
    }

    public static User searchByPrez(User[] users, String prezime){
        for(int i=0;i<users.length;i++){
            if(users[i].getPrezime().equals(prezime)){
                return users[i];
            }
        }
        return null;
    }

    public static Record findMaxRecordIznos(Record[] records){
        BigDecimal max = records[0].getIznos();
        int maxIndeks = 0;
        for(int i=0;i<records.length;i++){
            if(records[i].getIznos().compareTo(max) > 0){
                max = records[i].getIznos();
                maxIndeks = i;
            }
        }
        return records[maxIndeks];
    }

}