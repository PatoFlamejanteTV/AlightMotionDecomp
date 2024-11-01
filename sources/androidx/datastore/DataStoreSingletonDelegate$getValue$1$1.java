package androidx.datastore;

import U6.Q;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DataStoreSingletonDelegate$getValue$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ DataStoreSingletonDelegate<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreSingletonDelegate$getValue$1$1(Context context, DataStoreSingletonDelegate<T> dataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = dataStoreSingletonDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Q invoke() {
        String str;
        Q.a aVar = Q.f10156b;
        Context applicationContext = this.$applicationContext;
        AbstractC3292y.h(applicationContext, "applicationContext");
        str = ((DataStoreSingletonDelegate) this.this$0).fileName;
        String absolutePath = DataStoreFile.dataStoreFile(applicationContext, str).getAbsolutePath();
        AbstractC3292y.h(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
        return Q.a.e(aVar, absolutePath, false, 1, null);
    }
}
