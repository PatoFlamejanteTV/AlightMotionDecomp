package androidx.lifecycle.viewmodel.internal;

import Q5.I;
import R5.AbstractC1435t;
import androidx.annotation.MainThread;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;

/* loaded from: classes3.dex */
public final class ViewModelImpl {
    private final Set<AutoCloseable> closeables;
    private volatile boolean isCleared;
    private final Map<String, AutoCloseable> keyToCloseables;
    private final SynchronizedObject lock;

    public ViewModelImpl() {
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeWithRuntimeException(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(closeable, "closeable");
        if (this.isCleared) {
            closeWithRuntimeException(closeable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable = (AutoCloseable) this.keyToCloseables.put(key, closeable);
        }
        closeWithRuntimeException(autoCloseable);
    }

    @MainThread
    public final void clear() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            try {
                Iterator it = this.keyToCloseables.values().iterator();
                while (it.hasNext()) {
                    closeWithRuntimeException((AutoCloseable) it.next());
                }
                Iterator it2 = this.closeables.iterator();
                while (it2.hasNext()) {
                    closeWithRuntimeException((AutoCloseable) it2.next());
                }
                this.closeables.clear();
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        T t8;
        AbstractC3292y.i(key, "key");
        synchronized (this.lock) {
            t8 = (T) this.keyToCloseables.get(key);
        }
        return t8;
    }

    public ViewModelImpl(M viewModelScope) {
        AbstractC3292y.i(viewModelScope, "viewModelScope");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(viewModelScope));
    }

    public final void addCloseable(AutoCloseable closeable) {
        AbstractC3292y.i(closeable, "closeable");
        if (this.isCleared) {
            closeWithRuntimeException(closeable);
            return;
        }
        synchronized (this.lock) {
            this.closeables.add(closeable);
            I i8 = I.f8786a;
        }
    }

    public ViewModelImpl(AutoCloseable... closeables) {
        AbstractC3292y.i(closeables, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        AbstractC1435t.E(linkedHashSet, closeables);
    }

    public ViewModelImpl(M viewModelScope, AutoCloseable... closeables) {
        AbstractC3292y.i(viewModelScope, "viewModelScope");
        AbstractC3292y.i(closeables, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(viewModelScope));
        AbstractC1435t.E(linkedHashSet, closeables);
    }
}
