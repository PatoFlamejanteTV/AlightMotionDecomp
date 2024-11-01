package j3;

import B2.j;
import R5.AbstractC1435t;
import R5.a0;
import com.stripe.android.model.p;
import com.stripe.android.model.t;
import g3.C2898H;
import g3.s;
import g3.v;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p2.C3559a;

/* loaded from: classes4.dex */
public interface m {

    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ String a(m mVar, Set set, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    set = a0.f();
                }
                return mVar.k(set);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildPaymentUserAgent");
        }

        public static /* synthetic */ Object b(m mVar, String str, j.c cVar, List list, U5.d dVar, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 4) != 0) {
                    list = AbstractC1435t.m();
                }
                return mVar.c(str, cVar, list, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrievePaymentIntent-BWLJW6A");
        }

        public static /* synthetic */ Object c(m mVar, String str, j.c cVar, List list, U5.d dVar, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 4) != 0) {
                    list = AbstractC1435t.m();
                }
                return mVar.x(str, cVar, list, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveSetupIntent-BWLJW6A");
        }

        public static /* synthetic */ Object d(m mVar, String str, j.c cVar, List list, U5.d dVar, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 4) != 0) {
                    list = AbstractC1435t.m();
                }
                return mVar.f(str, cVar, list, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveStripeIntent-BWLJW6A");
        }
    }

    Object A(String str, com.stripe.android.model.d dVar, j.c cVar, U5.d dVar2);

    Object B(Set set, String str, j.c cVar, U5.d dVar);

    Object a(String str, String str2, String str3, j.c cVar, List list, U5.d dVar);

    Object b(v vVar, j.c cVar, U5.d dVar);

    Object c(String str, j.c cVar, List list, U5.d dVar);

    Object d(C3559a c3559a, j.c cVar, U5.d dVar);

    Object e(j.c cVar, Map map, U5.d dVar);

    Object f(String str, j.c cVar, List list, U5.d dVar);

    Object g(com.stripe.android.model.l lVar, Set set, j.c cVar, U5.d dVar);

    Object h(com.stripe.android.model.c cVar, j.c cVar2, List list, U5.d dVar);

    Object i(String str, String str2, String str3, j.c cVar, List list, U5.d dVar);

    Object j(C2898H c2898h, j.c cVar, U5.d dVar);

    String k(Set set);

    Object l(String str, String str2, j.c cVar, U5.d dVar);

    Object m(com.stripe.android.model.b bVar, j.c cVar, List list, U5.d dVar);

    Object n(String str, String str2, Map map, j.c cVar, U5.d dVar);

    Object o(String str, String str2, j.c cVar, U5.d dVar);

    Object p(String str, t tVar, j.c cVar, U5.d dVar);

    Object q(String str, com.stripe.android.model.d dVar, j.c cVar, U5.d dVar2);

    Object r(String str, String str2, j.c cVar, U5.d dVar);

    Object s(String str, Set set, j.c cVar, U5.d dVar);

    Object t(s sVar, j.c cVar, U5.d dVar);

    Object u(String str, j.c cVar, U5.d dVar);

    Object v(String str, j.c cVar, U5.d dVar);

    Object w(p pVar, j.c cVar, U5.d dVar);

    Object x(String str, j.c cVar, List list, U5.d dVar);

    Object y(String str, j.c cVar, U5.d dVar);

    Object z(j.c cVar, U5.d dVar);
}
