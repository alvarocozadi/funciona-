package pokedex;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Pokedex {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Pokedex, para começar escolha uma das opções abaixo:");
        int opcao;
        
        Cadastro meuCadastro;
        meuCadastro = new Cadastro();
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("1 - Cadastrar Pokemon");
            System.out.println("2 - Listar Pokemons");
            System.out.println("3 - Consultar dados de um pokemon");
            System.out.println("4 - Excluir um pokemon");
            System.out.println("5 - Criar uma pokebola");
            System.out.println("6 - Excluir uma pokebola");
            System.out.println("7 - Cadastrar uma nova habilidade");
            System.out.println("8 - Excluir uma habilidade existente");
            System.out.println("9 - Sair");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1: 
                    System.out.println("Digite um nome para o pokemon:");
                    String nomePokemon;
                    nomePokemon = entrada.next();
                    System.out.println("Digite uma quantidade de pontos de vida para o pokemon:");
                    double healthPoints;
                    healthPoints = entrada.nextDouble();
                    System.out.println("Digite um tipo para o pokemon:");
                    String tipo;
                    tipo = entrada.next();
                    System.out.println("Digite peso para o pokemon:");
                    double peso;
                    peso = entrada.nextDouble();
                    System.out.println("Digite uma altura para o pokemon:");
                    double altura;
                    altura = entrada.nextDouble(); 
                    Pokemon meuPokemon = new Pokemon(nomePokemon, healthPoints, tipo, peso, altura); 
                    meuCadastro.addPokemon(meuPokemon);
                    break; 
                    
                case 2: 
                    for (int i=0 ; i < meuCadastro.getNumeroDePokemons(); i++){
                        List listaParaPercorrer = meuCadastro.getListaDePokemons();
                        Pokemon pokemonParaImprimir = (Pokemon) listaParaPercorrer.get(i);
                        System.out.println(pokemonParaImprimir.getNome());
                    }
                    break;
                    
                case 3 : 
                    System.out.println("Digite o nome do pokemon que deseja consultar os dados");
                    nomePokemon = entrada.next();
                    if (meuCadastro.contemPokemon(nomePokemon)){ 
                    for (int i=0 ; i < meuCadastro.getNumeroDePokemons(); i++){
                      Pokemon pokemonParaImprimir = (Pokemon) meuCadastro.getPokemon(i);
                      if (nomePokemon.equals(pokemonParaImprimir.getNome())){
                            System.out.println("Pokemon Encontrado. Dados:");
                            System.out.print("Nome:");
                            System.out.println(pokemonParaImprimir.getNome());
                            System.out.print("HP:");
                            System.out.println(pokemonParaImprimir.gethealthPoints());
                            System.out.print("Tipo:");
                            System.out.println(pokemonParaImprimir.getTipo());
                            System.out.print("Peso:");
                            System.out.println(pokemonParaImprimir.getPeso());
                            System.out.print("Altura:");
                            System.out.println(pokemonParaImprimir.getAltura());
                        } 
                    }    
                    } else {
                            System.out.println("Este pokemon não existe no cadastro.");
                            }   
                    break;
                case 4 : 
                    System.out.print("Digite o nome do pokemon que deseja remover:");
                    nomePokemon = entrada.next();
                    if (meuCadastro.contemPokemon(nomePokemon)){
                      for (int i=0 ; i < meuCadastro.getNumeroDePokemons(); i++){
                        Pokemon pokemonParaRemover = (Pokemon) meuCadastro.getPokemon(i);
                        if (nomePokemon.equals(pokemonParaRemover.getNome())){
                            meuCadastro.removePokemon(nomePokemon); 
                        }  
                    } 
                    } else {
                            System.out.println("Este pokemon não existe no cadastro.");
                            } 
                    
                    break;
                case 5 : 
                    
                    break;
                case 6 : 
                    
                    break;
                case 7 : 
                    
                    break;
                case 8 : 
                    
                    break;
                    
                case 9 : 
                    
                    break;

            } 
        } while (opcao != 9);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
