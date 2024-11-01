package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onDismissRequest;
    final /* synthetic */ ExposedDropdownMenuBoxScope $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z8, Function0 function0, Modifier modifier, InterfaceC2073o interfaceC2073o, int i8, int i9) {
        super(2);
        this.$tmp0_rcvr = exposedDropdownMenuBoxScope;
        this.$expanded = z8;
        this.$onDismissRequest = function0;
        this.$modifier = modifier;
        this.$content = interfaceC2073o;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        this.$tmp0_rcvr.ExposedDropdownMenu(this.$expanded, this.$onDismissRequest, this.$modifier, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
