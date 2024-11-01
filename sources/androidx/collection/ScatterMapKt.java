package androidx.collection;

import Q5.r;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;
    public static final long[] EmptyGroup = {-9187201950435737345L, -1};
    private static final MutableScatterMap EmptyScatterMap = new MutableScatterMap(0);
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    public static final <K, V> ScatterMap<K, V> emptyScatterMap() {
        MutableScatterMap mutableScatterMap = EmptyScatterMap;
        AbstractC3292y.g(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final int get(long j8) {
        return Long.numberOfTrailingZeros(j8) >> 3;
    }

    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    public static /* synthetic */ void getSentinel$annotations() {
    }

    public static final long group(long[] metadata, int i8) {
        AbstractC3292y.i(metadata, "metadata");
        int i9 = i8 >> 3;
        int i10 = (i8 & 7) << 3;
        return (((-i10) >> 63) & (metadata[i9 + 1] << (64 - i10))) | (metadata[i9] >>> i10);
    }

    public static final int h1(int i8) {
        return i8 >>> 7;
    }

    public static final int h2(int i8) {
        return i8 & ModuleDescriptor.MODULE_VERSION;
    }

    public static final boolean hasNext(long j8) {
        return j8 != 0;
    }

    public static final int hash(Object obj) {
        int i8;
        if (obj != null) {
            i8 = obj.hashCode();
        } else {
            i8 = 0;
        }
        int i9 = i8 * MurmurHashC1;
        return i9 ^ (i9 << 16);
    }

    public static final boolean isDeleted(long[] metadata, int i8) {
        AbstractC3292y.i(metadata, "metadata");
        if (((metadata[i8 >> 3] >> ((i8 & 7) << 3)) & 255) == 254) {
            return true;
        }
        return false;
    }

    public static final boolean isEmpty(long[] metadata, int i8) {
        AbstractC3292y.i(metadata, "metadata");
        if (((metadata[i8 >> 3] >> ((i8 & 7) << 3)) & 255) == 128) {
            return true;
        }
        return false;
    }

    public static final boolean isFull(long j8) {
        return j8 < 128;
    }

    public static final int loadedCapacity(int i8) {
        if (i8 == 7) {
            return 6;
        }
        return i8 - (i8 / 8);
    }

    public static final int lowestBitSet(long j8) {
        return Long.numberOfTrailingZeros(j8) >> 3;
    }

    public static final long maskEmpty(long j8) {
        return j8 & ((~j8) << 6) & (-9187201950435737472L);
    }

    public static final long maskEmptyOrDeleted(long j8) {
        return j8 & ((~j8) << 7) & (-9187201950435737472L);
    }

    public static final long match(long j8, int i8) {
        long j9 = j8 ^ (i8 * BitmaskLsb);
        return (~j9) & (j9 - BitmaskLsb) & (-9187201950435737472L);
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf() {
        return new MutableScatterMap<>(0, 1, null);
    }

    public static final long next(long j8) {
        return j8 & (j8 - 1);
    }

    public static final int nextCapacity(int i8) {
        if (i8 == 0) {
            return 6;
        }
        return (i8 * 2) + 1;
    }

    public static final int normalizeCapacity(int i8) {
        if (i8 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i8);
        }
        return 0;
    }

    public static final long readRawMetadata(long[] data, int i8) {
        AbstractC3292y.i(data, "data");
        return (data[i8 >> 3] >> ((i8 & 7) << 3)) & 255;
    }

    public static final int unloadedCapacity(int i8) {
        if (i8 == 7) {
            return 8;
        }
        return i8 + ((i8 - 1) / 7);
    }

    public static final void writeRawMetadata(long[] data, int i8, long j8) {
        AbstractC3292y.i(data, "data");
        int i9 = i8 >> 3;
        int i10 = (i8 & 7) << 3;
        data[i9] = (j8 << i10) | (data[i9] & (~(255 << i10)));
    }

    public static final boolean isFull(long[] metadata, int i8) {
        AbstractC3292y.i(metadata, "metadata");
        return ((metadata[i8 >> 3] >> ((i8 & 7) << 3)) & 255) < 128;
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf(r... pairs) {
        AbstractC3292y.i(pairs, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairs.length);
        mutableScatterMap.putAll(pairs);
        return mutableScatterMap;
    }
}
