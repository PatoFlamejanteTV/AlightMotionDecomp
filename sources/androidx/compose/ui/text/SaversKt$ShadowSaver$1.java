package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$ShadowSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$ShadowSaver$1 INSTANCE = new SaversKt$ShadowSaver$1();

    SaversKt$ShadowSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, Shadow shadow) {
        return AbstractC1435t.g(SaversKt.save(Color.m2938boximpl(shadow.m3250getColor0d7_KjU()), SaversKt.getSaver(Color.Companion), saverScope), SaversKt.save(Offset.m2701boximpl(shadow.m3251getOffsetF1C5BW0()), SaversKt.getSaver(Offset.Companion), saverScope), SaversKt.save(Float.valueOf(shadow.getBlurRadius())));
    }
}
