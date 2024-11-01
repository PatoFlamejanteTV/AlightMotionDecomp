package M7;

import Q5.I;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f6239e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static volatile b f6240f;

    /* renamed from: a, reason: collision with root package name */
    private final Map f6241a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f6242b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f6243c;

    /* renamed from: d, reason: collision with root package name */
    private N7.f f6244d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final synchronized b a(Context context) {
            try {
                AbstractC3292y.i(context, "context");
                if (b.f6240f == null) {
                    synchronized (b.class) {
                        try {
                            if (b.f6240f == null) {
                                b.f6240f = new b(context, null);
                            }
                            I i8 = I.f8786a;
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return b.f6240f;
        }

        public final String b(Class... classes) {
            AbstractC3292y.i(classes, "classes");
            int length = classes.length;
            String[] strArr = new String[length];
            int length2 = classes.length;
            for (int i8 = 0; i8 < length2; i8++) {
                strArr[i8] = classes[i8].getSimpleName();
            }
            return c((String[]) Arrays.copyOf(strArr, length));
        }

        public final String c(String... tags) {
            AbstractC3292y.i(tags, "tags");
            StringBuilder sb = new StringBuilder("MATOMO:");
            int length = tags.length;
            for (int i8 = 0; i8 < length; i8++) {
                sb.append(tags[i8]);
                if (i8 < tags.length - 1) {
                    sb.append(":");
                }
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "toString(...)");
            return sb2;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ b(Context context, AbstractC3284p abstractC3284p) {
        this(context);
    }

    public static final synchronized b f(Context context) {
        b a9;
        synchronized (b.class) {
            a9 = f6239e.a(context);
        }
        return a9;
    }

    public static final String i(Class... clsArr) {
        return f6239e.b(clsArr);
    }

    public final Context c() {
        return this.f6242b;
    }

    public final P7.d d() {
        return new P7.d(this.f6242b, new P7.e(), new P7.a());
    }

    public final N7.f e() {
        return this.f6244d;
    }

    public final SharedPreferences g() {
        return this.f6243c;
    }

    public final SharedPreferences h(e tracker) {
        SharedPreferences sharedPreferences;
        String str;
        AbstractC3292y.i(tracker, "tracker");
        synchronized (this.f6241a) {
            sharedPreferences = (SharedPreferences) this.f6241a.get(tracker);
            if (sharedPreferences == null) {
                try {
                    str = "org.matomo.sdk_" + P7.b.b(tracker.d());
                } catch (Exception e8) {
                    V7.a.f10704a.d(e8);
                    str = "org.matomo.sdk_" + tracker.d();
                }
                sharedPreferences = this.f6242b.getSharedPreferences(str, 0);
                this.f6241a.put(tracker, sharedPreferences);
            }
        }
        return sharedPreferences;
    }

    private b(Context context) {
        this.f6241a = new HashMap();
        this.f6244d = new N7.b();
        this.f6242b = context.getApplicationContext();
        this.f6243c = context.getSharedPreferences("org.matomo.sdk", 0);
    }
}
