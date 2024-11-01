package androidx.privacysandbox.ads.adservices.java.appsetid;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.N;
import n6.U;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public abstract class AppSetIdManagerFutures {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class Api33Ext4JavaImpl extends AppSetIdManagerFutures {
        private final AppSetIdManager mAppSetIdManager;

        public Api33Ext4JavaImpl(AppSetIdManager mAppSetIdManager) {
            AbstractC3292y.i(mAppSetIdManager, "mAppSetIdManager");
            this.mAppSetIdManager = mAppSetIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures
        @DoNotInline
        public InterfaceFutureC4260d getAppSetIdAsync() {
            U b9;
            b9 = AbstractC3462k.b(N.a(C3445b0.a()), null, null, new AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1(this, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b9, null, 1, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final AppSetIdManagerFutures from(Context context) {
            AbstractC3292y.i(context, "context");
            AppSetIdManager obtain = AppSetIdManager.Companion.obtain(context);
            if (obtain != null) {
                return new Api33Ext4JavaImpl(obtain);
            }
            return null;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public static final AppSetIdManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract InterfaceFutureC4260d getAppSetIdAsync();
}
