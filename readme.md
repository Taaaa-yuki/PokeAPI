# PokeAPI

PokeAPIは、ポケモンの情報を取得するJavaアプリケーションです。

## ディレクトリ構造

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

## 使用方法

以下のコマンドを実行して、ポケモンの情報を取得してください。

``` bash
javac -d bin -cp lib/gson-2.8.9.jar src/Main.java src/Pokemon/GetPokemon.java src/Pokemon/PokeApi.java src/Pokemon/PokemonModel.java
java -cp bin:lib/gson-2.8.9.jar Main <pokemon_id>
```

## 参考文献

- [PokeAPI公式サイト](https://pokeapi.co/)
- [Gsonライブラリ公式ドキュメント](https://github.com/google/gson/blob/master/UserGuide.md)
