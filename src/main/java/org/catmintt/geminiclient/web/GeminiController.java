package org.catmintt.geminiclient.web;

import org.catmintt.geminiclient.service.GeminiService;
import org.catmintt.geminiclient.service.model.Content;
import org.catmintt.geminiclient.service.model.GeminiRequest;
import org.catmintt.geminiclient.service.model.GeminiResponse;
import org.catmintt.geminiclient.service.model.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@RestController
@RequestMapping("api/gemini")
public class GeminiController {

    @Autowired
    GeminiService geminiService;

    @GetMapping("textOnlyInput")
    public Mono<GeminiResponse> textOnlyInput(@RequestParam String prompt) {
        GeminiRequest request = new GeminiRequest();
        request.setContents(new ArrayList<>());
        request.getContents().add(new Content());
        request.getContents().get(0).setParts(new ArrayList<>());
        request.getContents().get(0).getParts().add(new Part());
        request.getContents().get(0).getParts().get(0).setText(prompt);
        return geminiService.textOnlyInput(request);
    }

}
