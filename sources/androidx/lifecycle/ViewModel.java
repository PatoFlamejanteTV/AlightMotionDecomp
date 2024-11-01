package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;

/* loaded from: classes3.dex */
public abstract class ViewModel {
    private final ViewModelImpl impl;

    public ViewModel() {
        this.impl = new ViewModelImpl();
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(key, closeable);
        }
    }

    @MainThread
    public final void clear$lifecycle_viewmodel_release() {
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.clear();
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        AbstractC3292y.i(key, "key");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            return (T) viewModelImpl.getCloseable(key);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCleared() {
    }

    public void addCloseable(AutoCloseable closeable) {
        AbstractC3292y.i(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    public ViewModel(M viewModelScope) {
        AbstractC3292y.i(viewModelScope, "viewModelScope");
        this.impl = new ViewModelImpl(viewModelScope);
    }

    public /* synthetic */ void addCloseable(Closeable closeable) {
        AbstractC3292y.i(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    public ViewModel(AutoCloseable... closeables) {
        AbstractC3292y.i(closeables, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public ViewModel(M viewModelScope, AutoCloseable... closeables) {
        AbstractC3292y.i(viewModelScope, "viewModelScope");
        AbstractC3292y.i(closeables, "closeables");
        this.impl = new ViewModelImpl(viewModelScope, (AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public /* synthetic */ ViewModel(Closeable... closeables) {
        AbstractC3292y.i(closeables, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }
}
