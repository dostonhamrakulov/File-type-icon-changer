package dev.dosha.plugin.html;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class HtmlLanguage extends Language {

    public static final HtmlLanguage INSTANCE = new HtmlLanguage();

    protected HtmlLanguage() {
        super("CUSTOM_HTML");
    }

    public HtmlLanguage(@NotNull String ID) {
        super(ID);
    }
}
