package com.gkatzioura.design.structural.adapter;

import java.util.List;

public interface Notifier {

    void notify(List<String> recipients, String message);

}
