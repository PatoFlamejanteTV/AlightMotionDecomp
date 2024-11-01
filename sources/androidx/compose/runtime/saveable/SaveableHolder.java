package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SaveableHolder<T> implements SaverScope, RememberObserver {
    private SaveableStateRegistry.Entry entry;
    private Object[] inputs;
    private String key;
    private SaveableStateRegistry registry;
    private Saver<T, Object> saver;
    private T value;
    private final Function0 valueProvider = new SaveableHolder$valueProvider$1(this);

    public SaveableHolder(Saver<T, Object> saver, SaveableStateRegistry saveableStateRegistry, String str, T t8, Object[] objArr) {
        this.saver = saver;
        this.registry = saveableStateRegistry;
        this.key = str;
        this.value = t8;
        this.inputs = objArr;
    }

    private final void register() {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        if (this.entry == null) {
            if (saveableStateRegistry != null) {
                RememberSaveableKt.requireCanBeSaved(saveableStateRegistry, this.valueProvider.invoke());
                this.entry = saveableStateRegistry.registerProvider(this.key, this.valueProvider);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public boolean canBeSaved(Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        if (saveableStateRegistry != null && !saveableStateRegistry.canBeSaved(obj)) {
            return false;
        }
        return true;
    }

    public final T getValueIfInputsDidntChange(Object[] objArr) {
        if (Arrays.equals(objArr, this.inputs)) {
            return this.value;
        }
        return null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        register();
    }

    public final void update(Saver<T, Object> saver, SaveableStateRegistry saveableStateRegistry, String str, T t8, Object[] objArr) {
        boolean z8;
        boolean z9 = true;
        if (this.registry != saveableStateRegistry) {
            this.registry = saveableStateRegistry;
            z8 = true;
        } else {
            z8 = false;
        }
        if (!AbstractC3292y.d(this.key, str)) {
            this.key = str;
        } else {
            z9 = z8;
        }
        this.saver = saver;
        this.value = t8;
        this.inputs = objArr;
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null && z9) {
            if (entry != null) {
                entry.unregister();
            }
            this.entry = null;
            register();
        }
    }
}
