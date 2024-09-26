package org.teama.enums;

public enum Messages {
    HOME_PAGE_TEXT("Hot Products"),
    SC_PAYMENT_TEXT("Your order is complete!");

    private final String text;

    Messages(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
