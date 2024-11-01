package com.stripe.android.stripe3ds2.transaction;

import Q5.s;
import Q5.t;
import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.d;
import d4.C2757a;
import d4.d;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface f {

    /* loaded from: classes4.dex */
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        private final a4.k f28076a;

        /* renamed from: b, reason: collision with root package name */
        private final SecretKey f28077b;

        /* renamed from: c, reason: collision with root package name */
        private final Z3.c f28078c;

        /* renamed from: d, reason: collision with root package name */
        private final c.a f28079d;

        public a(a4.k messageTransformer, SecretKey secretKey, Z3.c errorReporter, c.a creqExecutorConfig) {
            AbstractC3292y.i(messageTransformer, "messageTransformer");
            AbstractC3292y.i(secretKey, "secretKey");
            AbstractC3292y.i(errorReporter, "errorReporter");
            AbstractC3292y.i(creqExecutorConfig, "creqExecutorConfig");
            this.f28076a = messageTransformer;
            this.f28077b = secretKey;
            this.f28078c = errorReporter;
            this.f28079d = creqExecutorConfig;
        }

        private final d4.d b(C2757a c2757a, int i8, String str, String str2) {
            String valueOf = String.valueOf(i8);
            d.c cVar = d.c.f31424c;
            return new d4.d(c2757a.v(), c2757a.f(), null, valueOf, cVar, str, str2, "CRes", c2757a.p(), c2757a.u(), 4, null);
        }

        private final JSONObject c(String str) {
            return this.f28076a.I(str, this.f28077b);
        }

        private final boolean d(C2757a c2757a, d4.b bVar) {
            return AbstractC3292y.d(c2757a.p(), bVar.z());
        }

        private final boolean e(C2757a c2757a, d4.b bVar) {
            if (AbstractC3292y.d(c2757a.u(), bVar.W()) && AbstractC3292y.d(c2757a.v(), bVar.X()) && AbstractC3292y.d(c2757a.f(), bVar.i())) {
                return true;
            }
            return false;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.f
        public Object a(C2757a c2757a, c4.l lVar, U5.d dVar) {
            Object b9;
            if (lVar.b()) {
                JSONObject jSONObject = new JSONObject(lVar.a());
                d.a aVar = d4.d.f31412k;
                if (aVar.b(jSONObject)) {
                    return new d.b(aVar.a(jSONObject));
                }
                return new d.c(new IllegalArgumentException("Received a JSON response that was not an Error message."));
            }
            try {
                s.a aVar2 = s.f8810b;
                b9 = s.b(c(lVar.a()));
            } catch (Throwable th) {
                s.a aVar3 = s.f8810b;
                b9 = s.b(t.a(th));
            }
            Throwable e8 = s.e(b9);
            if (e8 != null) {
                this.f28078c.l(new RuntimeException(l6.n.e("\n                            Failed to process challenge response.\n\n                            CReq = " + c2757a.w() + "\n                            "), e8));
            }
            Throwable e9 = s.e(b9);
            if (e9 == null) {
                return f(c2757a, (JSONObject) b9);
            }
            d4.f fVar = d4.f.f31443i;
            int b10 = fVar.b();
            String c8 = fVar.c();
            String message = e9.getMessage();
            if (message == null) {
                message = "";
            }
            return new d.b(b(c2757a, b10, c8, message));
        }

        public final d f(C2757a creqData, JSONObject payload) {
            Object b9;
            d.b bVar;
            d c0676d;
            AbstractC3292y.i(creqData, "creqData");
            AbstractC3292y.i(payload, "payload");
            d.a aVar = d4.d.f31412k;
            if (aVar.b(payload)) {
                return new d.b(aVar.a(payload));
            }
            try {
                s.a aVar2 = s.f8810b;
                b9 = s.b(d4.b.f31370C.d(payload));
            } catch (Throwable th) {
                s.a aVar3 = s.f8810b;
                b9 = s.b(t.a(th));
            }
            Throwable e8 = s.e(b9);
            if (e8 == null) {
                d4.b bVar2 = (d4.b) b9;
                if (!e(creqData, bVar2)) {
                    d4.f fVar = d4.f.f31442h;
                    c0676d = new d.b(b(creqData, fVar.b(), fVar.c(), "The Transaction ID received was invalid."));
                } else if (!d(creqData, bVar2)) {
                    d4.f fVar2 = d4.f.f31438d;
                    bVar = new d.b(b(creqData, fVar2.b(), fVar2.c(), creqData.p()));
                } else {
                    c0676d = new d.C0676d(creqData, bVar2, this.f28079d);
                }
                return c0676d;
            }
            if (e8 instanceof d4.c) {
                d4.c cVar = (d4.c) e8;
                bVar = new d.b(b(creqData, cVar.a(), cVar.b(), cVar.c()));
            } else {
                return new d.c(e8);
            }
            return bVar;
        }
    }

    Object a(C2757a c2757a, c4.l lVar, U5.d dVar);
}
