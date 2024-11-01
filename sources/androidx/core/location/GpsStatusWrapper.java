package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
class GpsStatusWrapper extends GnssStatusCompat {
    private static final int BEIDOU_PRN_COUNT = 35;
    private static final int BEIDOU_PRN_OFFSET = 200;
    private static final int GLONASS_PRN_COUNT = 24;
    private static final int GLONASS_PRN_OFFSET = 64;
    private static final int GPS_PRN_COUNT = 32;
    private static final int GPS_PRN_OFFSET = 0;
    private static final int QZSS_SVID_MAX = 200;
    private static final int QZSS_SVID_MIN = 193;
    private static final int SBAS_PRN_MAX = 64;
    private static final int SBAS_PRN_MIN = 33;
    private static final int SBAS_PRN_OFFSET = -87;

    @GuardedBy("mWrapped")
    private Iterator<GpsSatellite> mCachedIterator;

    @GuardedBy("mWrapped")
    private int mCachedIteratorPosition;

    @GuardedBy("mWrapped")
    private GpsSatellite mCachedSatellite;

    @GuardedBy("mWrapped")
    private int mCachedSatelliteCount;
    private final GpsStatus mWrapped;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GpsStatusWrapper(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) Preconditions.checkNotNull(gpsStatus);
        this.mWrapped = gpsStatus2;
        this.mCachedSatelliteCount = -1;
        this.mCachedIterator = gpsStatus2.getSatellites().iterator();
        this.mCachedIteratorPosition = -1;
        this.mCachedSatellite = null;
    }

    private static int getConstellationFromPrn(int i8) {
        if (i8 > 0 && i8 <= 32) {
            return 1;
        }
        if (i8 >= 33 && i8 <= 64) {
            return 2;
        }
        if (i8 > 64 && i8 <= 88) {
            return 3;
        }
        if (i8 <= 200 || i8 > 235) {
            return (i8 < QZSS_SVID_MIN || i8 > 200) ? 0 : 4;
        }
        return 5;
    }

    private GpsSatellite getSatellite(int i8) {
        GpsSatellite gpsSatellite;
        synchronized (this.mWrapped) {
            try {
                if (i8 < this.mCachedIteratorPosition) {
                    this.mCachedIterator = this.mWrapped.getSatellites().iterator();
                    this.mCachedIteratorPosition = -1;
                }
                while (true) {
                    int i9 = this.mCachedIteratorPosition;
                    if (i9 >= i8) {
                        break;
                    }
                    this.mCachedIteratorPosition = i9 + 1;
                    if (!this.mCachedIterator.hasNext()) {
                        this.mCachedSatellite = null;
                        break;
                    }
                    this.mCachedSatellite = this.mCachedIterator.next();
                }
                gpsSatellite = this.mCachedSatellite;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (GpsSatellite) Preconditions.checkNotNull(gpsSatellite);
    }

    private static int getSvidFromPrn(int i8) {
        int constellationFromPrn = getConstellationFromPrn(i8);
        if (constellationFromPrn != 2) {
            if (constellationFromPrn != 3) {
                if (constellationFromPrn == 5) {
                    return i8 - 200;
                }
                return i8;
            }
            return i8 - 64;
        }
        return i8 + 87;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsStatusWrapper)) {
            return false;
        }
        return this.mWrapped.equals(((GpsStatusWrapper) obj).mWrapped);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i8) {
        return getSatellite(i8).getAzimuth();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i8) {
        return getSatellite(i8).getSnr();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i8) {
        if (Build.VERSION.SDK_INT < 24) {
            return 1;
        }
        return getConstellationFromPrn(getSatellite(i8).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i8) {
        return getSatellite(i8).getElevation();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        int i8;
        synchronized (this.mWrapped) {
            try {
                if (this.mCachedSatelliteCount == -1) {
                    for (GpsSatellite gpsSatellite : this.mWrapped.getSatellites()) {
                        this.mCachedSatelliteCount++;
                    }
                    this.mCachedSatelliteCount++;
                }
                i8 = this.mCachedSatelliteCount;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i8;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i8) {
        if (Build.VERSION.SDK_INT < 24) {
            return getSatellite(i8).getPrn();
        }
        return getSvidFromPrn(getSatellite(i8).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i8) {
        return getSatellite(i8).hasAlmanac();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i8) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i8) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i8) {
        return getSatellite(i8).hasEphemeris();
    }

    public int hashCode() {
        return this.mWrapped.hashCode();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i8) {
        return getSatellite(i8).usedInFix();
    }
}
