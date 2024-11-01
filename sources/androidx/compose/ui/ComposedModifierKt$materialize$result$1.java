package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.Z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ComposedModifierKt$materialize$result$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ Composer $this_materialize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposedModifierKt$materialize$result$1(Composer composer) {
        super(2);
        this.$this_materialize = composer;
    }

    @Override // c6.InterfaceC2072n
    public final Modifier invoke(Modifier modifier, Modifier.Element element) {
        boolean z8 = element instanceof ComposedModifier;
        Modifier modifier2 = element;
        if (z8) {
            InterfaceC2073o factory = ((ComposedModifier) element).getFactory();
            AbstractC3292y.g(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            modifier2 = ComposedModifierKt.materializeModifier(this.$this_materialize, (Modifier) ((InterfaceC2073o) Z.d(factory, 3)).invoke(Modifier.Companion, this.$this_materialize, 0));
        }
        return modifier.then(modifier2);
    }
}
