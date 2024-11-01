package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.node.Owner;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CompositionLocalsKt$ProvideCommonCompositionLocals$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ Owner $owner;
    final /* synthetic */ UriHandler $uriHandler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionLocalsKt$ProvideCommonCompositionLocals$1(Owner owner, UriHandler uriHandler, InterfaceC2072n interfaceC2072n, int i8) {
        super(2);
        this.$owner = owner;
        this.$uriHandler = uriHandler;
        this.$content = interfaceC2072n;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Q5.I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        CompositionLocalsKt.ProvideCommonCompositionLocals(this.$owner, this.$uriHandler, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
