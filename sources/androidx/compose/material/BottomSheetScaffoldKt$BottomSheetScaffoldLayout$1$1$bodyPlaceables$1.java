package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceables$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2073o $body;
    final /* synthetic */ float $sheetPeekHeight;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceables$1(InterfaceC2073o interfaceC2073o, float f8, int i8) {
        super(2);
        this.$body = interfaceC2073o;
        this.$sheetPeekHeight = f8;
        this.$$dirty = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2019457358, i8, -1, "androidx.compose.material.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:629)");
        }
        this.$body.invoke(PaddingKt.m574PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, this.$sheetPeekHeight, 7, null), composer, Integer.valueOf(this.$$dirty & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
