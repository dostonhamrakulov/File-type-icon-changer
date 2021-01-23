package dev.dosha.plugin.html;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class HtmlFileType extends LanguageFileType {

    public static final HtmlFileType INSTANCE = new HtmlFileType();

    private HtmlFileType() {
        super(HtmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "HTML file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "HTML file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "html";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return HtmlIcon.ICON;
    }
}
