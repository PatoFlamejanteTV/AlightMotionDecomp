package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class WindowInfoKt$WindowFocusObserver$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1 $onWindowFocusChanged;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoKt$WindowFocusObserver$2(Function1 function1, int i8) {
        super(2);
        this.$onWindowFocusChanged = function1;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Q5.I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        WindowInfoKt.WindowFocusObserver(this.$onWindowFocusChanged, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
