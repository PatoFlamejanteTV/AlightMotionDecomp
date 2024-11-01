package s4;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ModalBottomSheetDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import o4.AbstractC3539m;

/* renamed from: s4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3963e {
    public static final C3962d a(float f8, long j8, long j9, Composer composer, int i8, int i9) {
        float f9;
        long j10;
        long j11;
        composer.startReplaceableGroup(769413883);
        if ((i9 & 1) != 0) {
            f9 = Dp.m5155constructorimpl(AbstractC3539m.o(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).e());
        } else {
            f9 = f8;
        }
        if ((i9 & 2) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1159getSurface0d7_KjU();
        } else {
            j10 = j8;
        }
        if ((i9 & 4) != 0) {
            j11 = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composer, ModalBottomSheetDefaults.$stable);
        } else {
            j11 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(769413883, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetLayoutInfo (StripeBottomSheetLayoutInfo.kt:26)");
        }
        composer.startReplaceableGroup(-392359182);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C3962d(RoundedCornerShapeKt.m831RoundedCornerShapea9UjIt4$default(f9, f9, 0.0f, 0.0f, 12, null), j10, j11, null);
            composer.updateRememberedValue(rememberedValue);
        }
        C3962d c3962d = (C3962d) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c3962d;
    }
}
