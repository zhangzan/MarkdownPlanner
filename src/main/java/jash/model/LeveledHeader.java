package jash.model;

import lombok.Value;

@Value
public class LeveledHeader {
    private int level;
    private String header;

    public String getDisplay() {
        return header;
    }
}