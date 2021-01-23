package dev.dosha.plugin.java;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class JavaLanguage extends Language {

    public static final JavaLanguage INSTANCE = new JavaLanguage();

    protected JavaLanguage() {
        super("Java");
    }

    public JavaLanguage(@NotNull String ID) {
        super(ID);
    }
}
