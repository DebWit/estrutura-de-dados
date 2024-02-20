public class MeuVetor {
    // o atributos dessa classe será um vetor 
    private int[] v;
    private int ultimaPos;

    // ________________construtor________________
    public MeuVetor (int capacidade){
        v = new int[capacidade];
        ultimaPos = -1;
    }

    // ________________metodo de acesso________________
    public int getUltimaPos(){
        return ultimaPos; //retorna um inteiro
    }
    public int[] getV(){
        return v; //retorna um vetor
    }

    // ________________ metodos modificadores________________
    public void setUltimaPos(int pos){
        if (pos >= 0 && pos < v.length) {
            ultimaPos = pos;
        }
        else {
            ultimaPos = v.length -1;
        }

        // nao fizemos o set v, indicando que nesse caso não será permitirdo alterá-lo
    }

    // __________________ metodo que confirma se o vetor está cheio / retorno booleano __________________
    public boolean estaCheio() {
    //     if (ultimaPos == v.length-1){
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
        return ultimaPos == v.length-1;
    }

    // ______________________ metodo adicionar item no vetor _____________________
    public boolean add (int elemento) {
        if (estaCheio()){
            return false;
        }
        // não precisa do else porque se o return da função for o do if, será falso e ele interrompe a função
        ultimaPos++;
        v[ultimaPos] = elemento;
        return true;

        //sobrecarga é uma forma de polimorfismo: mesmo nome de metodo, masa parametros diferentes



    }
        
    // __________________ teste Estavazio _______________
    public boolean estaVazio () {
        return ultimaPos == -1;
        }
        
    // @Override significa que você não pode mexer na assinatura, o nome do metodo é o mesmo, mas o recheio é diferente, é um aviso para o usuario
    @Override
    public String toString () { //toString é padrao de ser uma representação textual de um vetor
        String s = "";
        if (estaVazio()){
            s = s + estaVazio();
        }
        else{
            for (int i = 0; i<=ultimaPos; i++){
                s = s + v[i] + ", ";
            }
            
        }
        s = s +"\n";
        return s;
    }
        
    
}