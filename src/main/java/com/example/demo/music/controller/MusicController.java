package com.example.demo.music.controller;

import com.example.demo.common.beans.ResponseData;
import com.example.demo.common.constants.ProjectConstant;
import com.example.demo.common.utils.MessageUtil;
import com.example.demo.music.entities.Music;
import com.example.demo.music.servinc.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping("/")
    public ResponseData<List<Music>> findAll(){
        ResponseData<List<Music>> responseData = new ResponseData<>();
        try {
            List<Music> data = musicService.findAll();
            responseData.setData(data);
            MessageUtil.setMessageSuccess(responseData);
        }catch (Exception e){
            MessageUtil.setMessageFail(responseData);
        }
        return responseData;
}

    @GetMapping("/{id}")
    public ResponseData<Music> finnById(@PathVariable long id){
        ResponseData<Music> responseData = new ResponseData<>();
        try {
            Music data = musicService.findAllById(id);
            responseData.setData(data);
            MessageUtil.setMessageSuccess(responseData);
        }catch (Exception e){
            MessageUtil.setMessageFail(responseData);
        }
        return responseData;
    }

    @DeleteMapping("/{id}")
    public ResponseData<?> delete(@PathVariable long id){
        ResponseData<?> responseData = new ResponseData<>();
        try {
            musicService.delete(id);
            MessageUtil.setMessageSuccess(responseData, ProjectConstant.ResponseMessage.Delete.SUCCESS);
        }catch (Exception e){
            MessageUtil.setMessageFail(responseData,  ProjectConstant.ResponseMessage.Delete.FAILED);
        }
        return responseData;
    }

    @PostMapping("/")
    public ResponseData<Music> save(@RequestBody Music music){
        ResponseData<Music> responseData = new ResponseData<>();
        try {
            Music data = musicService.save(music);
            responseData.setData(data);
            MessageUtil.setMessageSuccess(responseData);
        }catch (Exception e){
            MessageUtil.setMessageFail(responseData);
        }
        return responseData;
    }
}
