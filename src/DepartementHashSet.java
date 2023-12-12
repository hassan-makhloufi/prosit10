import java.util.*;
import java.lang.Object;
public  class DepartementHashSet implements IDepartement<Departement>{

   Set<Departement> departements = new HashSet<>();

   @Override
    public void ajouterDepartement(Departement departement) {

        departements.add(departement);
    }


@Override
public boolean rechercherDepartement(String nom) {
    Iterator<Departement> iterator = departements.iterator();
    while (iterator.hasNext()) {
        Departement d = iterator.next();
        if (d.getNom().equals(nom)) {
            return true;
        }
    }
    return false;
}

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for(Departement d : departements){ 
            System.out.println(d);

        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {

        Comparator<Departement> idComparator = Comparator.comparingInt(Departement::getId);

        TreeSet<Departement> sortedDepartements = new TreeSet<>(idComparator);
        sortedDepartements.addAll(departements);

        return sortedDepartements;

    }
}
