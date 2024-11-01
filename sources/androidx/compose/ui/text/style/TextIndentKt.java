package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;

/* loaded from: classes.dex */
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f8) {
        return new TextIndent(SpanStyleKt.m4634lerpTextUnitInheritableC3pnCVY(textIndent.m5083getFirstLineXSAIIZE(), textIndent2.m5083getFirstLineXSAIIZE(), f8), SpanStyleKt.m4634lerpTextUnitInheritableC3pnCVY(textIndent.m5084getRestLineXSAIIZE(), textIndent2.m5084getRestLineXSAIIZE(), f8), null);
    }
}
