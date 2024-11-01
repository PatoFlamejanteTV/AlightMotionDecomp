package androidx.compose.ui.modifier;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ModifierLocalManager$invalidate$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ModifierLocalManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierLocalManager$invalidate$1(ModifierLocalManager modifierLocalManager) {
        super(0);
        this.this$0 = modifierLocalManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4184invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4184invoke() {
        this.this$0.triggerUpdates();
    }
}
