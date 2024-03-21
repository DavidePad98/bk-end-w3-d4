package epicode.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
@DiscriminatorValue("FootballMatch")
public class PartitaDiCalcio extends Event{
    private String squadra_di_casa;
    private String ospite;
    private String vincente;
    private int numero_Gol_squadra_di_casa;
    private int numero_Gol_squadra_ospite;

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, String squadra_di_casa, String ospite, String vincente, int numero_Gol_squadra_di_casa, int numero_Gol_squadra_ospite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.squadra_di_casa = squadra_di_casa;
        this.ospite = ospite;
        this.vincente = vincente;
        this.numero_Gol_squadra_di_casa = numero_Gol_squadra_di_casa;
        this.numero_Gol_squadra_ospite = numero_Gol_squadra_ospite;
    }

    public PartitaDiCalcio() {}

    public String getSquadra_di_casa() {
        return squadra_di_casa;
    }

    public void setSquadra_di_casa(String squadra_di_casa) {
        this.squadra_di_casa = squadra_di_casa;
    }

    public String getOspite() {
        return ospite;
    }

    public void setOspite(String ospite) {
        this.ospite = ospite;
    }

    public String getVincente() {
        return vincente;
    }

    public void setVincente(String vincente) {
        this.vincente = vincente;
    }

    public int getNumero_Gol_squadra_di_casa() {
        return numero_Gol_squadra_di_casa;
    }

    public void setNumero_Gol_squadra_di_casa(int numero_Gol_squadra_di_casa) {
        this.numero_Gol_squadra_di_casa = numero_Gol_squadra_di_casa;
    }

    public int getNumero_Gol_squadra_ospite() {
        return numero_Gol_squadra_ospite;
    }

    public void setNumero_Gol_squadra_ospite(int numero_Gol_squadra_ospite) {
        this.numero_Gol_squadra_ospite = numero_Gol_squadra_ospite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadra_di_casa='" + squadra_di_casa + '\'' +
                ", ospite='" + ospite + '\'' +
                ", vincente='" + vincente + '\'' +
                ", numero_Gol_squadra_di_casa=" + numero_Gol_squadra_di_casa +
                ", numero_Gol_squadra_ospite=" + numero_Gol_squadra_ospite +
                '}';
    }
}
