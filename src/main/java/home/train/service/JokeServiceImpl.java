package home.train.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes joke;


    public JokeServiceImpl() {
        this.joke = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke() {

        return joke.getRandomQuote();
    }
}
