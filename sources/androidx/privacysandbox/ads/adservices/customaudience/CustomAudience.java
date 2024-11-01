package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdData;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import j$.time.Instant;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class CustomAudience {
    private final Instant activationTime;
    private final List<AdData> ads;
    private final Uri biddingLogicUri;
    private final AdTechIdentifier buyer;
    private final Uri dailyUpdateUri;
    private final Instant expirationTime;
    private final String name;
    private final TrustedBiddingData trustedBiddingSignals;
    private final AdSelectionSignals userBiddingSignals;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private Instant activationTime;
        private List<AdData> ads;
        private Uri biddingLogicUri;
        private AdTechIdentifier buyer;
        private Uri dailyUpdateUri;
        private Instant expirationTime;
        private String name;
        private TrustedBiddingData trustedBiddingData;
        private AdSelectionSignals userBiddingSignals;

        public Builder(AdTechIdentifier buyer, String name, Uri dailyUpdateUri, Uri biddingLogicUri, List<AdData> ads) {
            AbstractC3292y.i(buyer, "buyer");
            AbstractC3292y.i(name, "name");
            AbstractC3292y.i(dailyUpdateUri, "dailyUpdateUri");
            AbstractC3292y.i(biddingLogicUri, "biddingLogicUri");
            AbstractC3292y.i(ads, "ads");
            this.buyer = buyer;
            this.name = name;
            this.dailyUpdateUri = dailyUpdateUri;
            this.biddingLogicUri = biddingLogicUri;
            this.ads = ads;
        }

        public final CustomAudience build() {
            return new CustomAudience(this.buyer, this.name, this.dailyUpdateUri, this.biddingLogicUri, this.ads, this.activationTime, this.expirationTime, this.userBiddingSignals, this.trustedBiddingData);
        }

        public final Builder setActivationTime(Instant activationTime) {
            AbstractC3292y.i(activationTime, "activationTime");
            this.activationTime = activationTime;
            return this;
        }

        public final Builder setAds(List<AdData> ads) {
            AbstractC3292y.i(ads, "ads");
            this.ads = ads;
            return this;
        }

        public final Builder setBiddingLogicUri(Uri biddingLogicUri) {
            AbstractC3292y.i(biddingLogicUri, "biddingLogicUri");
            this.biddingLogicUri = biddingLogicUri;
            return this;
        }

        public final Builder setBuyer(AdTechIdentifier buyer) {
            AbstractC3292y.i(buyer, "buyer");
            this.buyer = buyer;
            return this;
        }

        public final Builder setDailyUpdateUri(Uri dailyUpdateUri) {
            AbstractC3292y.i(dailyUpdateUri, "dailyUpdateUri");
            this.dailyUpdateUri = dailyUpdateUri;
            return this;
        }

        public final Builder setExpirationTime(Instant expirationTime) {
            AbstractC3292y.i(expirationTime, "expirationTime");
            this.expirationTime = expirationTime;
            return this;
        }

        public final Builder setName(String name) {
            AbstractC3292y.i(name, "name");
            this.name = name;
            return this;
        }

        public final Builder setTrustedBiddingData(TrustedBiddingData trustedBiddingSignals) {
            AbstractC3292y.i(trustedBiddingSignals, "trustedBiddingSignals");
            this.trustedBiddingData = trustedBiddingSignals;
            return this;
        }

        public final Builder setUserBiddingSignals(AdSelectionSignals userBiddingSignals) {
            AbstractC3292y.i(userBiddingSignals, "userBiddingSignals");
            this.userBiddingSignals = userBiddingSignals;
            return this;
        }
    }

    public CustomAudience(AdTechIdentifier buyer, String name, Uri dailyUpdateUri, Uri biddingLogicUri, List<AdData> ads, Instant instant, Instant instant2, AdSelectionSignals adSelectionSignals, TrustedBiddingData trustedBiddingData) {
        AbstractC3292y.i(buyer, "buyer");
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(dailyUpdateUri, "dailyUpdateUri");
        AbstractC3292y.i(biddingLogicUri, "biddingLogicUri");
        AbstractC3292y.i(ads, "ads");
        this.buyer = buyer;
        this.name = name;
        this.dailyUpdateUri = dailyUpdateUri;
        this.biddingLogicUri = biddingLogicUri;
        this.ads = ads;
        this.activationTime = instant;
        this.expirationTime = instant2;
        this.userBiddingSignals = adSelectionSignals;
        this.trustedBiddingSignals = trustedBiddingData;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAudience)) {
            return false;
        }
        CustomAudience customAudience = (CustomAudience) obj;
        if (AbstractC3292y.d(this.buyer, customAudience.buyer) && AbstractC3292y.d(this.name, customAudience.name) && AbstractC3292y.d(this.activationTime, customAudience.activationTime) && AbstractC3292y.d(this.expirationTime, customAudience.expirationTime) && AbstractC3292y.d(this.dailyUpdateUri, customAudience.dailyUpdateUri) && AbstractC3292y.d(this.userBiddingSignals, customAudience.userBiddingSignals) && AbstractC3292y.d(this.trustedBiddingSignals, customAudience.trustedBiddingSignals) && AbstractC3292y.d(this.ads, customAudience.ads)) {
            return true;
        }
        return false;
    }

    public final Instant getActivationTime() {
        return this.activationTime;
    }

    public final List<AdData> getAds() {
        return this.ads;
    }

    public final Uri getBiddingLogicUri() {
        return this.biddingLogicUri;
    }

    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    public final Uri getDailyUpdateUri() {
        return this.dailyUpdateUri;
    }

    public final Instant getExpirationTime() {
        return this.expirationTime;
    }

    public final String getName() {
        return this.name;
    }

    public final TrustedBiddingData getTrustedBiddingSignals() {
        return this.trustedBiddingSignals;
    }

    public final AdSelectionSignals getUserBiddingSignals() {
        return this.userBiddingSignals;
    }

    public int hashCode() {
        int i8;
        int i9;
        int i10;
        int hashCode = ((this.buyer.hashCode() * 31) + this.name.hashCode()) * 31;
        Instant instant = this.activationTime;
        int i11 = 0;
        if (instant != null) {
            i8 = instant.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (hashCode + i8) * 31;
        Instant instant2 = this.expirationTime;
        if (instant2 != null) {
            i9 = instant2.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode2 = (((i12 + i9) * 31) + this.dailyUpdateUri.hashCode()) * 31;
        AdSelectionSignals adSelectionSignals = this.userBiddingSignals;
        if (adSelectionSignals != null) {
            i10 = adSelectionSignals.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode2 + i10) * 31;
        TrustedBiddingData trustedBiddingData = this.trustedBiddingSignals;
        if (trustedBiddingData != null) {
            i11 = trustedBiddingData.hashCode();
        }
        return ((((i13 + i11) * 31) + this.biddingLogicUri.hashCode()) * 31) + this.ads.hashCode();
    }

    public String toString() {
        return "CustomAudience: buyer=" + this.biddingLogicUri + ", activationTime=" + this.activationTime + ", expirationTime=" + this.expirationTime + ", dailyUpdateUri=" + this.dailyUpdateUri + ", userBiddingSignals=" + this.userBiddingSignals + ", trustedBiddingSignals=" + this.trustedBiddingSignals + ", biddingLogicUri=" + this.biddingLogicUri + ", ads=" + this.ads;
    }

    public /* synthetic */ CustomAudience(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, AdSelectionSignals adSelectionSignals, TrustedBiddingData trustedBiddingData, int i8, AbstractC3284p abstractC3284p) {
        this(adTechIdentifier, str, uri, uri2, list, (i8 & 32) != 0 ? null : instant, (i8 & 64) != 0 ? null : instant2, (i8 & 128) != 0 ? null : adSelectionSignals, (i8 & 256) != 0 ? null : trustedBiddingData);
    }
}
