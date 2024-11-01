package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class OnSizeChangedModifier extends InspectorValueInfo implements OnRemeasuredModifier {
    private final Function1 onSizeChanged;
    private long previousSize;

    public OnSizeChangedModifier(Function1 function1, Function1 function12) {
        super(function12);
        this.onSizeChanged = function1;
        this.previousSize = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnSizeChangedModifier)) {
            return false;
        }
        return AbstractC3292y.d(this.onSizeChanged, ((OnSizeChangedModifier) obj).onSizeChanged);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.c(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.d(this, obj, interfaceC2072n);
    }

    public final Function1 getOnSizeChanged() {
        return this.onSizeChanged;
    }

    public int hashCode() {
        return this.onSizeChanged.hashCode();
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo353onRemeasuredozmzZPI(long j8) {
        if (!IntSize.m5319equalsimpl0(this.previousSize, j8)) {
            this.onSizeChanged.invoke(IntSize.m5313boximpl(j8));
            this.previousSize = j8;
        }
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
