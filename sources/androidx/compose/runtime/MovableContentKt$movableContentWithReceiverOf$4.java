package androidx.compose.runtime;

import Q5.I;
import Q5.r;
import Q5.x;
import c6.InterfaceC2076r;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$4 extends AbstractC3293z implements InterfaceC2076r {
    final /* synthetic */ MovableContent<r> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$4(MovableContent<r> movableContent) {
        super(6);
        this.$movableContent = movableContent;
    }

    @Override // c6.InterfaceC2076r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        invoke((MovableContentKt$movableContentWithReceiverOf$4) obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(R r8, P1 p12, P2 p22, P3 p32, Composer composer, int i8) {
        int i9;
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(r8) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= composer.changed(p12) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= composer.changed(p22) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i9 |= composer.changed(p32) ? 2048 : 1024;
        }
        if ((46811 & i9) == 9362 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1468683306, i9, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:257)");
        }
        composer.insertMovableContent(this.$movableContent, x.a(x.a(r8, p12), x.a(p22, p32)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
