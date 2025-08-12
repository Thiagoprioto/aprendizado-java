public class Lista {
    int id;
    int idade;
    String nome;

    public Lista(int id,int idade,String nome){
        this.id = 222;
        this.nome = "Luiz";
        this.idade = 34567;
    }
    public void exibir(){
        System.out.println("ID:" + id);
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
    }
    public static void main(String[] args){
        Lista Lista = new Lista(222, 34567, "Luiz");

        Lista.exibir();
    }
}
