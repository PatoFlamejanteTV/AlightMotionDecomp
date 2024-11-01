package androidx.compose.ui.node;

import Q5.I;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackwardsCompatNode$updateModifierLocalConsumer$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ BackwardsCompatNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackwardsCompatNode$updateModifierLocalConsumer$1(BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.this$0 = backwardsCompatNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4188invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4188invoke() {
        Modifier.Element element = this.this$0.getElement();
        AbstractC3292y.g(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
        ((ModifierLocalConsumer) element).onModifierLocalsUpdated(this.this$0);
    }
}
