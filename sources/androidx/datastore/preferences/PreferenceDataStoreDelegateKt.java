package androidx.datastore.preferences;

import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.Preferences;
import f6.InterfaceC2871d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3445b0;
import n6.M;
import n6.N;
import n6.U0;

/* loaded from: classes3.dex */
public final class PreferenceDataStoreDelegateKt {
    public static final InterfaceC2871d preferencesDataStore(String name, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Function1 produceMigrations, M scope) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(produceMigrations, "produceMigrations");
        AbstractC3292y.i(scope, "scope");
        return new PreferenceDataStoreSingletonDelegate(name, replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static /* synthetic */ InterfaceC2871d preferencesDataStore$default(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, M m8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i8 & 4) != 0) {
            function1 = PreferenceDataStoreDelegateKt$preferencesDataStore$1.INSTANCE;
        }
        if ((i8 & 8) != 0) {
            m8 = N.a(C3445b0.b().plus(U0.b(null, 1, null)));
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, function1, m8);
    }
}
