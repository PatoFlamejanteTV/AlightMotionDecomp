package N4;

import Q5.I;
import Q5.t;
import android.content.ContentResolver;
import android.content.Context;
import androidx.documentfile.provider.DocumentFile;
import c6.InterfaceC2072n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import l6.n;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import n6.N;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f6699a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6700b;

    /* renamed from: c, reason: collision with root package name */
    private final O4.d f6701c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6702d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f6703e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6704a;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f6704a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                b bVar = b.this;
                this.f6704a = 1;
                if (bVar.l(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N4.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0126b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6706a;

        /* renamed from: b, reason: collision with root package name */
        Object f6707b;

        /* renamed from: c, reason: collision with root package name */
        Object f6708c;

        /* renamed from: d, reason: collision with root package name */
        Object f6709d;

        /* renamed from: e, reason: collision with root package name */
        int f6710e;

        /* renamed from: f, reason: collision with root package name */
        int f6711f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f6712g;

        /* renamed from: i, reason: collision with root package name */
        int f6714i;

        C0126b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6712g = obj;
            this.f6714i |= Integer.MIN_VALUE;
            return b.this.k(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f6715a;

        /* renamed from: b, reason: collision with root package name */
        Object f6716b;

        /* renamed from: c, reason: collision with root package name */
        Object f6717c;

        /* renamed from: d, reason: collision with root package name */
        int f6718d;

        /* renamed from: e, reason: collision with root package name */
        int f6719e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6721a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6722b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f6723c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f6724d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj, int i8, U5.d dVar) {
                super(2, dVar);
                this.f6722b = bVar;
                this.f6723c = obj;
                this.f6724d = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f6722b, this.f6723c, this.f6724d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f6721a == 0) {
                    t.b(obj);
                    O4.d dVar = this.f6722b.f6701c;
                    if (dVar != null) {
                        dVar.f(this.f6723c, this.f6724d);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N4.b$c$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0127b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6725a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f6726b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f6727c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0127b(File file, b bVar, U5.d dVar) {
                super(2, dVar);
                this.f6726b = file;
                this.f6727c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0127b(this.f6726b, this.f6727c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                O4.d dVar;
                V5.b.e();
                if (this.f6725a == 0) {
                    t.b(obj);
                    if (this.f6726b != null && (dVar = this.f6727c.f6701c) != null) {
                        dVar.h(this.f6726b);
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0127b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N4.b$c$c, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0128c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6728a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ DocumentFile f6729b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f6730c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0128c(DocumentFile documentFile, b bVar, U5.d dVar) {
                super(2, dVar);
                this.f6729b = documentFile;
                this.f6730c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0128c(this.f6729b, this.f6730c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                O4.d dVar;
                V5.b.e();
                if (this.f6728a == 0) {
                    t.b(obj);
                    if (this.f6729b != null && (dVar = this.f6730c.f6701c) != null) {
                        dVar.h(this.f6729b);
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0128c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6731a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ DocumentFile f6732b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f6733c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(DocumentFile documentFile, b bVar, U5.d dVar) {
                super(2, dVar);
                this.f6732b = documentFile;
                this.f6733c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new d(this.f6732b, this.f6733c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                O4.d dVar;
                V5.b.e();
                if (this.f6731a == 0) {
                    t.b(obj);
                    if (this.f6732b != null && (dVar = this.f6733c.f6701c) != null) {
                        dVar.h(this.f6732b);
                    }
                    return I.f8786a;
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
            int f6734a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6735b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b bVar, U5.d dVar) {
                super(2, dVar);
                this.f6735b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new e(this.f6735b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f6734a == 0) {
                    t.b(obj);
                    O4.d dVar = this.f6735b.f6701c;
                    if (dVar != null) {
                        dVar.i();
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

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0103 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x010c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0166 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x016f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01ed A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01fd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x010a -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x010c -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x011a -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x011c -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x012a -> B:12:0x0091). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x016d -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x016f -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x017d -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x017f -> B:11:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01e2 -> B:9:0x01e5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 574
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
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
        Object f6736a;

        /* renamed from: b, reason: collision with root package name */
        Object f6737b;

        /* renamed from: c, reason: collision with root package name */
        int f6738c;

        /* renamed from: d, reason: collision with root package name */
        int f6739d;

        /* renamed from: e, reason: collision with root package name */
        long f6740e;

        /* renamed from: f, reason: collision with root package name */
        int f6741f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InputStream f6742g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f6743h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OutputStream f6744i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ b f6745j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6746a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6747b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f6748c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, int i8, U5.d dVar) {
                super(2, dVar);
                this.f6747b = bVar;
                this.f6748c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f6747b, this.f6748c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f6746a == 0) {
                    t.b(obj);
                    O4.d dVar = this.f6747b.f6701c;
                    if (dVar != null) {
                        dVar.b(this.f6748c);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InputStream inputStream, long j8, OutputStream outputStream, b bVar, U5.d dVar) {
            super(2, dVar);
            this.f6742g = inputStream;
            this.f6743h = j8;
            this.f6744i = outputStream;
            this.f6745j = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f6742g, this.f6743h, this.f6744i, this.f6745j, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005a -> B:6:0x0082). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:6:0x0082). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007e -> B:5:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r14.f6741f
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L26
                if (r1 != r2) goto L1e
                long r4 = r14.f6740e
                int r1 = r14.f6739d
                int r6 = r14.f6738c
                java.lang.Object r7 = r14.f6737b
                kotlin.jvm.internal.Q r7 = (kotlin.jvm.internal.Q) r7
                java.lang.Object r8 = r14.f6736a
                byte[] r8 = (byte[]) r8
                Q5.t.b(r15)
                goto L81
            L1e:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L26:
                Q5.t.b(r15)
                r15 = 1024(0x400, float:1.435E-42)
                byte[] r15 = new byte[r15]
                kotlin.jvm.internal.Q r1 = new kotlin.jvm.internal.Q
                r1.<init>()
                r4 = 0
                r8 = r15
                r7 = r1
                r15 = 0
                r6 = 0
            L38:
                java.io.InputStream r1 = r14.f6742g
                int r1 = r1.read(r8)
                r7.f34571a = r1
                if (r1 <= 0) goto L8d
                double r9 = (double) r6
                r11 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r9 = r9 * r11
                long r11 = r14.f6743h
                double r11 = (double) r11
                double r9 = r9 / r11
                int r1 = (int) r9
                int r9 = r15 + 10
                if (r1 > r9) goto L5e
                long r9 = java.lang.System.currentTimeMillis()
                r11 = 1000(0x3e8, float:1.401E-42)
                long r11 = (long) r11
                long r11 = r11 + r4
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 <= 0) goto L82
                if (r1 <= r15) goto L82
            L5e:
                long r4 = java.lang.System.currentTimeMillis()
                n6.J0 r15 = n6.C3445b0.c()
                N4.b$d$a r9 = new N4.b$d$a
                N4.b r10 = r14.f6745j
                r11 = 0
                r9.<init>(r10, r1, r11)
                r14.f6736a = r8
                r14.f6737b = r7
                r14.f6738c = r6
                r14.f6739d = r1
                r14.f6740e = r4
                r14.f6741f = r2
                java.lang.Object r15 = n6.AbstractC3458i.g(r15, r9, r14)
                if (r15 != r0) goto L81
                return r0
            L81:
                r15 = r1
            L82:
                java.io.OutputStream r1 = r14.f6744i
                int r9 = r7.f34571a
                r1.write(r8, r3, r9)
                int r1 = r7.f34571a
                int r6 = r6 + r1
                goto L38
            L8d:
                java.io.InputStream r15 = r14.f6742g
                r15.close()
                java.io.OutputStream r15 = r14.f6744i
                r15.close()
                Q5.I r15 = Q5.I.f8786a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: N4.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6749a;

        /* renamed from: b, reason: collision with root package name */
        Object f6750b;

        /* renamed from: c, reason: collision with root package name */
        Object f6751c;

        /* renamed from: d, reason: collision with root package name */
        int f6752d;

        /* renamed from: e, reason: collision with root package name */
        int f6753e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6754f;

        /* renamed from: h, reason: collision with root package name */
        int f6756h;

        e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6754f = obj;
            this.f6756h |= Integer.MIN_VALUE;
            return b.this.o(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6757a;

        f(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6757a == 0) {
                t.b(obj);
                O4.d dVar = b.this.f6701c;
                if (dVar != null) {
                    dVar.g();
                    return I.f8786a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6759a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f6761c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(File file, U5.d dVar) {
            super(2, dVar);
            this.f6761c = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f6761c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6759a == 0) {
                t.b(obj);
                O4.d dVar = b.this.f6701c;
                if (dVar != null) {
                    dVar.e(this.f6761c);
                    return I.f8786a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6762a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f6764c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(File file, U5.d dVar) {
            super(2, dVar);
            this.f6764c = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f6764c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6762a == 0) {
                t.b(obj);
                O4.d dVar = b.this.f6701c;
                if (dVar != null) {
                    dVar.c(this.f6764c);
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
        int f6765a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f6767c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(T t8, U5.d dVar) {
            super(2, dVar);
            this.f6767c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new i(this.f6767c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6765a == 0) {
                t.b(obj);
                O4.d dVar = b.this.f6701c;
                if (dVar != null) {
                    dVar.e((File) this.f6767c.f34573a);
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
        int f6768a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f6770c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(T t8, U5.d dVar) {
            super(2, dVar);
            this.f6770c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new j(this.f6770c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6768a == 0) {
                t.b(obj);
                O4.d dVar = b.this.f6701c;
                if (dVar != null) {
                    dVar.c((File) this.f6770c.f34573a);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6771a;

        /* renamed from: b, reason: collision with root package name */
        Object f6772b;

        /* renamed from: c, reason: collision with root package name */
        Object f6773c;

        /* renamed from: d, reason: collision with root package name */
        int f6774d;

        /* renamed from: e, reason: collision with root package name */
        int f6775e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6776f;

        /* renamed from: h, reason: collision with root package name */
        int f6778h;

        k(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6776f = obj;
            this.f6778h |= Integer.MIN_VALUE;
            return b.this.n(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6779a;

        l(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f6779a == 0) {
                t.b(obj);
                O4.d dVar = b.this.f6701c;
                if (dVar != null) {
                    dVar.g();
                    return I.f8786a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6781a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f6782b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f6783c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DocumentFile f6784d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6785a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6786b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f6787c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, File file, U5.d dVar) {
                super(2, dVar);
                this.f6786b = bVar;
                this.f6787c = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f6786b, this.f6787c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f6785a == 0) {
                    t.b(obj);
                    O4.d dVar = this.f6786b.f6701c;
                    if (dVar != null) {
                        dVar.e(this.f6787c);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N4.b$m$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0129b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6788a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6789b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f6790c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0129b(b bVar, File file, U5.d dVar) {
                super(2, dVar);
                this.f6789b = bVar;
                this.f6790c = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0129b(this.f6789b, this.f6790c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f6788a == 0) {
                    t.b(obj);
                    O4.d dVar = this.f6789b.f6701c;
                    if (dVar != null) {
                        dVar.c(this.f6790c);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0129b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6791a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6792b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ DocumentFile f6793c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar, DocumentFile documentFile, U5.d dVar) {
                super(2, dVar);
                this.f6792b = bVar;
                this.f6793c = documentFile;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f6792b, this.f6793c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f6791a == 0) {
                    t.b(obj);
                    O4.d dVar = this.f6792b.f6701c;
                    if (dVar != null) {
                        DocumentFile documentFile = this.f6793c;
                        AbstractC3292y.f(documentFile);
                        dVar.d(documentFile);
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
            int f6794a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f6795b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ DocumentFile f6796c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(b bVar, DocumentFile documentFile, U5.d dVar) {
                super(2, dVar);
                this.f6795b = bVar;
                this.f6796c = documentFile;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new d(this.f6795b, this.f6796c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f6794a == 0) {
                    t.b(obj);
                    O4.d dVar = this.f6795b.f6701c;
                    if (dVar != null) {
                        DocumentFile documentFile = this.f6796c;
                        AbstractC3292y.f(documentFile);
                        dVar.a(documentFile);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(File file, b bVar, DocumentFile documentFile, U5.d dVar) {
            super(2, dVar);
            this.f6782b = file;
            this.f6783c = bVar;
            this.f6784d = documentFile;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new m(this.f6782b, this.f6783c, this.f6784d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            OutputStream outputStream;
            Object e8 = V5.b.e();
            int i8 = this.f6781a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                if (i8 == 5) {
                                    t.b(obj);
                                    return I.f8786a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t.b(obj);
                            return I.f8786a;
                        }
                        t.b(obj);
                        return I.f8786a;
                    }
                    t.b(obj);
                    return I.f8786a;
                }
                t.b(obj);
                return I.f8786a;
            }
            t.b(obj);
            try {
                FileInputStream fileInputStream = new FileInputStream(this.f6782b);
                try {
                    ContentResolver contentResolver = this.f6783c.f6703e.getContentResolver();
                    if (contentResolver != null) {
                        DocumentFile documentFile = this.f6784d;
                        AbstractC3292y.f(documentFile);
                        outputStream = contentResolver.openOutputStream(documentFile.getUri());
                    } else {
                        outputStream = null;
                    }
                    if (outputStream == null) {
                        J0 c8 = C3445b0.c();
                        d dVar = new d(this.f6783c, this.f6784d, null);
                        this.f6781a = 4;
                        if (AbstractC3458i.g(c8, dVar, this) == e8) {
                            return e8;
                        }
                        return I.f8786a;
                    }
                    b bVar = this.f6783c;
                    long length = this.f6782b.length();
                    this.f6781a = 5;
                    if (bVar.m(fileInputStream, outputStream, length, this) == e8) {
                        return e8;
                    }
                    return I.f8786a;
                } catch (FileNotFoundException unused) {
                    J0 c9 = C3445b0.c();
                    c cVar = new c(this.f6783c, this.f6784d, null);
                    this.f6781a = 3;
                    if (AbstractC3458i.g(c9, cVar, this) == e8) {
                        return e8;
                    }
                }
            } catch (FileNotFoundException unused2) {
                J0 c10 = C3445b0.c();
                a aVar = new a(this.f6783c, this.f6782b, null);
                this.f6781a = 1;
                if (AbstractC3458i.g(c10, aVar, this) == e8) {
                    return e8;
                }
            } catch (SecurityException unused3) {
                J0 c11 = C3445b0.c();
                C0129b c0129b = new C0129b(this.f6783c, this.f6782b, null);
                this.f6781a = 2;
                if (AbstractC3458i.g(c11, c0129b, this) == e8) {
                    return e8;
                }
            }
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public b(ArrayList itemsToCopy, Object targetDir, O4.d dVar, boolean z8, Context context) {
        AbstractC3292y.i(itemsToCopy, "itemsToCopy");
        AbstractC3292y.i(targetDir, "targetDir");
        AbstractC3292y.i(context, "context");
        this.f6699a = itemsToCopy;
        this.f6700b = targetDir;
        this.f6701c = dVar;
        this.f6702d = z8;
        this.f6703e = context;
        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b2 -> B:17:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(androidx.documentfile.provider.DocumentFile r12, androidx.documentfile.provider.DocumentFile r13, U5.d r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.b.k(androidx.documentfile.provider.DocumentFile, androidx.documentfile.provider.DocumentFile, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new c(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(InputStream inputStream, OutputStream outputStream, long j8, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new d(inputStream, j8, outputStream, this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0135 -> B:13:0x0137). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.io.File r20, androidx.documentfile.provider.DocumentFile r21, U5.d r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.b.n(java.io.File, androidx.documentfile.provider.DocumentFile, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0024. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x01a8 -> B:13:0x01ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.io.File r10, java.io.File r11, U5.d r12) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.b.o(java.io.File, java.io.File, U5.d):java.lang.Object");
    }

    private final DocumentFile p(DocumentFile documentFile, DocumentFile documentFile2) {
        if (!documentFile.isDirectory()) {
            if (documentFile.getName() != null) {
                if (documentFile.getType() != null) {
                    String type = documentFile.getType();
                    AbstractC3292y.f(type);
                    String name = documentFile.getName();
                    AbstractC3292y.f(name);
                    String name2 = documentFile.getName();
                    AbstractC3292y.f(name2);
                    String substring = name.substring(0, n.X(name2, ".", 0, false, 6, null));
                    AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String name3 = documentFile.getName();
                    AbstractC3292y.f(name3);
                    if (n.r(name3, ".xapk", false, 2, null)) {
                        substring = documentFile.getName();
                        AbstractC3292y.f(substring);
                        type = "xapk";
                    }
                    return documentFile2.createFile(type, substring);
                }
                throw new Exception("Source mimetype unknown");
            }
            throw new Exception("Source name unknown");
        }
        throw new Exception("Trying copying a directory into a file");
    }

    private final Object q(File file, DocumentFile documentFile, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new m(file, this, documentFile, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
