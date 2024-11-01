package androidx.datastore.preferences;

import R5.AbstractC1435t;
import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PreferenceDataStoreDelegateKt$preferencesDataStore$1 extends AbstractC3293z implements Function1 {
    public static final PreferenceDataStoreDelegateKt$preferencesDataStore$1 INSTANCE = new PreferenceDataStoreDelegateKt$preferencesDataStore$1();

    PreferenceDataStoreDelegateKt$preferencesDataStore$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<DataMigration<Preferences>> invoke(Context it) {
        AbstractC3292y.i(it, "it");
        return AbstractC1435t.m();
    }
}
