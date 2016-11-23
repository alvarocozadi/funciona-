package pokedex;
public class Pokemon {
    //atributos
    private String nome;
    private double healthPoints;
    private String tipo;
    private double peso;
    private double altura;
    private Habilidade vetorDeHabilidades[];
    
    //construtor
public Pokemon(String nome, double HP, String tipo, double peso,double altura) {
    this.nome = nome;
    this.healthPoints = HP;
    this.tipo = tipo;
    this.peso = peso;
    this.altura = altura;
}
    //metodos
public String getNome(){
    return this.nome;
}

public double gethealthPoints(){
    return this.healthPoints;
}

public String getTipo(){
    return this.tipo;
}

public double getPeso(){
    return this.peso;
}

public double getAltura(){
    return this.altura;
}





}
