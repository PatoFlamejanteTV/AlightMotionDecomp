package androidx.compose.runtime;

import Q5.I;
import Q5.r;
import Q5.x;
import c6.InterfaceC2075q;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$3 extends AbstractC3293z implements InterfaceC2075q {
    final /* synthetic */ MovableContent<r> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$3(MovableContent<r> movableContent) {
        super(5);
        this.$movableContent = movableContent;
    }

    @Override // c6.InterfaceC2075q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke((MovableContentKt$movableContentWithReceiverOf$3) obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(R r8, P1 p12, P2 p22, Composer composer, int i8) {
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
        if ((i9 & 5851) == 1170 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(583402949, i9, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:228)");
        }
        composer.insertMovableContent(this.$movableContent, x.a(x.a(r8, p12), p22));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
