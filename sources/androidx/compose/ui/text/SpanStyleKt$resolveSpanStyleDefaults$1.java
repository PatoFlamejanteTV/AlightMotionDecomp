package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextForegroundStyle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SpanStyleKt$resolveSpanStyleDefaults$1 extends AbstractC3293z implements Function0 {
    public static final SpanStyleKt$resolveSpanStyleDefaults$1 INSTANCE = new SpanStyleKt$resolveSpanStyleDefaults$1();

    SpanStyleKt$resolveSpanStyleDefaults$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextForegroundStyle invoke() {
        long j8;
        TextForegroundStyle.Companion companion = TextForegroundStyle.Companion;
        j8 = SpanStyleKt.DefaultColor;
        return companion.m5080from8_81llA(j8);
    }
}
