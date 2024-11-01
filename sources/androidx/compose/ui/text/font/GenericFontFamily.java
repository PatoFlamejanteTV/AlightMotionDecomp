package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class GenericFontFamily extends SystemFontFamily {
    public static final int $stable = 0;
    private final String fontFamilyName;
    private final String name;

    public GenericFontFamily(String str, String str2) {
        super(null);
        this.name = str;
        this.fontFamilyName = str2;
    }

    public final String getName() {
        return this.name;
    }

    public String toString() {
        return this.fontFamilyName;
    }
}
