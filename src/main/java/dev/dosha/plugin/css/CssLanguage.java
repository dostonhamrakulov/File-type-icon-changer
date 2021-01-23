package dev.dosha.plugin.css;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class CssLanguage extends Language {

    public static final CssLanguage INSTANCE = new CssLanguage();

    protected CssLanguage() {
        super("CUSTOM_CSS");
    }

    public CssLanguage(@NotNull String ID) {
        super(ID);
    }
}
