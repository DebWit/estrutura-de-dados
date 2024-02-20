public class TesteArgs {
    public static void main(String[] args) {
        //args é um vetorzinho de strings
        // é estático = é um metodo de classe, se não fosse estatico voce teria que instanciar um objetos de outra classe

        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }


    }
}
