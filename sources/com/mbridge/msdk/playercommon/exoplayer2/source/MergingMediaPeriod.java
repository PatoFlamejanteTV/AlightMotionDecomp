package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* loaded from: classes4.dex */
final class MergingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private MediaPeriod.Callback callback;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private MediaPeriod[] enabledPeriods;
    public final MediaPeriod[] periods;
    private TrackGroupArray trackGroups;
    private final ArrayList<MediaPeriod> childrenPendingPreparation = new ArrayList<>();
    private final IdentityHashMap<SampleStream, Integer> streamPeriodIndices = new IdentityHashMap<>();

    public MergingMediaPeriod(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, MediaPeriod... mediaPeriodArr) {
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.periods = mediaPeriodArr;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j8) {
        if (!this.childrenPendingPreparation.isEmpty()) {
            int size = this.childrenPendingPreparation.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.childrenPendingPreparation.get(i8).continueLoading(j8);
            }
            return false;
        }
        return this.compositeSequenceableLoader.continueLoading(j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void discardBuffer(long j8, boolean z8) {
        for (MediaPeriod mediaPeriod : this.enabledPeriods) {
            mediaPeriod.discardBuffer(j8, z8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long getAdjustedSeekPositionUs(long j8, SeekParameters seekParameters) {
        return this.enabledPeriods[0].getAdjustedSeekPositionUs(j8, seekParameters);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void maybeThrowPrepareError() throws IOException {
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod.Callback
    public final void onPrepared(MediaPeriod mediaPeriod) {
        this.childrenPendingPreparation.remove(mediaPeriod);
        if (!this.childrenPendingPreparation.isEmpty()) {
            return;
        }
        int i8 = 0;
        for (MediaPeriod mediaPeriod2 : this.periods) {
            i8 += mediaPeriod2.getTrackGroups().length;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i8];
        int i9 = 0;
        for (MediaPeriod mediaPeriod3 : this.periods) {
            TrackGroupArray trackGroups = mediaPeriod3.getTrackGroups();
            int i10 = trackGroups.length;
            int i11 = 0;
            while (i11 < i10) {
                trackGroupArr[i9] = trackGroups.get(i11);
                i11++;
                i9++;
            }
        }
        this.trackGroups = new TrackGroupArray(trackGroupArr);
        this.callback.onPrepared(this);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void prepare(MediaPeriod.Callback callback, long j8) {
        this.callback = callback;
        Collections.addAll(this.childrenPendingPreparation, this.periods);
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.prepare(this, j8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long readDiscontinuity() {
        long readDiscontinuity = this.periods[0].readDiscontinuity();
        int i8 = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.periods;
            if (i8 < mediaPeriodArr.length) {
                if (mediaPeriodArr[i8].readDiscontinuity() == C.TIME_UNSET) {
                    i8++;
                } else {
                    throw new IllegalStateException("Child reported discontinuity.");
                }
            } else {
                if (readDiscontinuity != C.TIME_UNSET) {
                    for (MediaPeriod mediaPeriod : this.enabledPeriods) {
                        if (mediaPeriod != this.periods[0] && mediaPeriod.seekToUs(readDiscontinuity) != readDiscontinuity) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                }
                return readDiscontinuity;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j8) {
        this.compositeSequenceableLoader.reevaluateBuffer(j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long seekToUs(long j8) {
        long seekToUs = this.enabledPeriods[0].seekToUs(j8);
        int i8 = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
            if (i8 < mediaPeriodArr.length) {
                if (mediaPeriodArr[i8].seekToUs(seekToUs) == seekToUs) {
                    i8++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return seekToUs;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j8) {
        boolean z8;
        SampleStream sampleStream;
        int intValue;
        SampleStream[] sampleStreamArr2 = sampleStreamArr;
        int[] iArr = new int[trackSelectionArr.length];
        int[] iArr2 = new int[trackSelectionArr.length];
        for (int i8 = 0; i8 < trackSelectionArr.length; i8++) {
            SampleStream sampleStream2 = sampleStreamArr2[i8];
            if (sampleStream2 == null) {
                intValue = -1;
            } else {
                intValue = this.streamPeriodIndices.get(sampleStream2).intValue();
            }
            iArr[i8] = intValue;
            iArr2[i8] = -1;
            TrackSelection trackSelection = trackSelectionArr[i8];
            if (trackSelection != null) {
                TrackGroup trackGroup = trackSelection.getTrackGroup();
                int i9 = 0;
                while (true) {
                    MediaPeriod[] mediaPeriodArr = this.periods;
                    if (i9 >= mediaPeriodArr.length) {
                        break;
                    }
                    if (mediaPeriodArr[i9].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i8] = i9;
                        break;
                    }
                    i9++;
                }
            }
        }
        this.streamPeriodIndices.clear();
        int length = trackSelectionArr.length;
        SampleStream[] sampleStreamArr3 = new SampleStream[length];
        SampleStream[] sampleStreamArr4 = new SampleStream[trackSelectionArr.length];
        TrackSelection[] trackSelectionArr2 = new TrackSelection[trackSelectionArr.length];
        ArrayList arrayList = new ArrayList(this.periods.length);
        long j9 = j8;
        int i10 = 0;
        while (i10 < this.periods.length) {
            for (int i11 = 0; i11 < trackSelectionArr.length; i11++) {
                TrackSelection trackSelection2 = null;
                if (iArr[i11] == i10) {
                    sampleStream = sampleStreamArr2[i11];
                } else {
                    sampleStream = null;
                }
                sampleStreamArr4[i11] = sampleStream;
                if (iArr2[i11] == i10) {
                    trackSelection2 = trackSelectionArr[i11];
                }
                trackSelectionArr2[i11] = trackSelection2;
            }
            int i12 = i10;
            TrackSelection[] trackSelectionArr3 = trackSelectionArr2;
            ArrayList arrayList2 = arrayList;
            long selectTracks = this.periods[i10].selectTracks(trackSelectionArr2, zArr, sampleStreamArr4, zArr2, j9);
            if (i12 == 0) {
                j9 = selectTracks;
            } else if (selectTracks != j9) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z9 = false;
            for (int i13 = 0; i13 < trackSelectionArr.length; i13++) {
                boolean z10 = true;
                if (iArr2[i13] == i12) {
                    if (sampleStreamArr4[i13] != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    Assertions.checkState(z8);
                    sampleStreamArr3[i13] = sampleStreamArr4[i13];
                    this.streamPeriodIndices.put(sampleStreamArr4[i13], Integer.valueOf(i12));
                    z9 = true;
                } else if (iArr[i13] == i12) {
                    if (sampleStreamArr4[i13] != null) {
                        z10 = false;
                    }
                    Assertions.checkState(z10);
                }
            }
            if (z9) {
                arrayList2.add(this.periods[i12]);
            }
            i10 = i12 + 1;
            arrayList = arrayList2;
            trackSelectionArr2 = trackSelectionArr3;
            sampleStreamArr2 = sampleStreamArr;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(sampleStreamArr3, 0, sampleStreamArr2, 0, length);
        MediaPeriod[] mediaPeriodArr2 = new MediaPeriod[arrayList3.size()];
        this.enabledPeriods = mediaPeriodArr2;
        arrayList3.toArray(mediaPeriodArr2);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(this.enabledPeriods);
        return j9;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader.Callback
    public final void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.callback.onContinueLoadingRequested(this);
    }
}
