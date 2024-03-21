package epicode.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "persone")
public class Person {
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	private String cognome;
	private String email;
	private LocalDate data_di_nascita;
	private char sesso;


	@OneToMany(mappedBy = "persona")
	private List<Attendance> listaPartecipazioni;

	@OneToMany(mappedBy = "setAtleti")
	private List<GaraDiAtletica> listaAtleti;

	@OneToOne(mappedBy = "vincitore")
	private GaraDiAtletica vincitore;

	public Person() {
	}

	public Person(String nome, String cognome, String email, LocalDate data_di_nascita, char sesso) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.data_di_nascita = data_di_nascita;
		this.sesso = sesso;
	}


	public long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getData_di_nascita() {
		return data_di_nascita;
	}

	public void setData_di_nascita(LocalDate data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}

	public char getSesso() {
		return sesso;
	}

	public void setSesso(char sesso) {
		this.sesso = sesso;
	}

	public List<Attendance> getListaPartecipazioni() {
		return listaPartecipazioni;
	}

	public List<GaraDiAtletica> getListaAtleti() {
		return listaAtleti;
	}

	public void setListaAtleti(List<GaraDiAtletica> listaAtleti) {
		this.listaAtleti = listaAtleti;
	}

	public void setListaPartecipazioni(List<Attendance> lista_partecipazioni) {
		this.listaPartecipazioni = lista_partecipazioni;

	}

	@Override
	public String toString() {
		return "Persona{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", cognome='" + cognome + '\'' +
				", email='" + email + '\'' +
				", data_di_nascita=" + data_di_nascita +
				", sesso=" + sesso +
				'}';
	}
}
