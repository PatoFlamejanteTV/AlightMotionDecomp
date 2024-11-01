package androidx.compose.runtime;

import Q5.I;
import Q5.r;
import Q5.x;
import c6.InterfaceC2075q;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$4 extends AbstractC3293z implements InterfaceC2075q {
    final /* synthetic */ MovableContent<r> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$4(MovableContent<r> movableContent) {
        super(5);
        this.$movableContent = movableContent;
    }

    @Override // c6.InterfaceC2075q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke((MovableContentKt$movableContentOf$4) obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(P1 p12, P2 p22, P3 p32, Composer composer, int i8) {
        int i9;
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(p12) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= composer.changed(p22) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= composer.changed(p32) ? 256 : 128;
        }
        if ((i9 & 5851) == 1170 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1083870185, i9, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:118)");
        }
        composer.insertMovableContent(this.$movableContent, x.a(x.a(p12, p22), p32));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
