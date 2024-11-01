package M3;

import Q5.p;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.model.u;
import com.stripe.android.paymentsheet.AbstractC2637d;
import com.stripe.android.paymentsheet.w;
import g3.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class f {
    private static final String b(w.i iVar) {
        w.h a9 = iVar.a();
        if (a9 instanceof w.h.a) {
            return ((w.h.a) iVar.a()).H();
        }
        if (a9 instanceof w.h.b) {
            return null;
        }
        throw new p();
    }

    public static final v c(w.l lVar, w.i iVar, List externalPaymentMethods, String str) {
        String str2;
        AbstractC3292y.i(lVar, "<this>");
        AbstractC3292y.i(externalPaymentMethods, "externalPaymentMethods");
        if (iVar != null) {
            str2 = b(iVar);
        } else {
            str2 = null;
        }
        String str3 = str2;
        if (lVar instanceof w.l.b) {
            return new v.b(((w.l.b) lVar).d(), null, str3, str, externalPaymentMethods, 2, null);
        }
        if (lVar instanceof w.l.c) {
            return new v.c(((w.l.c) lVar).d(), null, str3, str, externalPaymentMethods, 2, null);
        }
        if (lVar instanceof w.l.a) {
            return new v.a(null, AbstractC2637d.b(((w.l.a) lVar).b()), externalPaymentMethods, str, str3, 1, null);
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeIntent d(StripeIntent stripeIntent) {
        u a9;
        n a10;
        List e8 = stripeIntent.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e8) {
            if (!AbstractC3292y.d((String) obj, o.p.f25733C.f25773a)) {
                arrayList.add(obj);
            }
        }
        if (stripeIntent instanceof n) {
            a10 = r2.a((r44 & 1) != 0 ? r2.f25550a : null, (r44 & 2) != 0 ? r2.f25551b : arrayList, (r44 & 4) != 0 ? r2.f25552c : null, (r44 & 8) != 0 ? r2.f25553d : 0L, (r44 & 16) != 0 ? r2.f25554e : null, (r44 & 32) != 0 ? r2.f25555f : null, (r44 & 64) != 0 ? r2.f25556g : null, (r44 & 128) != 0 ? r2.f25557h : null, (r44 & 256) != 0 ? r2.f25558i : null, (r44 & 512) != 0 ? r2.f25559j : 0L, (r44 & 1024) != 0 ? r2.f25560k : null, (r44 & 2048) != 0 ? r2.f25561l : null, (r44 & 4096) != 0 ? r2.f25562m : false, (r44 & 8192) != 0 ? r2.f25563n : null, (r44 & 16384) != 0 ? r2.f25564o : null, (r44 & 32768) != 0 ? r2.f25565p : null, (r44 & 65536) != 0 ? r2.f25566q : null, (r44 & 131072) != 0 ? r2.f25567r : null, (r44 & 262144) != 0 ? r2.f25568s : null, (r44 & 524288) != 0 ? r2.f25569t : null, (r44 & 1048576) != 0 ? r2.f25570u : null, (r44 & 2097152) != 0 ? r2.f25571v : null, (r44 & 4194304) != 0 ? r2.f25572w : null, (r44 & 8388608) != 0 ? ((n) stripeIntent).f25573x : null);
            return a10;
        }
        if (stripeIntent instanceof u) {
            a9 = r2.a((r36 & 1) != 0 ? r2.f25913a : null, (r36 & 2) != 0 ? r2.f25914b : null, (r36 & 4) != 0 ? r2.f25915c : 0L, (r36 & 8) != 0 ? r2.f25916d : null, (r36 & 16) != 0 ? r2.f25917e : null, (r36 & 32) != 0 ? r2.f25918f : null, (r36 & 64) != 0 ? r2.f25919g : false, (r36 & 128) != 0 ? r2.f25920h : null, (r36 & 256) != 0 ? r2.f25921i : null, (r36 & 512) != 0 ? r2.f25922j : arrayList, (r36 & 1024) != 0 ? r2.f25923k : null, (r36 & 2048) != 0 ? r2.f25924l : null, (r36 & 4096) != 0 ? r2.f25925m : null, (r36 & 8192) != 0 ? r2.f25926n : null, (r36 & 16384) != 0 ? r2.f25927o : null, (r36 & 32768) != 0 ? r2.f25928p : null, (r36 & 65536) != 0 ? ((u) stripeIntent).f25929q : null);
            return a9;
        }
        throw new p();
    }
}
