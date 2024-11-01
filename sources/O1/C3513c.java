package o1;

import Q5.I;
import Q5.InterfaceC1416k;
import Q5.t;
import android.util.Log;
import androidx.datastore.core.DataStore;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.j;
import m1.C3352b;
import m6.AbstractC3376c;
import m6.C3374a;
import m6.EnumC3377d;
import org.json.JSONObject;
import w6.AbstractC4160c;
import w6.InterfaceC4158a;

/* renamed from: o1.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3513c implements InterfaceC3518h {

    /* renamed from: g, reason: collision with root package name */
    private static final a f35840g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final U5.g f35841a;

    /* renamed from: b, reason: collision with root package name */
    private final d1.e f35842b;

    /* renamed from: c, reason: collision with root package name */
    private final C3352b f35843c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3511a f35844d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1416k f35845e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC4158a f35846f;

    /* renamed from: o1.c$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: o1.c$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataStore f35847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DataStore dataStore) {
            super(0);
            this.f35847a = dataStore;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3517g invoke() {
            return new C3517g(this.f35847a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0815c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f35848a;

        /* renamed from: b, reason: collision with root package name */
        Object f35849b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f35850c;

        /* renamed from: e, reason: collision with root package name */
        int f35852e;

        C0815c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35850c = obj;
            this.f35852e |= Integer.MIN_VALUE;
            return C3513c.this.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f35853a;

        /* renamed from: b, reason: collision with root package name */
        Object f35854b;

        /* renamed from: c, reason: collision with root package name */
        int f35855c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f35856d;

        d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f35856d = obj;
            return dVar2;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, U5.d dVar) {
            return ((d) create(jSONObject, dVar)).invokeSuspend(I.f8786a);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0195 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 428
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o1.C3513c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1.c$e */
    /* loaded from: classes4.dex */
    public static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f35858a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35859b;

        e(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            e eVar = new e(dVar);
            eVar.f35859b = obj;
            return eVar;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, U5.d dVar) {
            return ((e) create(str, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f35858a == 0) {
                t.b(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f35859b));
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3513c(U5.g backgroundDispatcher, d1.e firebaseInstallationsApi, C3352b appInfo, InterfaceC3511a configsFetcher, DataStore dataStore) {
        AbstractC3292y.i(backgroundDispatcher, "backgroundDispatcher");
        AbstractC3292y.i(firebaseInstallationsApi, "firebaseInstallationsApi");
        AbstractC3292y.i(appInfo, "appInfo");
        AbstractC3292y.i(configsFetcher, "configsFetcher");
        AbstractC3292y.i(dataStore, "dataStore");
        this.f35841a = backgroundDispatcher;
        this.f35842b = firebaseInstallationsApi;
        this.f35843c = appInfo;
        this.f35844d = configsFetcher;
        this.f35845e = Q5.l.b(new b(dataStore));
        this.f35846f = AbstractC4160c.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3517g f() {
        return (C3517g) this.f35845e.getValue();
    }

    private final String g(String str) {
        return new j("/").f(str, "");
    }

    @Override // o1.InterfaceC3518h
    public Boolean a() {
        return f().g();
    }

    @Override // o1.InterfaceC3518h
    public C3374a b() {
        Integer e8 = f().e();
        if (e8 != null) {
            C3374a.C0804a c0804a = C3374a.f35036b;
            return C3374a.e(AbstractC3376c.s(e8.intValue(), EnumC3377d.f35046e));
        }
        return null;
    }

    @Override // o1.InterfaceC3518h
    public Double c() {
        return f().f();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(4:(2:3|(7:5|6|7|(1:(1:(1:(8:12|13|14|15|16|17|18|19)(2:29|30))(4:31|32|33|(3:35|36|37)(2:38|(1:40)(5:41|16|17|18|19))))(1:45))(2:55|(2:61|(1:63)(1:64))(2:59|60))|46|47|(3:49|50|51)(4:52|(1:54)|33|(0)(0))))|46|47|(0)(0))|67|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0055, code lost:            r0 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0056, code lost:            r2 = r8;     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x0051, B:35:0x00c1, B:49:0x0097), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc A[Catch: all -> 0x0162, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0162, blocks: (B:33:0x00b3, B:38:0x00cc, B:47:0x008d, B:52:0x00a2), top: B:46:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x0051, B:35:0x00c1, B:49:0x0097), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2 A[Catch: all -> 0x0162, TRY_ENTER, TryCatch #0 {all -> 0x0162, blocks: (B:33:0x00b3, B:38:0x00cc, B:47:0x008d, B:52:0x00a2), top: B:46:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    @Override // o1.InterfaceC3518h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(U5.d r17) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.C3513c.d(U5.d):java.lang.Object");
    }
}
