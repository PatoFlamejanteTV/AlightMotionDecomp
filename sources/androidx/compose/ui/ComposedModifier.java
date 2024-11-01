package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
class ComposedModifier extends InspectorValueInfo implements Modifier.Element {
    private final InterfaceC2073o factory;

    public ComposedModifier(Function1 function1, InterfaceC2073o interfaceC2073o) {
        super(function1);
        this.factory = interfaceC2073o;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return b.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
        return b.c(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
        return b.d(this, obj, interfaceC2072n);
    }

    public final InterfaceC2073o getFactory() {
        return this.factory;
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return a.a(this, modifier);
    }
}
