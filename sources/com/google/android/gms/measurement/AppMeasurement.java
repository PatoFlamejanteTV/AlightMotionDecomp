package com.google.android.gms.measurement;

import Q.AbstractC1396p;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.C2107c1;
import com.google.android.gms.measurement.internal.S2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l0.o;
import l0.z;

@Deprecated
/* loaded from: classes3.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f17101b;

    /* renamed from: a, reason: collision with root package name */
    private final a f17102a;

    /* loaded from: classes3.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @NonNull
        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @NonNull
        @Keep
        public String mExpiredEventName;

        @NonNull
        @Keep
        public Bundle mExpiredEventParams;

        @NonNull
        @Keep
        public String mName;

        @NonNull
        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @NonNull
        @Keep
        public String mTimedOutEventName;

        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @NonNull
        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @NonNull
        @Keep
        public String mTriggeredEventName;

        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @NonNull
        @Keep
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            AbstractC1396p.l(bundle);
            this.mAppId = (String) o.a(bundle, MBridgeConstans.APP_ID, String.class, null);
            this.mOrigin = (String) o.a(bundle, TtmlNode.ATTR_TTS_ORIGIN, String.class, null);
            this.mName = (String) o.a(bundle, "name", String.class, null);
            this.mValue = o.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) o.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) o.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) o.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) o.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) o.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) o.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) o.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) o.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) o.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) o.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) o.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) o.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class a implements z {
        private a() {
        }
    }

    private AppMeasurement(S2 s22) {
        this.f17102a = new b(s22);
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f17101b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f17101b == null) {
                        z b9 = b(context, null);
                        if (b9 != null) {
                            f17101b = new AppMeasurement(b9);
                        } else {
                            f17101b = new AppMeasurement(S2.b(context, new C2107c1(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return f17101b;
    }

    private static z b(Context context, Bundle bundle) {
        return (z) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    @NonNull
    @Keep
    @Deprecated
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurement getInstance(@NonNull Context context) {
        return a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.f17102a.i(str);
    }

    @Keep
    public void clearConditionalUserProperty(@NonNull @Size(max = 24, min = 1) String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f17102a.b(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.f17102a.g(str);
    }

    @Keep
    public long generateEventId() {
        return this.f17102a.A();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f17102a.e();
    }

    @NonNull
    @Keep
    @WorkerThread
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull @Size(max = 23, min = 1) String str2) {
        int size;
        List h8 = this.f17102a.h(str, str2);
        if (h8 == null) {
            size = 0;
        } else {
            size = h8.size();
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = h8.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f17102a.B();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f17102a.d();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f17102a.a();
    }

    @Keep
    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size(min = 1) String str) {
        return this.f17102a.c(str);
    }

    @NonNull
    @Keep
    @VisibleForTesting
    @WorkerThread
    protected Map<String, Object> getUserProperties(@NonNull String str, @NonNull @Size(max = 24, min = 1) String str2, boolean z8) {
        return this.f17102a.j(str, str2, z8);
    }

    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f17102a.k(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        AbstractC1396p.l(conditionalUserProperty);
        a aVar = this.f17102a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(MBridgeConstans.APP_ID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(TtmlNode.ATTR_TTS_ORIGIN, str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            o.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.f(bundle);
    }

    private AppMeasurement(z zVar) {
        this.f17102a = new com.google.android.gms.measurement.a(zVar);
    }
}
