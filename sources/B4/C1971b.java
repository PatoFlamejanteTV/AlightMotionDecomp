package b4;

import U5.g;
import X3.d;
import X3.k;
import Y3.m;
import Z3.c;
import a4.l;
import a4.n;
import android.content.Context;
import c4.p;
import c4.q;
import c4.s;
import c4.t;
import e4.InterfaceC2818b;
import java.security.PublicKey;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: b4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1971b implements InterfaceC1970a {

    /* renamed from: g, reason: collision with root package name */
    private static final a f14920g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final p f14921a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2818b f14922b;

    /* renamed from: c, reason: collision with root package name */
    private final c f14923c;

    /* renamed from: d, reason: collision with root package name */
    private final t f14924d;

    /* renamed from: e, reason: collision with root package name */
    private final l f14925e;

    /* renamed from: f, reason: collision with root package name */
    private final List f14926f;

    /* renamed from: b4.b$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C1971b(p messageVersionRegistry, InterfaceC2818b imageCache, c errorReporter, t transactionFactory, l publicKeyFactory, List warnings) {
        AbstractC3292y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3292y.i(imageCache, "imageCache");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(transactionFactory, "transactionFactory");
        AbstractC3292y.i(publicKeyFactory, "publicKeyFactory");
        AbstractC3292y.i(warnings, "warnings");
        this.f14921a = messageVersionRegistry;
        this.f14922b = imageCache;
        this.f14923c = errorReporter;
        this.f14924d = transactionFactory;
        this.f14925e = publicKeyFactory;
        this.f14926f = warnings;
    }

    private final s b(String str, String str2, boolean z8, String str3, List list, PublicKey publicKey, String str4, q qVar) {
        String str5 = str2;
        if (!this.f14921a.b(str2)) {
            if (str5 == null) {
                str5 = "";
            }
            throw new W3.a("Message version is unsupported: " + str5, null, 2, null);
        }
        return this.f14924d.a(str, list, publicKey, str4, qVar, z8, com.stripe.android.stripe3ds2.views.a.f28247e.a(str3, this.f14923c));
    }

    @Override // b4.InterfaceC1970a
    public s a(q sdkTransactionId, String directoryServerID, String str, boolean z8, String directoryServerName, List rootCerts, PublicKey dsPublicKey, String str2, m uiCustomization) {
        AbstractC3292y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3292y.i(directoryServerID, "directoryServerID");
        AbstractC3292y.i(directoryServerName, "directoryServerName");
        AbstractC3292y.i(rootCerts, "rootCerts");
        AbstractC3292y.i(dsPublicKey, "dsPublicKey");
        AbstractC3292y.i(uiCustomization, "uiCustomization");
        return b(directoryServerID, str, z8, directoryServerName, rootCerts, dsPublicKey, str2, sdkTransactionId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1971b(Context context, boolean z8, g workContext) {
        this(context, "3DS_LOA_SDK_STIN_020100_00142", z8, workContext);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1971b(Context context, String sdkReferenceNumber, boolean z8, g workContext) {
        this(context, InterfaceC2818b.a.f31705a, sdkReferenceNumber, z8, workContext);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3292y.i(workContext, "workContext");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1971b(android.content.Context r13, e4.InterfaceC2818b r14, java.lang.String r15, boolean r16, U5.g r17) {
        /*
            r12 = this;
            Z3.a r11 = new Z3.a
            android.content.Context r1 = r13.getApplicationContext()
            java.lang.String r0 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r1, r0)
            com.stripe.android.stripe3ds2.transaction.o$a r0 = com.stripe.android.stripe3ds2.transaction.o.f28138a
            r2 = r16
            com.stripe.android.stripe3ds2.transaction.o r4 = r0.a(r2)
            r9 = 246(0xf6, float:3.45E-43)
            r10 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r11
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.C1971b.<init>(android.content.Context, e4.b, java.lang.String, boolean, U5.g):void");
    }

    private C1971b(Context context, InterfaceC2818b interfaceC2818b, String str, c cVar, g gVar) {
        this(context, interfaceC2818b, str, cVar, new n(cVar), new k(context), new d(null, 1, 0 == true ? 1 : 0), new p(), gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C1971b(android.content.Context r16, e4.InterfaceC2818b r17, java.lang.String r18, Z3.c r19, a4.InterfaceC1673g r20, X3.k r21, X3.m r22, c4.p r23, U5.g r24) {
        /*
            r15 = this;
            r0 = r16
            r1 = r21
            c4.i r4 = new c4.i
            c4.g r2 = new c4.g
            X3.f r6 = new X3.f
            android.content.Context r3 = r16.getApplicationContext()
            java.lang.String r5 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r3, r5)
            r6.<init>(r3, r1)
            X3.i r7 = new X3.i
            r7.<init>(r1)
            X3.c r10 = new X3.c
            r1 = r24
            r10.<init>(r0, r1)
            r5 = r2
            r8 = r22
            r9 = r20
            r11 = r23
            r12 = r18
            r13 = r19
            r14 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = r18
            r3 = r20
            r4.<init>(r2, r3, r1)
            java.util.List r6 = r22.a()
            a4.l r5 = new a4.l
            r3 = r19
            r5.<init>(r0, r3)
            r0 = r15
            r1 = r23
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.C1971b.<init>(android.content.Context, e4.b, java.lang.String, Z3.c, a4.g, X3.k, X3.m, c4.p, U5.g):void");
    }
}
