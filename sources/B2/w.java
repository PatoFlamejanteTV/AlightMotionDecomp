package B2;

import D6.a;
import Q5.s;
import android.content.SharedPreferences;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.I;
import n6.M;

/* loaded from: classes4.dex */
public final class w implements i {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f521a;

    /* renamed from: b, reason: collision with root package name */
    private final I f522b;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f523a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f525c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, U5.d dVar) {
            super(2, dVar);
            this.f525c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f525c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            V5.b.e();
            if (this.f523a == 0) {
                Q5.t.b(obj);
                String string = w.this.f521a.getString(this.f525c, null);
                if (string == null) {
                    return null;
                }
                w.this.f521a.edit().remove(this.f525c).apply();
                try {
                    s.a aVar = Q5.s.f8810b;
                    a.C0025a c0025a = D6.a.f1444d;
                    c0025a.e();
                    b9 = Q5.s.b((C0955g) c0025a.b(C0955g.Companion.serializer(), string));
                } catch (Throwable th) {
                    s.a aVar2 = Q5.s.f8810b;
                    b9 = Q5.s.b(Q5.t.a(th));
                }
                if (Q5.s.g(b9)) {
                    return null;
                }
                return b9;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    private w(SharedPreferences sharedPreferences, I i8) {
        this.f521a = sharedPreferences;
        this.f522b = i8;
    }

    @Override // B2.i
    public Object a(String str, U5.d dVar) {
        return AbstractC3458i.g(this.f522b, new a(str, null), dVar);
    }

    /* synthetic */ w(SharedPreferences sharedPreferences, I i8, int i9, AbstractC3284p abstractC3284p) {
        this(sharedPreferences, (i9 & 2) != 0 ? C3445b0.b() : i8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w(android.app.Application r3) {
        /*
            r2 = this;
            java.lang.String r0 = "application"
            kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
            java.lang.String r0 = "StripeAnalyticsRequestV2Storage"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            java.lang.String r0 = "getSharedPreferences(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.w.<init>(android.app.Application):void");
    }
}
