package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2072n $bottomBar;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ InterfaceC2072n $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ InterfaceC2072n $snackbar;
    final /* synthetic */ InterfaceC2072n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$2(int i8, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, WindowInsets windowInsets, InterfaceC2072n interfaceC2072n4, int i9) {
        super(2);
        this.$fabPosition = i8;
        this.$topBar = interfaceC2072n;
        this.$content = interfaceC2073o;
        this.$snackbar = interfaceC2072n2;
        this.$fab = interfaceC2072n3;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = interfaceC2072n4;
        this.$$changed = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        ScaffoldKt.m1731ScaffoldLayoutFMILGgc(this.$fabPosition, this.$topBar, this.$content, this.$snackbar, this.$fab, this.$contentWindowInsets, this.$bottomBar, composer, this.$$changed | 1);
    }
}
