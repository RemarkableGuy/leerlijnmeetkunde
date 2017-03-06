package nl.leerlijnmeetkunde.services;

import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import nl.leerlijnmeetkunde.domain.Post;
import nl.leerlijnmeetkunde.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Service
public class MarkdownService {

    private final PostRepository postRepository;

    @Autowired
    public MarkdownService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void getData(Model model) {
        Parser parser = Parser.builder().build();
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        ArrayList<String> htmlArticles = new ArrayList<>();

        for (Post post : postRepository.findAllByOrderByDateDesc()) {
            Node document = parser.parse(post.getContent());
            htmlArticles.add(renderer.render(document));
        }
        model.addAttribute("posts", htmlArticles);
    }
}