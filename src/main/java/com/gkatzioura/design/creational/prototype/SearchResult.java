package com.gkatzioura.design.creational.prototype;

public interface SearchResult {

    SearchResult clone();

    int totalEntries();

    String getPage(int page);
}
