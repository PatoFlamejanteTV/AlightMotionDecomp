package B;

import B.c;
import android.app.job.JobInfo;
import androidx.work.WorkRequest;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class f {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private E.a f309a;

        /* renamed from: b, reason: collision with root package name */
        private Map f310b = new HashMap();

        public a a(s.f fVar, b bVar) {
            this.f310b.put(fVar, bVar);
            return this;
        }

        public f b() {
            if (this.f309a != null) {
                if (this.f310b.keySet().size() >= s.f.values().length) {
                    Map map = this.f310b;
                    this.f310b = new HashMap();
                    return f.d(this.f309a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        public a c(E.a aVar) {
            this.f309a = aVar;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b {

        /* loaded from: classes3.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j8);

            public abstract a c(Set set);

            public abstract a d(long j8);
        }

        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long d();
    }

    /* loaded from: classes3.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i8, long j8) {
        long j9;
        int i9 = i8 - 1;
        if (j8 > 1) {
            j9 = j8;
        } else {
            j9 = 2;
        }
        return (long) (Math.pow(3.0d, i9) * j8 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j9 * i9)));
    }

    public static a b() {
        return new a();
    }

    static f d(E.a aVar, Map map) {
        return new B.b(aVar, map);
    }

    public static f f(E.a aVar) {
        return b().a(s.f.DEFAULT, b.a().b(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).d(86400000L).a()).a(s.f.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(s.f.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, s.f fVar, long j8, int i8) {
        builder.setMinimumLatency(g(fVar, j8, i8));
        j(builder, ((b) h().get(fVar)).c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract E.a e();

    public long g(s.f fVar, long j8, int i8) {
        long a9 = j8 - e().a();
        b bVar = (b) h().get(fVar);
        return Math.min(Math.max(a(i8, bVar.b()), a9), bVar.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map h();
}
