package Pokemon;

public class PokemonModel {
    private int id;
    private String name;
    private String type;

    public PokemonModel(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setId() {
        this.id = id;
    }

    public void setName() {
        this.name = name;
    }

    public void setType() {
        this.type = type;
    }
}
