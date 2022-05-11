package com.example.mod5_hom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class DuneController {
    RestTemplate restTemplate = new RestTemplate();

    //@EventListener(ApplicationReadyEvent.class)
    public DuneModel[] getDune() {


        DuneModel[] duneModel = restTemplate.getForObject("https://the-dune-api.herokuapp" +
                ".com/books/3", DuneModel[].class);
        return duneModel;
    }

    @GetMapping("/dune")
    public String get(Model model) {
        List<DuneModel> duneModels = new ArrayList<>(Arrays.asList(getDune()));
        model.addAttribute("duneModels", duneModels);


        return "duneBook";
    }
}
