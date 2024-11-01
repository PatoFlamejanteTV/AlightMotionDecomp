package O3;

import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* renamed from: O3.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C1369q implements RippleTheme {

    /* renamed from: a, reason: collision with root package name */
    public static final C1369q f7736a = new C1369q();

    private C1369q() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    /* renamed from: defaultColor-WaAFU9c, reason: not valid java name */
    public long mo43defaultColorWaAFU9c(Composer composer, int i8) {
        composer.startReplaceableGroup(1543783583);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1543783583, i8, -1, "com.stripe.android.paymentsheet.ui.ErrorRippleTheme.defaultColor (EditPaymentMethod.kt:291)");
        }
        RippleTheme.Companion companion = RippleTheme.Companion;
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i9 = MaterialTheme.$stable;
        long m1423defaultRippleColor5vOe2sY = companion.m1423defaultRippleColor5vOe2sY(materialTheme.getColors(composer, i9).m1149getError0d7_KjU(), materialTheme.getColors(composer, i9).isLight());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1423defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    public RippleAlpha rippleAlpha(Composer composer, int i8) {
        composer.startReplaceableGroup(-1935762054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1935762054, i8, -1, "com.stripe.android.paymentsheet.ui.ErrorRippleTheme.rippleAlpha (EditPaymentMethod.kt:299)");
        }
        RippleTheme.Companion companion = RippleTheme.Companion;
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i9 = MaterialTheme.$stable;
        RippleAlpha m1422defaultRippleAlphaDxMtmZc = companion.m1422defaultRippleAlphaDxMtmZc(Color.m2947copywmQWz5c$default(materialTheme.getColors(composer, i9).m1149getError0d7_KjU(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, i9).isLight());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1422defaultRippleAlphaDxMtmZc;
    }
}
