package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
class GnssStatusWrapper extends GnssStatusCompat {
    private final GnssStatus mWrapped;

    @RequiresApi(26)
    /* loaded from: classes3.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static float getCarrierFrequencyHz(GnssStatus gnssStatus, int i8) {
            return gnssStatus.getCarrierFrequencyHz(i8);
        }

        @DoNotInline
        static boolean hasCarrierFrequencyHz(GnssStatus gnssStatus, int i8) {
            return gnssStatus.hasCarrierFrequencyHz(i8);
        }
    }

    @RequiresApi(30)
    /* loaded from: classes3.dex */
    static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        static float getBasebandCn0DbHz(GnssStatus gnssStatus, int i8) {
            return gnssStatus.getBasebandCn0DbHz(i8);
        }

        @DoNotInline
        static boolean hasBasebandCn0DbHz(GnssStatus gnssStatus, int i8) {
            return gnssStatus.hasBasebandCn0DbHz(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GnssStatusWrapper(Object obj) {
        this.mWrapped = AbstractC1857d.a(Preconditions.checkNotNull(AbstractC1857d.a(obj)));
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj instanceof GnssStatusWrapper) {
            equals = this.mWrapped.equals(((GnssStatusWrapper) obj).mWrapped);
            return equals;
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i8) {
        float azimuthDegrees;
        azimuthDegrees = this.mWrapped.getAzimuthDegrees(i8);
        return azimuthDegrees;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i8) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getBasebandCn0DbHz(this.mWrapped, i8);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i8) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getCarrierFrequencyHz(this.mWrapped, i8);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i8) {
        float cn0DbHz;
        cn0DbHz = this.mWrapped.getCn0DbHz(i8);
        return cn0DbHz;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i8) {
        int constellationType;
        constellationType = this.mWrapped.getConstellationType(i8);
        return constellationType;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i8) {
        float elevationDegrees;
        elevationDegrees = this.mWrapped.getElevationDegrees(i8);
        return elevationDegrees;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        int satelliteCount;
        satelliteCount = this.mWrapped.getSatelliteCount();
        return satelliteCount;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i8) {
        int svid;
        svid = this.mWrapped.getSvid(i8);
        return svid;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i8) {
        boolean hasAlmanacData;
        hasAlmanacData = this.mWrapped.hasAlmanacData(i8);
        return hasAlmanacData;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i8) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.hasBasebandCn0DbHz(this.mWrapped, i8);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i8) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasCarrierFrequencyHz(this.mWrapped, i8);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i8) {
        boolean hasEphemerisData;
        hasEphemerisData = this.mWrapped.hasEphemerisData(i8);
        return hasEphemerisData;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.mWrapped.hashCode();
        return hashCode;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i8) {
        boolean usedInFix;
        usedInFix = this.mWrapped.usedInFix(i8);
        return usedInFix;
    }
}
