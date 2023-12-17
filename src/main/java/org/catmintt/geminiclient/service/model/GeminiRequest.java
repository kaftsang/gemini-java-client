package org.catmintt.geminiclient.service.model;

import java.util.List;

public class GeminiRequest {

    private List<Content> contents;

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }
}
