package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities;
import com.mbridge.msdk.playercommon.exoplayer2.RendererConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class MappingTrackSelector extends TrackSelector {
    private MappedTrackInfo currentMappedTrackInfo;

    private static int findRenderer(RendererCapabilities[] rendererCapabilitiesArr, TrackGroup trackGroup) throws ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int i8 = 0;
        for (int i9 = 0; i9 < rendererCapabilitiesArr.length; i9++) {
            RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i9];
            for (int i10 = 0; i10 < trackGroup.length; i10++) {
                int supportsFormat = rendererCapabilities.supportsFormat(trackGroup.getFormat(i10)) & 7;
                if (supportsFormat > i8) {
                    if (supportsFormat == 4) {
                        return i9;
                    }
                    length = i9;
                    i8 = supportsFormat;
                }
            }
        }
        return length;
    }

    private static int[] getFormatSupport(RendererCapabilities rendererCapabilities, TrackGroup trackGroup) throws ExoPlaybackException {
        int[] iArr = new int[trackGroup.length];
        for (int i8 = 0; i8 < trackGroup.length; i8++) {
            iArr[i8] = rendererCapabilities.supportsFormat(trackGroup.getFormat(i8));
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(RendererCapabilities[] rendererCapabilitiesArr) throws ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = rendererCapabilitiesArr[i8].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    public final MappedTrackInfo getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector
    public final void onSelectionActivated(Object obj) {
        this.currentMappedTrackInfo = (MappedTrackInfo) obj;
    }

    protected abstract Pair<RendererConfiguration[], TrackSelection[]> selectTracks(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2) throws ExoPlaybackException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector
    public final TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray) throws ExoPlaybackException {
        int[] iArr = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length];
        int[][][] iArr2 = new int[rendererCapabilitiesArr.length + 1][];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = trackGroupArray.length;
            trackGroupArr[i8] = new TrackGroup[i9];
            iArr2[i8] = new int[i9];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(rendererCapabilitiesArr);
        for (int i10 = 0; i10 < trackGroupArray.length; i10++) {
            TrackGroup trackGroup = trackGroupArray.get(i10);
            int findRenderer = findRenderer(rendererCapabilitiesArr, trackGroup);
            int[] formatSupport = findRenderer == rendererCapabilitiesArr.length ? new int[trackGroup.length] : getFormatSupport(rendererCapabilitiesArr[findRenderer], trackGroup);
            int i11 = iArr[findRenderer];
            trackGroupArr[findRenderer][i11] = trackGroup;
            iArr2[findRenderer][i11] = formatSupport;
            iArr[findRenderer] = i11 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        int[] iArr3 = new int[rendererCapabilitiesArr.length];
        for (int i12 = 0; i12 < rendererCapabilitiesArr.length; i12++) {
            int i13 = iArr[i12];
            trackGroupArrayArr[i12] = new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[i12], i13));
            iArr2[i12] = (int[][]) Util.nullSafeArrayCopy(iArr2[i12], i13);
            iArr3[i12] = rendererCapabilitiesArr[i12].getTrackType();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(iArr3, trackGroupArrayArr, mixedMimeTypeAdaptationSupports, iArr2, new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[rendererCapabilitiesArr.length], iArr[rendererCapabilitiesArr.length])));
        Pair<RendererConfiguration[], TrackSelection[]> selectTracks = selectTracks(mappedTrackInfo, iArr2, mixedMimeTypeAdaptationSupports);
        return new TrackSelectorResult((RendererConfiguration[]) selectTracks.first, (TrackSelection[]) selectTracks.second, mappedTrackInfo);
    }

    /* loaded from: classes4.dex */
    public static final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
        public final int length;
        private final int rendererCount;
        private final int[][][] rendererFormatSupports;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final TrackGroupArray[] rendererTrackGroups;
        private final int[] rendererTrackTypes;
        private final TrackGroupArray unmappedTrackGroups;

        /* loaded from: classes4.dex */
        @interface RendererSupport {
        }

        MappedTrackInfo(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.rendererTrackTypes = iArr;
            this.rendererTrackGroups = trackGroupArrayArr;
            this.rendererFormatSupports = iArr3;
            this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
            this.unmappedTrackGroups = trackGroupArray;
            int length = iArr.length;
            this.rendererCount = length;
            this.length = length;
        }

        public final int getAdaptiveSupport(int i8, int i9, boolean z8) {
            int i10 = this.rendererTrackGroups[i8].get(i9).length;
            int[] iArr = new int[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                int trackSupport = getTrackSupport(i8, i9, i12);
                if (trackSupport == 4 || (z8 && trackSupport == 3)) {
                    iArr[i11] = i12;
                    i11++;
                }
            }
            return getAdaptiveSupport(i8, i9, Arrays.copyOf(iArr, i11));
        }

        public final int getRendererCount() {
            return this.rendererCount;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:            r1 = r1 + 1;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int getRendererSupport(int r8) {
            /*
                r7 = this;
                int[][][] r0 = r7.rendererFormatSupports
                r8 = r0[r8]
                r0 = 0
                r1 = 0
                r2 = 0
            L7:
                int r3 = r8.length
                if (r1 >= r3) goto L28
                r3 = 0
            Lb:
                r4 = r8[r1]
                int r5 = r4.length
                if (r3 >= r5) goto L25
                r4 = r4[r3]
                r4 = r4 & 7
                r5 = 3
                if (r4 == r5) goto L1d
                r6 = 4
                if (r4 == r6) goto L1c
                r4 = 1
                goto L1e
            L1c:
                return r5
            L1d:
                r4 = 2
            L1e:
                int r2 = java.lang.Math.max(r2, r4)
                int r3 = r3 + 1
                goto Lb
            L25:
                int r1 = r1 + 1
                goto L7
            L28:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo.getRendererSupport(int):int");
        }

        public final int getRendererType(int i8) {
            return this.rendererTrackTypes[i8];
        }

        public final int getTrackFormatSupport(int i8, int i9, int i10) {
            return getTrackSupport(i8, i9, i10);
        }

        public final TrackGroupArray getTrackGroups(int i8) {
            return this.rendererTrackGroups[i8];
        }

        public final int getTrackSupport(int i8, int i9, int i10) {
            return this.rendererFormatSupports[i8][i9][i10] & 7;
        }

        public final int getTrackTypeRendererSupport(int i8) {
            return getTypeSupport(i8);
        }

        public final int getTypeSupport(int i8) {
            int i9 = 0;
            for (int i10 = 0; i10 < this.rendererCount; i10++) {
                if (this.rendererTrackTypes[i10] == i8) {
                    i9 = Math.max(i9, getRendererSupport(i10));
                }
            }
            return i9;
        }

        public final TrackGroupArray getUnassociatedTrackGroups() {
            return getUnmappedTrackGroups();
        }

        public final TrackGroupArray getUnmappedTrackGroups() {
            return this.unmappedTrackGroups;
        }

        public final int getAdaptiveSupport(int i8, int i9, int[] iArr) {
            int i10 = 0;
            String str = null;
            boolean z8 = false;
            int i11 = 0;
            int i12 = 16;
            while (i10 < iArr.length) {
                String str2 = this.rendererTrackGroups[i8].get(i9).getFormat(iArr[i10]).sampleMimeType;
                int i13 = i11 + 1;
                if (i11 == 0) {
                    str = str2;
                } else {
                    z8 |= !Util.areEqual(str, str2);
                }
                i12 = Math.min(i12, this.rendererFormatSupports[i8][i9][i10] & 24);
                i10++;
                i11 = i13;
            }
            return z8 ? Math.min(i12, this.rendererMixedMimeTypeAdaptiveSupports[i8]) : i12;
        }
    }
}
