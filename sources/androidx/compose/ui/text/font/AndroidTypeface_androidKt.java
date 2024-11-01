package androidx.compose.ui.text.font;

import Q5.p;
import Q5.r;
import android.content.Context;
import androidx.compose.ui.text.platform.AndroidDefaultTypeface;
import androidx.compose.ui.text.platform.AndroidFontListTypeface;
import androidx.compose.ui.text.platform.AndroidGenericFontFamilyTypeface;
import androidx.compose.ui.text.platform.AndroidTypefaceWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class AndroidTypeface_androidKt {
    public static final FontFamily FontFamily(android.graphics.Typeface typeface) {
        return FontFamilyKt.FontFamily(Typeface(typeface));
    }

    public static final Typeface Typeface(Context context, FontFamily fontFamily, List<r> list) {
        if (fontFamily instanceof FontListFontFamily) {
            return new AndroidFontListTypeface((FontListFontFamily) fontFamily, context, list, null, 8, null);
        }
        if (fontFamily instanceof GenericFontFamily) {
            return new AndroidGenericFontFamilyTypeface((GenericFontFamily) fontFamily);
        }
        if (fontFamily instanceof DefaultFontFamily) {
            return new AndroidDefaultTypeface();
        }
        if (fontFamily instanceof LoadedFontFamily) {
            return ((LoadedFontFamily) fontFamily).getTypeface();
        }
        throw new p();
    }

    public static /* synthetic */ Typeface Typeface$default(Context context, FontFamily fontFamily, List list, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            list = null;
        }
        return Typeface(context, fontFamily, list);
    }

    public static final Typeface Typeface(android.graphics.Typeface typeface) {
        return new AndroidTypefaceWrapper(typeface);
    }
}
