package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ PreferenceDataStoreSingletonDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = preferenceDataStoreSingletonDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        String str;
        Context applicationContext = this.$applicationContext;
        AbstractC3292y.h(applicationContext, "applicationContext");
        str = this.this$0.name;
        return PreferenceDataStoreFile.preferencesDataStoreFile(applicationContext, str);
    }
}
