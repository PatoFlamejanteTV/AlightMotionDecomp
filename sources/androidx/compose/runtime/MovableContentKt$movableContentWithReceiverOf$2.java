package androidx.compose.runtime;

import Q5.I;
import Q5.r;
import Q5.x;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$2 extends AbstractC3293z implements InterfaceC2074p {
    final /* synthetic */ MovableContent<r> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$2(MovableContent<r> movableContent) {
        super(4);
        this.$movableContent = movableContent;
    }

    @Override // c6.InterfaceC2074p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((MovableContentKt$movableContentWithReceiverOf$2) obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(R r8, P p8, Composer composer, int i8) {
        int i9;
        if ((i8 & 14) == 0) {
            i9 = (composer.changed(r8) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= composer.changed(p8) ? 32 : 16;
        }
        if ((i9 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(627354118, i9, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:199)");
        }
        composer.insertMovableContent(this.$movableContent, x.a(r8, p8));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
