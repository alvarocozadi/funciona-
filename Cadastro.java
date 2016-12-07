package pokedex;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    //atributos
    private List listaDePokemons;
    private List listaDeHabilidades;
    
    
    //construtor
    Cadastro (){
        listaDePokemons = new ArrayList();
        listaDeHabilidades = new ArrayList();
        
    }
    //metodos
    public void addPokemon(Pokemon pokemonToAdd){
        listaDePokemons.add(pokemonToAdd);
    }
    
    public void addHabilidade(Habilidade abilityToAdd){
        listaDeHabilidades.add(abilityToAdd);
    }
    
    public Habilidade getHabilidade (int i){
        Habilidade habilidadeParaDevolver = (Habilidade) listaDeHabilidades.get(i);
        return habilidadeParaDevolver; 
    }
    
    public Pokemon getPokemon (int i){
        Pokemon pokemonParaDevolver = (Pokemon) listaDePokemons.get(i);
        return pokemonParaDevolver; 
    }
    
    public List getListaDeHabilidades(){
        return listaDeHabilidades;
    }
    
    public int getNumeroDePokemons(){
        return listaDePokemons.size();
    }
    
    public int getNumeroDeHabilidades(){
        return listaDeHabilidades.size();
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
    
    public void removeHabilidade(String abilityToRemove){
        for (int i=0 ; i <= this.getNumeroDeHabilidades(); i++){
            Habilidade habilidadeParaRemover = this.getHabilidade(i);
            if (abilityToRemove.equals(habilidadeParaRemover.getNome())){
                boolean remove = listaDeHabilidades.remove(habilidadeParaRemover);
            }
        } 
    }
    
    public boolean contemHabilidade (String abilityToSearch){
        for (int i=0 ; i < this.getNumeroDeHabilidades(); i++){
            Habilidade habilidadeParaVerificar = this.getHabilidade(i);
            if (abilityToSearch.equals(habilidadeParaVerificar.getNome())){
                return true;
            }
        } return false;
    } 
    
    public void associarPokemonComHabilidade (String pokemonEscolhido, String habilidadeEscolhida){
        
        for (int i=0 ; i < this.getNumeroDePokemons(); i++){
                        Pokemon pokemonParaVerificar = this.getPokemon(i);
                        if (pokemonEscolhido.equals(pokemonParaVerificar.getNome())){
                        if (this.contemHabilidade(habilidadeEscolhida)){
                        for (int n=0 ; n < this.getNumeroDeHabilidades(); n++){
                            Habilidade habilidadeParaVerificar = this.getHabilidade(n);
                                if (habilidadeEscolhida.equals(habilidadeParaVerificar.getNome())){
                                   pokemonParaVerificar.addHabilidade(habilidadeParaVerificar);
                                   
                                }
                        }
      
                    
                    }   
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
