package pokedex;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    //atributos
    
    
    private List listaDePokemons;
    
    //construtor
    Cadastro (){
        listaDePokemons = new ArrayList();
    }
    //metodos
    public void addPokemon(Pokemon pokemonToAdd){
        listaDePokemons.add(pokemonToAdd);
    }
    
    public Pokemon getPokemon (int i){
        Pokemon pokemonParaDevolver = (Pokemon) listaDePokemons.get(i);
        return pokemonParaDevolver; 
    }
    
    public int getNumeroDePokemons(){
        return listaDePokemons.size();
    }
    
    public List getListaDePokemons(){
        return listaDePokemons;
    }
    
    public void removePokemon(String pokemonToRemove){
        for (int i=0 ; i <= this.getNumeroDePokemons(); i++){
            Pokemon pokemonParaRemover = this.getPokemon(i);
            if (pokemonToRemove.equals(pokemonParaRemover.getNome())){
                boolean remove = listaDePokemons.remove(pokemonParaRemover);
            }
        } 
    }
    
    public boolean contemPokemon (String pokemonToSearch){
        for (int i=0 ; i < this.getNumeroDePokemons(); i++){
            Pokemon pokemonParaVerificar = this.getPokemon(i);
            if (pokemonToSearch.equals(pokemonParaVerificar.getNome())){
                return true;
            }
        } return false;
    } 
}
