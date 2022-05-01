import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Alumno matias = new Alumno("Mati Morro", "Sistemas", 35);
        ArrayList<Nota> notasInf = new ArrayList<>() ;
        ArrayList<Nota> notasFis = new ArrayList<>() ;

        Nota n1 = new Nota(10);
        notasInf.add(new Nota(7));
        notasInf.add(new Nota(8));
        notasInf.add(n1);

        Materia computacion = new Materia("Informatica");

        Materia fisica = new Materia("Fisica");

        notasFis.add(new Nota(2));
        notasFis.add(new Nota(3));

        matias.setNotasMaterias(new Materia("Fisica"), notasFis);
        matias.setNotasMaterias(new Materia("Informatica"), notasInf);

        //matias.obtenerPromedioTodasLasMaterias();
        matias.obtenerPromUnaSolaMateria(computacion);


    }

}