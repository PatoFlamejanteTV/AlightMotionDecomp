package androidx.compose.foundation.selection;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ToggleableKt$toggleable$4$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ boolean $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleable$4$1(Function1 function1, boolean z8) {
        super(0);
        this.$onValueChange = function1;
        this.$value = z8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m811invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m811invoke() {
        this.$onValueChange.invoke(Boolean.valueOf(!this.$value));
    }
}
