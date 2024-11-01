package com.inmobi.cmp.core.model;

import D5.i;
import D5.j;
import D5.k;
import D5.l;
import D5.s;
import D5.v;
import F5.f;
import R5.AbstractC1435t;
import Y7.d;
import androidx.annotation.Keep;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.core.cmpapi.map.ConsentMap;
import com.inmobi.cmp.core.cmpapi.map.OutOfBandMap;
import com.inmobi.cmp.core.cmpapi.map.PublisherMap;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.EventStatus;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import p.C3550a;

@Keep
/* loaded from: classes4.dex */
public final class GDPRData {
    private Integer cmpId;
    private CmpStatus cmpStatus;
    private Integer cmpVersion;
    private EventStatus eventStatus;
    private Boolean gdprApplies;
    private String gppString;
    private boolean isServiceSpecific;
    private final OutOfBandMap outOfBand;
    private PrivacyEncodingMode privacyEncodingMode;
    private final PublisherMap publisher;
    private String publisherCC;
    private final ConsentMap purpose;
    private boolean purposeOneTreatment;
    private Map<String, Boolean> specialFeaturesOptions;
    private String tcString;
    private final int tcfPolicyVersion;
    private boolean useNonStandardStacks;
    private final ConsentMap vendor;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19077a;

        static {
            int[] iArr = new int[PrivacyEncodingMode.values().length];
            iArr[PrivacyEncodingMode.TCF.ordinal()] = 1;
            iArr[PrivacyEncodingMode.GPP.ordinal()] = 2;
            f19077a = iArr;
        }
    }

    public GDPRData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Map<String, Map<String, k>> createRestrictions(j jVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jVar.a() > 0) {
            int a9 = jVar.a();
            int i8 = 1;
            if (1 <= a9) {
                while (true) {
                    int i9 = i8 + 1;
                    for (i iVar : jVar.b(Integer.valueOf(i8))) {
                        if (!linkedHashMap.containsKey(String.valueOf(iVar.f1382a))) {
                            linkedHashMap.put(String.valueOf(iVar.f1382a), new LinkedHashMap());
                        }
                        Map map = (Map) linkedHashMap.get(String.valueOf(iVar.f1382a));
                        if (map != null) {
                        }
                    }
                    if (i8 == a9) {
                        break;
                    }
                    i8 = i9;
                }
            }
        }
        return linkedHashMap;
    }

    private final int getPublisherVendorId() {
        Vector vector;
        s sVar = C3550a.f36074c;
        if (sVar == null || (vector = sVar.f1433t) == null || vector.isEmpty()) {
            return -1;
        }
        return ((Number) AbstractC1435t.l0(vector.getKeys())).intValue();
    }

    public final Integer getCmpId() {
        return this.cmpId;
    }

    public final CmpStatus getCmpStatus() {
        return this.cmpStatus;
    }

    public final Integer getCmpVersion() {
        return this.cmpVersion;
    }

    public final EventStatus getEventStatus() {
        return this.eventStatus;
    }

    public final Boolean getGdprApplies() {
        return this.gdprApplies;
    }

    public final String getGppString() {
        return this.gppString;
    }

    public final OutOfBandMap getOutOfBand() {
        return this.outOfBand;
    }

    public final PrivacyEncodingMode getPrivacyEncodingMode() {
        return this.privacyEncodingMode;
    }

    public final PublisherMap getPublisher() {
        return this.publisher;
    }

    public final String getPublisherCC() {
        return this.publisherCC;
    }

    public final ConsentMap getPurpose() {
        return this.purpose;
    }

    public final boolean getPurposeOneTreatment() {
        return this.purposeOneTreatment;
    }

    public final Map<String, Boolean> getSpecialFeaturesOptions() {
        return this.specialFeaturesOptions;
    }

    public final String getTcString() {
        return this.tcString;
    }

    public final int getTcfPolicyVersion() {
        return this.tcfPolicyVersion;
    }

    public final boolean getUseNonStandardStacks() {
        return this.useNonStandardStacks;
    }

    public final ConsentMap getVendor() {
        return this.vendor;
    }

    public final boolean isServiceSpecific() {
        return this.isServiceSpecific;
    }

    public final void setCmpId(Integer num) {
        this.cmpId = num;
    }

    public final void setCmpStatus(CmpStatus cmpStatus) {
        AbstractC3292y.i(cmpStatus, "<set-?>");
        this.cmpStatus = cmpStatus;
    }

    public final void setCmpVersion(Integer num) {
        this.cmpVersion = num;
    }

    public final void setEventStatus(EventStatus eventStatus) {
        this.eventStatus = eventStatus;
    }

    public final void setGdprApplies(Boolean bool) {
        this.gdprApplies = bool;
    }

    public final void setGppString(String str) {
        this.gppString = str;
    }

    public final void setPrivacyEncodingMode(PrivacyEncodingMode privacyEncodingMode) {
        this.privacyEncodingMode = privacyEncodingMode;
    }

    public final void setPublisherCC(String str) {
        this.publisherCC = str;
    }

    public final void setPurposeOneTreatment(boolean z8) {
        this.purposeOneTreatment = z8;
    }

    public final void setServiceSpecific(boolean z8) {
        this.isServiceSpecific = z8;
    }

    public final void setSpecialFeaturesOptions(Map<String, Boolean> map) {
        AbstractC3292y.i(map, "<set-?>");
        this.specialFeaturesOptions = map;
    }

    public final void setTcString(String str) {
        this.tcString = str;
    }

    public final void setUseNonStandardStacks(boolean z8) {
        this.useNonStandardStacks = z8;
    }

    public GDPRData(Set<Integer> set) {
        this.tcfPolicyVersion = 2;
        C3550a c3550a = C3550a.f36072a;
        this.eventStatus = null;
        this.cmpStatus = c3550a.a();
        this.purpose = new ConsentMap(null, null, 3, null);
        this.vendor = new ConsentMap(null, null, 3, null);
        this.specialFeaturesOptions = new LinkedHashMap();
        this.publisher = new PublisherMap(0, null, null, null, null, 31, null);
        this.outOfBand = new OutOfBandMap(null, null, 3, null);
        c3550a.b(ChoiceCmp.INSTANCE.getTcModel$app_release());
        s f8 = c3550a.f();
        if (f8 == null) {
            return;
        }
        H6.j jVar = H6.j.f3307a;
        d dVar = d.f13152a;
        setPrivacyEncodingMode(jVar.a(dVar.j().a().a()));
        PrivacyEncodingMode privacyEncodingMode = getPrivacyEncodingMode();
        int i8 = privacyEncodingMode == null ? -1 : a.f19077a[privacyEncodingMode.ordinal()];
        if (i8 == 1) {
            c3550a.e(v.f1443a.a(f8, new f(Boolean.TRUE, 2, AbstractC1435t.s(l.CORE))));
            setTcString(c3550a.g());
        } else if (i8 != 2) {
            c3550a.e(v.f1443a.a(f8, new f(Boolean.TRUE, 2, AbstractC1435t.s(l.CORE))));
            setTcString(c3550a.g());
            c3550a.c(D5.d.f1370a.a(f8));
            setGppString(c3550a.d());
        } else {
            c3550a.c(D5.d.f1370a.a(f8));
            setGppString(c3550a.d());
        }
        setServiceSpecific(f8.w());
        setUseNonStandardStacks(f8.r());
        setPurposeOneTreatment(f8.p());
        setPublisherCC(f8.i());
        setCmpId(Integer.valueOf(f8.a()));
        setCmpVersion(Integer.valueOf(f8.d()));
        setGdprApplies(Boolean.valueOf(dVar.m().i(X7.a.TCF_GDPR_APPLIES) == 1));
        OutOfBandMap outOfBand = getOutOfBand();
        outOfBand.setAllowedVendors(jVar.c(f8.u(), set));
        outOfBand.setDisclosedVendors(jVar.c(f8.v(), set));
        ConsentMap purpose = getPurpose();
        purpose.setConsents(jVar.b(f8.n()));
        purpose.setLegitimateInterests(jVar.b(f8.o()));
        ConsentMap vendor = getVendor();
        vendor.setConsents(jVar.b(f8.s()));
        vendor.setLegitimateInterests(jVar.b(f8.t()));
        setSpecialFeaturesOptions(jVar.b(f8.q()));
        PublisherMap publisher = getPublisher();
        publisher.setVendorId(getPublisherVendorId());
        publisher.setConsents(jVar.b(f8.h()));
        publisher.setLegitimateInterests(jVar.b(f8.l()));
        ConsentMap customPurpose = publisher.getCustomPurpose();
        customPurpose.setConsents(jVar.b(f8.j()));
        customPurpose.setLegitimateInterests(jVar.b(f8.k()));
        publisher.setRestrictions(createRestrictions(f8.m()));
    }

    public /* synthetic */ GDPRData(Set set, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : set);
    }
}
