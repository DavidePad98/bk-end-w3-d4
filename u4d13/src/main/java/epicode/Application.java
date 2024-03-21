package epicode;

import com.github.javafaker.Faker;
import epicode.dao.AttendancesDAO;
import epicode.dao.EventsDAO;
import epicode.dao.LocationsDAO;
import epicode.dao.PeopleDAO;
import epicode.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        Faker faker = new Faker(Locale.ITALY);
        EventsDAO eventsDAO = new EventsDAO(em);
        LocationsDAO locationsDAO = new LocationsDAO(em);
        PeopleDAO peopleDAO = new PeopleDAO(em);
        AttendancesDAO attendancesDAO = new AttendancesDAO(em);
        Random rndm = new Random();

        // ******************** SALVATAGGIO LOCATIONS, UTENTI E EVENTI ************************

        // Location location1 = new Location(faker.address().city(), faker.address().cityName());
//         locationsDAO.save(location1);
        Location location1 = locationsDAO.findById(1);

        // Location location2 = new Location(faker.address().city(), faker.address().cityName());
//         locationsDAO.save(location2);
        Location location2 = locationsDAO.findById(2);

//        Person person8 = new Person(faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(),  LocalDate.now(), rndm.nextInt(0, 2) == 0 ? 'M' : 'F');
//         peopleDAO.save(person8);

//        for (int i = 0; i < 20; i++) {
//            eventsDAO.save(new Event(
//                    faker.chuckNorris().fact(),
//                    LocalDate.of(rndm.nextInt(2023, 2025),
//                            rndm.nextInt(1, 13),
//                            rndm.nextInt(1, 29)),
//                    faker.lorem().fixedString(50),
//                    rndm.nextInt(1, 3) == 1 ? TipoEvento.PRIVATO : TipoEvento.PUBBLICO,
//                    rndm.nextInt(1, 1000),rndm.nextInt(0, 2) == 0 ? location1: location2));
//        }

        // ******************** PARTECIPAZIONE AD UN EVENTO ************************

//        Person person = peopleDAO.findById(3);
//        Event event = eventsDAO.findById(6);
//        System.out.println(person);
//        System.out.println(event);

        // Attendance partecipazione = new Attendance(person, event);
        //  attendancesDAO.save(partecipazione);

        // Stampo eventi a cui partecipa la persona 23
        // person.getListaPartecipazioni().forEach(System.out::println);

        // Stampo elenco partecipanti evento 24
       // event.getListaPartecipazioni().forEach(System.out::println);
//
//        // ******************** CASCADING ************************
//
//        // Eliminando un evento dovrebbe eliminare anche le partecipazioni ad esso collegate
//        eventsDAO.findByIdAndDelete(24);

        //********************************************************************************************

//       PartitaDiCalcio p1 = new PartitaDiCalcio("brc-npl", LocalDate.of(2020,7,7), "champion", TipoEvento.PUBBLICO, 50000, location1, "brc", "npl", "casa", 3, 1 );
//       PartitaDiCalcio p2 = new PartitaDiCalcio("juv-int", LocalDate.of(2023,6,17), "serie-a", TipoEvento.PUBBLICO, 60000, location2, "juv", "int", "ospite", 2, 4 );
//       PartitaDiCalcio p3 = new PartitaDiCalcio("mil-cgl", LocalDate.of(2024,10,27), "seria-a", TipoEvento.PUBBLICO, 80000, location1, "mil", "cgl", "casa", 2, 1 );
//       PartitaDiCalcio p4 = new PartitaDiCalcio("rlm-brm", LocalDate.of(2021,2,5), "champion", TipoEvento.PUBBLICO, 120000, location2, "rlm", "brml", "ospite", 3, 5 );

//       eventsDAO.save(p1);
//       eventsDAO.save(p2);
//       eventsDAO.save(p3);
//       eventsDAO.save(p4);

//        Concerto c1 = new Concerto("uno", LocalDate.of(2020,7,7), "spettacolo imbarazzante", TipoEvento.PRIVATO, 300, location1, Genere.CLASSICO, true);
//        Concerto c2 = new Concerto("due", LocalDate.of(2022,1,1), "ac/dc", TipoEvento.PUBBLICO, 30000, location2, Genere.ROCK, false);
//        Concerto c3 = new Concerto("tre", LocalDate.of(2023,8,19), "lol", TipoEvento.PRIVATO, 100, location2, Genere.CLASSICO, true);
//        Concerto c4 = new Concerto("quattro", LocalDate.of(2024,12,10), "aiuto", TipoEvento.PUBBLICO, 32200, location1, Genere.POP, false);

//        eventsDAO.save(c1);
//        eventsDAO.save(c2);
//        eventsDAO.save(c3);
//        eventsDAO.save(c4);

        

        GaraDiAtletica g1 = new GaraDiAtletica("gara1", LocalDate.of(2020,7,7), "gara atletica leggera 1", TipoEvento.PUBBLICO, 400, location1, )


        em.close();
        emf.close();
   }
}
