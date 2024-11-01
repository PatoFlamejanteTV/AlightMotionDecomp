package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    public static final Paragraph ActualParagraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i8, boolean z8, float f8, Density density, Font.ResourceLoader resourceLoader) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), density), i8, z8, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f8), 0, 0, 13, null), null);
    }

    /* renamed from: ActualParagraph--hBUhpc, reason: not valid java name */
    public static final Paragraph m4917ActualParagraphhBUhpc(ParagraphIntrinsics paragraphIntrinsics, int i8, boolean z8, long j8) {
        AbstractC3292y.g(paragraphIntrinsics, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i8, z8, j8, null);
    }

    /* renamed from: ActualParagraph-O3s9Psw, reason: not valid java name */
    public static final Paragraph m4918ActualParagraphO3s9Psw(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i8, boolean z8, long j8, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i8, z8, j8, null);
    }
}
