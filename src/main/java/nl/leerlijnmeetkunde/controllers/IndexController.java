package nl.leerlijnmeetkunde.controllers;

import nl.leerlijnmeetkunde.domain.Post;
import nl.leerlijnmeetkunde.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;

import java.util.ArrayList;

@Controller
public class IndexController {

    @Autowired
    PostRepository postRepository;

    @RequestMapping("/")
    public String index(Model model) {
        Parser parser = Parser.builder().build();
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        ArrayList<String> htmlArticles = new ArrayList<>();

        for (Post post : postRepository.findAllByOrderByDateDesc()) {
            Node document = parser.parse(post.getContent());
            htmlArticles.add(renderer.render(document));
        }
        model.addAttribute("htmltest", htmlArticles);
        return "index";
    }
}