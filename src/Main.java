import Pokemon.PokeApi;
import Pokemon.PokemonModel;
import Pokemon.GetPokemon;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main <pokemon_id>");
            return;
        } 
        
        // コマンドライン引数からポケモンIDを取得する
        int pokemonId = Integer.parseInt(args[0]);
        System.out.println("Pokemon ID: " + pokemonId);

        // PokeAPIからポケモン情報を取得するためのURL
        String url = "https://pokeapi.co/api/v2/pokemon/" + pokemonId;

        // PokemonAPIを使用してポケモン情報を取得する
        PokeApi pokemonApi = new GetPokemon();
        PokemonModel pokemon = pokemonApi.request(url);

        // 取得したポケモン情報を表示する
        System.out.println(pokemon.getId());
        System.out.println(pokemon.getName());
        System.out.println(pokemon.getType());
    }
}
