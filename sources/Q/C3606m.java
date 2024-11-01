package q;

import Q5.I;
import R5.AbstractC1428l;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import c.C2001i;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: q.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3606m extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final H6.a f36590a;

    /* renamed from: b, reason: collision with root package name */
    public final U7.i f36591b;

    /* renamed from: c, reason: collision with root package name */
    public final ChoiceCmpCallback f36592c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36593d;

    /* renamed from: q.m$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC3293z implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            I i8;
            ChoiceCmpCallback choiceCmpCallback;
            ChoiceCmpCallback choiceCmpCallback2;
            USRegulationData uSRegulationData = (USRegulationData) obj;
            if (uSRegulationData == null || (choiceCmpCallback2 = C3606m.this.f36592c) == null) {
                i8 = null;
            } else {
                choiceCmpCallback2.onReceiveUSRegulationsConsent(uSRegulationData);
                i8 = I.f8786a;
            }
            if (i8 == null && (choiceCmpCallback = C3606m.this.f36592c) != null) {
                choiceCmpCallback.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
            }
            return I.f8786a;
        }
    }

    public C3606m(H6.a mspaConfig, U7.i gbcConsentRepository, ChoiceCmpCallback choiceCmpCallback) {
        AbstractC3292y.i(mspaConfig, "mspaConfig");
        AbstractC3292y.i(gbcConsentRepository, "gbcConsentRepository");
        this.f36590a = mspaConfig;
        this.f36591b = gbcConsentRepository;
        this.f36592c = choiceCmpCallback;
        this.f36593d = 2;
    }

    public final LiveData a() {
        if (C2001i.f15173b) {
            this.f36591b.a();
        }
        H6.d dVar = H6.d.f3272a;
        H6.a mspaConfig = this.f36590a;
        a completion = new a();
        AbstractC3292y.i(mspaConfig, "mspaConfig");
        AbstractC3292y.i(completion, "completion");
        I6.e eVar = H6.d.f3275d;
        if (eVar != null) {
            List<H6.e> purposes = mspaConfig.f3253d;
            if (purposes != null) {
                H6.c completion2 = new H6.c(completion);
                AbstractC3292y.i(purposes, "purposes");
                AbstractC3292y.i(completion2, "completion");
                for (H6.e eVar2 : purposes) {
                    eVar2.f3284d = Boolean.FALSE;
                    List list = eVar2.f3287g;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((H6.f) it.next()).f3291d = Boolean.FALSE;
                        }
                    }
                }
                eVar.e(purposes, true, new I6.d(completion2));
            }
        } else {
            A5.b.a(A5.b.f238a, ChoiceError.UNEXPECTED_ERROR_OCCURRED, null, null, A5.c.CONSOLE, null, 22);
            completion.invoke(null);
        }
        return Q7.m.f9074a.a(Q7.n.ACCEPT_ALL, Q7.a.ACCEPT_ALL);
    }

    public final List b(int[] iArr) {
        ArrayList<H6.e> arrayList;
        boolean U8;
        String str;
        ArrayList arrayList2 = new ArrayList();
        List list = this.f36590a.f3253d;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Integer num = ((H6.e) obj).f3281a;
                if (num == null) {
                    U8 = false;
                } else {
                    U8 = AbstractC1428l.U(iArr, num.intValue());
                }
                if (U8) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null) {
            for (H6.e eVar : arrayList) {
                Integer num2 = eVar.f3281a;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    L5.a aVar = eVar.f3285e;
                    if (aVar == null) {
                        str = null;
                    } else {
                        str = aVar.f5401c;
                    }
                    if (str == null) {
                        str = "";
                    }
                    arrayList2.add(new b8.d(new G6.f(intValue, str), eVar.f3284d, null, b8.e.MSPA_PURPOSE, false, null, null, 116));
                }
            }
        }
        return arrayList2;
    }
}
