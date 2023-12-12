import java.util.Objects;

public class Departement {
    protected int id;
    protected String nom;
    protected int nbr_emp;

    public Departement() {
    }

    public Departement(int id, String nom, int nbr_emp) {
        this.id = id;
        this.nom = nom;
        this.nbr_emp = nbr_emp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbr_emp() {
        return nbr_emp;
    }

    public void setNbr_emp(int nbr_emp) {
        this.nbr_emp = nbr_emp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nom, that.nom);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbr_emp=" + nbr_emp +
                '}';
    }



}



