package modelo;

public class Produto{
    private String marca, nome;
    private double preco;
    private int id;
    
        public Produto(String marca, String nome, double preco, int id){
            this.marca=marca;
            this.nome=nome;
            this.preco=preco;
            this.id=id;
        }

        public String getMarca() {
            return marca;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getId() {
            return id;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public void setId(int id) {
            this.id = id;
        }

    
}