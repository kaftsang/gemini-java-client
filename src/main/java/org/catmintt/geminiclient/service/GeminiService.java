package org.catmintt.geminiclient.service;

import org.catmintt.geminiclient.service.model.GeminiRequest;
import org.catmintt.geminiclient.service.model.GeminiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class GeminiService {

    private static final String BASE_URL = "https://generativelanguage.googleapis.com";

    private static final String TEXT_ONLY_INPUT_URL = BASE_URL + "/v1beta/models/gemini-pro:generateContent";

    @Value("${gemini.api.key}")
    private String API_KEY;

    @Autowired
    WebClient webClient;

    public Mono<GeminiResponse> textOnlyInput(GeminiRequest request) {
        String url = TEXT_ONLY_INPUT_URL + "?key=" + API_KEY;
        return webClient.post()
                .uri(url)
                .header("Content-Type", "application/json")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(GeminiResponse.class);
    }

    public String textAndImageInput(GeminiRequest request) {
        return null;
    }

    public String chat(GeminiRequest request) {
        return null;
    }

    public String configuration(GeminiRequest request) {
        return null;
    }

    public String streamGenerateContent(GeminiRequest request) {
        return null;
    }

    public String countTokens(GeminiRequest request) {
        return null;
    }

    public String embedding(GeminiRequest request) {
        return null;
    }

    public String getModel(GeminiRequest request) {
        return null;
    }

    public String listModels(GeminiRequest request) {
        return null;
    }
}
