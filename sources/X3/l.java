package X3;

import R5.AbstractC1435t;
import X3.n;
import android.os.Debug;
import android.os.Environment;
import b4.C1971b;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private final n f11186a;

    /* loaded from: classes4.dex */
    public static final class b extends l {

        /* renamed from: b, reason: collision with root package name */
        private static final a f11190b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final n f11191c = new n("SW02", "An emulator is being used to run the App.", n.b.f11204c);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public b() {
            super(f11191c, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:            if (l6.n.B(r0, "generic", false, 2, null) == false) goto L18;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean c() {
            /*
                r7 = this;
                java.lang.String r0 = android.os.Build.FINGERPRINT
                java.lang.String r1 = "FINGERPRINT"
                kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
                java.lang.String r2 = "generic"
                r3 = 0
                r4 = 2
                r5 = 0
                boolean r6 = l6.n.B(r0, r2, r3, r4, r5)
                if (r6 != 0) goto L73
                kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
                java.lang.String r1 = "unknown"
                boolean r0 = l6.n.B(r0, r1, r3, r4, r5)
                if (r0 != 0) goto L73
                java.lang.String r0 = android.os.Build.MODEL
                java.lang.String r1 = "MODEL"
                kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
                java.lang.String r6 = "Emulator"
                boolean r6 = l6.n.G(r0, r6, r3, r4, r5)
                if (r6 != 0) goto L73
                kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
                java.lang.String r6 = "Android SDK built for x86"
                boolean r6 = l6.n.G(r0, r6, r3, r4, r5)
                if (r6 != 0) goto L73
                kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
                java.lang.String r1 = "google_sdk"
                boolean r0 = l6.n.G(r0, r1, r3, r4, r5)
                if (r0 != 0) goto L73
                java.lang.String r0 = android.os.Build.MANUFACTURER
                java.lang.String r6 = "MANUFACTURER"
                kotlin.jvm.internal.AbstractC3292y.h(r0, r6)
                java.lang.String r6 = "Genymotion"
                boolean r0 = l6.n.G(r0, r6, r3, r4, r5)
                if (r0 != 0) goto L73
                java.lang.String r0 = android.os.Build.BRAND
                java.lang.String r6 = "BRAND"
                kotlin.jvm.internal.AbstractC3292y.h(r0, r6)
                boolean r0 = l6.n.B(r0, r2, r3, r4, r5)
                if (r0 == 0) goto L6b
                java.lang.String r0 = android.os.Build.DEVICE
                java.lang.String r6 = "DEVICE"
                kotlin.jvm.internal.AbstractC3292y.h(r0, r6)
                boolean r0 = l6.n.B(r0, r2, r3, r4, r5)
                if (r0 != 0) goto L73
            L6b:
                java.lang.String r0 = android.os.Build.PRODUCT
                boolean r0 = kotlin.jvm.internal.AbstractC3292y.d(r1, r0)
                if (r0 == 0) goto L74
            L73:
                r3 = 1
            L74:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: X3.l.b.c():boolean");
        }

        @Override // X3.l
        public boolean a() {
            return c();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends l {

        /* renamed from: b, reason: collision with root package name */
        private static final a f11192b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final List f11193c = AbstractC1435t.p("/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/");

        /* renamed from: d, reason: collision with root package name */
        private static final n f11194d = new n("SW01", "The device is jailbroken.", n.b.f11204c);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public c() {
            super(f11194d, null);
        }

        private final boolean c() {
            List list = f11193c;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (new File(((String) it.next()) + DownloadCommon.DOWNLOAD_REPORT_SUCCESS).exists()) {
                    return true;
                }
            }
            return false;
        }

        private final boolean d() {
            return new File(Environment.getRootDirectory().toString() + "/Superuser").isDirectory();
        }

        @Override // X3.l
        public boolean a() {
            if (!c() && !d()) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends l {

        /* renamed from: b, reason: collision with root package name */
        private static final a f11195b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final n f11196c = new n("SW02", "The integrity of the SDK has been tampered.", n.b.f11204c);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public d() {
            super(f11196c, null);
        }

        private final boolean c() {
            Field[] declaredFields = C1971b.class.getDeclaredFields();
            AbstractC3292y.h(declaredFields, "getDeclaredFields(...)");
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if (true ^ field.isSynthetic()) {
                    arrayList.add(field);
                }
            }
            if (arrayList.size() != 8) {
                return false;
            }
            return true;
        }

        private final boolean d() {
            Method[] declaredMethods = C1971b.class.getDeclaredMethods();
            AbstractC3292y.h(declaredMethods, "getDeclaredMethods(...)");
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                if (true ^ method.isSynthetic()) {
                    arrayList.add(method);
                }
            }
            if (arrayList.size() != 5) {
                return false;
            }
            return true;
        }

        @Override // X3.l
        public boolean a() {
            if (c() && d()) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends l {

        /* renamed from: b, reason: collision with root package name */
        private static final a f11197b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final n f11198c = new n("SW05", "The OS or the OS version is not supported.", n.b.f11204c);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public e() {
            super(f11198c, null);
        }

        @Override // X3.l
        public boolean a() {
            return false;
        }
    }

    public /* synthetic */ l(n nVar, AbstractC3284p abstractC3284p) {
        this(nVar);
    }

    public abstract boolean a();

    public final n b() {
        return this.f11186a;
    }

    /* loaded from: classes4.dex */
    public static final class a extends l {

        /* renamed from: c, reason: collision with root package name */
        private static final C0239a f11187c = new C0239a(null);

        /* renamed from: d, reason: collision with root package name */
        private static final n f11188d = new n("SW04", "A debugger is attached to the App.", n.b.f11203b);

        /* renamed from: b, reason: collision with root package name */
        private final boolean f11189b;

        /* renamed from: X3.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0239a {
            private C0239a() {
            }

            public /* synthetic */ C0239a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public /* synthetic */ a(boolean z8, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? Debug.isDebuggerConnected() : z8);
        }

        @Override // X3.l
        public boolean a() {
            return this.f11189b;
        }

        public a(boolean z8) {
            super(f11188d, null);
            this.f11189b = z8;
        }
    }

    private l(n nVar) {
        this.f11186a = nVar;
    }
}
