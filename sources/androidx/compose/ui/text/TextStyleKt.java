package androidx.compose.ui.text;

import Q5.p;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class TextStyleKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PlatformTextStyle createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    public static final TextStyle lerp(TextStyle textStyle, TextStyle textStyle2, float f8) {
        return new TextStyle(SpanStyleKt.lerp(textStyle.toSpanStyle(), textStyle2.toSpanStyle(), f8), ParagraphStyleKt.lerp(textStyle.toParagraphStyle(), textStyle2.toParagraphStyle(), f8));
    }

    public static final TextStyle resolveDefaults(TextStyle textStyle, LayoutDirection layoutDirection) {
        return new TextStyle(SpanStyleKt.resolveSpanStyleDefaults(textStyle.getSpanStyle$ui_text_release()), ParagraphStyleKt.resolveParagraphStyleDefaults(textStyle.getParagraphStyle$ui_text_release(), layoutDirection), textStyle.getPlatformStyle());
    }

    /* renamed from: resolveTextDirection-IhaHGbI */
    public static final int m4715resolveTextDirectionIhaHGbI(LayoutDirection layoutDirection, int i8) {
        TextDirection.Companion companion = TextDirection.Companion;
        if (TextDirection.m5069equalsimpl0(i8, companion.m5073getContents_7Xco())) {
            int i9 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    return companion.m5075getContentOrRtls_7Xco();
                }
                throw new p();
            }
            return companion.m5074getContentOrLtrs_7Xco();
        }
        if (TextDirection.m5069equalsimpl0(i8, companion.m5078getUnspecifieds_7Xco())) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return companion.m5077getRtls_7Xco();
                }
                throw new p();
            }
            return companion.m5076getLtrs_7Xco();
        }
        return i8;
    }
}
