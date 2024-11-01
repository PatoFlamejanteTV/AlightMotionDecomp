package com.inmobi.cmp.core.model.gbc;

import androidx.annotation.Keep;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

@Keep
/* loaded from: classes4.dex */
public final class GoogleBasicConsents {
    private final GBCConsentValue adPersonalization;
    private final GBCConsentValue adStorage;
    private final GBCConsentValue adUserData;
    private final GBCConsentValue analyticsStorage;

    public GoogleBasicConsents(GBCConsentValue adStorage, GBCConsentValue adUserData, GBCConsentValue adPersonalization, GBCConsentValue analyticsStorage) {
        AbstractC3292y.i(adStorage, "adStorage");
        AbstractC3292y.i(adUserData, "adUserData");
        AbstractC3292y.i(adPersonalization, "adPersonalization");
        AbstractC3292y.i(analyticsStorage, "analyticsStorage");
        this.adStorage = adStorage;
        this.adUserData = adUserData;
        this.adPersonalization = adPersonalization;
        this.analyticsStorage = analyticsStorage;
    }

    public static /* synthetic */ GoogleBasicConsents copy$default(GoogleBasicConsents googleBasicConsents, GBCConsentValue gBCConsentValue, GBCConsentValue gBCConsentValue2, GBCConsentValue gBCConsentValue3, GBCConsentValue gBCConsentValue4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gBCConsentValue = googleBasicConsents.adStorage;
        }
        if ((i8 & 2) != 0) {
            gBCConsentValue2 = googleBasicConsents.adUserData;
        }
        if ((i8 & 4) != 0) {
            gBCConsentValue3 = googleBasicConsents.adPersonalization;
        }
        if ((i8 & 8) != 0) {
            gBCConsentValue4 = googleBasicConsents.analyticsStorage;
        }
        return googleBasicConsents.copy(gBCConsentValue, gBCConsentValue2, gBCConsentValue3, gBCConsentValue4);
    }

    public final GBCConsentValue component1() {
        return this.adStorage;
    }

    public final GBCConsentValue component2() {
        return this.adUserData;
    }

    public final GBCConsentValue component3() {
        return this.adPersonalization;
    }

    public final GBCConsentValue component4() {
        return this.analyticsStorage;
    }

    public final GoogleBasicConsents copy(GBCConsentValue adStorage, GBCConsentValue adUserData, GBCConsentValue adPersonalization, GBCConsentValue analyticsStorage) {
        AbstractC3292y.i(adStorage, "adStorage");
        AbstractC3292y.i(adUserData, "adUserData");
        AbstractC3292y.i(adPersonalization, "adPersonalization");
        AbstractC3292y.i(analyticsStorage, "analyticsStorage");
        return new GoogleBasicConsents(adStorage, adUserData, adPersonalization, analyticsStorage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleBasicConsents)) {
            return false;
        }
        GoogleBasicConsents googleBasicConsents = (GoogleBasicConsents) obj;
        return this.adStorage == googleBasicConsents.adStorage && this.adUserData == googleBasicConsents.adUserData && this.adPersonalization == googleBasicConsents.adPersonalization && this.analyticsStorage == googleBasicConsents.analyticsStorage;
    }

    public final GBCConsentValue getAdPersonalization() {
        return this.adPersonalization;
    }

    public final GBCConsentValue getAdStorage() {
        return this.adStorage;
    }

    public final GBCConsentValue getAdUserData() {
        return this.adUserData;
    }

    public final GBCConsentValue getAnalyticsStorage() {
        return this.analyticsStorage;
    }

    public int hashCode() {
        return this.analyticsStorage.hashCode() + ((this.adPersonalization.hashCode() + ((this.adUserData.hashCode() + (this.adStorage.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("GoogleBasicConsents(adStorage=");
        a9.append(this.adStorage);
        a9.append(", adUserData=");
        a9.append(this.adUserData);
        a9.append(", adPersonalization=");
        a9.append(this.adPersonalization);
        a9.append(", analyticsStorage=");
        a9.append(this.analyticsStorage);
        a9.append(')');
        return a9.toString();
    }
}
