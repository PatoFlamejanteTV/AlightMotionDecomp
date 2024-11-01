package androidx.compose.ui.text.font;

import R5.AbstractC1428l;
import androidx.compose.runtime.Stable;
import java.util.List;

/* loaded from: classes.dex */
public final class FontFamilyKt {
    @Stable
    public static final FontFamily FontFamily(List<? extends Font> list) {
        return new FontListFontFamily(list);
    }

    @Stable
    public static final FontFamily FontFamily(Font... fontArr) {
        return new FontListFontFamily(AbstractC1428l.c(fontArr));
    }

    @Stable
    public static final FontFamily FontFamily(Typeface typeface) {
        return new LoadedFontFamily(typeface);
    }
}
