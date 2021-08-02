public class App {
    public static void main(String[] args) throws Exception {
        ProyectoBaterias prueba1 = new ProyectoBaterias(0, 0, 0);
        System.out.println(prueba1.calcInteresSimple());
        System.out.println(prueba1.calcInteresCompuesto());
        System.out.println(prueba1.comparar());

        ProyectoBaterias prueba2= new ProyectoBaterias(2,10000000,6);
        System.out.println(prueba2.calcInteresSimple());
        System.out.println(prueba2.calcInteresCompuesto());
        System.out.println(prueba2.comparar());
    }
}
