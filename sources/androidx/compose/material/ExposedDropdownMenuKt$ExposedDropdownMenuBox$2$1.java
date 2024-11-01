package androidx.compose.material;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ Function1 $onExpandedChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1(Function1 function1, boolean z8) {
        super(0);
        this.$onExpandedChange = function1;
        this.$expanded = z8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1223invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1223invoke() {
        this.$onExpandedChange.invoke(Boolean.valueOf(!this.$expanded));
    }
}
