package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TwoLine$ListItem$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2072n $icon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ InterfaceC2072n $overlineText;
    final /* synthetic */ InterfaceC2072n $secondaryText;
    final /* synthetic */ InterfaceC2072n $text;
    final /* synthetic */ TwoLine $tmp0_rcvr;
    final /* synthetic */ InterfaceC2072n $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoLine$ListItem$2(TwoLine twoLine, Modifier modifier, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, InterfaceC2072n interfaceC2072n5, int i8, int i9) {
        super(2);
        this.$tmp0_rcvr = twoLine;
        this.$modifier = modifier;
        this.$icon = interfaceC2072n;
        this.$text = interfaceC2072n2;
        this.$secondaryText = interfaceC2072n3;
        this.$overlineText = interfaceC2072n4;
        this.$trailing = interfaceC2072n5;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        this.$tmp0_rcvr.ListItem(this.$modifier, this.$icon, this.$text, this.$secondaryText, this.$overlineText, this.$trailing, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
