package n1;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n1.InterfaceC3389b;
import w6.AbstractC4160c;
import w6.InterfaceC4158a;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3388a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3388a f35071a = new C3388a();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f35072b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0805a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4158a f35073a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC3389b f35074b;

        public C0805a(InterfaceC4158a mutex, InterfaceC3389b interfaceC3389b) {
            AbstractC3292y.i(mutex, "mutex");
            this.f35073a = mutex;
            this.f35074b = interfaceC3389b;
        }

        public final InterfaceC4158a a() {
            return this.f35073a;
        }

        public final InterfaceC3389b b() {
            return this.f35074b;
        }

        public final void c(InterfaceC3389b interfaceC3389b) {
            this.f35074b = interfaceC3389b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0805a)) {
                return false;
            }
            C0805a c0805a = (C0805a) obj;
            if (AbstractC3292y.d(this.f35073a, c0805a.f35073a) && AbstractC3292y.d(this.f35074b, c0805a.f35074b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f35073a.hashCode() * 31;
            InterfaceC3389b interfaceC3389b = this.f35074b;
            if (interfaceC3389b == null) {
                hashCode = 0;
            } else {
                hashCode = interfaceC3389b.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Dependency(mutex=" + this.f35073a + ", subscriber=" + this.f35074b + ')';
        }

        public /* synthetic */ C0805a(InterfaceC4158a interfaceC4158a, InterfaceC3389b interfaceC3389b, int i8, AbstractC3284p abstractC3284p) {
            this(interfaceC4158a, (i8 & 2) != 0 ? null : interfaceC3389b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f35075a;

        /* renamed from: b, reason: collision with root package name */
        Object f35076b;

        /* renamed from: c, reason: collision with root package name */
        Object f35077c;

        /* renamed from: d, reason: collision with root package name */
        Object f35078d;

        /* renamed from: e, reason: collision with root package name */
        Object f35079e;

        /* renamed from: f, reason: collision with root package name */
        Object f35080f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f35081g;

        /* renamed from: i, reason: collision with root package name */
        int f35083i;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35081g = obj;
            this.f35083i |= Integer.MIN_VALUE;
            return C3388a.this.c(this);
        }
    }

    private C3388a() {
    }

    public static final void a(InterfaceC3389b.a subscriberName) {
        AbstractC3292y.i(subscriberName, "subscriberName");
        if (subscriberName != InterfaceC3389b.a.PERFORMANCE) {
            Map dependencies = f35072b;
            if (dependencies.containsKey(subscriberName)) {
                Log.d("SessionsDependencies", "Dependency " + subscriberName + " already added.");
                return;
            }
            AbstractC3292y.h(dependencies, "dependencies");
            dependencies.put(subscriberName, new C0805a(AbstractC4160c.a(true), null, 2, 0 == true ? 1 : 0));
            Log.d("SessionsDependencies", "Dependency to " + subscriberName + " added.");
            return;
        }
        throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
    }

    private final C0805a b(InterfaceC3389b.a aVar) {
        Map dependencies = f35072b;
        AbstractC3292y.h(dependencies, "dependencies");
        Object obj = dependencies.get(aVar);
        if (obj != null) {
            AbstractC3292y.h(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (C0805a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static final void e(InterfaceC3389b subscriber) {
        AbstractC3292y.i(subscriber, "subscriber");
        InterfaceC3389b.a b9 = subscriber.b();
        C0805a b10 = f35071a.b(b9);
        if (b10.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + b9 + " already registered.");
            return;
        }
        b10.c(subscriber);
        Log.d("SessionsDependencies", "Subscriber " + b9 + " registered.");
        InterfaceC4158a.C0922a.c(b10.a(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a1 -> B:10:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(U5.d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof n1.C3388a.b
            if (r0 == 0) goto L13
            r0 = r11
            n1.a$b r0 = (n1.C3388a.b) r0
            int r1 = r0.f35083i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35083i = r1
            goto L18
        L13:
            n1.a$b r0 = new n1.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f35081g
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f35083i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f35080f
            java.lang.Object r5 = r0.f35079e
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f35078d
            w6.a r6 = (w6.InterfaceC4158a) r6
            java.lang.Object r7 = r0.f35077c
            n1.b$a r7 = (n1.InterfaceC3389b.a) r7
            java.lang.Object r8 = r0.f35076b
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f35075a
            java.util.Map r9 = (java.util.Map) r9
            Q5.t.b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            Q5.t.b(r11)
            java.util.Map r11 = n1.C3388a.f35072b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.AbstractC3292y.h(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = R5.Q.d(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            n1.b$a r7 = (n1.InterfaceC3389b.a) r7
            java.lang.Object r11 = r11.getValue()
            n1.a$a r11 = (n1.C3388a.C0805a) r11
            w6.a r6 = r11.a()
            r0.f35075a = r5
            r0.f35076b = r8
            r0.f35077c = r7
            r0.f35078d = r6
            r0.f35079e = r5
            r0.f35080f = r2
            r0.f35083i = r3
            java.lang.Object r11 = r6.a(r4, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            n1.a r11 = n1.C3388a.f35071a     // Catch: java.lang.Throwable -> Lb0
            n1.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.d(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.d(r4)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C3388a.c(U5.d):java.lang.Object");
    }

    public final InterfaceC3389b d(InterfaceC3389b.a subscriberName) {
        AbstractC3292y.i(subscriberName, "subscriberName");
        InterfaceC3389b b9 = b(subscriberName).b();
        if (b9 != null) {
            return b9;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}
