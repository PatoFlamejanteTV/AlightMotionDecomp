package androidx.compose.runtime;

import Q5.I;
import Q5.r;
import c6.InterfaceC2073o;
import c6.InterfaceC2076r;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$movableContent$4 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ InterfaceC2076r $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$movableContent$4(InterfaceC2076r interfaceC2076r) {
        super(3);
        this.$content = interfaceC2076r;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((r) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(r rVar, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(838586922, i8, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:254)");
        }
        this.$content.invoke(((r) rVar.c()).c(), ((r) rVar.c()).d(), ((r) rVar.d()).c(), ((r) rVar.d()).d(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}