package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public <T> T get(CreationExtras.Key<T> key) {
        AbstractC3292y.i(key, "key");
        return (T) getMap$lifecycle_viewmodel_release().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(CreationExtras.Key<T> key, T t8) {
        AbstractC3292y.i(key, "key");
        getMap$lifecycle_viewmodel_release().put(key, t8);
    }

    public MutableCreationExtras(CreationExtras initialExtras) {
        AbstractC3292y.i(initialExtras, "initialExtras");
        getMap$lifecycle_viewmodel_release().putAll(initialExtras.getMap$lifecycle_viewmodel_release());
    }

    public /* synthetic */ MutableCreationExtras(CreationExtras creationExtras, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }
}
