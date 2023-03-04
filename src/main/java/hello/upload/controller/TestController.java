package hello.upload.controller;

import hello.upload.file.FileStore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.UrlResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TestController {
    private final FileStore fileStore;

    @ResponseBody
    @GetMapping("testing")
    public URL downloadImage() throws IOException {
        UrlResource resource = new UrlResource("file:" + fileStore.getFullPath("profile.png"));

//        return resource.getURI();
        return resource.getURL();
//        return "http://localhost:8080" + fileStore.getFullPath("profile.png");
    }
}
