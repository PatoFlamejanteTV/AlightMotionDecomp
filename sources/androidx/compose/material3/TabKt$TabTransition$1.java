package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composer;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabKt$TabTransition$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $activeColor;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ long $inactiveColor;
    final /* synthetic */ boolean $selected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$TabTransition$1(long j8, long j9, boolean z8, InterfaceC2072n interfaceC2072n, int i8) {
        super(2);
        this.$activeColor = j8;
        this.$inactiveColor = j9;
        this.$selected = z8;
        this.$content = interfaceC2072n;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        TabKt.m1804TabTransitionKlgxPg(this.$activeColor, this.$inactiveColor, this.$selected, this.$content, composer, this.$$changed | 1);
    }
}
