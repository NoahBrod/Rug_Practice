package com.example.urban_rug_finds.rug;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/rug")
public class RugRest {
    @Autowired
    private RugService rugService;

    @GetMapping("/rugs")
    public List<Rug> getRugs() {
        return rugService.getRugs();
    }

    @PostMapping("/addRug")
    public void addRug(@RequestParam("file") MultipartFile file, @RequestParam("price")double price) throws IOException {
        // System.out.println(rug.toString());
        // byte[] image = Base64
        System.out.println(file);
        Rug rug = new Rug();
        rug.setImage(file.getBytes());
        rug.setPrice(price);
        rugService.saveRug(rug);
    }
    
}
