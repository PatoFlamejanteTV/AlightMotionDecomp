package androidx.datastore.preferences;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import f6.InterfaceC2871d;
import j6.i;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;

/* loaded from: classes3.dex */
public final class PreferenceDataStoreSingletonDelegate implements InterfaceC2871d {

    @GuardedBy("lock")
    private volatile DataStore<Preferences> INSTANCE;
    private final ReplaceFileCorruptionHandler<Preferences> corruptionHandler;
    private final Object lock;
    private final String name;
    private final Function1 produceMigrations;
    private final M scope;

    public PreferenceDataStoreSingletonDelegate(String name, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Function1 produceMigrations, M scope) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(produceMigrations, "produceMigrations");
        AbstractC3292y.i(scope, "scope");
        this.name = name;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // f6.InterfaceC2871d
    public DataStore<Preferences> getValue(Context thisRef, i property) {
        DataStore<Preferences> dataStore;
        AbstractC3292y.i(thisRef, "thisRef");
        AbstractC3292y.i(property, "property");
        DataStore<Preferences> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                    ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler = this.corruptionHandler;
                    Function1 function1 = this.produceMigrations;
                    AbstractC3292y.h(applicationContext, "applicationContext");
                    this.INSTANCE = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) function1.invoke(applicationContext), this.scope, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
                }
                dataStore = this.INSTANCE;
                AbstractC3292y.f(dataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataStore;
    }
}
