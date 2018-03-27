package com.gkatzioura.design.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class FederatedSearchResult implements SearchResult {

    private List<String> pages = new ArrayList<String>();

    public FederatedSearchResult(List<String> pages) {
        this.pages = pages;
    }

    @Override
    public SearchResult clone() {

        final List<String> resultCopies = new ArrayList<String>();
        pages.forEach(p->resultCopies.add(p));
        FederatedSearchResult federatedSearchResult = new FederatedSearchResult(resultCopies);
        return federatedSearchResult;
    }

    @Override
    public int totalEntries() {
        return pages.size();
    }

    @Override
    public String getPage(int page) {
        return pages.get(page);
    }


}
