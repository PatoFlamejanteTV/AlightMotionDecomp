package S4;

import J4.j;
import Q5.I;
import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;

/* loaded from: classes5.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9466a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: S4.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0201a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9467a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9468b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f9469c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ O4.k f9470d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0201a(String str, Context context, O4.k kVar, U5.d dVar) {
                super(2, dVar);
                this.f9468b = str;
                this.f9469c = context;
                this.f9470d = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0201a(this.f9468b, this.f9469c, this.f9470d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f9467a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    a aVar = s.f9466a;
                    String str = this.f9468b;
                    Context context = this.f9469c;
                    O4.k kVar = this.f9470d;
                    this.f9467a = 1;
                    if (aVar.c(str, context, kVar, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0201a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            Object f9471a;

            /* renamed from: b, reason: collision with root package name */
            Object f9472b;

            /* renamed from: c, reason: collision with root package name */
            int f9473c;

            /* renamed from: d, reason: collision with root package name */
            int f9474d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f9475e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Context f9476f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ O4.k f9477g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: S4.s$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0202a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f9478a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ O4.k f9479b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f9480c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f9481d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0202a(O4.k kVar, String str, String str2, U5.d dVar) {
                    super(2, dVar);
                    this.f9479b = kVar;
                    this.f9480c = str;
                    this.f9481d = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0202a(this.f9479b, this.f9480c, this.f9481d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f9478a == 0) {
                        Q5.t.b(obj);
                        O4.k kVar = this.f9479b;
                        if (kVar != null) {
                            kVar.e(this.f9480c);
                        }
                        j.a aVar = J4.j.f4395g;
                        if (aVar.t() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", this.f9481d);
                            ResultReceiver t8 = aVar.t();
                            if (t8 != null) {
                                t8.send(304, bundle);
                            }
                        }
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0202a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: S4.s$a$b$b, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0203b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f9482a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ O4.k f9483b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f9484c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f9485d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0203b(O4.k kVar, String str, String str2, U5.d dVar) {
                    super(2, dVar);
                    this.f9483b = kVar;
                    this.f9484c = str;
                    this.f9485d = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C0203b(this.f9483b, this.f9484c, this.f9485d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f9482a == 0) {
                        Q5.t.b(obj);
                        O4.k kVar = this.f9483b;
                        if (kVar != null) {
                            kVar.a(this.f9484c);
                        }
                        j.a aVar = J4.j.f4395g;
                        if (aVar.t() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", this.f9485d);
                            ResultReceiver t8 = aVar.t();
                            if (t8 != null) {
                                t8.send(301, bundle);
                            }
                        }
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((C0203b) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f9486a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ O4.k f9487b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f9488c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f9489d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f9490e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(O4.k kVar, String str, String str2, String str3, U5.d dVar) {
                    super(2, dVar);
                    this.f9487b = kVar;
                    this.f9488c = str;
                    this.f9489d = str2;
                    this.f9490e = str3;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new c(this.f9487b, this.f9488c, this.f9489d, this.f9490e, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f9486a == 0) {
                        Q5.t.b(obj);
                        O4.k kVar = this.f9487b;
                        if (kVar != null) {
                            kVar.c(this.f9488c, this.f9489d);
                        }
                        j.a aVar = J4.j.f4395g;
                        if (aVar.t() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", this.f9490e);
                            bundle.putString("filename", this.f9488c);
                            bundle.putString("errorMsg", this.f9489d);
                            ResultReceiver t8 = aVar.t();
                            if (t8 != null) {
                                t8.send(303, bundle);
                            }
                        }
                        return I.f8786a;
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
                int f9491a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ O4.k f9492b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f9493c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f9494d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(O4.k kVar, String str, String str2, U5.d dVar) {
                    super(2, dVar);
                    this.f9492b = kVar;
                    this.f9493c = str;
                    this.f9494d = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new d(this.f9492b, this.f9493c, this.f9494d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f9491a == 0) {
                        Q5.t.b(obj);
                        O4.k kVar = this.f9492b;
                        if (kVar != null) {
                            kVar.b(this.f9493c);
                        }
                        j.a aVar = J4.j.f4395g;
                        if (aVar.t() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", this.f9494d);
                            bundle.putString("filename", this.f9493c);
                            ResultReceiver t8 = aVar.t();
                            if (t8 != null) {
                                t8.send(302, bundle);
                            }
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
                int f9495a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ O4.k f9496b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f9497c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(O4.k kVar, String str, U5.d dVar) {
                    super(2, dVar);
                    this.f9496b = kVar;
                    this.f9497c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new e(this.f9496b, this.f9497c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f9495a == 0) {
                        Q5.t.b(obj);
                        O4.k kVar = this.f9496b;
                        if (kVar != null) {
                            kVar.d(this.f9497c);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Context context, O4.k kVar, U5.d dVar) {
                super(2, dVar);
                this.f9475e = str;
                this.f9476f = context;
                this.f9477g = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f9475e, this.f9476f, this.f9477g, dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:22:0x012d A[Catch: Exception -> 0x0022, TryCatch #1 {Exception -> 0x0022, blocks: (B:9:0x001d, B:15:0x002d, B:16:0x01bf, B:18:0x0038, B:20:0x010f, B:22:0x012d, B:23:0x013e, B:25:0x017b, B:28:0x0184, B:30:0x018c, B:33:0x01a7, B:37:0x0046, B:38:0x00b3, B:52:0x00bb, B:43:0x005a, B:45:0x006d, B:46:0x007f, B:48:0x0099, B:56:0x01c5), top: B:2:0x0011 }] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x018c A[Catch: Exception -> 0x0022, TryCatch #1 {Exception -> 0x0022, blocks: (B:9:0x001d, B:15:0x002d, B:16:0x01bf, B:18:0x0038, B:20:0x010f, B:22:0x012d, B:23:0x013e, B:25:0x017b, B:28:0x0184, B:30:0x018c, B:33:0x01a7, B:37:0x0046, B:38:0x00b3, B:52:0x00bb, B:43:0x005a, B:45:0x006d, B:46:0x007f, B:48:0x0099, B:56:0x01c5), top: B:2:0x0011 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x01a7 A[Catch: Exception -> 0x0022, TryCatch #1 {Exception -> 0x0022, blocks: (B:9:0x001d, B:15:0x002d, B:16:0x01bf, B:18:0x0038, B:20:0x010f, B:22:0x012d, B:23:0x013e, B:25:0x017b, B:28:0x0184, B:30:0x018c, B:33:0x01a7, B:37:0x0046, B:38:0x00b3, B:52:0x00bb, B:43:0x005a, B:45:0x006d, B:46:0x007f, B:48:0x0099, B:56:0x01c5), top: B:2:0x0011 }] */
            /* JADX WARN: Type inference failed for: r11v6, types: [S4.f] */
            /* JADX WARN: Type inference failed for: r12v0, types: [S4.f] */
            /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, android.content.pm.PackageInfo] */
            /* JADX WARN: Type inference failed for: r2v29, types: [android.content.pm.PackageInfo] */
            /* JADX WARN: Type inference failed for: r2v33 */
            /* JADX WARN: Type inference failed for: r2v34 */
            /* JADX WARN: Type inference failed for: r2v4, types: [android.content.pm.PackageInfo] */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v20 */
            /* JADX WARN: Type inference failed for: r3v25 */
            /* JADX WARN: Type inference failed for: r3v26 */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r8v1, types: [S4.f] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                /*
                    Method dump skipped, instructions count: 544
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: S4.s.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object c(String str, Context context, O4.k kVar, U5.d dVar) {
            Object g8 = AbstractC3458i.g(C3445b0.a(), new b(str, context, kVar, null), dVar);
            if (g8 == V5.b.e()) {
                return g8;
            }
            return I.f8786a;
        }

        public final void b(String filename, Context context, O4.k kVar) {
            AbstractC3292y.i(filename, "filename");
            AbstractC3292y.i(context, "context");
            AbstractC3462k.d(N.a(C3445b0.a()), null, null, new C0201a(filename, context, kVar, null), 3, null);
        }

        public final boolean d() {
            return T4.a.b();
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }
}
