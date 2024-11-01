package androidx.compose.runtime;

import Q5.I;
import Q5.r;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class MovableContentKt$movableContentWithReceiverOf$movableContent$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ InterfaceC2074p $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentWithReceiverOf$movableContent$2(InterfaceC2074p interfaceC2074p) {
        super(3);
        this.$content = interfaceC2074p;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((r) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(r rVar, Composer composer, int i8) {
        if ((i8 & 14) == 0) {
            i8 |= composer.changed(rVar) ? 4 : 2;
        }
        if ((i8 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(812082854, i8, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
        }
        this.$content.invoke(rVar.c(), rVar.d(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
