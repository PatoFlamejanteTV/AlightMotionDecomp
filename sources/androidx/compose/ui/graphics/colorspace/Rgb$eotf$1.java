package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Rgb$eotf$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Rgb this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$eotf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }

    public final Double invoke(double d8) {
        float f8;
        float f9;
        DoubleFunction eotfOrig$ui_graphics_release = this.this$0.getEotfOrig$ui_graphics_release();
        f8 = this.this$0.min;
        double d9 = f8;
        f9 = this.this$0.max;
        return Double.valueOf(eotfOrig$ui_graphics_release.invoke(i6.m.i(d8, d9, f9)));
    }
}
