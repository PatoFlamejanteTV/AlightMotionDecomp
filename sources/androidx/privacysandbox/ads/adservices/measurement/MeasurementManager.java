package androidx.privacysandbox.ads.adservices.measurement;

import Q5.I;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import j$.time.TimeConversions;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3472p;

/* loaded from: classes3.dex */
public abstract class MeasurementManager {
    public static final Companion Companion = new Companion(null);
    public static final int MEASUREMENT_API_STATE_DISABLED = 0;
    public static final int MEASUREMENT_API_STATE_ENABLED = 1;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final MeasurementManager obtain(Context context) {
            AbstractC3292y.i(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
            sb.append(adServicesInfo.version());
            Log.d("MeasurementManager", sb.toString());
            if (adServicesInfo.version() >= 5) {
                return new Api33Ext5Impl(context);
            }
            return null;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final MeasurementManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object deleteRegistrations(DeletionRequest deletionRequest, U5.d dVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object getMeasurementApiStatus(U5.d dVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerSource(Uri uri, InputEvent inputEvent, U5.d dVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerTrigger(Uri uri, U5.d dVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, U5.d dVar);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, U5.d dVar);

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresExtension(extension = 1000000, version = 5)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* loaded from: classes3.dex */
    public static final class Api33Ext5Impl extends MeasurementManager {
        private final android.adservices.measurement.MeasurementManager mMeasurementManager;

        public Api33Ext5Impl(android.adservices.measurement.MeasurementManager mMeasurementManager) {
            AbstractC3292y.i(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.measurement.DeletionRequest convertDeletionRequest(DeletionRequest deletionRequest) {
            DeletionRequest.Builder deletionMode;
            DeletionRequest.Builder matchBehavior;
            DeletionRequest.Builder start;
            DeletionRequest.Builder end;
            DeletionRequest.Builder domainUris;
            DeletionRequest.Builder originUris;
            android.adservices.measurement.DeletionRequest build;
            deletionMode = v.a().setDeletionMode(deletionRequest.getDeletionMode());
            matchBehavior = deletionMode.setMatchBehavior(deletionRequest.getMatchBehavior());
            start = matchBehavior.setStart(TimeConversions.convert(deletionRequest.getStart()));
            end = start.setEnd(TimeConversions.convert(deletionRequest.getEnd()));
            domainUris = end.setDomainUris(deletionRequest.getDomainUris());
            originUris = domainUris.setOriginUris(deletionRequest.getOriginUris());
            build = originUris.build();
            AbstractC3292y.h(build, "Builder()\n              …\n                .build()");
            return build;
        }

        private final List<android.adservices.measurement.WebSourceParams> convertWebSourceParams(List<WebSourceParams> list) {
            WebSourceParams.Builder debugKeyAllowed;
            android.adservices.measurement.WebSourceParams build;
            ArrayList arrayList = new ArrayList();
            for (WebSourceParams webSourceParams : list) {
                u.a();
                debugKeyAllowed = t.a(webSourceParams.getRegistrationUri()).setDebugKeyAllowed(webSourceParams.getDebugKeyAllowed());
                build = debugKeyAllowed.build();
                AbstractC3292y.h(build, "Builder(param.registrati…                 .build()");
                arrayList.add(build);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.measurement.WebSourceRegistrationRequest convertWebSourceRequest(WebSourceRegistrationRequest webSourceRegistrationRequest) {
            WebSourceRegistrationRequest.Builder webDestination;
            WebSourceRegistrationRequest.Builder appDestination;
            WebSourceRegistrationRequest.Builder inputEvent;
            WebSourceRegistrationRequest.Builder verifiedDestination;
            android.adservices.measurement.WebSourceRegistrationRequest build;
            y.a();
            webDestination = x.a(convertWebSourceParams(webSourceRegistrationRequest.getWebSourceParams()), webSourceRegistrationRequest.getTopOriginUri()).setWebDestination(webSourceRegistrationRequest.getWebDestination());
            appDestination = webDestination.setAppDestination(webSourceRegistrationRequest.getAppDestination());
            inputEvent = appDestination.setInputEvent(webSourceRegistrationRequest.getInputEvent());
            verifiedDestination = inputEvent.setVerifiedDestination(webSourceRegistrationRequest.getVerifiedDestination());
            build = verifiedDestination.build();
            AbstractC3292y.h(build, "Builder(\n               …\n                .build()");
            return build;
        }

        private final List<android.adservices.measurement.WebTriggerParams> convertWebTriggerParams(List<WebTriggerParams> list) {
            WebTriggerParams.Builder debugKeyAllowed;
            android.adservices.measurement.WebTriggerParams build;
            ArrayList arrayList = new ArrayList();
            for (WebTriggerParams webTriggerParams : list) {
                s.a();
                debugKeyAllowed = r.a(webTriggerParams.getRegistrationUri()).setDebugKeyAllowed(webTriggerParams.getDebugKeyAllowed());
                build = debugKeyAllowed.build();
                AbstractC3292y.h(build, "Builder(param.registrati…                 .build()");
                arrayList.add(build);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.measurement.WebTriggerRegistrationRequest convertWebTriggerRequest(WebTriggerRegistrationRequest webTriggerRegistrationRequest) {
            android.adservices.measurement.WebTriggerRegistrationRequest build;
            A.a();
            build = z.a(convertWebTriggerParams(webTriggerRegistrationRequest.getWebTriggerParams()), webTriggerRegistrationRequest.getDestination()).build();
            AbstractC3292y.h(build, "Builder(\n               …\n                .build()");
            return build;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @DoNotInline
        public Object deleteRegistrations(DeletionRequest deletionRequest, U5.d dVar) {
            C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
            c3472p.B();
            this.mMeasurementManager.deleteRegistrations(convertDeletionRequest(deletionRequest), new androidx.privacysandbox.ads.adservices.adid.g(), OutcomeReceiverKt.asOutcomeReceiver(c3472p));
            Object y8 = c3472p.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (y8 == V5.b.e()) {
                return y8;
            }
            return I.f8786a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object getMeasurementApiStatus(U5.d dVar) {
            C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
            c3472p.B();
            this.mMeasurementManager.getMeasurementApiStatus(new androidx.privacysandbox.ads.adservices.adid.g(), OutcomeReceiverKt.asOutcomeReceiver(c3472p));
            Object y8 = c3472p.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y8;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object registerSource(Uri uri, InputEvent inputEvent, U5.d dVar) {
            C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
            c3472p.B();
            this.mMeasurementManager.registerSource(uri, inputEvent, new androidx.privacysandbox.ads.adservices.adid.g(), OutcomeReceiverKt.asOutcomeReceiver(c3472p));
            Object y8 = c3472p.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (y8 == V5.b.e()) {
                return y8;
            }
            return I.f8786a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object registerTrigger(Uri uri, U5.d dVar) {
            C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
            c3472p.B();
            this.mMeasurementManager.registerTrigger(uri, new androidx.privacysandbox.ads.adservices.adid.g(), OutcomeReceiverKt.asOutcomeReceiver(c3472p));
            Object y8 = c3472p.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (y8 == V5.b.e()) {
                return y8;
            }
            return I.f8786a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, U5.d dVar) {
            C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
            c3472p.B();
            this.mMeasurementManager.registerWebSource(convertWebSourceRequest(webSourceRegistrationRequest), new androidx.privacysandbox.ads.adservices.adid.g(), OutcomeReceiverKt.asOutcomeReceiver(c3472p));
            Object y8 = c3472p.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (y8 == V5.b.e()) {
                return y8;
            }
            return I.f8786a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, U5.d dVar) {
            C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
            c3472p.B();
            this.mMeasurementManager.registerWebTrigger(convertWebTriggerRequest(webTriggerRegistrationRequest), new androidx.privacysandbox.ads.adservices.adid.g(), OutcomeReceiverKt.asOutcomeReceiver(c3472p));
            Object y8 = c3472p.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (y8 == V5.b.e()) {
                return y8;
            }
            return I.f8786a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Api33Ext5Impl(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.AbstractC3292y.i(r2, r0)
                java.lang.Class r0 = androidx.privacysandbox.ads.adservices.measurement.AbstractC1943g.a()
                java.lang.Object r2 = g.AbstractC2877d.a(r2, r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.AbstractC3292y.h(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = androidx.privacysandbox.ads.adservices.measurement.AbstractC1944h.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.measurement.MeasurementManager.Api33Ext5Impl.<init>(android.content.Context):void");
        }
    }
}
