package androidx.datastore.preferences.core;

import U5.d;
import androidx.datastore.core.DataStore;
import c6.InterfaceC2072n;

/* loaded from: classes3.dex */
public final class PreferencesKt {
    public static final Object edit(DataStore<Preferences> dataStore, InterfaceC2072n interfaceC2072n, d dVar) {
        return dataStore.updateData(new PreferencesKt$edit$2(interfaceC2072n, null), dVar);
    }
}
