package androidx.compose.foundation.text.selection;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextSelectionColorsKt$LocalTextSelectionColors$1 extends AbstractC3293z implements Function0 {
    public static final TextSelectionColorsKt$LocalTextSelectionColors$1 INSTANCE = new TextSelectionColorsKt$LocalTextSelectionColors$1();

    TextSelectionColorsKt$LocalTextSelectionColors$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextSelectionColors invoke() {
        TextSelectionColors textSelectionColors;
        textSelectionColors = TextSelectionColorsKt.DefaultTextSelectionColors;
        return textSelectionColors;
    }
}
