package com.example.test1228.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface PictureService {
    String uploadPic(MultipartFile multipartFile)throws IOException;
}
