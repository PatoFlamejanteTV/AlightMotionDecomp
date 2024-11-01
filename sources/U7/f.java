package U7;

import R5.AbstractC1435t;
import android.os.Build;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.model.ACData;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.NonIABData;
import com.mbridge.msdk.MBridgeConstans;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3335a;

/* loaded from: classes5.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f10274a;

    /* renamed from: b, reason: collision with root package name */
    public final D5.s f10275b;

    /* renamed from: c, reason: collision with root package name */
    public final ChoiceCmpCallback f10276c;

    /* renamed from: d, reason: collision with root package name */
    public final F5.f f10277d;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10278a;

        static {
            int[] iArr = new int[PrivacyEncodingMode.values().length];
            iArr[PrivacyEncodingMode.GPP.ordinal()] = 1;
            iArr[PrivacyEncodingMode.TCF.ordinal()] = 2;
            f10278a = iArr;
        }
    }

    public f(SharedStorage sharedStorage, D5.s tcModel, ChoiceCmpCallback choiceCmpCallback) {
        AbstractC3292y.i(sharedStorage, "sharedStorage");
        AbstractC3292y.i(tcModel, "tcModel");
        this.f10274a = sharedStorage;
        this.f10275b = tcModel;
        this.f10276c = choiceCmpCallback;
        this.f10277d = new F5.f(Boolean.TRUE, 2, AbstractC1435t.s(D5.l.CORE));
    }

    @Override // U7.e
    public void a(PrivacyEncodingMode encodingMode, boolean z8) {
        ChoiceCmpCallback choiceCmpCallback;
        Object valueOf;
        boolean z9;
        AbstractC3292y.i(encodingMode, "encodingMode");
        D5.s sVar = this.f10275b;
        int i8 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of("UTC"));
            ZonedDateTime of = ZonedDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), 0, 0, 0, 0, ZoneOffset.UTC);
            sVar.f1417d = of;
            long epochMilli = of.toInstant().toEpochMilli();
            sVar.f1415b = epochMilli;
            sVar.f1416c = epochMilli;
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            sVar.f1415b = timeInMillis;
            sVar.f1416c = timeInMillis;
        }
        int i9 = a.f10278a[encodingMode.ordinal()];
        int i10 = 1;
        if (i9 != 1) {
            if (i9 != 2) {
                b();
                c();
            } else {
                c();
            }
        } else {
            b();
        }
        SharedStorage sharedStorage = this.f10274a;
        X7.a aVar = X7.a.NON_IAB_CONSENT_ENCODED;
        D5.s sVar2 = this.f10275b;
        long j8 = sVar2.f1415b;
        long j9 = sVar2.f1416c;
        int i11 = sVar2.f1426m;
        int i12 = sVar2.f1427n;
        int maxId = sVar2.f1407A.getMaxId();
        Set<Integer> vendorConsents = sVar2.f1407A.getAcceptedItems();
        AbstractC3292y.i(vendorConsents, "vendorConsents");
        StringBuilder sb = new StringBuilder();
        String l8 = Long.toString(j8, AbstractC3335a.a(2));
        AbstractC3292y.h(l8, "toString(this, checkRadix(radix))");
        sb.append(l8);
        String l9 = Long.toString(j9, AbstractC3335a.a(2));
        AbstractC3292y.h(l9, "toString(this, checkRadix(radix))");
        sb.append(l9);
        String num = Integer.toString(i11, AbstractC3335a.a(2));
        AbstractC3292y.h(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        String num2 = Integer.toString(i12, AbstractC3335a.a(2));
        AbstractC3292y.h(num2, "toString(this, checkRadix(radix))");
        sb.append(num2);
        String num3 = Integer.toString(maxId, AbstractC3335a.a(2));
        AbstractC3292y.h(num3, "toString(this, checkRadix(radix))");
        sb.append(num3);
        String str = "";
        if (!vendorConsents.isEmpty()) {
            Iterator<T> it = vendorConsents.iterator();
            while (it.hasNext()) {
                String num4 = Integer.toString(((Number) it.next()).intValue(), AbstractC3335a.a(2));
                AbstractC3292y.h(num4, "toString(this, checkRadix(radix))");
                while (true) {
                    int length = num4.length();
                    String num5 = Integer.toString(maxId, AbstractC3335a.a(2));
                    AbstractC3292y.h(num5, "toString(this, checkRadix(radix))");
                    if (length < num5.length()) {
                        num4 = AbstractC3292y.q(MBridgeConstans.ENDCARD_URL_TYPE_PL, num4);
                    }
                }
                str = AbstractC3292y.q(str, num4);
            }
        }
        sb.append(str);
        sharedStorage.e(aVar, F5.a.f2690a.b(sb.toString()));
        if (z8) {
            ChoiceCmpCallback choiceCmpCallback2 = this.f10276c;
            if (choiceCmpCallback2 != null) {
                GDPRData gDPRData = new GDPRData(null, i10, 0 == true ? 1 : 0);
                gDPRData.setCmpStatus(CmpStatus.LOADED);
                choiceCmpCallback2.onIABVendorConsentGiven(gDPRData);
            }
            ChoiceCmpCallback choiceCmpCallback3 = this.f10276c;
            if (choiceCmpCallback3 != null) {
                if (this.f10274a.i(X7.a.TCF_GDPR_APPLIES) == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                choiceCmpCallback3.onNonIABVendorConsentGiven(new NonIABData(z9, false, false, this.f10274a.j(X7.a.NON_IAB_CONSENT_ENCODED), this.f10275b.f1407A.getMap()));
            }
            if (this.f10274a.h(X7.a.GOOGLE_ENABLED) && (choiceCmpCallback = this.f10276c) != null) {
                Set<Integer> vendorsID = this.f10275b.f1408B.getAcceptedItems();
                AbstractC3292y.i(vendorsID, "vendorsID");
                String str2 = "1~";
                for (Object obj : vendorsID) {
                    int i13 = i8 + 1;
                    if (i8 < 0) {
                        AbstractC1435t.w();
                    }
                    int intValue = ((Number) obj).intValue();
                    if (i8 != 0) {
                        valueOf = AbstractC3292y.q(".", Integer.valueOf(intValue));
                    } else {
                        valueOf = Integer.valueOf(intValue);
                    }
                    str2 = AbstractC3292y.q(str2, valueOf);
                    i8 = i13;
                }
                choiceCmpCallback.onGoogleVendorConsentGiven(new ACData(str2));
            }
        }
    }

    public final void b() {
        Object valueOf;
        D5.s sVar = this.f10275b;
        SharedStorage sharedStorage = this.f10274a;
        String gppString = D5.d.f1370a.a(sVar);
        F5.b bVar = F5.b.f2692a;
        String nonIabVendorConsents = bVar.a(sVar.f1407A);
        String nonIabVendorConsentsEncoded = R7.b.b(sVar.f1407A.toString());
        String nonIabVendorLegitimateInterests = bVar.a(sVar.f1410D);
        Set<Integer> vendorsID = sVar.f1408B.getAcceptedItems();
        AbstractC3292y.i(vendorsID, "vendorsID");
        String googleVendorConsents = "1~";
        int i8 = 0;
        for (Object obj : vendorsID) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1435t.w();
            }
            int intValue = ((Number) obj).intValue();
            if (i8 != 0) {
                valueOf = AbstractC3292y.q(".", Integer.valueOf(intValue));
            } else {
                valueOf = Integer.valueOf(intValue);
            }
            googleVendorConsents = AbstractC3292y.q(googleVendorConsents, valueOf);
            i8 = i9;
        }
        String iabVendorConsents = bVar.a(sVar.f1439z);
        String vendorLegitimateInterests = bVar.a(sVar.f1409C);
        String purposeConsents = bVar.a(sVar.f1431r);
        String purposeLegitimateInterests = bVar.a(sVar.f1432s);
        String specialFeatureOptions = bVar.a(sVar.f1430q);
        String publisherRestrictions = sVar.f1413G.f1386c.toString();
        String publisherConsents = bVar.a(sVar.f1435v);
        String publisherLegitimateInterests = bVar.a(sVar.f1436w);
        String publisherCustomConsents = bVar.a(sVar.f1437x);
        String publisherCustomLegitimateInterests = bVar.a(sVar.f1438y);
        sharedStorage.getClass();
        AbstractC3292y.i(gppString, "gppString");
        AbstractC3292y.i(nonIabVendorConsents, "nonIabVendorConsents");
        AbstractC3292y.i(nonIabVendorConsentsEncoded, "nonIabVendorConsentsEncoded");
        AbstractC3292y.i(nonIabVendorLegitimateInterests, "nonIabVendorLegitimateInterests");
        AbstractC3292y.i(googleVendorConsents, "googleVendorConsents");
        AbstractC3292y.i(iabVendorConsents, "iabVendorConsents");
        AbstractC3292y.i(vendorLegitimateInterests, "vendorLegitimateInterests");
        AbstractC3292y.i(purposeConsents, "purposeConsents");
        AbstractC3292y.i(purposeLegitimateInterests, "purposeLegitimateInterests");
        AbstractC3292y.i(specialFeatureOptions, "specialFeatureOptions");
        AbstractC3292y.i(publisherRestrictions, "publisherRestrictions");
        AbstractC3292y.i(publisherConsents, "publisherConsents");
        AbstractC3292y.i(publisherLegitimateInterests, "publisherLegitimateInterests");
        AbstractC3292y.i(publisherCustomConsents, "publisherCustomConsents");
        AbstractC3292y.i(publisherCustomLegitimateInterests, "publisherCustomLegitimateInterests");
        sharedStorage.e(X7.a.NON_IAB_VENDOR_CONSENTS, nonIabVendorConsents);
        X7.a aVar = X7.a.NON_IAB_VENDOR_CONSENT_HASH;
        sharedStorage.e(aVar, R7.b.b(nonIabVendorConsentsEncoded));
        sharedStorage.e(X7.a.NON_IAB_VENDOR_LEG_INTERESTS, nonIabVendorLegitimateInterests);
        sharedStorage.e(X7.a.OPTION_HASH, AbstractC3292y.q(sharedStorage.j(aVar), sharedStorage.j(X7.a.PORTAL_CONFIG_HASH)));
        sharedStorage.e(X7.a.ADDTL_CONSENT, googleVendorConsents);
        sharedStorage.e(X7.a.GPP_STRING, gppString);
        sharedStorage.e(X7.a.GPP_VENDOR_CONSENTS, iabVendorConsents);
        sharedStorage.e(X7.a.GPP_VENDOR_LEGITIMATE_INTERESTS, vendorLegitimateInterests);
        sharedStorage.e(X7.a.GPP_PURPOSE_CONSENTS, purposeConsents);
        sharedStorage.e(X7.a.GPP_PURPOSE_LEGITIMATE_INTERESTS, purposeLegitimateInterests);
        sharedStorage.e(X7.a.GPP_SPECIAL_FEATURES_OPT_INS, specialFeatureOptions);
        sharedStorage.e(X7.a.GPP_PUBLISHER_RESTRICTIONS, publisherRestrictions);
        sharedStorage.e(X7.a.GPP_PUBLISHER_CONSENT, publisherConsents);
        sharedStorage.e(X7.a.GPP_PUBLISHER_LEGITIMATE_INTERESTS, publisherLegitimateInterests);
        sharedStorage.e(X7.a.GPP_PUBLISHER_CUSTOM_PURPOSES_CONSENTS, publisherCustomConsents);
        sharedStorage.e(X7.a.GPP_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS, publisherCustomLegitimateInterests);
    }

    public final void c() {
        Object valueOf;
        D5.s sVar = this.f10275b;
        SharedStorage sharedStorage = this.f10274a;
        String tcString = D5.v.f1443a.a(sVar, this.f10277d);
        F5.b bVar = F5.b.f2692a;
        String nonIabVendorConsents = bVar.a(sVar.f1407A);
        String nonIabVendorConsentsEncoded = R7.b.b(sVar.f1407A.toString());
        String nonIabVendorLegitimateInterests = bVar.a(sVar.f1410D);
        Set<Integer> vendorsID = sVar.f1408B.getAcceptedItems();
        AbstractC3292y.i(vendorsID, "vendorsID");
        String googleVendorConsents = "1~";
        int i8 = 0;
        for (Object obj : vendorsID) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1435t.w();
            }
            int intValue = ((Number) obj).intValue();
            if (i8 != 0) {
                valueOf = AbstractC3292y.q(".", Integer.valueOf(intValue));
            } else {
                valueOf = Integer.valueOf(intValue);
            }
            googleVendorConsents = AbstractC3292y.q(googleVendorConsents, valueOf);
            i8 = i9;
        }
        String iabVendorConsents = bVar.a(sVar.f1439z);
        String vendorLegitimateInterests = bVar.a(sVar.f1409C);
        String purposeConsents = bVar.a(sVar.f1431r);
        String purposeLegitimateInterests = bVar.a(sVar.f1432s);
        String specialFeatureOptions = bVar.a(sVar.f1430q);
        String publisherRestrictions = sVar.f1413G.f1386c.toString();
        String publisherConsents = bVar.a(sVar.f1435v);
        String publisherLegitimateInterests = bVar.a(sVar.f1436w);
        String publisherCustomConsents = bVar.a(sVar.f1437x);
        String publisherCustomLegitimateInterests = bVar.a(sVar.f1438y);
        sharedStorage.getClass();
        AbstractC3292y.i(tcString, "tcString");
        AbstractC3292y.i(nonIabVendorConsents, "nonIabVendorConsents");
        AbstractC3292y.i(nonIabVendorConsentsEncoded, "nonIabVendorConsentsEncoded");
        AbstractC3292y.i(nonIabVendorLegitimateInterests, "nonIabVendorLegitimateInterests");
        AbstractC3292y.i(googleVendorConsents, "googleVendorConsents");
        AbstractC3292y.i(iabVendorConsents, "iabVendorConsents");
        AbstractC3292y.i(vendorLegitimateInterests, "vendorLegitimateInterests");
        AbstractC3292y.i(purposeConsents, "purposeConsents");
        AbstractC3292y.i(purposeLegitimateInterests, "purposeLegitimateInterests");
        AbstractC3292y.i(specialFeatureOptions, "specialFeatureOptions");
        AbstractC3292y.i(publisherRestrictions, "publisherRestrictions");
        AbstractC3292y.i(publisherConsents, "publisherConsents");
        AbstractC3292y.i(publisherLegitimateInterests, "publisherLegitimateInterests");
        AbstractC3292y.i(publisherCustomConsents, "publisherCustomConsents");
        AbstractC3292y.i(publisherCustomLegitimateInterests, "publisherCustomLegitimateInterests");
        sharedStorage.e(X7.a.TC_STRING, tcString);
        sharedStorage.e(X7.a.NON_IAB_VENDOR_CONSENTS, nonIabVendorConsents);
        X7.a aVar = X7.a.NON_IAB_VENDOR_CONSENT_HASH;
        sharedStorage.e(aVar, R7.b.b(nonIabVendorConsentsEncoded));
        sharedStorage.e(X7.a.NON_IAB_VENDOR_LEG_INTERESTS, nonIabVendorLegitimateInterests);
        sharedStorage.e(X7.a.OPTION_HASH, AbstractC3292y.q(sharedStorage.j(aVar), sharedStorage.j(X7.a.PORTAL_CONFIG_HASH)));
        sharedStorage.e(X7.a.ADDTL_CONSENT, googleVendorConsents);
        sharedStorage.e(X7.a.TCF_VENDOR_CONSENTS, iabVendorConsents);
        sharedStorage.e(X7.a.TCF_VENDOR_LEGITIMATE_INTERESTS, vendorLegitimateInterests);
        sharedStorage.e(X7.a.TCF_PURPOSE_CONSENTS, purposeConsents);
        sharedStorage.e(X7.a.TCF_PURPOSE_LEGITIMATE_INTERESTS, purposeLegitimateInterests);
        sharedStorage.e(X7.a.TCF_SPECIAL_FEATURES_OPT_INS, specialFeatureOptions);
        sharedStorage.e(X7.a.TCF_PUBLISHER_RESTRICTIONS, publisherRestrictions);
        sharedStorage.e(X7.a.TCF_PUBLISHER_CONSENT, publisherConsents);
        sharedStorage.e(X7.a.TCF_PUBLISHER_LEGITIMATE_INTERESTS, publisherLegitimateInterests);
        sharedStorage.e(X7.a.TCF_PUBLISHER_CUSTOM_PURPOSES_CONSENTS, publisherCustomConsents);
        sharedStorage.e(X7.a.TCF_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS, publisherCustomLegitimateInterests);
    }
}
