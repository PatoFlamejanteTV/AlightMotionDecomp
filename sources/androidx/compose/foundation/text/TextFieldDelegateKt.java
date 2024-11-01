package androidx.compose.foundation.text;

import R5.AbstractC1435t;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes.dex */
public final class TextFieldDelegateKt {
    public static final int DefaultWidthCharCount = 10;
    private static final String EmptyTextReplacement = n.v("H", 10);

    public static final long computeSizeForDefaultText(TextStyle style, Density density, FontFamily.Resolver fontFamilyResolver, String text, int i8) {
        AbstractC3292y.i(style, "style");
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        AbstractC3292y.i(text, "text");
        Paragraph m4561ParagraphUdtVg6A$default = ParagraphKt.m4561ParagraphUdtVg6A$default(text, style, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), density, fontFamilyResolver, AbstractC1435t.m(), null, i8, false, 64, null);
        return IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(m4561ParagraphUdtVg6A$default.getMinIntrinsicWidth()), TextDelegateKt.ceilToIntPx(m4561ParagraphUdtVg6A$default.getHeight()));
    }

    public static /* synthetic */ long computeSizeForDefaultText$default(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i8, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            str = EmptyTextReplacement;
        }
        if ((i9 & 16) != 0) {
            i8 = 1;
        }
        return computeSizeForDefaultText(textStyle, density, resolver, str, i8);
    }

    public static final String getEmptyTextReplacement() {
        return EmptyTextReplacement;
    }
}
