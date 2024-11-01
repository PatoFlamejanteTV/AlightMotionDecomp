package com.mbridge.msdk.playercommon.exoplayer2.source.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AdPlaybackState {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public static final AdPlaybackState NONE = new AdPlaybackState(new long[0]);
    public final int adGroupCount;
    public final long[] adGroupTimesUs;
    public final AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final long contentDurationUs;

    /* loaded from: classes4.dex */
    public static final class AdGroup {
        public final int count;
        public final long[] durationsUs;
        public final int[] states;
        public final Uri[] uris;

        public AdGroup() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i8) {
            int length = jArr.length;
            int max = Math.max(i8, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, C.TIME_UNSET);
            return copyOf;
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i8) {
            int length = iArr.length;
            int max = Math.max(i8, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public final int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public final int getNextAdIndexToPlay(int i8) {
            int i9;
            int i10 = i8 + 1;
            while (true) {
                int[] iArr = this.states;
                if (i10 >= iArr.length || (i9 = iArr[i10]) == 0 || i9 == 1) {
                    break;
                }
                i10++;
            }
            return i10;
        }

        public final boolean hasUnplayedAds() {
            if (this.count != -1 && getFirstAdIndexToPlay() >= this.count) {
                return false;
            }
            return true;
        }

        public final AdGroup withAdCount(int i8) {
            boolean z8;
            if (this.count == -1 && this.states.length <= i8) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkArgument(z8);
            return new AdGroup(i8, copyStatesWithSpaceForAdCount(this.states, i8), (Uri[]) Arrays.copyOf(this.uris, i8), copyDurationsUsWithSpaceForAdCount(this.durationsUs, i8));
        }

        public final AdGroup withAdDurationsUs(long[] jArr) {
            boolean z8;
            if (this.count != -1 && jArr.length > this.uris.length) {
                z8 = false;
            } else {
                z8 = true;
            }
            Assertions.checkArgument(z8);
            int length = jArr.length;
            Uri[] uriArr = this.uris;
            if (length < uriArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, uriArr.length);
            }
            return new AdGroup(this.count, this.states, this.uris, jArr);
        }

        public final AdGroup withAdState(int i8, int i9) {
            boolean z8;
            int i10 = this.count;
            boolean z9 = false;
            if (i10 != -1 && i9 >= i10) {
                z8 = false;
            } else {
                z8 = true;
            }
            Assertions.checkArgument(z8);
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i9 + 1);
            int i11 = copyStatesWithSpaceForAdCount[i9];
            if (i11 == 0 || i11 == 1 || i11 == i8) {
                z9 = true;
            }
            Assertions.checkArgument(z9);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr = this.uris;
            if (uriArr.length != copyStatesWithSpaceForAdCount.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, copyStatesWithSpaceForAdCount.length);
            }
            copyStatesWithSpaceForAdCount[i9] = i8;
            return new AdGroup(this.count, copyStatesWithSpaceForAdCount, uriArr, jArr);
        }

        public final AdGroup withAdUri(Uri uri, int i8) {
            boolean z8;
            int i9 = this.count;
            boolean z9 = false;
            if (i9 != -1 && i8 >= i9) {
                z8 = false;
            } else {
                z8 = true;
            }
            Assertions.checkArgument(z8);
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i8 + 1);
            if (copyStatesWithSpaceForAdCount[i8] == 0) {
                z9 = true;
            }
            Assertions.checkArgument(z9);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.uris, copyStatesWithSpaceForAdCount.length);
            uriArr[i8] = uri;
            copyStatesWithSpaceForAdCount[i8] = 1;
            return new AdGroup(this.count, copyStatesWithSpaceForAdCount, uriArr, jArr);
        }

        public final AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new AdGroup(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i8 = 0; i8 < length; i8++) {
                int i9 = copyOf[i8];
                if (i9 == 1 || i9 == 0) {
                    copyOf[i8] = 2;
                }
            }
            return new AdGroup(length, copyOf, this.uris, this.durationsUs);
        }

        private AdGroup(int i8, int[] iArr, Uri[] uriArr, long[] jArr) {
            Assertions.checkArgument(iArr.length == uriArr.length);
            this.count = i8;
            this.states = iArr;
            this.uris = uriArr;
            this.durationsUs = jArr;
        }
    }

    /* loaded from: classes4.dex */
    public @interface AdState {
    }

    public AdPlaybackState(long... jArr) {
        int length = jArr.length;
        this.adGroupCount = length;
        this.adGroupTimesUs = Arrays.copyOf(jArr, length);
        this.adGroups = new AdGroup[length];
        for (int i8 = 0; i8 < length; i8++) {
            this.adGroups[i8] = new AdGroup();
        }
        this.adResumePositionUs = 0L;
        this.contentDurationUs = C.TIME_UNSET;
    }

    public final int getAdGroupIndexAfterPositionUs(long j8) {
        int i8 = 0;
        while (true) {
            long[] jArr = this.adGroupTimesUs;
            if (i8 >= jArr.length) {
                break;
            }
            long j9 = jArr[i8];
            if (j9 == Long.MIN_VALUE || (j8 < j9 && this.adGroups[i8].hasUnplayedAds())) {
                break;
            }
            i8++;
        }
        if (i8 >= this.adGroupTimesUs.length) {
            return -1;
        }
        return i8;
    }

    public final int getAdGroupIndexForPositionUs(long j8) {
        int length = this.adGroupTimesUs.length - 1;
        while (length >= 0) {
            long j9 = this.adGroupTimesUs[length];
            if (j9 != Long.MIN_VALUE && j9 <= j8) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.adGroups[length].hasUnplayedAds()) {
            return -1;
        }
        return length;
    }

    public final AdPlaybackState withAdCount(int i8, int i9) {
        boolean z8;
        if (i9 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i8].count == i9) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i8] = this.adGroups[i8].withAdCount(i9);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withAdDurationsUs(long[][] jArr) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        for (int i8 = 0; i8 < this.adGroupCount; i8++) {
            adGroupArr2[i8] = adGroupArr2[i8].withAdDurationsUs(jArr[i8]);
        }
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withAdLoadError(int i8, int i9) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i8] = adGroupArr2[i8].withAdState(4, i9);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withAdResumePositionUs(long j8) {
        if (this.adResumePositionUs == j8) {
            return this;
        }
        return new AdPlaybackState(this.adGroupTimesUs, this.adGroups, j8, this.contentDurationUs);
    }

    public final AdPlaybackState withAdUri(int i8, int i9, Uri uri) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i8] = adGroupArr2[i8].withAdUri(uri, i9);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withContentDurationUs(long j8) {
        if (this.contentDurationUs == j8) {
            return this;
        }
        return new AdPlaybackState(this.adGroupTimesUs, this.adGroups, this.adResumePositionUs, j8);
    }

    public final AdPlaybackState withPlayedAd(int i8, int i9) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i8] = adGroupArr2[i8].withAdState(3, i9);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withSkippedAd(int i8, int i9) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i8] = adGroupArr2[i8].withAdState(2, i9);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withSkippedAdGroup(int i8) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i8] = adGroupArr2[i8].withAllAdsSkipped();
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    private AdPlaybackState(long[] jArr, AdGroup[] adGroupArr, long j8, long j9) {
        this.adGroupCount = adGroupArr.length;
        this.adGroupTimesUs = jArr;
        this.adGroups = adGroupArr;
        this.adResumePositionUs = j8;
        this.contentDurationUs = j9;
    }
}
