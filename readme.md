# PokeAPI

PokeAPI is a Java application that retrieves Pokemon information.

## Directory structure

``` tree
PokeAPI
├── bin
│   ├── Main.class
│   └── Pokemon
│       ├── GetPokemon.class
│       ├── PokeApi.class
│       └── PokemonModel.class
├── lib
│   └── gson-2.8.9.jar
├── readme.md
└── src
    ├── Main.java
    └── Pokemon
        ├── GetPokemon.java
        ├── PokeApi.java
        └── PokemonModel.java
```

## Usage

Execute the following command to obtain Pokémon information.

``` bash
javac -d bin -cp lib/gson-2.8.9.jar src/Main.java src/Pokemon/GetPokemon.java src/Pokemon/PokeApi.java src/Pokemon/PokemonModel.java
java -cp bin:lib/gson-2.8.9.jar Main <pokemon_id>
```

### References

- [PokeAPI official website](https://pokeapi.co/)
- [Gson Library Official Documentation](https://github.com/google/gson/blob/master/UserGuide.md)
