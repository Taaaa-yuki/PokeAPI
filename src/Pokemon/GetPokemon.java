package Pokemon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.*;

public class GetPokemon implements PokeApi {
    @Override
    public PokemonModel request(String url) {
        StringBuilder result = new StringBuilder();
        try {
            URL urlObj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(result.toString(), JsonObject.class);

        int id = jsonObject.get("id").getAsInt();
        String name = jsonObject.get("name").getAsString();

        JsonArray types = jsonObject.get("types").getAsJsonArray();
        StringBuilder typeBuilder = new StringBuilder();
        for (JsonElement type : types) {
            JsonObject typeObj = type.getAsJsonObject();
            String typeName = typeObj.get("type").getAsJsonObject().get("name").getAsString();
            typeBuilder.append(typeName).append(" ");
        }
        String type = typeBuilder.toString().trim();

        PokemonModel pokemon = new PokemonModel(id, name, type);
        return pokemon;
    }
}
