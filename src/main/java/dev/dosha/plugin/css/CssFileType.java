package dev.dosha.plugin.css;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class CssFileType extends LanguageFileType {

    public static final CssFileType INSTANCE = new CssFileType();

    private CssFileType() {
        super(CssLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "CSS file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "CSS file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "css";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CssIcon.ICON;
    }
}
