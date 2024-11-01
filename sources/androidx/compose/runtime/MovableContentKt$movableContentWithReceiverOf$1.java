package androidx.compose.runtime;

import Q5.I;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ MovableContent<R> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$1(MovableContent<R> movableContent) {
        super(3);
        this.$movableContent = movableContent;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((MovableContentKt$movableContentWithReceiverOf$1) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(R r8, Composer composer, int i8) {
        if ((i8 & 14) == 0) {
            i8 |= composer.changed(r8) ? 4 : 2;
        }
        if ((i8 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(506997506, i8, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:172)");
        }
        composer.insertMovableContent(this.$movableContent, r8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
