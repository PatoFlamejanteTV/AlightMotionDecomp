package q6;

import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;
import p6.EnumC3588a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3817b extends C3819d {

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2072n f37400e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37401a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37402b;

        /* renamed from: d, reason: collision with root package name */
        int f37404d;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37402b = obj;
            this.f37404d |= Integer.MIN_VALUE;
            return C3817b.this.h(null, this);
        }
    }

    public /* synthetic */ C3817b(InterfaceC2072n interfaceC2072n, U5.g gVar, int i8, EnumC3588a enumC3588a, int i9, AbstractC3284p abstractC3284p) {
        this(interfaceC2072n, (i9 & 2) != 0 ? U5.h.f10149a : gVar, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? EnumC3588a.SUSPEND : enumC3588a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // q6.C3819d, r6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(p6.s r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof q6.C3817b.a
            if (r0 == 0) goto L13
            r0 = r6
            q6.b$a r0 = (q6.C3817b.a) r0
            int r1 = r0.f37404d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37404d = r1
            goto L18
        L13:
            q6.b$a r0 = new q6.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37402b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f37404d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f37401a
            p6.s r5 = (p6.s) r5
            Q5.t.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            Q5.t.b(r6)
            r0.f37401a = r5
            r0.f37404d = r3
            java.lang.Object r6 = super.h(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.A()
            if (r5 == 0) goto L4c
            Q5.I r5 = Q5.I.f8786a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.C3817b.h(p6.s, U5.d):java.lang.Object");
    }

    @Override // q6.C3819d, r6.e
    protected r6.e i(U5.g gVar, int i8, EnumC3588a enumC3588a) {
        return new C3817b(this.f37400e, gVar, i8, enumC3588a);
    }

    public C3817b(InterfaceC2072n interfaceC2072n, U5.g gVar, int i8, EnumC3588a enumC3588a) {
        super(interfaceC2072n, gVar, i8, enumC3588a);
        this.f37400e = interfaceC2072n;
    }
}
