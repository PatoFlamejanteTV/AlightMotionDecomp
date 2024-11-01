package N4;

import Q5.I;
import Q5.t;
import S4.r;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.documentfile.provider.DocumentFile;
import c6.InterfaceC2072n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3488x0;
import n6.M;
import n6.N;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0124a f6623e = new C0124a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f6624a;

    /* renamed from: b, reason: collision with root package name */
    private final O4.b f6625b;

    /* renamed from: c, reason: collision with root package name */
    private String f6626c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6627d;

    /* renamed from: N4.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0124a {
        private C0124a() {
        }

        public /* synthetic */ C0124a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6628a;

        /* renamed from: c, reason: collision with root package name */
        int f6630c;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6628a = obj;
            this.f6630c |= Integer.MIN_VALUE;
            return a.this.l(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6631a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P4.b f6633c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(P4.b bVar, U5.d dVar) {
            super(2, dVar);
            this.f6633c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f6633c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6631a == 0) {
                t.b(obj);
                O4.b bVar = a.this.f6625b;
                if (bVar != null) {
                    bVar.f(this.f6633c);
                    return I.f8786a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6634a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P4.b f6636c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(P4.b bVar, U5.d dVar) {
            super(2, dVar);
            this.f6636c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f6636c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6634a == 0) {
                t.b(obj);
                O4.b bVar = a.this.f6625b;
                if (bVar != null) {
                    bVar.f(this.f6636c);
                    return I.f8786a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6637a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P4.b f6639c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(P4.b bVar, U5.d dVar) {
            super(2, dVar);
            this.f6639c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f6639c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6637a == 0) {
                t.b(obj);
                O4.b bVar = a.this.f6625b;
                if (bVar != null) {
                    bVar.b(this.f6639c);
                    return I.f8786a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f6640a;

        /* renamed from: b, reason: collision with root package name */
        Object f6641b;

        /* renamed from: c, reason: collision with root package name */
        int f6642c;

        /* renamed from: d, reason: collision with root package name */
        int f6643d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f6644e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f6645f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N4.a$f$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0125a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6646a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f6647b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ P4.b f6648c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f6649d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0125a(a aVar, P4.b bVar, int i8, U5.d dVar) {
                super(2, dVar);
                this.f6647b = aVar;
                this.f6648c = bVar;
                this.f6649d = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0125a(this.f6647b, this.f6648c, this.f6649d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f6646a == 0) {
                    t.b(obj);
                    O4.b bVar = this.f6647b.f6625b;
                    if (bVar != null) {
                        bVar.a(this.f6648c, this.f6649d);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0125a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6650a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f6651b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f6652c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar, ArrayList arrayList, U5.d dVar) {
                super(2, dVar);
                this.f6651b = aVar;
                this.f6652c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f6651b, this.f6652c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f6650a == 0) {
                    t.b(obj);
                    O4.b bVar = this.f6651b.f6625b;
                    if (bVar != null) {
                        bVar.c(this.f6652c);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ArrayList arrayList, a aVar, U5.d dVar) {
            super(2, dVar);
            this.f6644e = arrayList;
            this.f6645f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f6644e, this.f6645f, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008c -> B:13:0x004b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r11.f6643d
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L39
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                Q5.t.b(r12)
                goto La7
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                int r1 = r11.f6642c
                java.lang.Object r6 = r11.f6640a
                java.util.Iterator r6 = (java.util.Iterator) r6
                Q5.t.b(r12)
                r12 = r6
                goto L4b
            L2a:
                int r1 = r11.f6642c
                java.lang.Object r6 = r11.f6641b
                P4.b r6 = (P4.b) r6
                java.lang.Object r7 = r11.f6640a
                java.util.Iterator r7 = (java.util.Iterator) r7
                Q5.t.b(r12)
                r12 = r7
                goto L75
            L39:
                Q5.t.b(r12)
                java.util.ArrayList r12 = r11.f6644e
                int r12 = r12.size()
                if (r12 <= 0) goto La7
                java.util.ArrayList r12 = r11.f6644e
                java.util.Iterator r12 = r12.iterator()
                r1 = 0
            L4b:
                boolean r6 = r12.hasNext()
                if (r6 == 0) goto L8f
                int r6 = r1 + 1
                java.lang.Object r7 = r12.next()
                P4.b r7 = (P4.b) r7
                n6.J0 r8 = n6.C3445b0.c()
                N4.a$f$a r9 = new N4.a$f$a
                N4.a r10 = r11.f6645f
                r9.<init>(r10, r7, r1, r5)
                r11.f6640a = r12
                r11.f6641b = r7
                r11.f6642c = r6
                r11.f6643d = r4
                java.lang.Object r1 = n6.AbstractC3458i.g(r8, r9, r11)
                if (r1 != r0) goto L73
                return r0
            L73:
                r1 = r6
                r6 = r7
            L75:
                N4.a r7 = r11.f6645f
                java.lang.String r7 = N4.a.g(r7, r6)
                r6.d(r7)
                N4.a r7 = r11.f6645f
                r11.f6640a = r12
                r11.f6641b = r5
                r11.f6642c = r1
                r11.f6643d = r3
                java.lang.Object r6 = N4.a.d(r7, r6, r11)
                if (r6 != r0) goto L4b
                return r0
            L8f:
                n6.J0 r12 = n6.C3445b0.c()
                N4.a$f$b r1 = new N4.a$f$b
                N4.a r3 = r11.f6645f
                java.util.ArrayList r4 = r11.f6644e
                r1.<init>(r3, r4, r5)
                r11.f6640a = r5
                r11.f6643d = r2
                java.lang.Object r12 = n6.AbstractC3458i.g(r12, r1, r11)
                if (r12 != r0) goto La7
                return r0
            La7:
                Q5.I r12 = Q5.I.f8786a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6653a;

        /* renamed from: b, reason: collision with root package name */
        Object f6654b;

        /* renamed from: c, reason: collision with root package name */
        Object f6655c;

        /* renamed from: d, reason: collision with root package name */
        Object f6656d;

        /* renamed from: e, reason: collision with root package name */
        Object f6657e;

        /* renamed from: f, reason: collision with root package name */
        int f6658f;

        /* renamed from: g, reason: collision with root package name */
        int f6659g;

        /* renamed from: h, reason: collision with root package name */
        long f6660h;

        /* renamed from: i, reason: collision with root package name */
        long f6661i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f6662j;

        /* renamed from: l, reason: collision with root package name */
        int f6664l;

        g(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6662j = obj;
            this.f6664l |= Integer.MIN_VALUE;
            return a.this.n(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6665a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6667c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i8, U5.d dVar) {
            super(2, dVar);
            this.f6667c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f6667c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6665a == 0) {
                t.b(obj);
                O4.b bVar = a.this.f6625b;
                if (bVar != null) {
                    bVar.g(this.f6667c);
                    return I.f8786a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6668a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P4.b f6670c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(P4.b bVar, U5.d dVar) {
            super(2, dVar);
            this.f6670c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new i(this.f6670c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6668a == 0) {
                t.b(obj);
                O4.b bVar = a.this.f6625b;
                if (bVar != null) {
                    bVar.f(this.f6670c);
                    return I.f8786a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6671a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P4.b f6673c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(P4.b bVar, U5.d dVar) {
            super(2, dVar);
            this.f6673c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new j(this.f6673c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6671a == 0) {
                t.b(obj);
                O4.b bVar = a.this.f6625b;
                if (bVar != null) {
                    bVar.d(this.f6673c);
                    return I.f8786a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6674a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f6676c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ArrayList arrayList, U5.d dVar) {
            super(2, dVar);
            this.f6676c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(this.f6676c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:            if (r0.exists() != false) goto L27;     */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:            r0.delete();     */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:            if (r4.exists() != false) goto L34;     */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:            r4.delete();     */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:            if (r0.exists() != false) goto L27;     */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:            if (r4.exists() != false) goto L34;     */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                Method dump skipped, instructions count: 333
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6677a;

        /* renamed from: b, reason: collision with root package name */
        Object f6678b;

        /* renamed from: c, reason: collision with root package name */
        Object f6679c;

        /* renamed from: d, reason: collision with root package name */
        Object f6680d;

        /* renamed from: e, reason: collision with root package name */
        Object f6681e;

        /* renamed from: f, reason: collision with root package name */
        Object f6682f;

        /* renamed from: g, reason: collision with root package name */
        long f6683g;

        /* renamed from: h, reason: collision with root package name */
        long f6684h;

        /* renamed from: i, reason: collision with root package name */
        int f6685i;

        /* renamed from: j, reason: collision with root package name */
        int f6686j;

        /* renamed from: k, reason: collision with root package name */
        int f6687k;

        /* renamed from: l, reason: collision with root package name */
        int f6688l;

        /* renamed from: m, reason: collision with root package name */
        int f6689m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f6690n;

        /* renamed from: p, reason: collision with root package name */
        int f6692p;

        l(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6690n = obj;
            this.f6692p |= Integer.MIN_VALUE;
            return a.this.u(null, null, null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6693a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6695c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, U5.d dVar) {
            super(2, dVar);
            this.f6695c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new m(this.f6695c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6693a == 0) {
                t.b(obj);
                O4.b bVar = a.this.f6625b;
                if (bVar != null) {
                    bVar.e(this.f6695c);
                    return I.f8786a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6696a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6698c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i8, U5.d dVar) {
            super(2, dVar);
            this.f6698c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new n(this.f6698c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6696a == 0) {
                t.b(obj);
                O4.b bVar = a.this.f6625b;
                if (bVar != null) {
                    bVar.g(this.f6698c);
                    return I.f8786a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public a(Context context, O4.b bVar) {
        AbstractC3292y.i(context, "context");
        this.f6624a = context;
        this.f6625b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:17)(2:14|15))(3:20|21|(2:23|(2:25|(4:27|(1:29)|30|(2:32|(1:34)))(2:35|(1:37)))(2:38|(4:40|41|(1:43)(2:59|(1:63))|(4:45|(1:47)|48|(2:50|(1:52))(2:53|(1:55)))(2:56|(1:58))))))|18|19))|66|6|7|(0)(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x003c, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(P4.b r20, U5.d r21) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.a.l(P4.b, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(ArrayList arrayList, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new f(arrayList, this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0103, code lost:            r6 = r23;        r3 = r17;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0100 -> B:10:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r23, java.lang.Object r24, U5.d r25) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.a.n(java.lang.Object, java.lang.Object, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(P4.b r23, U5.d r24) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.a.o(P4.b, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p(P4.b bVar) {
        String m8;
        L4.a aVar = new L4.a(this.f6624a);
        if (aVar.i()) {
            m8 = new S4.e().m(bVar.b());
        } else {
            m8 = new S4.e().m(bVar.c());
        }
        if (aVar.k()) {
            return m8 + '_' + s(bVar);
        }
        return m8;
    }

    private final InputStream q(Object obj) {
        InputStream inputStream;
        if (obj instanceof File) {
            return new FileInputStream((File) obj);
        }
        if (obj instanceof DocumentFile) {
            ContentResolver contentResolver = this.f6624a.getContentResolver();
            if (contentResolver != null) {
                inputStream = contentResolver.openInputStream(((DocumentFile) obj).getUri());
            } else {
                inputStream = null;
            }
            AbstractC3292y.f(inputStream);
            return inputStream;
        }
        throw new Exception("getInputStream: Illegal parameter type");
    }

    private final OutputStream r(Object obj) {
        OutputStream outputStream;
        if (obj instanceof File) {
            return new FileOutputStream((File) obj);
        }
        if (obj instanceof DocumentFile) {
            DocumentFile documentFile = (DocumentFile) obj;
            if (documentFile.getName() != null) {
                ContentResolver contentResolver = this.f6624a.getContentResolver();
                if (contentResolver != null) {
                    outputStream = contentResolver.openOutputStream(documentFile.getUri());
                } else {
                    outputStream = null;
                }
                AbstractC3292y.f(outputStream);
                return outputStream;
            }
            throw new Exception("getOutputStream: DocumentFile name is null");
        }
        throw new Exception("getOutputStream: Illegal parameter type");
    }

    private final long s(P4.b bVar) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = this.f6624a.getPackageManager();
            AbstractC3292y.h(packageManager, "context.packageManager");
            packageInfo = r.d(packageManager, bVar.c(), 0);
        } catch (Exception e8) {
            e8.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo != null) {
            return new S4.f().m(packageInfo);
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(2:20|(4:29|15|16|(2:32|(3:34|16|(0)(0))(3:35|36|37))(0))(1:23))(1:31)|24|(1:26)(5:28|14|15|16|(0)(0)))(0))(2:38|39))(2:40|41))(4:43|(3:48|(1:50)(2:58|(2:60|(1:62)(2:63|64))(1:65))|(2:52|(1:54)(1:55))(2:56|57))|36|37)|42|(0)(0)))|68|6|7|(0)(0)|42|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0229, code lost:            r11 = r1;        r12 = r3;        r2 = r17;        r4 = r18;        r1 = r21;        r5 = 0;        r17 = r28;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0072, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x026f, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0197 A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:12:0x005e, B:15:0x0229, B:18:0x0197, B:20:0x01ac, B:24:0x01ce, B:32:0x023d, B:34:0x0157, B:35:0x0263, B:41:0x009b, B:42:0x014e, B:46:0x00a7, B:48:0x00b1, B:50:0x00c0, B:52:0x0114, B:56:0x0267, B:57:0x026e, B:58:0x00eb, B:60:0x00ef, B:62:0x00f9, B:63:0x0109, B:64:0x0110), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x023d A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:12:0x005e, B:15:0x0229, B:18:0x0197, B:20:0x01ac, B:24:0x01ce, B:32:0x023d, B:34:0x0157, B:35:0x0263, B:41:0x009b, B:42:0x014e, B:46:0x00a7, B:48:0x00b1, B:50:0x00c0, B:52:0x0114, B:56:0x0267, B:57:0x026e, B:58:0x00eb, B:60:0x00ef, B:62:0x00f9, B:63:0x0109, B:64:0x0110), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0157 A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:12:0x005e, B:15:0x0229, B:18:0x0197, B:20:0x01ac, B:24:0x01ce, B:32:0x023d, B:34:0x0157, B:35:0x0263, B:41:0x009b, B:42:0x014e, B:46:0x00a7, B:48:0x00b1, B:50:0x00c0, B:52:0x0114, B:56:0x0267, B:57:0x026e, B:58:0x00eb, B:60:0x00ef, B:62:0x00f9, B:63:0x0109, B:64:0x0110), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0263 A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:12:0x005e, B:15:0x0229, B:18:0x0197, B:20:0x01ac, B:24:0x01ce, B:32:0x023d, B:34:0x0157, B:35:0x0263, B:41:0x009b, B:42:0x014e, B:46:0x00a7, B:48:0x00b1, B:50:0x00c0, B:52:0x0114, B:56:0x0267, B:57:0x026e, B:58:0x00eb, B:60:0x00ef, B:62:0x00f9, B:63:0x0109, B:64:0x0110), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0214 -> B:14:0x021c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0157 -> B:16:0x0194). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(java.util.ArrayList r27, java.util.ArrayList r28, java.lang.String r29, long r30, U5.d r32) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.a.u(java.util.ArrayList, java.util.ArrayList, java.lang.String, long, U5.d):java.lang.Object");
    }

    public final InterfaceC3488x0 t(ArrayList appsToBackup) {
        InterfaceC3488x0 d8;
        AbstractC3292y.i(appsToBackup, "appsToBackup");
        d8 = AbstractC3462k.d(N.a(C3445b0.b()), null, null, new k(appsToBackup, null), 3, null);
        return d8;
    }
}
