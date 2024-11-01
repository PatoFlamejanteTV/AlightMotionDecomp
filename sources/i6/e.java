package I6;

import A1.l;
import Q5.I;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import R5.N;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import i6.i;
import i6.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import org.json.JSONArray;
import org.json.JSONException;
import v1.C4119a;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public C4119a f3802a;

    /* renamed from: b, reason: collision with root package name */
    public final J6.f f3803b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedStorage f3804c;

    /* renamed from: d, reason: collision with root package name */
    public final USRegulationData f3805d;

    public e() {
        Y7.d dVar = Y7.d.f13152a;
        this.f3802a = dVar.g();
        this.f3803b = dVar.j();
        this.f3804c = dVar.m();
        this.f3805d = new USRegulationData(0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 131071, null);
    }

    public final String a() {
        try {
            String d8 = this.f3802a.d();
            AbstractC3292y.h(d8, "{ gppModel.encode() }");
            return d8;
        } catch (Exception unused) {
            A5.b.a(A5.b.f238a, ChoiceError.ERROR_WHILE_SAVING_CONSENT, null, null, A5.c.CONSOLE, null, 22);
            return "";
        }
    }

    public String b(H6.b field) {
        AbstractC3292y.i(field, "field");
        switch (field.ordinal()) {
            case 0:
                String SHARING_NOTICE = z1.g.f41417b;
                AbstractC3292y.h(SHARING_NOTICE, "SHARING_NOTICE");
                return SHARING_NOTICE;
            case 1:
                String SALE_OPT_OUT_NOTICE = z1.g.f41418c;
                AbstractC3292y.h(SALE_OPT_OUT_NOTICE, "SALE_OPT_OUT_NOTICE");
                return SALE_OPT_OUT_NOTICE;
            case 2:
                String SHARING_OPT_OUT_NOTICE = z1.g.f41419d;
                AbstractC3292y.h(SHARING_OPT_OUT_NOTICE, "SHARING_OPT_OUT_NOTICE");
                return SHARING_OPT_OUT_NOTICE;
            case 3:
                String TARGETED_ADVERTISING_OPT_OUT_NOTICE = z1.g.f41420e;
                AbstractC3292y.h(TARGETED_ADVERTISING_OPT_OUT_NOTICE, "TARGETED_ADVERTISING_OPT_OUT_NOTICE");
                return TARGETED_ADVERTISING_OPT_OUT_NOTICE;
            case 4:
                String SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE = z1.g.f41421f;
                AbstractC3292y.h(SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE, "SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE");
                return SENSITIVE_DATA_PROCESSING_OPT_OUT_NOTICE;
            case 5:
                String SENSITIVE_DATA_LIMIT_USE_NOTICE = z1.g.f41422g;
                AbstractC3292y.h(SENSITIVE_DATA_LIMIT_USE_NOTICE, "SENSITIVE_DATA_LIMIT_USE_NOTICE");
                return SENSITIVE_DATA_LIMIT_USE_NOTICE;
            case 6:
                String SALE_OPT_OUT = z1.g.f41423h;
                AbstractC3292y.h(SALE_OPT_OUT, "SALE_OPT_OUT");
                return SALE_OPT_OUT;
            case 7:
                String SHARING_OPT_OUT = z1.g.f41424i;
                AbstractC3292y.h(SHARING_OPT_OUT, "SHARING_OPT_OUT");
                return SHARING_OPT_OUT;
            case 8:
                String TARGETED_ADVERTISING_OPT_OUT = z1.g.f41425j;
                AbstractC3292y.h(TARGETED_ADVERTISING_OPT_OUT, "TARGETED_ADVERTISING_OPT_OUT");
                return TARGETED_ADVERTISING_OPT_OUT;
            case 9:
                String SENSITIVE_DATA_PROCESSING = z1.g.f41426k;
                AbstractC3292y.h(SENSITIVE_DATA_PROCESSING, "SENSITIVE_DATA_PROCESSING");
                return SENSITIVE_DATA_PROCESSING;
            case 10:
                String KNOWN_CHILD_SENSITIVE_DATA_CONSENTS = z1.g.f41427l;
                AbstractC3292y.h(KNOWN_CHILD_SENSITIVE_DATA_CONSENTS, "KNOWN_CHILD_SENSITIVE_DATA_CONSENTS");
                return KNOWN_CHILD_SENSITIVE_DATA_CONSENTS;
            case 11:
                String PERSONAL_DATA_CONSENTS = z1.g.f41428m;
                AbstractC3292y.h(PERSONAL_DATA_CONSENTS, "PERSONAL_DATA_CONSENTS");
                return PERSONAL_DATA_CONSENTS;
            case 12:
                String MSPA_COVERED_TRANSACTION = z1.g.f41429n;
                AbstractC3292y.h(MSPA_COVERED_TRANSACTION, "MSPA_COVERED_TRANSACTION");
                return MSPA_COVERED_TRANSACTION;
            case 13:
                String MSPA_OPT_OUT_OPTION_MODE = z1.g.f41430o;
                AbstractC3292y.h(MSPA_OPT_OUT_OPTION_MODE, "MSPA_OPT_OUT_OPTION_MODE");
                return MSPA_OPT_OUT_OPTION_MODE;
            case 14:
                String MSPA_SERVICE_PROVIDER_MODE = z1.g.f41431p;
                AbstractC3292y.h(MSPA_SERVICE_PROVIDER_MODE, "MSPA_SERVICE_PROVIDER_MODE");
                return MSPA_SERVICE_PROVIDER_MODE;
            default:
                return "";
        }
    }

    public final void c(H6.b field, Object value) {
        AbstractC3292y.i(field, "field");
        AbstractC3292y.i(value, "value");
        try {
            this.f3802a.k(g(), b(field), value);
        } catch (Exception unused) {
            A5.b.a(A5.b.f238a, ChoiceError.ERROR_WHILE_SAVING_CONSENT, null, null, A5.c.CONSOLE, null, 22);
        }
    }

    public void d(H6.b field, boolean z8) {
        List<Integer> p8;
        AbstractC3292y.i(field, "field");
        if (z8) {
            p8 = AbstractC1435t.p(1, 1);
        } else {
            p8 = AbstractC1435t.p(2, 2);
        }
        c(field, p8);
        this.f3805d.setKnownChildSensitiveDataConsents(p8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.ArrayList] */
    public final void e(List purposes, boolean z8, Function1 function1) {
        ?? m8;
        int i8;
        int i9;
        I i10;
        List<H6.f> list;
        H6.b bVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC3292y.i(purposes, "purposes");
        int i17 = this.f3804c.i(X7.a.SAVED_MSPA_SECTION_ID);
        String str = "";
        this.f3804c.g(n.z("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(i17), false, 4, null), "");
        try {
            JSONArray jSONArray = new JSONArray(this.f3804c.j(X7.a.HDR_SECTION_LIST));
            i s8 = m.s(0, jSONArray.length());
            m8 = new ArrayList(AbstractC1435t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                m8.add(Integer.valueOf(jSONArray.getInt(((N) it).nextInt())));
            }
        } catch (JSONException unused) {
            m8 = AbstractC1435t.m();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : m8) {
            if (((Number) obj).intValue() != i17) {
                arrayList.add(obj);
            }
        }
        this.f3804c.e(X7.a.HDR_SECTION_LIST, arrayList.toString());
        this.f3804c.e(X7.a.HDR_SECTION_ID, AbstractC1435t.w0(arrayList, "_", null, null, 0, null, null, 62, null));
        this.f3802a.b(i17);
        this.f3804c.e(X7.a.GPP_STRING, a());
        Iterator it2 = purposes.iterator();
        while (true) {
            int i18 = 2;
            if (it2.hasNext()) {
                H6.e eVar = (H6.e) it2.next();
                Integer num = eVar.f3281a;
                if (num != null) {
                    switch (num.intValue()) {
                        case 1:
                            bVar = H6.b.SharingOptOut;
                            break;
                        case 2:
                            bVar = H6.b.SaleOptOut;
                            break;
                        case 3:
                            bVar = H6.b.TargetedAdvertisingOptOut;
                            break;
                        case 4:
                            bVar = H6.b.PersonalDataConsents;
                            break;
                        case 5:
                            bVar = H6.b.SensitiveDataProcessing;
                            break;
                        case 6:
                            bVar = H6.b.KnownChildSensitiveDataConsents;
                            break;
                        default:
                            bVar = H6.b.NONE;
                            break;
                    }
                    Object obj2 = 0;
                    switch (bVar.ordinal()) {
                        case 6:
                            if (z8) {
                                i11 = 1;
                            } else {
                                i11 = 2;
                            }
                            c(H6.b.SaleOptOutNotice, Integer.valueOf(i11));
                            this.f3805d.setSaleOptOutNotice(i11);
                            if (z8) {
                                if (AbstractC3292y.d(eVar.f3284d, Boolean.TRUE)) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                            } else {
                                i12 = 0;
                            }
                            Integer valueOf = Integer.valueOf(i12);
                            USRegulationData uSRegulationData = this.f3805d;
                            if (AbstractC3292y.d(eVar.f3284d, Boolean.TRUE)) {
                                i18 = 1;
                            }
                            uSRegulationData.setSaleOptOut(i18);
                            c(bVar, valueOf);
                            break;
                        case 7:
                            j(z8);
                            k(z8);
                            if (b(bVar).length() <= 0) {
                                break;
                            } else {
                                if (z8) {
                                    if (AbstractC3292y.d(eVar.f3284d, Boolean.TRUE)) {
                                        i13 = 1;
                                    } else {
                                        i13 = 2;
                                    }
                                } else {
                                    i13 = 0;
                                }
                                Integer valueOf2 = Integer.valueOf(i13);
                                USRegulationData uSRegulationData2 = this.f3805d;
                                if (z8) {
                                    if (AbstractC3292y.d(eVar.f3284d, Boolean.TRUE)) {
                                        i18 = 1;
                                    }
                                } else {
                                    i18 = 0;
                                }
                                uSRegulationData2.setSharingOptOut(i18);
                                c(bVar, valueOf2);
                                break;
                            }
                        case 8:
                            if (b(bVar).length() > 0) {
                                l(z8);
                                if (z8) {
                                    if (AbstractC3292y.d(eVar.f3284d, Boolean.TRUE)) {
                                        i14 = 1;
                                    } else {
                                        i14 = 2;
                                    }
                                } else {
                                    i14 = 0;
                                }
                                Integer valueOf3 = Integer.valueOf(i14);
                                USRegulationData uSRegulationData3 = this.f3805d;
                                if (z8) {
                                    if (AbstractC3292y.d(eVar.f3284d, Boolean.TRUE)) {
                                        i18 = 1;
                                    }
                                } else {
                                    i18 = 0;
                                }
                                uSRegulationData3.setTargetedAdvertisingOptOut(i18);
                                c(bVar, valueOf3);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            List<H6.f> list2 = eVar.f3287g;
                            if (list2 != null) {
                                h(z8);
                                f(z8);
                                int[] iArr = new int[12];
                                for (int i19 = 0; i19 < 12; i19++) {
                                    iArr[i19] = 0;
                                }
                                for (H6.f fVar : list2) {
                                    if (fVar.f3289b != null && new i(1, 12).m(fVar.f3289b.intValue())) {
                                        int intValue = fVar.f3289b.intValue() - 1;
                                        Boolean bool = fVar.f3291d;
                                        if (bool == null) {
                                            bool = eVar.f3284d;
                                        }
                                        if (AbstractC3292y.d(bool, Boolean.TRUE)) {
                                            i15 = 1;
                                        } else {
                                            i15 = 2;
                                        }
                                        iArr[intValue] = i15;
                                    }
                                }
                                obj2 = AbstractC1428l.U0(iArr);
                                this.f3805d.setSensitiveDataProcessing(AbstractC1428l.U0(iArr));
                            }
                            c(bVar, obj2);
                            break;
                        case 10:
                            d(bVar, AbstractC3292y.d(eVar.f3284d, Boolean.TRUE));
                            break;
                        case 11:
                            if (b(bVar).length() <= 0) {
                                break;
                            } else {
                                if (z8) {
                                    if (AbstractC3292y.d(eVar.f3284d, Boolean.TRUE)) {
                                        i16 = 1;
                                    } else {
                                        i16 = 2;
                                    }
                                } else {
                                    i16 = 0;
                                }
                                Integer valueOf4 = Integer.valueOf(i16);
                                USRegulationData uSRegulationData4 = this.f3805d;
                                if (z8) {
                                    if (AbstractC3292y.d(eVar.f3284d, Boolean.TRUE)) {
                                        i18 = 1;
                                    }
                                } else {
                                    i18 = 0;
                                }
                                uSRegulationData4.setPersonalDataConsents(i18);
                                c(bVar, valueOf4);
                                break;
                            }
                    }
                }
            } else {
                if (this.f3803b.f4497b.f4446K) {
                    i8 = 1;
                } else {
                    i8 = 2;
                }
                c(H6.b.MspaCoveredTransaction, Integer.valueOf(i8));
                this.f3805d.setMspaCoveredTransaction(i8);
                String str2 = this.f3803b.f4497b.f4447L;
                H6.e eVar2 = null;
                if (str2 == null) {
                    i10 = null;
                } else {
                    if (AbstractC3292y.d(str2, "OPT_OUT")) {
                        i9 = 1;
                    } else {
                        i9 = 2;
                    }
                    if (AbstractC3292y.d(str2, "SERVICE-PROVIDER")) {
                        i18 = 1;
                    }
                    c(H6.b.MspaOptOutOptionMode, Integer.valueOf(i9));
                    c(H6.b.MspaServiceProviderMode, Integer.valueOf(i18));
                    this.f3805d.setMspaOptOutOptionMode(i9);
                    this.f3805d.setMspaServiceProviderMode(i18);
                    i10 = I.f8786a;
                }
                if (i10 == null) {
                    c(H6.b.MspaOptOutOptionMode, 0);
                    c(H6.b.MspaServiceProviderMode, 0);
                    this.f3805d.setMspaOptOutOptionMode(0);
                    this.f3805d.setMspaServiceProviderMode(0);
                }
                Vector vector = new Vector(null, 1, null);
                Iterator it3 = purposes.iterator();
                while (it3.hasNext()) {
                    H6.e eVar3 = (H6.e) it3.next();
                    Integer num2 = eVar3.f3281a;
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        if (AbstractC3292y.d(eVar3.f3284d, Boolean.TRUE)) {
                            vector.set(intValue2);
                        } else {
                            vector.unset(intValue2);
                        }
                    }
                }
                this.f3804c.d(X7.a.MSPA_PURPOSE_CONSENT, vector);
                Vector vector2 = new Vector(null, 1, null);
                Iterator it4 = purposes.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        ?? next = it4.next();
                        Integer num3 = ((H6.e) next).f3281a;
                        int b02 = AbstractC1428l.b0(H6.i.f3304c);
                        if (num3 != null && num3.intValue() == b02) {
                            eVar2 = next;
                        }
                    }
                }
                H6.e eVar4 = eVar2;
                if (eVar4 != null && (list = eVar4.f3287g) != null) {
                    for (H6.f fVar2 : list) {
                        Integer num4 = fVar2.f3289b;
                        if (num4 != null) {
                            int intValue3 = num4.intValue();
                            if (AbstractC3292y.d(fVar2.f3291d, Boolean.TRUE)) {
                                vector2.set(intValue3);
                            } else {
                                vector2.unset(intValue3);
                            }
                        }
                    }
                }
                this.f3804c.d(X7.a.MSPA_SENSITIVE_PURPOSE_CONSENT, vector2);
                Y7.d dVar = Y7.d.f13152a;
                C4119a gppModel = this.f3802a;
                AbstractC3292y.i(gppModel, "gppModel");
                Y7.d.f13166o = gppModel;
                this.f3805d.setGppString(a());
                this.f3805d.setVersion(1);
                this.f3804c.c(X7.a.SAVED_MSPA_SECTION_ID, i());
                this.f3804c.e(X7.a.HDR_GPP_VERSION, String.valueOf(this.f3802a.e().g()));
                this.f3804c.e(X7.a.HDR_SECTION_LIST, this.f3802a.h().toString());
                SharedStorage sharedStorage = this.f3804c;
                X7.a aVar = X7.a.HDR_SECTION_ID;
                List h8 = this.f3802a.h();
                AbstractC3292y.h(h8, "gppModel.sectionIds");
                sharedStorage.e(aVar, AbstractC1435t.w0(h8, "_", null, null, 0, null, null, 62, null));
                String z9 = n.z("IABGPP_[SectionID]_String", "[SectionID]", String.valueOf(i()), false, 4, null);
                SharedStorage sharedStorage2 = this.f3804c;
                try {
                    String b9 = this.f3802a.g(g()).b();
                    AbstractC3292y.h(b9, "{\n            gppModel.g…ction).encode()\n        }");
                    str = b9;
                } catch (Exception unused2) {
                }
                sharedStorage2.g(z9, str);
                this.f3804c.e(X7.a.HDR_GPP_STRING, this.f3805d.getGppString());
                this.f3804c.e(X7.a.SAVED_MSPA_JURISDICTION, H6.d.f3279h.f1380a);
                this.f3804c.e(X7.a.SAVED_REGION, Y7.d.f13165n);
                this.f3804c.e(X7.a.GPP_STRING, this.f3805d.getGppString());
                function1.invoke(this.f3805d);
                return;
            }
        }
    }

    public void f(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(H6.b.SensitiveDataLimitUseNotice, Integer.valueOf(i8));
        this.f3805d.setSensitiveDataLimitUseNotice(i8);
    }

    public String g() {
        String NAME = l.f134f;
        AbstractC3292y.h(NAME, "NAME");
        return NAME;
    }

    public void h(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(H6.b.SensitiveDataProcessingOptOutNotice, Integer.valueOf(i8));
        this.f3805d.setSensitiveDataProcessingOptOutNotice(i8);
    }

    public int i() {
        return l.f132d;
    }

    public void j(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(H6.b.SharingNotice, Integer.valueOf(i8));
        this.f3805d.setSharingNotice(i8);
    }

    public void k(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(H6.b.SharingOptOutNotice, Integer.valueOf(i8));
        this.f3805d.setSharingOptOutNotice(i8);
    }

    public void l(boolean z8) {
        int i8;
        if (z8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(H6.b.TargetedAdvertisingOptOutNotice, Integer.valueOf(i8));
        this.f3805d.setTargetedAdvertisingOptOutNotice(i8);
    }
}
