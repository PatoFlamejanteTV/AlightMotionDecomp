package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.measurement.DeletionRequest;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.N;
import n6.U;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
public abstract class MeasurementManagerFutures {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {
        private final MeasurementManager mMeasurementManager;

        public Api33Ext5JavaImpl(MeasurementManager mMeasurementManager) {
            AbstractC3292y.i(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public InterfaceFutureC4260d deleteRegistrationsAsync(DeletionRequest deletionRequest) {
            U b9;
            AbstractC3292y.i(deletionRequest, "deletionRequest");
            b9 = AbstractC3462k.b(N.a(C3445b0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1(this, deletionRequest, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b9, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public InterfaceFutureC4260d getMeasurementApiStatusAsync() {
            U b9;
            b9 = AbstractC3462k.b(N.a(C3445b0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b9, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public InterfaceFutureC4260d registerSourceAsync(Uri attributionSource, InputEvent inputEvent) {
            U b9;
            AbstractC3292y.i(attributionSource, "attributionSource");
            b9 = AbstractC3462k.b(N.a(C3445b0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1(this, attributionSource, inputEvent, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b9, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public InterfaceFutureC4260d registerTriggerAsync(Uri trigger) {
            U b9;
            AbstractC3292y.i(trigger, "trigger");
            b9 = AbstractC3462k.b(N.a(C3445b0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this, trigger, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b9, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public InterfaceFutureC4260d registerWebSourceAsync(WebSourceRegistrationRequest request) {
            U b9;
            AbstractC3292y.i(request, "request");
            b9 = AbstractC3462k.b(N.a(C3445b0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1(this, request, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b9, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public InterfaceFutureC4260d registerWebTriggerAsync(WebTriggerRegistrationRequest request) {
            U b9;
            AbstractC3292y.i(request, "request");
            b9 = AbstractC3462k.b(N.a(C3445b0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1(this, request, null), 3, null);
            return CoroutineAdapterKt.asListenableFuture$default(b9, null, 1, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final MeasurementManagerFutures from(Context context) {
            AbstractC3292y.i(context, "context");
            MeasurementManager obtain = MeasurementManager.Companion.obtain(context);
            if (obtain != null) {
                return new Api33Ext5JavaImpl(obtain);
            }
            return null;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public static final MeasurementManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract InterfaceFutureC4260d deleteRegistrationsAsync(DeletionRequest deletionRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract InterfaceFutureC4260d getMeasurementApiStatusAsync();

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract InterfaceFutureC4260d registerSourceAsync(Uri uri, InputEvent inputEvent);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract InterfaceFutureC4260d registerTriggerAsync(Uri uri);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract InterfaceFutureC4260d registerWebSourceAsync(WebSourceRegistrationRequest webSourceRegistrationRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract InterfaceFutureC4260d registerWebTriggerAsync(WebTriggerRegistrationRequest webTriggerRegistrationRequest);
}
