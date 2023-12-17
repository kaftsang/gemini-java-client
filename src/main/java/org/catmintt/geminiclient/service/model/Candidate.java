package org.catmintt.geminiclient.service.model;

import java.util.List;

public class Candidate {

    private Content content;

    private String finishReason;

    private Integer index;

    private List<SafetyRating> safetyRatings;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public List<SafetyRating> getSafetyRatings() {
        return safetyRatings;
    }

    public void setSafetyRatings(List<SafetyRating> safetyRatings) {
        this.safetyRatings = safetyRatings;
    }
}
