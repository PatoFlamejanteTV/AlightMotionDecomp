package androidx.core.text;

import android.text.Html;
import android.text.Spanned;

/* loaded from: classes3.dex */
public final class HtmlKt {
    public static final Spanned parseAsHtml(String str, int i8, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return HtmlCompat.fromHtml(str, i8, imageGetter, tagHandler);
    }

    public static /* synthetic */ Spanned parseAsHtml$default(String str, int i8, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        if ((i9 & 2) != 0) {
            imageGetter = null;
        }
        if ((i9 & 4) != 0) {
            tagHandler = null;
        }
        return HtmlCompat.fromHtml(str, i8, imageGetter, tagHandler);
    }

    public static final String toHtml(Spanned spanned, int i8) {
        return HtmlCompat.toHtml(spanned, i8);
    }

    public static /* synthetic */ String toHtml$default(Spanned spanned, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return HtmlCompat.toHtml(spanned, i8);
    }
}
