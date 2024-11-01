package androidx.lifecycle.viewmodel.compose;

import Q5.InterfaceC1412g;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.SavedStateHandle;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3289v;
import kotlin.jvm.internal.InterfaceC3286s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public /* synthetic */ class SavedStateHandleSaverKt$saveable$1$1$1 implements SaverScope, InterfaceC3286s {
    final /* synthetic */ SavedStateHandle.Companion $tmp0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion companion) {
        this.$tmp0 = companion;
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean canBeSaved(Object obj) {
        return this.$tmp0.validateValue(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SaverScope) && (obj instanceof InterfaceC3286s)) {
            return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3286s
    public final InterfaceC1412g getFunctionDelegate() {
        return new C3289v(1, this.$tmp0, SavedStateHandle.Companion.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
