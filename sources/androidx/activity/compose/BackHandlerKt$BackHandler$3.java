package androidx.activity.compose;

import Q5.I;
import androidx.compose.runtime.Composer;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BackHandlerKt$BackHandler$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function0 $onBack;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$3(boolean z8, Function0 function0, int i8, int i9) {
        super(2);
        this.$enabled = z8;
        this.$onBack = function0;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        BackHandlerKt.BackHandler(this.$enabled, this.$onBack, composer, this.$$changed | 1, this.$$default);
    }
}
