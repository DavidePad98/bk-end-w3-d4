package epicode.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@DiscriminatorValue("AtleticMatch")
public class GaraDiAtletica extends Event{
    @ManyToOne
    @JoinColumn(name = "atleti")
    private Person setAtleti;

    @OneToOne
    @JoinColumn(name = "winner", unique = true)
    private Person vincitore;

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, Person setAtleti, Person vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.setAtleti = setAtleti;
        this.vincitore = vincitore;
    }

    public Person getSetAtleti() {
        return setAtleti;
    }

    public void setSetAtleti(Person setAtleti) {
        this.setAtleti = setAtleti;
    }

    public Person getVincitore() {
        return vincitore;
    }

    public void setVincitore(Person vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "setAtleti=" + setAtleti +
                ", vincitore=" + vincitore +
                '}';
    }
}
