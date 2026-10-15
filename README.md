# Screenmatch

Java console application that searches movies and series by title using the
[OMDb API](https://www.omdbapi.com/), converts the JSON response into Java
objects, and saves the search results to a file.

## Features
- Search any title interactively; type `sair` to exit
- Fetches movie/series data from the OMDb API using `HttpClient`
- Parses JSON into Java objects with Gson
- Models titles with OOP classes (`Titulo`, `TituloOmdb`)
- Saves all searched titles to `filmes.json`
- URL-encodes the search text, so titles with spaces, accents and special
  characters work (e.g. "Star Wars", "Amélie")
- Handles invalid input and conversion errors without crashing

## Tech
Java 23 · Gson · Java `HttpClient` · IntelliJ IDEA · Git/GitHub

## How to run
1. Clone the repo:
   `git clone https://github.com/Joao-Healy/Screenmatch.git`
2. Get a free API key at https://www.omdbapi.com/apikey.aspx
3. Set the key as an environment variable named `API_KEY`
   (in IntelliJ: Run > Edit Configurations > Environment variables >
   `API_KEY=your_key`)
4. Run `PrincipalBusca` and type a title to search

The key is read from the environment and is never stored in the code.

## What I learned
- Designing classes with OOP and Java records
- Consuming a REST API with `HttpClient` and parsing JSON with Gson
- Writing results to a file
- Debugging: fixed a crash on titles containing spaces by URL-encoding the
  input with `URLEncoder`
- Keeping secrets out of source control (environment variables + `.gitignore`)
