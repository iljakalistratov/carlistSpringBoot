package de.ilja.carlist.controller;

import de.ilja.carlist.car.Model;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ModelController {

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/carlist",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Model getModel() {

        List characteristics = new ArrayList<String>();
        characteristics.add("250" + " PS");
        characteristics.add("Verbrauch: " + "8" + " Liter/100km");

        String marke = "Audi";
        String modelname = "A6 C7";

        Model model = new Model(marke, modelname, characteristics);

        return model;

    }

}
