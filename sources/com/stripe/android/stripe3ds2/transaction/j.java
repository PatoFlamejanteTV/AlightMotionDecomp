package com.stripe.android.stripe3ds2.transaction;

import androidx.core.view.PointerIconCompat;
import c4.InterfaceC2030b;
import com.stripe.android.stripe3ds2.transaction.k;
import d4.C2757a;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class j implements c4.n {

    /* renamed from: a, reason: collision with root package name */
    private final c4.q f28104a;

    /* renamed from: b, reason: collision with root package name */
    private final c4.p f28105b;

    /* renamed from: c, reason: collision with root package name */
    private final c4.o f28106c;

    /* renamed from: d, reason: collision with root package name */
    private final a4.k f28107d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2030b f28108e;

    /* renamed from: f, reason: collision with root package name */
    private final e f28109f;

    /* renamed from: g, reason: collision with root package name */
    private final k.a f28110g;

    /* renamed from: h, reason: collision with root package name */
    private final Y3.m f28111h;

    /* renamed from: i, reason: collision with root package name */
    private final Z3.c f28112i;

    /* renamed from: j, reason: collision with root package name */
    private final o f28113j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28114a;

        /* renamed from: b, reason: collision with root package name */
        Object f28115b;

        /* renamed from: c, reason: collision with root package name */
        Object f28116c;

        /* renamed from: d, reason: collision with root package name */
        Object f28117d;

        /* renamed from: e, reason: collision with root package name */
        Object f28118e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f28119f;

        /* renamed from: h, reason: collision with root package name */
        int f28121h;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28119f = obj;
            this.f28121h |= Integer.MIN_VALUE;
            return j.this.a(null, this);
        }
    }

    public j(c4.q sdkTransactionId, c4.p messageVersionRegistry, c4.o jwsValidator, a4.k messageTransformer, InterfaceC2030b acsDataParser, e challengeRequestResultRepository, k.a errorRequestExecutorFactory, Y3.m uiCustomization, Z3.c errorReporter, o logger) {
        AbstractC3292y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3292y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3292y.i(jwsValidator, "jwsValidator");
        AbstractC3292y.i(messageTransformer, "messageTransformer");
        AbstractC3292y.i(acsDataParser, "acsDataParser");
        AbstractC3292y.i(challengeRequestResultRepository, "challengeRequestResultRepository");
        AbstractC3292y.i(errorRequestExecutorFactory, "errorRequestExecutorFactory");
        AbstractC3292y.i(uiCustomization, "uiCustomization");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(logger, "logger");
        this.f28104a = sdkTransactionId;
        this.f28105b = messageVersionRegistry;
        this.f28106c = jwsValidator;
        this.f28107d = messageTransformer;
        this.f28108e = acsDataParser;
        this.f28109f = challengeRequestResultRepository;
        this.f28110g = errorRequestExecutorFactory;
        this.f28111h = uiCustomization;
        this.f28112i = errorReporter;
        this.f28113j = logger;
    }

    private final C2757a b(c4.q qVar, c4.e eVar) {
        String b9 = eVar.b();
        if (b9 != null) {
            String f8 = eVar.f();
            if (f8 != null) {
                return new C2757a(this.f28105b.a(), f8, b9, qVar, null, null, null, null, null, null, PointerIconCompat.TYPE_TEXT, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|(1:(4:9|10|11|12)(2:41|42))(5:43|44|45|46|(4:48|49|50|(1:52)(1:53))(3:55|56|57))|13|14|(1:16)(2:24|(1:26)(2:27|(1:29)(2:30|(1:32)(2:33|34))))|17|18|(1:23)(2:20|21)))|62|6|(0)(0)|13|14|(0)(0)|17|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:            r0 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0101, code lost:            r2 = r2;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d8 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:14:0x00d2, B:16:0x00d8, B:17:0x015a, B:24:0x0103, B:26:0x0107, B:27:0x0126, B:29:0x012a, B:30:0x0142, B:32:0x0146, B:33:0x015f, B:34:0x0164), top: B:13:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0103 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:14:0x00d2, B:16:0x00d8, B:17:0x015a, B:24:0x0103, B:26:0x0107, B:27:0x0126, B:29:0x012a, B:30:0x0142, B:32:0x0146, B:33:0x015f, B:34:0x0164), top: B:13:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // c4.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(c4.m r17, U5.d r18) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.j.a(c4.m, U5.d):java.lang.Object");
    }
}
