package androidx.compose.runtime;

import Q5.I;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$movableContent$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ InterfaceC2072n $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$movableContent$1(InterfaceC2072n interfaceC2072n) {
        super(3);
        this.$content = interfaceC2072n;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((I) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(I i8, Composer composer, int i9) {
        if ((i9 & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1079330685, i9, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
        }
        this.$content.invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
