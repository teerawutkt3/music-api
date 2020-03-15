package com.example.demo.music.servinc;

import com.example.demo.music.entities.Music;
import com.example.demo.music.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public List<Music> findAll(){
        return musicRepository.findAll();
    }
    public Music findAllById(long id){
        return musicRepository.findById(id).get();
    }
    public Music save(Music music){
        return musicRepository.save(music);
    }
    public void delete(long id){
        musicRepository.deleteById(id);
    }
}
