package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;

/* loaded from: classes.dex */
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    public static final Paragraph Paragraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i8, boolean z8, float f8, Density density, Font.ResourceLoader resourceLoader) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.ActualParagraph(str, textStyle, list, list2, i8, z8, f8, density, resourceLoader);
    }

    /* renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final Paragraph m4560ParagraphUdtVg6A(String str, TextStyle textStyle, long j8, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i8, boolean z8) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m4918ActualParagraphO3s9Psw(str, textStyle, list, list2, i8, z8, j8, density, resolver);
    }

    /* renamed from: Paragraph-UdtVg6A$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m4561ParagraphUdtVg6A$default(String str, TextStyle textStyle, long j8, Density density, FontFamily.Resolver resolver, List list, List list2, int i8, boolean z8, int i9, Object obj) {
        List list3;
        List list4;
        int i10;
        boolean z9;
        if ((i9 & 32) != 0) {
            list3 = AbstractC1435t.m();
        } else {
            list3 = list;
        }
        if ((i9 & 64) != 0) {
            list4 = AbstractC1435t.m();
        } else {
            list4 = list2;
        }
        if ((i9 & 128) != 0) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = i8;
        }
        if ((i9 & 256) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        return m4560ParagraphUdtVg6A(str, textStyle, j8, density, resolver, list3, list4, i10, z9);
    }

    /* renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final Paragraph m4562Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long j8, int i8, boolean z8) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m4917ActualParagraphhBUhpc(paragraphIntrinsics, i8, z8, j8);
    }

    /* renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m4563Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j8, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        if ((i9 & 8) != 0) {
            z8 = false;
        }
        return m4562Paragraph_EkL_Y(paragraphIntrinsics, j8, i8, z8);
    }

    public static final int ceilToInt(float f8) {
        return (int) Math.ceil(f8);
    }

    public static final Paragraph Paragraph(String str, TextStyle textStyle, float f8, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i8, boolean z8) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m4918ActualParagraphO3s9Psw(str, textStyle, list, list2, i8, z8, ConstraintsKt.Constraints$default(0, ceilToInt(f8), 0, 0, 13, null), density, resolver);
    }

    public static final Paragraph Paragraph(ParagraphIntrinsics paragraphIntrinsics, int i8, boolean z8, float f8) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m4917ActualParagraphhBUhpc(paragraphIntrinsics, i8, z8, ConstraintsKt.Constraints$default(0, ceilToInt(f8), 0, 0, 13, null));
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i8, boolean z8, float f8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return Paragraph(paragraphIntrinsics, i8, z8, f8);
    }
}
