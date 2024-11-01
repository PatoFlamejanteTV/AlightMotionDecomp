package androidx.compose.ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class ModifierLocalProviderKt$modifierLocalProvider$1<T> extends InspectorValueInfo implements ModifierLocalProvider<T> {
    private final ProvidableModifierLocal<T> key;
    private final State value$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ModifierLocalProviderKt$modifierLocalProvider$1(ProvidableModifierLocal<T> providableModifierLocal, Function0 function0, Function1 function1) {
        super(function1);
        this.key = providableModifierLocal;
        this.value$delegate = SnapshotStateKt.derivedStateOf(function0);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.c(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.d(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<T> getKey() {
        return this.key;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public T getValue() {
        return (T) this.value$delegate.getValue();
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
