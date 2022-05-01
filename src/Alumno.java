import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Alumno {
    private String nombre;
    private String carrera;
    private int edad;
    private HashMap<Materia, ArrayList<Nota>> notasMaterias;


    public Alumno(String nombre, String carrera, int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
        this.notasMaterias = new HashMap<Materia, ArrayList<Nota>>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void setNotasMaterias(Materia m, ArrayList<Nota> n) {
        this.notasMaterias.put(m, n);
    }


    public HashMap<Materia, ArrayList<Nota>> getNotasMaterias() {
        return notasMaterias;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", carrera='" + carrera + '\'' +
                ", edad=" + edad +
                ", notasMaterias=" + notasMaterias +
                '}';
    }


    public float obtenerPromedioTodasLasMaterias() {
        float suma = 0;
        int i = 0;

        for (Map.Entry<Materia, ArrayList<Nota>> entry : this.notasMaterias.entrySet()) {

            System.out.printf("Materia =" + entry.getKey());

            ArrayList <Nota> n = entry.getValue();
            for (Nota num : n){
               suma += num.getNota();
               i++;
            }

            System.out.println(suma/ n.size());
            suma = 0;
        }
        return 0;
    }
    public float obtenerPromUnaSolaMateria(Materia m) {
        float suma = 0;
        int i = 0;

        for (Map.Entry<Materia, ArrayList<Nota>> entry : this.notasMaterias.entrySet()) {

            if(entry.getKey().getNombre().equals(m.getNombre())){
                System.out.printf("Materia =" + entry.getKey());
                ArrayList <Nota> n = entry.getValue();

                for (Nota num : n){
                    suma += num.getNota();
                    i++;
                }
                System.out.println(suma/ n.size());

            }





        }
        return 0;
    }


}
