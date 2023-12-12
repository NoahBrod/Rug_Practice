package com.example.urban_rug_finds.rug;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


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
    public void addRug(@RequestBody Rug rug) {
        rugService.saveRug(rug);
    }
    
}
