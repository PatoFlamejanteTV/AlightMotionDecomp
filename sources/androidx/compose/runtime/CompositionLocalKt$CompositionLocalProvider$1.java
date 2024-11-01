package androidx.compose.runtime;

import Q5.I;
import c6.InterfaceC2072n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CompositionLocalKt$CompositionLocalProvider$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ ProvidedValue<?>[] $values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionLocalKt$CompositionLocalProvider$1(ProvidedValue<?>[] providedValueArr, InterfaceC2072n interfaceC2072n, int i8) {
        super(2);
        this.$values = providedValueArr;
        this.$content = interfaceC2072n;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        ProvidedValue<?>[] providedValueArr = this.$values;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
