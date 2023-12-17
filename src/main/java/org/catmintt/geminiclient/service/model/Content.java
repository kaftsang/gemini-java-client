package org.catmintt.geminiclient.service.model;

import java.util.List;

public class Content {

    private List<Part> parts;

    private String role;

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
