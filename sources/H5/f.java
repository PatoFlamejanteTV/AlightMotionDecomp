package H5;

import D5.i;
import H5.d;
import Q5.I;
import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;

/* loaded from: classes5.dex */
public final class f extends AbstractC3293z implements InterfaceC2072n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f3247a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(T t8) {
        super(2);
        this.f3247a = t8;
    }

    @Override // c6.InterfaceC2072n
    public Object invoke(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        String str;
        int intValue3;
        int intValue4;
        String hash = (String) obj;
        Set vendorIds = (Set) obj2;
        AbstractC3292y.i(hash, "hash");
        AbstractC3292y.i(vendorIds, "vendorIds");
        i a9 = i.f1381c.a(hash);
        T t8 = this.f3247a;
        String str2 = (String) t8.f34573a;
        d.a aVar = d.f3245a;
        Integer valueOf = Integer.valueOf(a9.f1382a);
        F5.c cVar = F5.c.f2694a;
        Integer a10 = cVar.a(F5.d.PURPOSE_ID);
        int i8 = 0;
        if (a10 == null) {
            intValue = 0;
        } else {
            intValue = a10.intValue();
        }
        t8.f34573a = AbstractC3292y.q(str2, aVar.b(valueOf, intValue));
        T t9 = this.f3247a;
        String str3 = (String) t9.f34573a;
        Integer valueOf2 = Integer.valueOf(a9.f1383b.f1392a);
        Integer a11 = cVar.a(F5.d.RESTRICTION_TYPE);
        if (a11 == null) {
            intValue2 = 0;
        } else {
            intValue2 = a11.intValue();
        }
        t9.f34573a = AbstractC3292y.q(str3, aVar.b(valueOf2, intValue2));
        List O02 = AbstractC1435t.O0(vendorIds);
        int size = O02.size();
        String str4 = "";
        int i9 = 0;
        int i10 = 0;
        loop0: while (true) {
            int i11 = 0;
            while (i9 < size) {
                int i12 = i9 + 1;
                int intValue5 = ((Number) O02.get(i9)).intValue();
                if (i11 == 0) {
                    i10++;
                    i11 = intValue5;
                }
                boolean z8 = true;
                if (i9 != O02.size() - 1 && ((Number) O02.get(i12)).intValue() <= intValue5 + 1) {
                    i9 = i12;
                } else {
                    if (intValue5 == i11) {
                        z8 = false;
                    }
                    if (z8) {
                        str = "1";
                    } else {
                        str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                    }
                    String q8 = AbstractC3292y.q(str4, str);
                    d.a aVar2 = d.f3245a;
                    Integer valueOf3 = Integer.valueOf(i11);
                    F5.c cVar2 = F5.c.f2694a;
                    F5.d dVar = F5.d.VENDOR_ID;
                    Integer a12 = cVar2.a(dVar);
                    if (a12 == null) {
                        intValue3 = 0;
                    } else {
                        intValue3 = a12.intValue();
                    }
                    str4 = AbstractC3292y.q(q8, aVar2.b(valueOf3, intValue3));
                    if (z8) {
                        Integer valueOf4 = Integer.valueOf(intValue5);
                        Integer a13 = cVar2.a(dVar);
                        if (a13 == null) {
                            intValue4 = 0;
                        } else {
                            intValue4 = a13.intValue();
                        }
                        str4 = AbstractC3292y.q(str4, aVar2.b(valueOf4, intValue4));
                    }
                    i9 = i12;
                }
            }
            break loop0;
        }
        T t10 = this.f3247a;
        String str5 = (String) t10.f34573a;
        d.a aVar3 = d.f3245a;
        Integer valueOf5 = Integer.valueOf(i10);
        Integer a14 = F5.c.f2694a.a(F5.d.NUM_ENTRIES);
        if (a14 != null) {
            i8 = a14.intValue();
        }
        t10.f34573a = AbstractC3292y.q(str5, aVar3.b(valueOf5, i8));
        T t11 = this.f3247a;
        t11.f34573a = AbstractC3292y.q((String) t11.f34573a, str4);
        return I.f8786a;
    }
}
