package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {
    private final Function1 consumer;

    public ModifierLocalConsumerImpl(Function1 function1, Function1 function12) {
        super(function12);
        this.consumer = function1;
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
        if ((obj instanceof ModifierLocalConsumerImpl) && AbstractC3292y.d(((ModifierLocalConsumerImpl) obj).consumer, this.consumer)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.c(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.d(this, obj, interfaceC2072n);
    }

    public final Function1 getConsumer() {
        return this.consumer;
    }

    public int hashCode() {
        return this.consumer.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        this.consumer.invoke(modifierLocalReadScope);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
