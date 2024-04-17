package org.example;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.AnchorTarget;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        Button button = new Button("Click me",
                event -> UI.getCurrent().getPage().open("/html/page1.html", "_blank"));

        add(button);
        Anchor anchor = new Anchor("/html/page1.html", "Page 1", AnchorTarget.BLANK);
        add(anchor);
    }
}
