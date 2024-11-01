package com.inmobi.cmp.core.cmpapi.map;

import D5.k;
import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

@Keep
/* loaded from: classes4.dex */
public final class PublisherMap {
    private Map<String, Boolean> consents;
    private final ConsentMap customPurpose;
    private Map<String, Boolean> legitimateInterests;
    private Map<String, Map<String, k>> restrictions;
    private int vendorId;

    public PublisherMap() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PublisherMap copy$default(PublisherMap publisherMap, int i8, Map map, Map map2, ConsentMap consentMap, Map map3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = publisherMap.vendorId;
        }
        if ((i9 & 2) != 0) {
            map = publisherMap.consents;
        }
        Map map4 = map;
        if ((i9 & 4) != 0) {
            map2 = publisherMap.legitimateInterests;
        }
        Map map5 = map2;
        if ((i9 & 8) != 0) {
            consentMap = publisherMap.customPurpose;
        }
        ConsentMap consentMap2 = consentMap;
        if ((i9 & 16) != 0) {
            map3 = publisherMap.restrictions;
        }
        return publisherMap.copy(i8, map4, map5, consentMap2, map3);
    }

    public final int component1() {
        return this.vendorId;
    }

    public final Map<String, Boolean> component2() {
        return this.consents;
    }

    public final Map<String, Boolean> component3() {
        return this.legitimateInterests;
    }

    public final ConsentMap component4() {
        return this.customPurpose;
    }

    public final Map<String, Map<String, k>> component5() {
        return this.restrictions;
    }

    public final PublisherMap copy(int i8, Map<String, Boolean> consents, Map<String, Boolean> legitimateInterests, ConsentMap customPurpose, Map<String, Map<String, k>> restrictions) {
        AbstractC3292y.i(consents, "consents");
        AbstractC3292y.i(legitimateInterests, "legitimateInterests");
        AbstractC3292y.i(customPurpose, "customPurpose");
        AbstractC3292y.i(restrictions, "restrictions");
        return new PublisherMap(i8, consents, legitimateInterests, customPurpose, restrictions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublisherMap)) {
            return false;
        }
        PublisherMap publisherMap = (PublisherMap) obj;
        return this.vendorId == publisherMap.vendorId && AbstractC3292y.d(this.consents, publisherMap.consents) && AbstractC3292y.d(this.legitimateInterests, publisherMap.legitimateInterests) && AbstractC3292y.d(this.customPurpose, publisherMap.customPurpose) && AbstractC3292y.d(this.restrictions, publisherMap.restrictions);
    }

    public final Map<String, Boolean> getConsents() {
        return this.consents;
    }

    public final ConsentMap getCustomPurpose() {
        return this.customPurpose;
    }

    public final Map<String, Boolean> getLegitimateInterests() {
        return this.legitimateInterests;
    }

    public final Map<String, Map<String, k>> getRestrictions() {
        return this.restrictions;
    }

    public final int getVendorId() {
        return this.vendorId;
    }

    public int hashCode() {
        return this.restrictions.hashCode() + ((this.customPurpose.hashCode() + ((this.legitimateInterests.hashCode() + ((this.consents.hashCode() + (this.vendorId * 31)) * 31)) * 31)) * 31);
    }

    public final void setConsents(Map<String, Boolean> map) {
        AbstractC3292y.i(map, "<set-?>");
        this.consents = map;
    }

    public final void setLegitimateInterests(Map<String, Boolean> map) {
        AbstractC3292y.i(map, "<set-?>");
        this.legitimateInterests = map;
    }

    public final void setRestrictions(Map<String, Map<String, k>> map) {
        AbstractC3292y.i(map, "<set-?>");
        this.restrictions = map;
    }

    public final void setVendorId(int i8) {
        this.vendorId = i8;
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("PublisherMap(vendorId=");
        a9.append(this.vendorId);
        a9.append(", consents=");
        a9.append(this.consents);
        a9.append(", legitimateInterests=");
        a9.append(this.legitimateInterests);
        a9.append(", customPurpose=");
        a9.append(this.customPurpose);
        a9.append(", restrictions=");
        a9.append(this.restrictions);
        a9.append(')');
        return a9.toString();
    }

    public PublisherMap(int i8, Map<String, Boolean> consents, Map<String, Boolean> legitimateInterests, ConsentMap customPurpose, Map<String, Map<String, k>> restrictions) {
        AbstractC3292y.i(consents, "consents");
        AbstractC3292y.i(legitimateInterests, "legitimateInterests");
        AbstractC3292y.i(customPurpose, "customPurpose");
        AbstractC3292y.i(restrictions, "restrictions");
        this.vendorId = i8;
        this.consents = consents;
        this.legitimateInterests = legitimateInterests;
        this.customPurpose = customPurpose;
        this.restrictions = restrictions;
    }

    public /* synthetic */ PublisherMap(int i8, Map map, Map map2, ConsentMap consentMap, Map map3, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 0 : i8, (i9 & 2) != 0 ? new LinkedHashMap() : map, (i9 & 4) != 0 ? new LinkedHashMap() : map2, (i9 & 8) != 0 ? new ConsentMap(null, null, 3, null) : consentMap, (i9 & 16) != 0 ? new LinkedHashMap() : map3);
    }
}
