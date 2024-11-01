package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class Typography {
    public static final int $stable = 0;
    private final TextStyle body1;
    private final TextStyle body2;
    private final TextStyle button;
    private final TextStyle caption;

    /* renamed from: h1, reason: collision with root package name */
    private final TextStyle f14417h1;

    /* renamed from: h2, reason: collision with root package name */
    private final TextStyle f14418h2;

    /* renamed from: h3, reason: collision with root package name */
    private final TextStyle f14419h3;

    /* renamed from: h4, reason: collision with root package name */
    private final TextStyle f14420h4;

    /* renamed from: h5, reason: collision with root package name */
    private final TextStyle f14421h5;

    /* renamed from: h6, reason: collision with root package name */
    private final TextStyle f14422h6;
    private final TextStyle overline;
    private final TextStyle subtitle1;
    private final TextStyle subtitle2;

    public Typography(TextStyle h12, TextStyle h22, TextStyle h32, TextStyle h42, TextStyle h52, TextStyle h62, TextStyle subtitle1, TextStyle subtitle2, TextStyle body1, TextStyle body2, TextStyle button, TextStyle caption, TextStyle overline) {
        AbstractC3292y.i(h12, "h1");
        AbstractC3292y.i(h22, "h2");
        AbstractC3292y.i(h32, "h3");
        AbstractC3292y.i(h42, "h4");
        AbstractC3292y.i(h52, "h5");
        AbstractC3292y.i(h62, "h6");
        AbstractC3292y.i(subtitle1, "subtitle1");
        AbstractC3292y.i(subtitle2, "subtitle2");
        AbstractC3292y.i(body1, "body1");
        AbstractC3292y.i(body2, "body2");
        AbstractC3292y.i(button, "button");
        AbstractC3292y.i(caption, "caption");
        AbstractC3292y.i(overline, "overline");
        this.f14417h1 = h12;
        this.f14418h2 = h22;
        this.f14419h3 = h32;
        this.f14420h4 = h42;
        this.f14421h5 = h52;
        this.f14422h6 = h62;
        this.subtitle1 = subtitle1;
        this.subtitle2 = subtitle2;
        this.body1 = body1;
        this.body2 = body2;
        this.button = button;
        this.caption = caption;
        this.overline = overline;
    }

    public static /* synthetic */ Typography copy$default(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i8, Object obj) {
        TextStyle textStyle14;
        TextStyle textStyle15;
        TextStyle textStyle16;
        TextStyle textStyle17;
        TextStyle textStyle18;
        TextStyle textStyle19;
        TextStyle textStyle20;
        TextStyle textStyle21;
        TextStyle textStyle22;
        TextStyle textStyle23;
        TextStyle textStyle24;
        TextStyle textStyle25;
        TextStyle textStyle26;
        if ((i8 & 1) != 0) {
            textStyle14 = typography.f14417h1;
        } else {
            textStyle14 = textStyle;
        }
        if ((i8 & 2) != 0) {
            textStyle15 = typography.f14418h2;
        } else {
            textStyle15 = textStyle2;
        }
        if ((i8 & 4) != 0) {
            textStyle16 = typography.f14419h3;
        } else {
            textStyle16 = textStyle3;
        }
        if ((i8 & 8) != 0) {
            textStyle17 = typography.f14420h4;
        } else {
            textStyle17 = textStyle4;
        }
        if ((i8 & 16) != 0) {
            textStyle18 = typography.f14421h5;
        } else {
            textStyle18 = textStyle5;
        }
        if ((i8 & 32) != 0) {
            textStyle19 = typography.f14422h6;
        } else {
            textStyle19 = textStyle6;
        }
        if ((i8 & 64) != 0) {
            textStyle20 = typography.subtitle1;
        } else {
            textStyle20 = textStyle7;
        }
        if ((i8 & 128) != 0) {
            textStyle21 = typography.subtitle2;
        } else {
            textStyle21 = textStyle8;
        }
        if ((i8 & 256) != 0) {
            textStyle22 = typography.body1;
        } else {
            textStyle22 = textStyle9;
        }
        if ((i8 & 512) != 0) {
            textStyle23 = typography.body2;
        } else {
            textStyle23 = textStyle10;
        }
        if ((i8 & 1024) != 0) {
            textStyle24 = typography.button;
        } else {
            textStyle24 = textStyle11;
        }
        if ((i8 & 2048) != 0) {
            textStyle25 = typography.caption;
        } else {
            textStyle25 = textStyle12;
        }
        if ((i8 & 4096) != 0) {
            textStyle26 = typography.overline;
        } else {
            textStyle26 = textStyle13;
        }
        return typography.copy(textStyle14, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26);
    }

    public final Typography copy(TextStyle h12, TextStyle h22, TextStyle h32, TextStyle h42, TextStyle h52, TextStyle h62, TextStyle subtitle1, TextStyle subtitle2, TextStyle body1, TextStyle body2, TextStyle button, TextStyle caption, TextStyle overline) {
        AbstractC3292y.i(h12, "h1");
        AbstractC3292y.i(h22, "h2");
        AbstractC3292y.i(h32, "h3");
        AbstractC3292y.i(h42, "h4");
        AbstractC3292y.i(h52, "h5");
        AbstractC3292y.i(h62, "h6");
        AbstractC3292y.i(subtitle1, "subtitle1");
        AbstractC3292y.i(subtitle2, "subtitle2");
        AbstractC3292y.i(body1, "body1");
        AbstractC3292y.i(body2, "body2");
        AbstractC3292y.i(button, "button");
        AbstractC3292y.i(caption, "caption");
        AbstractC3292y.i(overline, "overline");
        return new Typography(h12, h22, h32, h42, h52, h62, subtitle1, subtitle2, body1, body2, button, caption, overline);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        if (AbstractC3292y.d(this.f14417h1, typography.f14417h1) && AbstractC3292y.d(this.f14418h2, typography.f14418h2) && AbstractC3292y.d(this.f14419h3, typography.f14419h3) && AbstractC3292y.d(this.f14420h4, typography.f14420h4) && AbstractC3292y.d(this.f14421h5, typography.f14421h5) && AbstractC3292y.d(this.f14422h6, typography.f14422h6) && AbstractC3292y.d(this.subtitle1, typography.subtitle1) && AbstractC3292y.d(this.subtitle2, typography.subtitle2) && AbstractC3292y.d(this.body1, typography.body1) && AbstractC3292y.d(this.body2, typography.body2) && AbstractC3292y.d(this.button, typography.button) && AbstractC3292y.d(this.caption, typography.caption) && AbstractC3292y.d(this.overline, typography.overline)) {
            return true;
        }
        return false;
    }

    public final TextStyle getBody1() {
        return this.body1;
    }

    public final TextStyle getBody2() {
        return this.body2;
    }

    public final TextStyle getButton() {
        return this.button;
    }

    public final TextStyle getCaption() {
        return this.caption;
    }

    public final TextStyle getH1() {
        return this.f14417h1;
    }

    public final TextStyle getH2() {
        return this.f14418h2;
    }

    public final TextStyle getH3() {
        return this.f14419h3;
    }

    public final TextStyle getH4() {
        return this.f14420h4;
    }

    public final TextStyle getH5() {
        return this.f14421h5;
    }

    public final TextStyle getH6() {
        return this.f14422h6;
    }

    public final TextStyle getOverline() {
        return this.overline;
    }

    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    public final TextStyle getSubtitle2() {
        return this.subtitle2;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f14417h1.hashCode() * 31) + this.f14418h2.hashCode()) * 31) + this.f14419h3.hashCode()) * 31) + this.f14420h4.hashCode()) * 31) + this.f14421h5.hashCode()) * 31) + this.f14422h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.f14417h1 + ", h2=" + this.f14418h2 + ", h3=" + this.f14419h3 + ", h4=" + this.f14420h4 + ", h5=" + this.f14421h5 + ", h6=" + this.f14422h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Typography(androidx.compose.ui.text.font.FontFamily r48, androidx.compose.ui.text.TextStyle r49, androidx.compose.ui.text.TextStyle r50, androidx.compose.ui.text.TextStyle r51, androidx.compose.ui.text.TextStyle r52, androidx.compose.ui.text.TextStyle r53, androidx.compose.ui.text.TextStyle r54, androidx.compose.ui.text.TextStyle r55, androidx.compose.ui.text.TextStyle r56, androidx.compose.ui.text.TextStyle r57, androidx.compose.ui.text.TextStyle r58, androidx.compose.ui.text.TextStyle r59, androidx.compose.ui.text.TextStyle r60, androidx.compose.ui.text.TextStyle r61, int r62, kotlin.jvm.internal.AbstractC3284p r63) {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, int, kotlin.jvm.internal.p):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Typography(androidx.compose.ui.text.font.FontFamily r2, androidx.compose.ui.text.TextStyle r3, androidx.compose.ui.text.TextStyle r4, androidx.compose.ui.text.TextStyle r5, androidx.compose.ui.text.TextStyle r6, androidx.compose.ui.text.TextStyle r7, androidx.compose.ui.text.TextStyle r8, androidx.compose.ui.text.TextStyle r9, androidx.compose.ui.text.TextStyle r10, androidx.compose.ui.text.TextStyle r11, androidx.compose.ui.text.TextStyle r12, androidx.compose.ui.text.TextStyle r13, androidx.compose.ui.text.TextStyle r14, androidx.compose.ui.text.TextStyle r15) {
        /*
            r1 = this;
            java.lang.String r0 = "defaultFontFamily"
            kotlin.jvm.internal.AbstractC3292y.i(r2, r0)
            java.lang.String r0 = "h1"
            kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
            java.lang.String r0 = "h2"
            kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
            java.lang.String r0 = "h3"
            kotlin.jvm.internal.AbstractC3292y.i(r5, r0)
            java.lang.String r0 = "h4"
            kotlin.jvm.internal.AbstractC3292y.i(r6, r0)
            java.lang.String r0 = "h5"
            kotlin.jvm.internal.AbstractC3292y.i(r7, r0)
            java.lang.String r0 = "h6"
            kotlin.jvm.internal.AbstractC3292y.i(r8, r0)
            java.lang.String r0 = "subtitle1"
            kotlin.jvm.internal.AbstractC3292y.i(r9, r0)
            java.lang.String r0 = "subtitle2"
            kotlin.jvm.internal.AbstractC3292y.i(r10, r0)
            java.lang.String r0 = "body1"
            kotlin.jvm.internal.AbstractC3292y.i(r11, r0)
            java.lang.String r0 = "body2"
            kotlin.jvm.internal.AbstractC3292y.i(r12, r0)
            java.lang.String r0 = "button"
            kotlin.jvm.internal.AbstractC3292y.i(r13, r0)
            java.lang.String r0 = "caption"
            kotlin.jvm.internal.AbstractC3292y.i(r14, r0)
            java.lang.String r0 = "overline"
            kotlin.jvm.internal.AbstractC3292y.i(r15, r0)
            androidx.compose.ui.text.TextStyle r3 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r3, r2)
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r4, r2)
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r5, r2)
            androidx.compose.ui.text.TextStyle r6 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r6, r2)
            androidx.compose.ui.text.TextStyle r7 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r7, r2)
            androidx.compose.ui.text.TextStyle r8 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r8, r2)
            androidx.compose.ui.text.TextStyle r9 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r9, r2)
            androidx.compose.ui.text.TextStyle r10 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r10, r2)
            androidx.compose.ui.text.TextStyle r11 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r11, r2)
            androidx.compose.ui.text.TextStyle r12 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r12, r2)
            androidx.compose.ui.text.TextStyle r13 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r13, r2)
            androidx.compose.ui.text.TextStyle r14 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r14, r2)
            androidx.compose.ui.text.TextStyle r15 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r15, r2)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle):void");
    }
}
