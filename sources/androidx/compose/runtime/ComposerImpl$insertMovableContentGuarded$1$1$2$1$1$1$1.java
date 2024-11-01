package androidx.compose.runtime;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ MovableContentStateReference $to;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1(ComposerImpl composerImpl, MovableContentStateReference movableContentStateReference) {
        super(0);
        this.this$0 = composerImpl;
        this.$to = movableContentStateReference;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2444invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2444invoke() {
        this.this$0.invokeMovableContentLambda(this.$to.getContent$runtime_release(), this.$to.getLocals$runtime_release(), this.$to.getParameter$runtime_release(), true);
    }
}
