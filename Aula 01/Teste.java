public class Teste {
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(10);
        //v1.ultimaPos = 27;
        //v1.v[v1.ultimaPos] = 10; // vai dar erro porque a posição que ele quer acessar é a 27, 
        //mas acabou de ser definido que o máximo de posições que v1.v pode ter é 10
        //como resolver isso? colocar private antes dos atributos -> encapsulamento
        
        System.out.println("ultima posição depois de instanciar: " + v1.getUltimaPos());
        // v1.setUltimaPos(27);
        // tiramos o set porque o ideal é nao deixar ele publico, se nao pode alterar o funcionamento do preograma (nesse caso, ao checar que o vetor vai até a posição 9, ele para a visão ali, então isso quebra a logica de descobrir se o vetor está vazio a partir da ultima posição utilizada, pois, apesar de estar vazio, ele ainda está olhando para a posição 9 por causa do set 27)
        System.out.println("ultima posição depois do set: " + v1.getUltimaPos());
        System.out.println(v1);

        if (v1.add(12)){
            System.out.println("Elemento inserido ocm sucesso!");
        }
        else{
            System.out.println("Não foi possível adicionar o elemento.");
        }

        // a classe Object é uma superclasse pai de todas as outras classes, onde permite, por exemplo, a mudança de tipos de variaveis.
        // encapsulamento, herança e polimorfismo
        // existe um jeito, em vez da herança, de a classe filha sobrescrever conteudos da classe pai, no caso so dela


        // existem varios tipos de polimorfismo:
        // o dinamico (que é a sobrecarga), resolvido em tempo de execução
        // o estático (que é a sobrescrita), resolvido em tempo de compilação
        // e o parametrico (que é o generics: definir o tipo a partir da instanciação), defino na hora que se instacia o objeto


    }
}
