package home.train.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService{

    private final guru.springframework.norris.chuck.ChuckNorrisQuotes joke;

    public JokeServiceImpl(ChuckNorrisQuotes joke) {
        this.joke = joke;
    }

    @Override
    public String getRandomJoke() {

        return joke.getRandomQuote();
    }
}
