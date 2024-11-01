package b;

import D5.s;
import F5.a;
import F5.g;
import H5.d;
import H5.g;
import H5.h;
import R5.AbstractC1435t;
import U7.m;
import U7.o;
import U7.q;
import U7.u;
import U7.w;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import z1.AbstractC4263c;

/* renamed from: b.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1957l {

    /* renamed from: a, reason: collision with root package name */
    public SharedStorage f14873a;

    /* renamed from: b, reason: collision with root package name */
    public final s f14874b;

    /* renamed from: c, reason: collision with root package name */
    public final J6.f f14875c;

    /* renamed from: d, reason: collision with root package name */
    public final q f14876d;

    /* renamed from: e, reason: collision with root package name */
    public final U7.c f14877e;

    /* renamed from: f, reason: collision with root package name */
    public final u f14878f;

    /* renamed from: g, reason: collision with root package name */
    public w f14879g;

    /* renamed from: h, reason: collision with root package name */
    public final m f14880h;

    /* renamed from: i, reason: collision with root package name */
    public final o f14881i;

    /* renamed from: j, reason: collision with root package name */
    public final U7.k f14882j;

    /* renamed from: k, reason: collision with root package name */
    public final U7.e f14883k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14884l;

    /* renamed from: m, reason: collision with root package name */
    public D5.e f14885m;

    /* renamed from: n, reason: collision with root package name */
    public O5.b f14886n;

    /* renamed from: o, reason: collision with root package name */
    public int f14887o;

    /* renamed from: p, reason: collision with root package name */
    public D5.g f14888p;

    public C1957l(SharedStorage storage, s tcModel, J6.f portalConfig, q gvlRepository, U7.c cmpRepository, u portalConfigRepository, w translationsTextRepository, m geoIPRepository, o googleVendorsRepository, U7.k gbcRepository, U7.e consentRepository) {
        AbstractC3292y.i(storage, "storage");
        AbstractC3292y.i(tcModel, "tcModel");
        AbstractC3292y.i(portalConfig, "portalConfig");
        AbstractC3292y.i(gvlRepository, "gvlRepository");
        AbstractC3292y.i(cmpRepository, "cmpRepository");
        AbstractC3292y.i(portalConfigRepository, "portalConfigRepository");
        AbstractC3292y.i(translationsTextRepository, "translationsTextRepository");
        AbstractC3292y.i(geoIPRepository, "geoIPRepository");
        AbstractC3292y.i(googleVendorsRepository, "googleVendorsRepository");
        AbstractC3292y.i(gbcRepository, "gbcRepository");
        AbstractC3292y.i(consentRepository, "consentRepository");
        this.f14873a = storage;
        this.f14874b = tcModel;
        this.f14875c = portalConfig;
        this.f14876d = gvlRepository;
        this.f14877e = cmpRepository;
        this.f14878f = portalConfigRepository;
        this.f14879g = translationsTextRepository;
        this.f14880h = geoIPRepository;
        this.f14881i = googleVendorsRepository;
        this.f14882j = gbcRepository;
        this.f14883k = consentRepository;
        this.f14885m = new D5.e(null, 1);
        this.f14887o = -1;
        this.f14888p = new D5.g(null, null, 3);
        this.f14887o = g();
    }

    public final Vector a(Object obj) {
        ArrayList arrayList;
        Boolean bool;
        if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            arrayList = null;
        }
        Vector vector = new Vector(null, 1, null);
        if (arrayList != null) {
            int i8 = 0;
            for (Object obj2 : arrayList) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC1435t.w();
                }
                if (obj2 instanceof Boolean) {
                    bool = (Boolean) obj2;
                } else {
                    bool = null;
                }
                if (AbstractC3292y.d(bool, Boolean.TRUE)) {
                    vector.set(i9);
                }
                i8 = i9;
            }
        }
        return vector;
    }

    public final boolean b() {
        String str;
        String upperCase;
        if (this.f14875c.f4497b.f4452Q.contains("EEA")) {
            O5.b bVar = this.f14886n;
            if (bVar == null) {
                str = null;
            } else {
                str = bVar.f7876a;
            }
            int[] a9 = D5.b.a(32);
            int length = a9.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = a9[i8];
                i8++;
                String a10 = O5.a.a(i9);
                if (str == null) {
                    upperCase = null;
                } else {
                    upperCase = str.toUpperCase(Locale.ROOT);
                    AbstractC3292y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                }
                if (AbstractC3292y.d(a10, upperCase)) {
                    return true;
                }
            }
        }
        if (!this.f14875c.f4497b.f4452Q.contains("WORLDWIDE")) {
            return false;
        }
        return true;
    }

    public final boolean c(Set set) {
        List list = this.f14875c.f4497b.f4462h;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AbstractC1948c.a((Number) it.next(), list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Vector d(Object obj) {
        ArrayList arrayList;
        Integer num;
        if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            arrayList = null;
        }
        Vector vector = new Vector(null, 1, null);
        if (arrayList != null) {
            for (Object obj2 : arrayList) {
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    vector.set(num.intValue());
                }
            }
        }
        return vector;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14875c.f4497b.f4454S.f4485c);
        sb.append(this.f14875c.f4497b.f4454S.f4483a);
        return R7.b.b(sb.toString());
    }

    public final String f() {
        return R7.b.b(this.f14875c.f4498c.f4495c + this.f14875c.f4497b.f4480z + this.f14875c.f4497b.f4476v + this.f14875c.f4497b.f4477w + this.f14875c.f4497b.f4475u + this.f14875c.f4497b.f4473s + this.f14875c.f4497b.f4474t);
    }

    public final int g() {
        int i8 = this.f14873a.i(X7.a.TCF_POLICY_VERSION);
        if (i8 == 0) {
            return this.f14873a.i(X7.a.GPP_POLICY_VERSION);
        }
        return i8;
    }

    public final int h() {
        Integer num;
        G6.e eVar = this.f14874b.f1414a;
        if (eVar == null) {
            num = null;
        } else {
            num = eVar.f3113c;
        }
        if (num == null) {
            int i8 = this.f14873a.i(X7.a.TCF_POLICY_VERSION);
            if (i8 == 0) {
                return this.f14873a.i(X7.a.GPP_POLICY_VERSION);
            }
            return i8;
        }
        return num.intValue();
    }

    public final int i() {
        Integer num;
        G6.e eVar = this.f14874b.f1414a;
        if (eVar == null) {
            num = null;
        } else {
            num = eVar.f3112b;
        }
        if (num == null) {
            return this.f14873a.i(X7.a.VENDOR_LIST_VERSION);
        }
        return num.intValue();
    }

    public final boolean j() {
        if (m()) {
            return !AbstractC3292y.d(this.f14873a.j(X7.a.GBC_PURPOSE_HASH), e());
        }
        return false;
    }

    public final boolean k() {
        if (this.f14875c.f4497b.f4448M) {
            String str = Y7.d.f13165n;
            H6.g state = H6.g.CALIFORNIA;
            AbstractC3292y.i(state, "state");
            if (AbstractC3292y.d(str, DownloadCommon.DOWNLOAD_REPORT_CANCEL)) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        String str;
        O5.b bVar = this.f14886n;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.f7876a;
        }
        return n.s(str, "USA", true);
    }

    public final boolean m() {
        String str;
        String str2;
        String str3;
        String str4;
        String upperCase;
        J6.c cVar = this.f14875c.f4497b.f4454S;
        if (!cVar.f4483a) {
            return false;
        }
        if (!cVar.f4484b.contains("WORLDWIDE")) {
            String str5 = null;
            if (this.f14875c.f4497b.f4454S.f4484b.contains("EEA")) {
                O5.b bVar = this.f14886n;
                if (bVar == null) {
                    str4 = null;
                } else {
                    str4 = bVar.f7876a;
                }
                int[] a9 = D5.b.a(32);
                int length = a9.length;
                int i8 = 0;
                while (i8 < length) {
                    int i9 = a9[i8];
                    i8++;
                    String a10 = O5.a.a(i9);
                    if (str4 == null) {
                        upperCase = null;
                    } else {
                        upperCase = str4.toUpperCase(Locale.ROOT);
                        AbstractC3292y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    }
                    if (AbstractC3292y.d(a10, upperCase)) {
                        break;
                    }
                }
            }
            List list = this.f14875c.f4497b.f4454S.f4484b;
            O5.b bVar2 = this.f14886n;
            if (bVar2 == null || (str3 = bVar2.f7876a) == null) {
                str = null;
            } else {
                str = str3.toUpperCase(Locale.ROOT);
                AbstractC3292y.h(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            if (!AbstractC1435t.d0(list, str)) {
                List list2 = this.f14875c.f4497b.f4454S.f4484b;
                O5.b bVar3 = this.f14886n;
                if (bVar3 != null && (str2 = bVar3.f7876a) != null) {
                    str5 = str2.toLowerCase(Locale.ROOT);
                    AbstractC3292y.h(str5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                if (AbstractC1435t.d0(list2, str5)) {
                    break;
                }
                return false;
            }
        }
        return true;
    }

    public final boolean n() {
        SharedStorage sharedStorage = this.f14873a;
        X7.a preferenceKey = X7.a.VENDOR_LIST_LAST_UPDATED;
        sharedStorage.getClass();
        AbstractC3292y.i(preferenceKey, "preferenceKey");
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - sharedStorage.f19084a.getLong("gvl_last_updated", 0L)) >= this.f14875c.f4497b.f4436A && i() > this.f14873a.i(X7.a.VENDOR_LIST_VERSION)) {
            return false;
        }
        return true;
    }

    public final boolean o() {
        if (this.f14875c.f4497b.f4456b.contains("USP") && (this.f14875c.f4497b.f4452Q.contains("WORLDWIDE") || this.f14875c.f4497b.f4452Q.contains("USA"))) {
            return true;
        }
        return false;
    }

    public final void p() {
        List list;
        String[] strArr;
        String value;
        int i8;
        String[] strArr2;
        int i9;
        int i10;
        int i11;
        String str;
        int i12;
        String str2;
        String str3;
        int intValue;
        int i13;
        int intValue2;
        String str4;
        int intValue3;
        int i14;
        int intValue4;
        String str5;
        int intValue5;
        int i15;
        int intValue6;
        Integer b9;
        int intValue7;
        C1957l c1957l = this;
        Y7.d dVar = Y7.d.f13152a;
        int i16 = 0;
        if (dVar.g().i(A1.h.f114d)) {
            A1.c f8 = dVar.g().f(A1.h.f114d);
            Vector vector = c1957l.f14874b.f1431r;
            Object c8 = f8.c(AbstractC4263c.f41359m);
            AbstractC3292y.h(c8, "gppModel.getFieldValue(\n…ONSENTS\n                )");
            vector.set(c1957l.a(c8));
            Vector vector2 = c1957l.f14874b.f1432s;
            vector2.unsetAllOwnedItems();
            Object c9 = f8.c(AbstractC4263c.f41360n);
            AbstractC3292y.h(c9, "gppModel.getFieldValue(T…OSE_LEGITIMATE_INTERESTS)");
            vector2.set(c1957l.a(c9));
            Vector vector3 = c1957l.f14874b.f1430q;
            Object c10 = f8.c(AbstractC4263c.f41358l);
            AbstractC3292y.h(c10, "gppModel.getFieldValue(T…d.SPECIAL_FEATURE_OPTINS)");
            vector3.set(c1957l.a(c10));
            Vector vector4 = c1957l.f14874b.f1439z;
            vector4.unsetAllOwnedItems();
            Object c11 = f8.c(AbstractC4263c.f41363q);
            AbstractC3292y.h(c11, "gppModel.getFieldValue(T…uV2Field.VENDOR_CONSENTS)");
            vector4.setOwnedItems(c1957l.d(c11));
            Vector vector5 = c1957l.f14874b.f1409C;
            vector5.unsetAllOwnedItems();
            Object c12 = f8.c(AbstractC4263c.f41364r);
            AbstractC3292y.h(c12, "gppModel.getFieldValue(T…DOR_LEGITIMATE_INTERESTS)");
            vector5.setOwnedItems(c1957l.d(c12));
        } else {
            String j8 = c1957l.f14873a.j(X7.a.TC_STRING);
            String encodedTCString = j8.length() > 0 ? j8 : null;
            if (encodedTCString != null) {
                AbstractC3292y.i(encodedTCString, "encodedTCString");
                List s02 = n.s0(encodedTCString, new String[]{"."}, false, 0, 6, null);
                int size = s02.size();
                s tcModel = new s(null);
                int i17 = 0;
                while (i17 < size) {
                    int i18 = i17 + 1;
                    String encodedString = (String) s02.get(i17);
                    a.C0039a c0039a = F5.a.f2690a;
                    String a9 = c0039a.a(String.valueOf(encodedString.charAt(i16)));
                    F5.c cVar = F5.c.f2694a;
                    F5.d dVar2 = F5.d.SEGMENT_TYPE;
                    Integer a10 = cVar.a(dVar2);
                    String substring = a9.substring(i16, a10 == null ? 0 : a10.intValue());
                    AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Set set = D5.m.f1400b;
                    d.a aVar = H5.d.f3245a;
                    Integer a11 = cVar.a(dVar2);
                    D5.l segment = (D5.l) AbstractC1435t.h0(set, aVar.a(substring, a11 == null ? 0 : a11.intValue()));
                    g.a aVar2 = F5.g.f2714a;
                    String str6 = "encodedString";
                    AbstractC3292y.i(encodedString, "encodedString");
                    AbstractC3292y.i(tcModel, "tcModel");
                    AbstractC3292y.i(segment, "segment");
                    String a12 = c0039a.a(encodedString);
                    D5.l lVar = D5.l.CORE;
                    String str7 = LeanbackPreferenceDialogFragment.ARG_KEY;
                    if (segment == lVar) {
                        D5.c key = D5.c.VERSION;
                        AbstractC3292y.i(key, "key");
                        Map map = F5.c.f2695b;
                        Integer num = (Integer) map.get(key);
                        if (num == null) {
                            list = s02;
                            intValue7 = 0;
                        } else {
                            list = s02;
                            intValue7 = num.intValue();
                        }
                        String substring2 = a12.substring(i16, intValue7);
                        AbstractC3292y.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        AbstractC3292y.i(key, "key");
                        Integer num2 = (Integer) map.get(key);
                        tcModel.f1422i = aVar.a(substring2, num2 == null ? 0 : num2.intValue());
                    } else {
                        list = s02;
                    }
                    int intValue8 = (segment == lVar || (b9 = cVar.b("segmentType")) == null) ? 0 : b9.intValue();
                    if (tcModel.f1422i == 1) {
                        strArr = (String[]) J5.a.f4434b.get(segment.f1398a);
                    } else {
                        strArr = (String[]) J5.a.f4435c.get(segment.f1398a);
                    }
                    if (strArr != null) {
                        int length = strArr.length;
                        int i19 = 0;
                        while (i19 < length) {
                            String str8 = strArr[i19];
                            int i20 = i19 + 1;
                            H5.b bVar = H5.b.f3242a;
                            AbstractC3292y.i(str8, str7);
                            Integer b10 = F5.c.f2694a.b(str8);
                            if (b10 == null && F5.g.f2714a.a(str8)) {
                                b10 = Integer.valueOf(tcModel.f1429p);
                            }
                            if ((b10 != null && b10.intValue() == 0) || b10 == null) {
                                size = size;
                                strArr = strArr;
                                length = length;
                                i18 = i18;
                                a12 = a12;
                                str6 = str6;
                                i19 = i20;
                                str7 = str7;
                                intValue8 = intValue8;
                            } else {
                                try {
                                    value = a12.substring(intValue8, b10.intValue() + intValue8);
                                    AbstractC3292y.h(value, "this as java.lang.String…ing(startIndex, endIndex)");
                                } catch (IndexOutOfBoundsException unused) {
                                    value = n.c0(a12, b10.intValue() + intValue8, '0').substring(intValue8, b10.intValue() + intValue8);
                                    AbstractC3292y.h(value, "this as java.lang.String…ing(startIndex, endIndex)");
                                }
                                if (AbstractC3292y.d(str8, "version")) {
                                    tcModel.f1422i = H5.d.f3245a.a(value, b10.intValue());
                                    i11 = intValue8;
                                    i8 = size;
                                    strArr2 = strArr;
                                } else {
                                    if (AbstractC3292y.d(str8, "created")) {
                                        i8 = size;
                                        strArr2 = strArr;
                                        tcModel.f1415b = H5.a.f3241a.a(value, b10.intValue());
                                    } else {
                                        i8 = size;
                                        strArr2 = strArr;
                                        if (AbstractC3292y.d(str8, "lastUpdated")) {
                                            tcModel.f1416c = H5.a.f3241a.a(value, b10.intValue());
                                        } else {
                                            i9 = i18;
                                            if (AbstractC3292y.d(str8, "cmpId")) {
                                                int a13 = H5.d.f3245a.a(value, b10.intValue());
                                                if (a13 > -1) {
                                                    tcModel.f1426m = a13;
                                                } else {
                                                    D5.u uVar = new D5.u("cmpId", String.valueOf(a13), "");
                                                    A5.b bVar2 = A5.b.f238a;
                                                    ChoiceError choiceError = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3292y.h("f.s", "TAG");
                                                    String message = uVar.getMessage();
                                                    bVar2.b(choiceError, "f.s", message == null ? "" : message, A5.c.CONSOLE_AND_CALLBACK, uVar);
                                                }
                                            } else if (AbstractC3292y.d(str8, "cmpVersion")) {
                                                int a14 = H5.d.f3245a.a(value, b10.intValue());
                                                if (a14 > -1) {
                                                    tcModel.f1427n = a14;
                                                } else {
                                                    D5.u uVar2 = new D5.u("cmpVersion", String.valueOf(a14), "");
                                                    A5.b bVar3 = A5.b.f238a;
                                                    ChoiceError choiceError2 = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3292y.h("f.s", "TAG");
                                                    String message2 = uVar2.getMessage();
                                                    bVar3.b(choiceError2, "f.s", message2 == null ? "" : message2, A5.c.CONSOLE_AND_CALLBACK, uVar2);
                                                }
                                            } else if (AbstractC3292y.d(str8, "consentScreen")) {
                                                int a15 = H5.d.f3245a.a(value, b10.intValue());
                                                if (a15 > -1) {
                                                    tcModel.f1423j = a15;
                                                } else {
                                                    D5.u uVar3 = new D5.u("consentScreen", String.valueOf(a15), "");
                                                    A5.b bVar4 = A5.b.f238a;
                                                    ChoiceError choiceError3 = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3292y.h("f.s", "TAG");
                                                    String message3 = uVar3.getMessage();
                                                    bVar4.b(choiceError3, "f.s", message3 == null ? "" : message3, A5.c.CONSOLE_AND_CALLBACK, uVar3);
                                                }
                                            } else if (AbstractC3292y.d(str8, "consentLanguage")) {
                                                String a16 = H5.e.f3246a.a(value, b10.intValue());
                                                AbstractC3292y.i(a16, "<set-?>");
                                                tcModel.f1425l = a16;
                                            } else if (AbstractC3292y.d(str8, "vendorListVersion")) {
                                                int a17 = H5.d.f3245a.a(value, b10.intValue());
                                                tcModel.f1428o = a17;
                                                if (a17 < 0) {
                                                    D5.u uVar4 = new D5.u("vendorListVersion", String.valueOf(a17), "");
                                                    A5.b bVar5 = A5.b.f238a;
                                                    ChoiceError choiceError4 = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3292y.h("f.s", "TAG");
                                                    String message4 = uVar4.getMessage();
                                                    bVar5.b(choiceError4, "f.s", message4 == null ? "" : message4, A5.c.CONSOLE_AND_CALLBACK, uVar4);
                                                }
                                            } else if (AbstractC3292y.d(str8, "policyVersion")) {
                                                int a18 = H5.d.f3245a.a(value, b10.intValue());
                                                tcModel.f1424k = a18;
                                                if (a18 < 0) {
                                                    D5.u uVar5 = new D5.u("policyVersion", String.valueOf(a18), "");
                                                    A5.b bVar6 = A5.b.f238a;
                                                    ChoiceError choiceError5 = ChoiceError.TC_MODEL_PROPERTY_ERROR;
                                                    AbstractC3292y.h("f.s", "TAG");
                                                    String message5 = uVar5.getMessage();
                                                    bVar6.b(choiceError5, "f.s", message5 == null ? "" : message5, A5.c.CONSOLE_AND_CALLBACK, uVar5);
                                                }
                                            } else {
                                                String str9 = "1";
                                                String str10 = "value";
                                                if (AbstractC3292y.d(str8, "isServiceSpecific")) {
                                                    AbstractC3292y.i(value, "value");
                                                    tcModel.f1418e = AbstractC3292y.d(value, "1");
                                                } else if (AbstractC3292y.d(str8, "useNonStandardStacks")) {
                                                    AbstractC3292y.i(value, "value");
                                                    tcModel.f1419f = AbstractC3292y.d(value, "1");
                                                } else if (AbstractC3292y.d(str8, "specialFeatureOptions")) {
                                                    tcModel.f1430q = AbstractC1947b.a(b10, H5.c.f3244a, value, "<set-?>");
                                                } else if (AbstractC3292y.d(str8, "purposeConsents")) {
                                                    tcModel.f1431r = AbstractC1947b.a(b10, H5.c.f3244a, value, "<set-?>");
                                                } else if (AbstractC3292y.d(str8, "purposeLegitimateInterests")) {
                                                    tcModel.f1432s = AbstractC1947b.a(b10, H5.c.f3244a, value, "<set-?>");
                                                } else if (AbstractC3292y.d(str8, "purposeOneTreatment")) {
                                                    AbstractC3292y.i(value, "value");
                                                    tcModel.f1420g = AbstractC3292y.d(value, "1");
                                                } else if (AbstractC3292y.d(str8, "publisherCountryCode")) {
                                                    tcModel.b(H5.e.f3246a.a(value, b10.intValue()));
                                                } else {
                                                    i10 = length;
                                                    if (AbstractC3292y.d(str8, "vendorConsents")) {
                                                        h.a aVar3 = H5.h.f3249a;
                                                        String substring3 = a12.substring(intValue8);
                                                        AbstractC3292y.h(substring3, "this as java.lang.String).substring(startIndex)");
                                                        Vector a19 = aVar3.a(substring3);
                                                        AbstractC3292y.i(a19, "<set-?>");
                                                        tcModel.f1439z = a19;
                                                        b10 = Integer.valueOf(a19.getBitLength());
                                                    } else if (AbstractC3292y.d(str8, "vendorLegitimateInterests")) {
                                                        h.a aVar4 = H5.h.f3249a;
                                                        String substring4 = a12.substring(intValue8);
                                                        AbstractC3292y.h(substring4, "this as java.lang.String).substring(startIndex)");
                                                        Vector a20 = aVar4.a(substring4);
                                                        AbstractC3292y.i(a20, "<set-?>");
                                                        tcModel.f1409C = a20;
                                                        b10 = Integer.valueOf(a20.getBitLength());
                                                    } else {
                                                        if (AbstractC3292y.d(str8, "publisherRestrictions")) {
                                                            g.a aVar5 = H5.g.f3248a;
                                                            G6.e gvl = new G6.e();
                                                            AbstractC3292y.i(value, str6);
                                                            AbstractC3292y.i(gvl, "gvl");
                                                            D5.j jVar = new D5.j(gvl, null, null, null, 14);
                                                            d.a aVar6 = H5.d.f3245a;
                                                            F5.c cVar2 = F5.c.f2694a;
                                                            str = a12;
                                                            F5.d dVar3 = F5.d.NUM_RESTRICTIONS;
                                                            Integer a21 = cVar2.a(dVar3);
                                                            if (a21 == null) {
                                                                i12 = i20;
                                                                str2 = str6;
                                                                intValue = 0;
                                                            } else {
                                                                i12 = i20;
                                                                intValue = a21.intValue();
                                                                str2 = str6;
                                                            }
                                                            String substring5 = value.substring(0, intValue);
                                                            AbstractC3292y.h(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                                            Integer a22 = cVar2.a(dVar3);
                                                            int a23 = aVar6.a(substring5, a22 == null ? 0 : a22.intValue());
                                                            Integer a24 = cVar2.a(dVar3);
                                                            int intValue9 = a24 == null ? 0 : a24.intValue();
                                                            int i21 = 0;
                                                            while (i21 < a23) {
                                                                int i22 = i21 + 1;
                                                                d.a aVar7 = H5.d.f3245a;
                                                                F5.c cVar3 = F5.c.f2694a;
                                                                int i23 = a23;
                                                                F5.d dVar4 = F5.d.PURPOSE_ID;
                                                                Integer a25 = cVar3.a(dVar4);
                                                                if (a25 == null) {
                                                                    i13 = i22;
                                                                    intValue2 = 0;
                                                                } else {
                                                                    i13 = i22;
                                                                    intValue2 = a25.intValue();
                                                                }
                                                                String substring6 = value.substring(intValue9, intValue2);
                                                                AbstractC3292y.h(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                Integer a26 = cVar3.a(dVar4);
                                                                if (a26 == null) {
                                                                    str4 = str7;
                                                                    intValue3 = 0;
                                                                } else {
                                                                    str4 = str7;
                                                                    intValue3 = a26.intValue();
                                                                }
                                                                int a27 = aVar7.a(substring6, intValue3);
                                                                Integer a28 = cVar3.a(dVar4);
                                                                int intValue10 = intValue9 + (a28 == null ? 0 : a28.intValue());
                                                                F5.d dVar5 = F5.d.RESTRICTION_TYPE;
                                                                Integer a29 = cVar3.a(dVar5);
                                                                String substring7 = value.substring(intValue10, a29 == null ? 0 : a29.intValue());
                                                                AbstractC3292y.h(substring7, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                Integer a30 = cVar3.a(dVar5);
                                                                int a31 = aVar7.a(substring7, a30 == null ? 0 : a30.intValue());
                                                                Integer a32 = cVar3.a(dVar5);
                                                                int intValue11 = intValue10 + (a32 == null ? 0 : a32.intValue());
                                                                D5.i iVar = new D5.i(a27, D5.k.valueOf(String.valueOf(a31)));
                                                                F5.d dVar6 = F5.d.NUM_ENTRIES;
                                                                Integer a33 = cVar3.a(dVar6);
                                                                String substring8 = value.substring(intValue11, a33 == null ? 0 : a33.intValue());
                                                                AbstractC3292y.h(substring8, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                Integer a34 = cVar3.a(dVar6);
                                                                int a35 = aVar7.a(substring8, a34 == null ? 0 : a34.intValue());
                                                                Integer a36 = cVar3.a(dVar6);
                                                                intValue9 = intValue11 + (a36 == null ? 0 : a36.intValue());
                                                                if (a35 >= 0) {
                                                                    int i24 = 0;
                                                                    while (true) {
                                                                        int i25 = i24 + 1;
                                                                        F5.c cVar4 = F5.c.f2694a;
                                                                        F5.d dVar7 = F5.d.ANY_BOOLEAN;
                                                                        Integer a37 = cVar4.a(dVar7);
                                                                        if (a37 == null) {
                                                                            i14 = i25;
                                                                            intValue4 = 0;
                                                                        } else {
                                                                            i14 = i25;
                                                                            intValue4 = a37.intValue();
                                                                        }
                                                                        String substring9 = value.substring(intValue9, intValue4);
                                                                        AbstractC3292y.h(substring9, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                        AbstractC3292y.i(substring9, str10);
                                                                        boolean d8 = AbstractC3292y.d(substring9, str9);
                                                                        Integer a38 = cVar4.a(dVar7);
                                                                        int intValue12 = intValue9 + (a38 == null ? 0 : a38.intValue());
                                                                        d.a aVar8 = H5.d.f3245a;
                                                                        String str11 = str9;
                                                                        F5.d dVar8 = F5.d.VENDOR_ID;
                                                                        Integer a39 = cVar4.a(dVar8);
                                                                        if (a39 == null) {
                                                                            str5 = str10;
                                                                            intValue5 = 0;
                                                                        } else {
                                                                            str5 = str10;
                                                                            intValue5 = a39.intValue();
                                                                        }
                                                                        String substring10 = value.substring(intValue12, intValue5);
                                                                        AbstractC3292y.h(substring10, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                        Integer a40 = cVar4.a(dVar8);
                                                                        if (a40 == null) {
                                                                            i15 = intValue8;
                                                                            intValue6 = 0;
                                                                        } else {
                                                                            i15 = intValue8;
                                                                            intValue6 = a40.intValue();
                                                                        }
                                                                        int a41 = aVar8.a(substring10, intValue6);
                                                                        Integer a42 = cVar4.a(dVar8);
                                                                        intValue9 = intValue12 + (a42 == null ? 0 : a42.intValue());
                                                                        if (d8) {
                                                                            Integer a43 = cVar4.a(dVar8);
                                                                            String substring11 = value.substring(intValue9, a43 == null ? 0 : a43.intValue());
                                                                            AbstractC3292y.h(substring11, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                            Integer a44 = cVar4.a(dVar8);
                                                                            int a45 = aVar8.a(substring11, a44 == null ? 0 : a44.intValue());
                                                                            Integer a46 = cVar4.a(dVar8);
                                                                            intValue9 += a46 == null ? 0 : a46.intValue();
                                                                            if (a45 < a41) {
                                                                                StringBuilder sb = new StringBuilder();
                                                                                g.a aVar9 = H5.g.f3248a;
                                                                                sb.append((Object) "h.g");
                                                                                sb.append(": Invalid RangeEntry: endVendorId ");
                                                                                sb.append(a45);
                                                                                sb.append(" is less than ");
                                                                                sb.append(a41);
                                                                                throw new F5.e(sb.toString());
                                                                            }
                                                                            if (a41 <= a45) {
                                                                                while (true) {
                                                                                    int i26 = a41 + 1;
                                                                                    jVar.c(a41, iVar);
                                                                                    if (a41 == a45) {
                                                                                        break;
                                                                                    } else {
                                                                                        a41 = i26;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            jVar.c(a41, iVar);
                                                                        }
                                                                        if (i24 == a35) {
                                                                            a23 = i23;
                                                                            str9 = str11;
                                                                            i21 = i13;
                                                                            str7 = str4;
                                                                            str10 = str5;
                                                                            intValue8 = i15;
                                                                            break;
                                                                        }
                                                                        str9 = str11;
                                                                        i24 = i14;
                                                                        str10 = str5;
                                                                        intValue8 = i15;
                                                                    }
                                                                } else {
                                                                    a23 = i23;
                                                                    i21 = i13;
                                                                    str7 = str4;
                                                                }
                                                            }
                                                            i11 = intValue8;
                                                            str3 = str7;
                                                            AbstractC3292y.i(jVar, "<set-?>");
                                                            tcModel.f1413G = jVar;
                                                        } else {
                                                            i11 = intValue8;
                                                            str = a12;
                                                            i12 = i20;
                                                            str2 = str6;
                                                            str3 = str7;
                                                            if (AbstractC3292y.d(str8, "publisherConsents")) {
                                                                tcModel.f1435v = AbstractC1947b.a(b10, H5.c.f3244a, value, "<set-?>");
                                                            } else if (AbstractC3292y.d(str8, "publisherLegitimateInterests")) {
                                                                tcModel.f1436w = AbstractC1947b.a(b10, H5.c.f3244a, value, "<set-?>");
                                                            } else if (AbstractC3292y.d(str8, "numCustomPurposes")) {
                                                                tcModel.f1429p = H5.d.f3245a.a(value, b10.intValue());
                                                            } else if (AbstractC3292y.d(str8, "publisherCustomConsents")) {
                                                                tcModel.f1437x = AbstractC1947b.a(b10, H5.c.f3244a, value, "<set-?>");
                                                            } else if (AbstractC3292y.d(str8, "publisherCustomLegitimateInterests")) {
                                                                tcModel.f1438y = AbstractC1947b.a(b10, H5.c.f3244a, value, "<set-?>");
                                                            } else if (AbstractC3292y.d(str8, "vendorsAllowed")) {
                                                                Vector a47 = H5.h.f3249a.a(value);
                                                                AbstractC3292y.i(a47, "<set-?>");
                                                                tcModel.f1412F = a47;
                                                            } else if (AbstractC3292y.d(str8, "vendorsDisclosed")) {
                                                                Vector a48 = H5.h.f3249a.a(value);
                                                                AbstractC3292y.i(a48, "<set-?>");
                                                                tcModel.f1411E = a48;
                                                            } else {
                                                                g.a aVar10 = F5.g.f2714a;
                                                                throw new F5.e(((Object) "g.g") + ": Unable to find: " + str8 + " field on TCModel, segment");
                                                            }
                                                        }
                                                        intValue8 = b10.intValue() + i11;
                                                        size = i8;
                                                        strArr = strArr2;
                                                        length = i10;
                                                        i18 = i9;
                                                        a12 = str;
                                                        str6 = str2;
                                                        i19 = i12;
                                                        str7 = str3;
                                                    }
                                                    i11 = intValue8;
                                                    str = a12;
                                                    i12 = i20;
                                                    str2 = str6;
                                                    str3 = str7;
                                                    intValue8 = b10.intValue() + i11;
                                                    size = i8;
                                                    strArr = strArr2;
                                                    length = i10;
                                                    i18 = i9;
                                                    a12 = str;
                                                    str6 = str2;
                                                    i19 = i12;
                                                    str7 = str3;
                                                }
                                            }
                                            i11 = intValue8;
                                            str = a12;
                                            i10 = length;
                                            i12 = i20;
                                            str2 = str6;
                                            str3 = str7;
                                            intValue8 = b10.intValue() + i11;
                                            size = i8;
                                            strArr = strArr2;
                                            length = i10;
                                            i18 = i9;
                                            a12 = str;
                                            str6 = str2;
                                            i19 = i12;
                                            str7 = str3;
                                        }
                                    }
                                    i11 = intValue8;
                                }
                                str = a12;
                                i9 = i18;
                                i10 = length;
                                i12 = i20;
                                str2 = str6;
                                str3 = str7;
                                intValue8 = b10.intValue() + i11;
                                size = i8;
                                strArr = strArr2;
                                length = i10;
                                i18 = i9;
                                a12 = str;
                                str6 = str2;
                                i19 = i12;
                                str7 = str3;
                            }
                        }
                    }
                    c1957l = this;
                    s02 = list;
                    size = size;
                    i17 = i18;
                    i16 = 0;
                }
                c1957l.f14874b.f1431r.set(tcModel.f1431r);
                Vector vector6 = c1957l.f14874b.f1432s;
                vector6.unsetAllOwnedItems();
                vector6.set(tcModel.f1432s);
                c1957l.f14874b.f1430q.set(tcModel.f1430q);
                Vector vector7 = c1957l.f14874b.f1439z;
                vector7.unsetAllOwnedItems();
                vector7.setOwnedItems(tcModel.f1439z);
                Vector vector8 = c1957l.f14874b.f1409C;
                vector8.unsetAllOwnedItems();
                vector8.setOwnedItems(tcModel.f1409C);
            }
        }
        Y7.d dVar9 = Y7.d.f13152a;
        if (dVar9.g().j(A1.h.f116f) || c1957l.f14873a.j(X7.a.TC_STRING).length() > 0) {
            String str12 = c1957l.f14875c.f4497b.f4444I;
            if (str12 != null) {
                PrivacyEncodingMode privacyEncodingMode = PrivacyEncodingMode.GPP;
                if (str12.equals(privacyEncodingMode.getValue())) {
                    if (!dVar9.g().i(A1.h.f114d)) {
                        c1957l.f14883k.a(privacyEncodingMode, false);
                    }
                    c1957l.f14873a.b(X7.a.TCF_CMP_SDK_ID);
                    c1957l.f14873a.b(X7.a.TCF_CMP_SDK_VERSION);
                    c1957l.f14873a.b(X7.a.TCF_POLICY_VERSION);
                    c1957l.f14873a.b(X7.a.TCF_GDPR_APPLIES);
                    c1957l.f14873a.b(X7.a.TCF_PUBLISHER_CC);
                    c1957l.f14873a.b(X7.a.TCF_PURPOSE_ONE_TREATMENT);
                    c1957l.f14873a.b(X7.a.TCF_USE_NON_STANDARD_STACKS);
                    c1957l.f14873a.b(X7.a.TC_STRING);
                    c1957l.f14873a.b(X7.a.TCF_VENDOR_CONSENTS);
                    c1957l.f14873a.b(X7.a.TCF_VENDOR_LEGITIMATE_INTERESTS);
                    c1957l.f14873a.b(X7.a.TCF_PURPOSE_CONSENTS);
                    c1957l.f14873a.b(X7.a.TCF_PURPOSE_LEGITIMATE_INTERESTS);
                    c1957l.f14873a.b(X7.a.TCF_SPECIAL_FEATURES_OPT_INS);
                    c1957l.f14873a.b(X7.a.TCF_PUBLISHER_RESTRICTIONS);
                    c1957l.f14873a.b(X7.a.TCF_PUBLISHER_CONSENT);
                    c1957l.f14873a.b(X7.a.TCF_PUBLISHER_LEGITIMATE_INTERESTS);
                    c1957l.f14873a.b(X7.a.TCF_PUBLISHER_CUSTOM_PURPOSES_CONSENTS);
                    c1957l.f14873a.b(X7.a.TCF_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS);
                    return;
                }
            }
            String str13 = c1957l.f14875c.f4497b.f4444I;
            if (str13 != null) {
                PrivacyEncodingMode privacyEncodingMode2 = PrivacyEncodingMode.TCF;
                if (str13.equals(privacyEncodingMode2.getValue())) {
                    dVar9.g().b(A1.h.f114d);
                    c1957l.f14873a.b(X7.a.GPP_CMP_SDK_ID);
                    c1957l.f14873a.b(X7.a.GPP_CMP_SDK_VERSION);
                    c1957l.f14873a.b(X7.a.GPP_POLICY_VERSION);
                    c1957l.f14873a.b(X7.a.GPP_GDPR_APPLIES);
                    c1957l.f14873a.b(X7.a.GPP_PUBLISHER_CC);
                    c1957l.f14873a.b(X7.a.GPP_PURPOSE_ONE_TREATMENT);
                    c1957l.f14873a.b(X7.a.GPP_USE_NON_STANDARD_STACKS);
                    c1957l.f14873a.b(X7.a.GPP_STRING);
                    c1957l.f14873a.b(X7.a.GPP_VENDOR_CONSENTS);
                    c1957l.f14873a.b(X7.a.GPP_VENDOR_LEGITIMATE_INTERESTS);
                    c1957l.f14873a.b(X7.a.GPP_PURPOSE_CONSENTS);
                    c1957l.f14873a.b(X7.a.GPP_PURPOSE_LEGITIMATE_INTERESTS);
                    c1957l.f14873a.b(X7.a.GPP_SPECIAL_FEATURES_OPT_INS);
                    c1957l.f14873a.b(X7.a.GPP_PUBLISHER_RESTRICTIONS);
                    c1957l.f14873a.b(X7.a.GPP_PUBLISHER_CONSENT);
                    c1957l.f14873a.b(X7.a.GPP_PUBLISHER_LEGITIMATE_INTERESTS);
                    c1957l.f14873a.b(X7.a.GPP_PUBLISHER_CUSTOM_PURPOSES_CONSENTS);
                    c1957l.f14873a.b(X7.a.GPP_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS);
                    if (c1957l.f14873a.j(X7.a.TC_STRING).length() == 0) {
                        c1957l.f14883k.a(privacyEncodingMode2, false);
                        return;
                    }
                    return;
                }
            }
            if (!dVar9.g().i(A1.h.f114d)) {
                c1957l.f14883k.a(PrivacyEncodingMode.GPP, false);
            }
            if (c1957l.f14873a.j(X7.a.TC_STRING).length() == 0) {
                c1957l.f14883k.a(PrivacyEncodingMode.TCF, false);
            }
        }
    }

    public final void q() {
        this.f14873a.c(X7.a.GPP_CMP_SDK_ID, this.f14874b.f1426m);
        this.f14873a.c(X7.a.GPP_CMP_SDK_VERSION, this.f14874b.f1427n);
        this.f14873a.c(X7.a.GPP_POLICY_VERSION, this.f14874b.f());
        this.f14873a.c(X7.a.GPP_GDPR_APPLIES, b() ? 1 : 0);
        this.f14873a.e(X7.a.GPP_PUBLISHER_CC, this.f14875c.f4497b.f4460f);
        this.f14873a.c(X7.a.GPP_PURPOSE_ONE_TREATMENT, this.f14874b.f1420g ? 1 : 0);
        this.f14873a.c(X7.a.GPP_USE_NON_STANDARD_STACKS, this.f14874b.f1419f ? 1 : 0);
    }

    public final void r() {
        this.f14873a.c(X7.a.TCF_CMP_SDK_ID, this.f14874b.f1426m);
        this.f14873a.c(X7.a.TCF_CMP_SDK_VERSION, this.f14874b.f1427n);
        this.f14873a.c(X7.a.TCF_POLICY_VERSION, this.f14874b.f());
        this.f14873a.c(X7.a.TCF_GDPR_APPLIES, b() ? 1 : 0);
        this.f14873a.e(X7.a.TCF_PUBLISHER_CC, this.f14875c.f4497b.f4460f);
        this.f14873a.c(X7.a.TCF_PURPOSE_ONE_TREATMENT, this.f14874b.f1420g ? 1 : 0);
        this.f14873a.c(X7.a.TCF_USE_NON_STANDARD_STACKS, this.f14874b.f1419f ? 1 : 0);
    }

    public final boolean s() {
        boolean z8;
        if (this.f14873a.j(X7.a.TRANSLATIONS_TEXT).length() > 0 && this.f14873a.j(X7.a.PORTAL_CONFIG).length() > 0 && (!this.f14888p.f1376b.containsKey(String.valueOf(this.f14874b.f1426m)) || !n() || !AbstractC3292y.d(AbstractC3292y.q(this.f14873a.j(X7.a.NON_IAB_VENDOR_CONSENT_HASH), f()), this.f14873a.j(X7.a.OPTION_HASH)) || this.f14887o != h() || ((this.f14873a.j(X7.a.TC_STRING).length() == 0 && !Y7.d.f13152a.g().j(A1.h.f116f)) || j()))) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (m()) {
            this.f14873a.e(X7.a.GBC_PURPOSE_HASH, e());
        }
        return z8;
    }
}
