package de.ilja.carlist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String mainPage() {
        StringBuilder htmlIndex = new StringBuilder();
        try {
            File htmlFile = new File("C:\\Users\\KALISI\\IdeaProjects\\carlist\\src\\main\\java\\de\\ilja\\carlist\\controller\\index.html");
            Scanner scanner = new Scanner(htmlFile);
            while (scanner.hasNext())
                htmlIndex.append(scanner.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return htmlIndex.toString();
    }

}
