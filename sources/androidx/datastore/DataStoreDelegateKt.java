package androidx.datastore;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import f6.InterfaceC2871d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3445b0;
import n6.M;
import n6.N;
import n6.U0;

/* loaded from: classes3.dex */
public final class DataStoreDelegateKt {
    public static final <T> InterfaceC2871d dataStore(String fileName, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, Function1 produceMigrations, M scope) {
        AbstractC3292y.i(fileName, "fileName");
        AbstractC3292y.i(serializer, "serializer");
        AbstractC3292y.i(produceMigrations, "produceMigrations");
        AbstractC3292y.i(scope, "scope");
        return new DataStoreSingletonDelegate(fileName, new OkioSerializerWrapper(serializer), replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static /* synthetic */ InterfaceC2871d dataStore$default(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, M m8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i8 & 8) != 0) {
            function1 = DataStoreDelegateKt$dataStore$1.INSTANCE;
        }
        if ((i8 & 16) != 0) {
            m8 = N.a(C3445b0.b().plus(U0.b(null, 1, null)));
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, function1, m8);
    }
}
