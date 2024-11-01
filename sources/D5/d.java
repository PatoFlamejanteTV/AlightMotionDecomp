package D5;

import Q5.I;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import v1.C4119a;
import z1.AbstractC4263c;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1370a = new a();

    /* loaded from: classes5.dex */
    public static final class a {
        public final String a(s tcModel) {
            Integer num;
            int intValue;
            AbstractC3292y.i(tcModel, "tcModel");
            try {
                Y7.d dVar = Y7.d.f13152a;
                C4119a gppModel = dVar.g();
                SharedStorage m8 = dVar.m();
                gppModel.k(A1.h.f116f, AbstractC4263c.f41347a, Integer.valueOf(tcModel.f1422i));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41350d, Integer.valueOf(tcModel.f1426m));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41351e, Integer.valueOf(tcModel.f1427n));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41352f, Integer.valueOf(tcModel.f1423j));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41353g, tcModel.f1425l);
                String str = A1.h.f116f;
                String str2 = AbstractC4263c.f41354h;
                G6.e eVar = tcModel.f1414a;
                if (eVar == null) {
                    num = null;
                } else {
                    num = eVar.f3112b;
                }
                if (num == null) {
                    intValue = tcModel.f1428o;
                } else {
                    intValue = num.intValue();
                }
                gppModel.k(str, str2, Integer.valueOf(intValue));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41355i, Integer.valueOf(tcModel.f()));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41356j, Boolean.valueOf(tcModel.f1418e));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41357k, Boolean.valueOf(tcModel.f1419f));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41358l, b(12, tcModel.f1430q));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41359m, b(24, tcModel.f1431r));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41360n, b(24, tcModel.f1432s));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41361o, Boolean.valueOf(tcModel.f1420g));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41362p, tcModel.f1421h);
                gppModel.k(A1.h.f116f, AbstractC4263c.f41363q, AbstractC1435t.W0(tcModel.f1439z.getAcceptedItems()));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41364r, AbstractC1435t.W0(tcModel.f1409C.getAcceptedItems()));
                String str3 = A1.h.f116f;
                String str4 = AbstractC4263c.f41365s;
                ArrayList arrayList = new ArrayList();
                Iterator it = tcModel.f1413G.f1386c.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.addAll((Collection) ((Map.Entry) it.next()).getValue());
                }
                I i8 = I.f8786a;
                gppModel.k(str3, str4, arrayList);
                gppModel.k(A1.h.f116f, AbstractC4263c.f41367u, b(24, tcModel.f1435v));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41368v, b(24, tcModel.f1436w));
                int i9 = tcModel.f1429p;
                gppModel.k(A1.h.f116f, AbstractC4263c.f41369w, Integer.valueOf(i9));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41370x, b(i9, tcModel.f1437x));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41371y, b(i9, tcModel.f1438y));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41344A, AbstractC1435t.W0(tcModel.f1412F.getAcceptedItems()));
                gppModel.k(A1.h.f116f, AbstractC4263c.f41346C, AbstractC1435t.W0(tcModel.f1411E.getAcceptedItems()));
                m8.e(X7.a.HDR_GPP_VERSION, String.valueOf(gppModel.e().g()));
                m8.e(X7.a.HDR_SECTION_LIST, gppModel.h().toString());
                X7.a aVar = X7.a.HDR_SECTION_ID;
                List h8 = gppModel.h();
                AbstractC3292y.h(h8, "gppModel.sectionIds");
                m8.e(aVar, AbstractC1435t.w0(h8, "_", null, null, 0, null, null, 62, null));
                String z8 = l6.n.z("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(A1.h.f114d), false, 4, null);
                String b9 = gppModel.g(A1.h.f116f).b();
                AbstractC3292y.h(b9, "gppModel.getSection(TcfEuV2.NAME).encode()");
                m8.g(z8, b9);
                ZonedDateTime zonedDateTime = tcModel.f1417d;
                if (zonedDateTime != null) {
                    gppModel.k(A1.h.f116f, AbstractC4263c.f41348b, zonedDateTime);
                    gppModel.k(A1.h.f116f, AbstractC4263c.f41349c, tcModel.f1417d);
                }
                Y7.d dVar2 = Y7.d.f13152a;
                AbstractC3292y.i(gppModel, "gppModel");
                Y7.d.f13166o = gppModel;
                String gppString = gppModel.d();
                X7.a aVar2 = X7.a.HDR_GPP_STRING;
                AbstractC3292y.h(gppString, "gppString");
                m8.e(aVar2, gppString);
                return gppString;
            } catch (Exception unused) {
                ChoiceCmpCallback callback = ChoiceCmp.INSTANCE.getCallback();
                if (callback != null) {
                    callback.onCmpError(ChoiceError.ERROR_WHILE_SAVING_CONSENT);
                    return "";
                }
                return "";
            }
        }

        public final List b(int i8, Vector vector) {
            boolean[] zArr = new boolean[i8];
            Iterator<T> it = vector.getAcceptedItems().iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (1 <= intValue && intValue < i8 + 1) {
                    zArr[intValue - 1] = true;
                }
            }
            return AbstractC1428l.W0(zArr);
        }
    }
}
