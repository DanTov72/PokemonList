package com.example.pokemonlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pokemonlist.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    PokemonAdapter pokemonAdapter;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<String> list = new ArrayList<>();
        list.add("https://media.mstdn.io/mstdn-media/media_attachments/files/001/330/308/original/d3f1679f139eff2b.jpg");
        list.add("https://i.pinimg.com/736x/a9/8f/ac/a98fac1f85e2ea5c12bbc523b59cda2e.jpg");
        list.add("https://avatars.mds.yandex.net/i?id=4ba74bdc27a61f539e6e8565f1ca899d-7043127-images-thumbs&n=13");
        list.add("https://www.pidgi.net/wiki/images/3/37/Wartortle_-_Pokemon_anime.png");
        list.add("https://static.zerochan.net/Shinx.full.977709.jpg");
        list.add("https://i.pinimg.com/originals/08/81/e2/0881e29b386c176bc56fd4bfa55edf80.png");
        list.add("https://i.pinimg.com/originals/c9/97/5f/c9975fb71e94b1f42970829a457fd871.png");
        list.add("https://yt3.ggpht.com/ytc/AKedOLRqQwrFBkUa_ftv-Mmybik3qTlyd8sbYdVbP8ZhJA=s900-c-k-c0x00ffffff-no-rj");
        list.add("https://i.pinimg.com/originals/c9/d6/f0/c9d6f0767fc2940ebe5ff1f8a0a24c75.png");
        list.add("https://i.pinimg.com/originals/e7/d7/99/e7d799f746581f46ccb70484a2e7f47e.jpg");

        pokemonAdapter = new PokemonAdapter(list);

        binding.recyclerPokemon.setAdapter(pokemonAdapter);
    }
}