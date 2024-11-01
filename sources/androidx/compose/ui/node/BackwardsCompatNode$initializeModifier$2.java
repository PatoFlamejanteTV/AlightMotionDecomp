package androidx.compose.ui.node;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackwardsCompatNode$initializeModifier$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ BackwardsCompatNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackwardsCompatNode$initializeModifier$2(BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.this$0 = backwardsCompatNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4186invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4186invoke() {
        this.this$0.updateModifierLocalConsumer();
    }
}
