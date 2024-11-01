package androidx.datastore.preferences.core;

import U5.d;
import androidx.datastore.core.DataStore;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3821f;

/* loaded from: classes3.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {
    private final DataStore<Preferences> delegate;

    public PreferenceDataStore(DataStore<Preferences> delegate) {
        AbstractC3292y.i(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    public InterfaceC3821f getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(InterfaceC2072n interfaceC2072n, d dVar) {
        return this.delegate.updateData(new PreferenceDataStore$updateData$2(interfaceC2072n, null), dVar);
    }
}
