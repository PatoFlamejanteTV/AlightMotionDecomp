package androidx.compose.material3;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class CheckboxKt$Checkbox$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ boolean $checked;
    final /* synthetic */ Function1 $onCheckedChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$Checkbox$2$1(Function1 function1, boolean z8) {
        super(0);
        this.$onCheckedChange = function1;
        this.$checked = z8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1474invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1474invoke() {
        this.$onCheckedChange.invoke(Boolean.valueOf(!this.$checked));
    }
}
