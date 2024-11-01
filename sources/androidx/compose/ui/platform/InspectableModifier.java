package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class InspectableModifier extends InspectorValueInfo implements Modifier.Element {
    public static final int $stable = 0;
    private final End end;

    /* loaded from: classes.dex */
    public final class End implements Modifier.Element {
        public End() {
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

        @Override // androidx.compose.ui.Modifier
        public /* synthetic */ Modifier then(Modifier modifier) {
            return androidx.compose.ui.a.a(this, modifier);
        }
    }

    public InspectableModifier(Function1 function1) {
        super(function1);
        this.end = new End();
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

    public final End getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
