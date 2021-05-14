package ru.netology.phonemissedcalls;

public enum Group {
    WORK("work"),
    FRIENDS("friends"),
    FAMILY("family");

    private String text;

    Group(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static Group fromString(String text) {
        for (Group b : Group.values()) {
            if (b.text.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
