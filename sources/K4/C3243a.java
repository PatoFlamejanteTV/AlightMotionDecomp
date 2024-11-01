package k4;

import Q5.s;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.net.PlacesClient;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3292y;
import p3.i;

/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3243a implements InterfaceC3244b {

    /* renamed from: b, reason: collision with root package name */
    private final PlacesClient f34489b;

    /* renamed from: c, reason: collision with root package name */
    private final i f34490c;

    /* renamed from: d, reason: collision with root package name */
    private final AutocompleteSessionToken f34491d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0787a extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f34492a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34493b;

        /* renamed from: d, reason: collision with root package name */
        int f34495d;

        C0787a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34493b = obj;
            this.f34495d |= Integer.MIN_VALUE;
            Object a9 = C3243a.this.a(null, this);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return s.a(a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k4.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f34496a;

        /* renamed from: b, reason: collision with root package name */
        int f34497b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34498c;

        /* renamed from: e, reason: collision with root package name */
        int f34500e;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34498c = obj;
            this.f34500e |= Integer.MIN_VALUE;
            Object b9 = C3243a.this.b(null, null, 0, this);
            if (b9 == V5.b.e()) {
                return b9;
            }
            return s.a(b9);
        }
    }

    public C3243a(PlacesClient client, i errorReporter) {
        AbstractC3292y.i(client, "client");
        AbstractC3292y.i(errorReporter, "errorReporter");
        this.f34489b = client;
        this.f34490c = errorReporter;
        this.f34491d = AutocompleteSessionToken.newInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // k4.InterfaceC3244b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r7, U5.d r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.C3243a.a(java.lang.String, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1 A[Catch: Exception -> 0x002f, LOOP:0: B:13:0x009b->B:15:0x00a1, LOOP_END, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x002b, B:12:0x0072, B:13:0x009b, B:15:0x00a1, B:17:0x00d5), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // k4.InterfaceC3244b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.String r11, java.lang.String r12, int r13, U5.d r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.C3243a.b(java.lang.String, java.lang.String, int, U5.d):java.lang.Object");
    }
}
