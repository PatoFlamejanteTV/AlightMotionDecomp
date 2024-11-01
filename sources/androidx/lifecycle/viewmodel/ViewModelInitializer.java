package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import b6.AbstractC1989a;
import j6.InterfaceC3214c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final InterfaceC3214c clazz;
    private final Function1 initializer;

    public ViewModelInitializer(InterfaceC3214c clazz, Function1 initializer) {
        AbstractC3292y.i(clazz, "clazz");
        AbstractC3292y.i(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    public final InterfaceC3214c getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    public final Function1 getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(Class<T> clazz, Function1 initializer) {
        this(AbstractC1989a.c(clazz), initializer);
        AbstractC3292y.i(clazz, "clazz");
        AbstractC3292y.i(initializer, "initializer");
    }
}
