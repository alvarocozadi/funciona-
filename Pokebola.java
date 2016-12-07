package pokedex;
public class Pokebola {
    //atributos
    String tipo;
    int nivelMax;
    Pokemon pokemonContido;
    
    
    //construtor
    public Pokebola(String tipo, int nivelMax) {
    this.tipo = tipo;
    this.nivelMax = nivelMax;
    }
    
    public Pokebola(String tipo, int nivelMax, Pokemon pokemonASerInserido){
        this.tipo = tipo;
        this.nivelMax = nivelMax;
        this.pokemonContido = new Pokemon(pokemonASerInserido.getNome(),pokemonASerInserido.gethealthPoints(),pokemonASerInserido.getTipo(),pokemonASerInserido.getPeso(),pokemonASerInserido.getAltura());
    }
    //metodos
    
    public Pokebola inserirPokemon(Pokemon pokemonASerInserido){
        
        this.pokemonContido = pokemonASerInserido;
        
        
        return this;
    }
    
    public Pokebola removerPokemon(){
        
        this.pokemonContido = null;
        
        
        return this;
    }
    
    
    
}
