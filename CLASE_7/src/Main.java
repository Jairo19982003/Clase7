import pkgAlumnos.Alumno;
import pkgAlumnos.Curso;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("AA001", "Juan", "2222-2222", "San Salvador");
        Curso cur = new Curso("C001", "Programación", 150.00);
        //alumno1.agregarcurso(cur);
        alumno1.agregarcurso(new Curso("C001", "Programación", 150.00));
        alumno1.agregarcurso(new Curso("C002", "Matemáticas", 100.00));

        Alumno alumno2 = new Alumno("AA002", "Pedro", "2222-2222", "San Salvador");
        alumno2.agregarcurso(new Curso("C001", "Programación", 150.00));
        alumno2.agregarcurso(new Curso("C002", "Matemáticas", 100.00));

        Alumno alumno3 = new Alumno("AA003", "Maria", "2222-2222", "San Salvador");
        alumno3.agregarcurso(new Curso("C001", "Programación", 150.00));
        alumno3.agregarcurso(new Curso("C002", "Matemáticas", 100.00));

        Alumno alumno4 = new Alumno("AA004", "Jose", "2222-2222", "San Salvador");
        alumno4.agregarcurso(new Curso("C001", "Programación", 150.00));
        alumno4.agregarcurso(new Curso("C002", "Matemáticas", 100.00));


        System.out.println("nombre del alumno: " + alumno1.getNombre());
        System.out.println("carnet del alumno: " + alumno1.getCarnet());

        System.out.println();


        /*for(int i=0; i<alumno1.getCursos().size(); i++){
            double precio1 = 0;
            System.out.println("Curso:"+ alumno1.getCursos().get(i).getNombre()+ " Valor:"+ alumno1.getCursos().get(i).getCosto());
            precio1 = precio1 + alumno3.getCursos().get(i).getCosto();
            System.out.println("Total a pagar: "+ precio1);


        }*/

       /* System.out.println("nombre del alumno: " + alumno2.getNombre());
        System.out.println("carnet del alumno: " + alumno2.getCarnet());

        for(int i=0; i<alumno2.getCursos().size(); i++){
            double precio2 = 0;
            System.out.println("Curso:"+ alumno2.getCursos().get(i).getNombre()+ " Valor:"+ alumno2.getCursos().get(i).getCosto());
            precio2 = precio2 + alumno3.getCursos().get(i).getCosto();
            System.out.println("Total a pagar: "+ precio2);
        }

        System.out.println("nombre del alumno: " + alumno3.getNombre());
        System.out.println("carnet del alumno: " + alumno3.getCarnet());

        for(int i=0; i<alumno3.getCursos().size(); i++){
            double precio3 = 0;
            System.out.println("Curso:"+ alumno3.getCursos().get(i).getNombre()+ " Valor:"+ alumno3.getCursos().get(i).getCosto());
            precio3 = precio3 + alumno3.getCursos().get(i).getCosto();
            System.out.println("Total a pagar: "+ precio3);

        }

        System.out.println("nombre del alumno: " + alumno4.getNombre());
        System.out.println("carnet del alumno: " + alumno4.getCarnet());

        for(int i=0; i<alumno4.getCursos().size(); i++){
            double precio4 = 0;
            System.out.println("Curso:"+ alumno4.getCursos().get(i).getNombre()+ " Valor:"+ alumno4.getCursos().get(i).getCosto());
            precio4 = precio4 + alumno3.getCursos().get(i).getCosto();
            System.out.println("Total a pagar: "+ precio4);
        }*/

        //iteracion
        /*double gt = 0;
        double to = 0;
        for (Curso curso : alumno1.getCursos()) {
            to = to+curso.getCosto();
           System.out.println("Curso:"+ curso.getNombre()+ " Valor:"+ curso.getCosto());
        }
        gt = gt + to;
        System.out.println("Total a pagar: "+ to);

        to = 0;
        for (Curso curso : alumno2.getCursos()) {
            to = to+curso.getCosto();
            System.out.println("Curso:"+ curso.getNombre()+ " Valor:"+ curso.getCosto());
        }

        gt = gt + to;
        System.out.println("Total a pagar: "+ to);
        System.out.println("Gran total a pagar: "+ gt);*/

    }
}
