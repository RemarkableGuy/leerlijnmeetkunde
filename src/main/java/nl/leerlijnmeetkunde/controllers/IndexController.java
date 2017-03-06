package nl.leerlijnmeetkunde.controllers;

import nl.leerlijnmeetkunde.services.MarkdownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final MarkdownService markdownService;

    @Autowired
    public IndexController(MarkdownService markdownService) {
        this.markdownService = markdownService;
    }

    @RequestMapping("/")
    public String index(Model model) {
        markdownService.getData(model);
        return "index";
    }
}