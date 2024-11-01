package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ChunkIndex;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class FragmentedMp4Extractor implements Extractor {
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    private static final int FLAG_SIDELOADED = 8;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final String TAG = "FragmentedMp4Extractor";
    private final TrackOutput additionalEmsgTrackOutput;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private TrackOutput[] cea608TrackOutputs;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
    private TrackBundle currentTrackBundle;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final byte[] extendedTypeScratch;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private final ParsableByteArray nalBuffer;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final ArrayDeque<MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private long segmentIndexEarliestPresentationTimeUs;
    private final DrmInitData sideloadedDrmInitData;
    private final Track sideloadedTrack;
    private final TimestampAdjuster timestampAdjuster;
    private final SparseArray<TrackBundle> trackBundles;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.FragmentedMp4Extractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new FragmentedMp4Extractor()};
        }
    };
    private static final int SAMPLE_GROUP_TYPE_seig = Util.getIntegerCodeForString("seig");
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final Format EMSG_FORMAT = Format.createSampleFormat(null, MimeTypes.APPLICATION_EMSG, Long.MAX_VALUE);

    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class MetadataSampleInfo {
        public final long presentationTimeDeltaUs;
        public final int size;

        public MetadataSampleInfo(long j8, int i8) {
            this.presentationTimeDeltaUs = j8;
            this.size = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class TrackBundle {
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        public DefaultSampleValues defaultSampleValues;
        public int firstSampleToOutputIndex;
        public final TrackOutput output;
        public Track track;
        public final TrackFragment fragment = new TrackFragment();
        private final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
        private final ParsableByteArray defaultInitializationVector = new ParsableByteArray();

        public TrackBundle(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        private TrackEncryptionBox getEncryptionBox() {
            TrackFragment trackFragment = this.fragment;
            int i8 = trackFragment.header.sampleDescriptionIndex;
            TrackEncryptionBox trackEncryptionBox = trackFragment.trackEncryptionBox;
            if (trackEncryptionBox == null) {
                return this.track.getSampleDescriptionEncryptionBox(i8);
            }
            return trackEncryptionBox;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void skipSampleEncryptionData() {
            TrackFragment trackFragment = this.fragment;
            if (!trackFragment.definesEncryptionData) {
                return;
            }
            ParsableByteArray parsableByteArray = trackFragment.sampleEncryptionData;
            int i8 = getEncryptionBox().initializationVectorSize;
            if (i8 != 0) {
                parsableByteArray.skipBytes(i8);
            }
            if (this.fragment.sampleHasSubsampleEncryptionTable[this.currentSampleIndex]) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
            }
        }

        public final void init(Track track, DefaultSampleValues defaultSampleValues) {
            this.track = (Track) Assertions.checkNotNull(track);
            this.defaultSampleValues = (DefaultSampleValues) Assertions.checkNotNull(defaultSampleValues);
            this.output.format(track.format);
            reset();
        }

        public final boolean next() {
            this.currentSampleIndex++;
            int i8 = this.currentSampleInTrackRun + 1;
            this.currentSampleInTrackRun = i8;
            int[] iArr = this.fragment.trunLength;
            int i9 = this.currentTrackRunIndex;
            if (i8 != iArr[i9]) {
                return true;
            }
            this.currentTrackRunIndex = i9 + 1;
            this.currentSampleInTrackRun = 0;
            return false;
        }

        public final int outputSampleEncryptionData() {
            ParsableByteArray parsableByteArray;
            int i8;
            if (!this.fragment.definesEncryptionData) {
                return 0;
            }
            TrackEncryptionBox encryptionBox = getEncryptionBox();
            int i9 = encryptionBox.initializationVectorSize;
            if (i9 != 0) {
                parsableByteArray = this.fragment.sampleEncryptionData;
            } else {
                byte[] bArr = encryptionBox.defaultInitializationVector;
                this.defaultInitializationVector.reset(bArr, bArr.length);
                ParsableByteArray parsableByteArray2 = this.defaultInitializationVector;
                i9 = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean z8 = this.fragment.sampleHasSubsampleEncryptionTable[this.currentSampleIndex];
            ParsableByteArray parsableByteArray3 = this.encryptionSignalByte;
            byte[] bArr2 = parsableByteArray3.data;
            if (z8) {
                i8 = 128;
            } else {
                i8 = 0;
            }
            bArr2[0] = (byte) (i8 | i9);
            parsableByteArray3.setPosition(0);
            this.output.sampleData(this.encryptionSignalByte, 1);
            this.output.sampleData(parsableByteArray, i9);
            if (!z8) {
                return i9 + 1;
            }
            ParsableByteArray parsableByteArray4 = this.fragment.sampleEncryptionData;
            int readUnsignedShort = parsableByteArray4.readUnsignedShort();
            parsableByteArray4.skipBytes(-2);
            int i10 = (readUnsignedShort * 6) + 2;
            this.output.sampleData(parsableByteArray4, i10);
            return i9 + 1 + i10;
        }

        public final void reset() {
            this.fragment.reset();
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
        }

        public final void seek(long j8) {
            long usToMs = C.usToMs(j8);
            int i8 = this.currentSampleIndex;
            while (true) {
                TrackFragment trackFragment = this.fragment;
                if (i8 < trackFragment.sampleCount && trackFragment.getSamplePresentationTime(i8) < usToMs) {
                    if (this.fragment.sampleIsSyncFrameTable[i8]) {
                        this.firstSampleToOutputIndex = i8;
                    }
                    i8++;
                } else {
                    return;
                }
            }
        }

        public final void updateDrmInitData(DrmInitData drmInitData) {
            String str;
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.track.getSampleDescriptionEncryptionBox(this.fragment.header.sampleDescriptionIndex);
            if (sampleDescriptionEncryptionBox != null) {
                str = sampleDescriptionEncryptionBox.schemeType;
            } else {
                str = null;
            }
            this.output.format(this.track.format.copyWithDrmInitData(drmInitData.copyWithSchemeType(str)));
        }
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private DefaultSampleValues getDefaultSampleValues(SparseArray<DefaultSampleValues> sparseArray, int i8) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (DefaultSampleValues) Assertions.checkNotNull(sparseArray.get(i8));
    }

    private static DrmInitData getDrmInitDataFromAtoms(List<Atom.LeafAtom> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < size; i8++) {
            Atom.LeafAtom leafAtom = list.get(i8);
            if (leafAtom.type == Atom.TYPE_pssh) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = leafAtom.data.data;
                UUID parseUuid = PsshAtomUtil.parseUuid(bArr);
                if (parseUuid == null) {
                    Log.w(TAG, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(parseUuid, MimeTypes.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private static TrackBundle getNextFragmentRun(SparseArray<TrackBundle> sparseArray) {
        int size = sparseArray.size();
        TrackBundle trackBundle = null;
        long j8 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < size; i8++) {
            TrackBundle valueAt = sparseArray.valueAt(i8);
            int i9 = valueAt.currentTrackRunIndex;
            TrackFragment trackFragment = valueAt.fragment;
            if (i9 != trackFragment.trunCount) {
                long j9 = trackFragment.trunDataPosition[i9];
                if (j9 < j8) {
                    trackBundle = valueAt;
                    j8 = j9;
                }
            }
        }
        return trackBundle;
    }

    private static TrackBundle getTrackBundle(SparseArray<TrackBundle> sparseArray, int i8) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i8);
    }

    private void maybeInitExtraTracks() {
        int i8;
        if (this.emsgTrackOutputs == null) {
            TrackOutput[] trackOutputArr = new TrackOutput[2];
            this.emsgTrackOutputs = trackOutputArr;
            TrackOutput trackOutput = this.additionalEmsgTrackOutput;
            if (trackOutput != null) {
                trackOutputArr[0] = trackOutput;
                i8 = 1;
            } else {
                i8 = 0;
            }
            if ((this.flags & 4) != 0) {
                trackOutputArr[i8] = this.extractorOutput.track(this.trackBundles.size(), 4);
                i8++;
            }
            TrackOutput[] trackOutputArr2 = (TrackOutput[]) Arrays.copyOf(this.emsgTrackOutputs, i8);
            this.emsgTrackOutputs = trackOutputArr2;
            for (TrackOutput trackOutput2 : trackOutputArr2) {
                trackOutput2.format(EMSG_FORMAT);
            }
        }
        if (this.cea608TrackOutputs == null) {
            this.cea608TrackOutputs = new TrackOutput[this.closedCaptionFormats.size()];
            for (int i9 = 0; i9 < this.cea608TrackOutputs.length; i9++) {
                TrackOutput track = this.extractorOutput.track(this.trackBundles.size() + 1 + i9, 3);
                track.format(this.closedCaptionFormats.get(i9));
                this.cea608TrackOutputs[i9] = track;
            }
        }
    }

    private void onContainerAtomRead(Atom.ContainerAtom containerAtom) throws ParserException {
        int i8 = containerAtom.type;
        if (i8 == Atom.TYPE_moov) {
            onMoovContainerAtomRead(containerAtom);
        } else if (i8 == Atom.TYPE_moof) {
            onMoofContainerAtomRead(containerAtom);
        } else if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(containerAtom);
        }
    }

    private void onEmsgLeafAtomRead(ParsableByteArray parsableByteArray) {
        TrackOutput[] trackOutputArr = this.emsgTrackOutputs;
        if (trackOutputArr != null && trackOutputArr.length != 0) {
            parsableByteArray.setPosition(12);
            int bytesLeft = parsableByteArray.bytesLeft();
            parsableByteArray.readNullTerminatedString();
            parsableByteArray.readNullTerminatedString();
            long scaleLargeTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, parsableByteArray.readUnsignedInt());
            for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                parsableByteArray.setPosition(12);
                trackOutput.sampleData(parsableByteArray, bytesLeft);
            }
            long j8 = this.segmentIndexEarliestPresentationTimeUs;
            if (j8 != C.TIME_UNSET) {
                long j9 = j8 + scaleLargeTimestamp;
                TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
                if (timestampAdjuster != null) {
                    j9 = timestampAdjuster.adjustSampleTimestamp(j9);
                }
                long j10 = j9;
                for (TrackOutput trackOutput2 : this.emsgTrackOutputs) {
                    trackOutput2.sampleMetadata(j10, 1, bytesLeft, 0, null);
                }
                return;
            }
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(scaleLargeTimestamp, bytesLeft));
            this.pendingMetadataSampleBytes += bytesLeft;
        }
    }

    private void onLeafAtomRead(Atom.LeafAtom leafAtom, long j8) throws ParserException {
        if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(leafAtom);
            return;
        }
        int i8 = leafAtom.type;
        if (i8 == Atom.TYPE_sidx) {
            Pair<Long, ChunkIndex> parseSidx = parseSidx(leafAtom.data, j8);
            this.segmentIndexEarliestPresentationTimeUs = ((Long) parseSidx.first).longValue();
            this.extractorOutput.seekMap((SeekMap) parseSidx.second);
            this.haveOutputSeekMap = true;
            return;
        }
        if (i8 == Atom.TYPE_emsg) {
            onEmsgLeafAtomRead(leafAtom.data);
        }
    }

    private void onMoofContainerAtomRead(Atom.ContainerAtom containerAtom) throws ParserException {
        DrmInitData drmInitDataFromAtoms;
        parseMoof(containerAtom, this.trackBundles, this.flags, this.extendedTypeScratch);
        if (this.sideloadedDrmInitData != null) {
            drmInitDataFromAtoms = null;
        } else {
            drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerAtom.leafChildren);
        }
        if (drmInitDataFromAtoms != null) {
            int size = this.trackBundles.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.trackBundles.valueAt(i8).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.pendingSeekTimeUs != C.TIME_UNSET) {
            int size2 = this.trackBundles.size();
            for (int i9 = 0; i9 < size2; i9++) {
                this.trackBundles.valueAt(i9).seek(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = C.TIME_UNSET;
        }
    }

    private void onMoovContainerAtomRead(Atom.ContainerAtom containerAtom) throws ParserException {
        boolean z8;
        int i8;
        int i9;
        boolean z9;
        int i10 = 0;
        boolean z10 = true;
        if (this.sideloadedTrack == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8, "Unexpected moov box.");
        DrmInitData drmInitData = this.sideloadedDrmInitData;
        if (drmInitData == null) {
            drmInitData = getDrmInitDataFromAtoms(containerAtom.leafChildren);
        }
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_mvex);
        SparseArray<DefaultSampleValues> sparseArray = new SparseArray<>();
        int size = containerAtomOfType.leafChildren.size();
        long j8 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            Atom.LeafAtom leafAtom = containerAtomOfType.leafChildren.get(i11);
            int i12 = leafAtom.type;
            if (i12 == Atom.TYPE_trex) {
                Pair<Integer, DefaultSampleValues> parseTrex = parseTrex(leafAtom.data);
                sparseArray.put(((Integer) parseTrex.first).intValue(), (DefaultSampleValues) parseTrex.second);
            } else if (i12 == Atom.TYPE_mehd) {
                j8 = parseMehd(leafAtom.data);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = containerAtom.containerChildren.size();
        int i13 = 0;
        while (i13 < size2) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i13);
            if (containerAtom2.type == Atom.TYPE_trak) {
                Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd);
                if ((this.flags & 16) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                i8 = i13;
                boolean z11 = z9;
                i9 = size2;
                Track parseTrak = AtomParsers.parseTrak(containerAtom2, leafAtomOfType, j8, drmInitData, z11, false);
                if (parseTrak != null) {
                    sparseArray2.put(parseTrak.id, parseTrak);
                }
            } else {
                i8 = i13;
                i9 = size2;
            }
            i13 = i8 + 1;
            size2 = i9;
        }
        int size3 = sparseArray2.size();
        if (this.trackBundles.size() == 0) {
            while (i10 < size3) {
                Track track = (Track) sparseArray2.valueAt(i10);
                TrackBundle trackBundle = new TrackBundle(this.extractorOutput.track(i10, track.type));
                trackBundle.init(track, getDefaultSampleValues(sparseArray, track.id));
                this.trackBundles.put(track.id, trackBundle);
                this.durationUs = Math.max(this.durationUs, track.durationUs);
                i10++;
            }
            maybeInitExtraTracks();
            this.extractorOutput.endTracks();
            return;
        }
        if (this.trackBundles.size() != size3) {
            z10 = false;
        }
        Assertions.checkState(z10);
        while (i10 < size3) {
            Track track2 = (Track) sparseArray2.valueAt(i10);
            this.trackBundles.get(track2.id).init(track2, getDefaultSampleValues(sparseArray, track2.id));
            i10++;
        }
    }

    private void outputPendingMetadataSamples(long j8) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            MetadataSampleInfo removeFirst = this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= removeFirst.size;
            long j9 = removeFirst.presentationTimeDeltaUs + j8;
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                j9 = timestampAdjuster.adjustSampleTimestamp(j9);
            }
            for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                trackOutput.sampleMetadata(j9, 1, removeFirst.size, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static long parseMehd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0) {
            return parsableByteArray.readUnsignedInt();
        }
        return parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(Atom.ContainerAtom containerAtom, SparseArray<TrackBundle> sparseArray, int i8, byte[] bArr) throws ParserException {
        int size = containerAtom.containerChildren.size();
        for (int i9 = 0; i9 < size; i9++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i9);
            if (containerAtom2.type == Atom.TYPE_traf) {
                parseTraf(containerAtom2, sparseArray, i8, bArr);
            }
        }
    }

    private static void parseSaio(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        long readUnsignedLongToLong;
        parsableByteArray.setPosition(8);
        int readInt = parsableByteArray.readInt();
        if ((Atom.parseFullAtomFlags(readInt) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt == 1) {
            int parseFullAtomVersion = Atom.parseFullAtomVersion(readInt);
            long j8 = trackFragment.auxiliaryDataPosition;
            if (parseFullAtomVersion == 0) {
                readUnsignedLongToLong = parsableByteArray.readUnsignedInt();
            } else {
                readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            }
            trackFragment.auxiliaryDataPosition = j8 + readUnsignedLongToLong;
            return;
        }
        throw new ParserException("Unexpected saio entry count: " + readUnsignedIntToInt);
    }

    private static void parseSaiz(TrackEncryptionBox trackEncryptionBox, ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        int i8;
        boolean z8;
        int i9 = trackEncryptionBox.initializationVectorSize;
        parsableByteArray.setPosition(8);
        boolean z9 = true;
        if ((Atom.parseFullAtomFlags(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt == trackFragment.sampleCount) {
            if (readUnsignedByte == 0) {
                boolean[] zArr = trackFragment.sampleHasSubsampleEncryptionTable;
                i8 = 0;
                for (int i10 = 0; i10 < readUnsignedIntToInt; i10++) {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    i8 += readUnsignedByte2;
                    if (readUnsignedByte2 > i9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zArr[i10] = z8;
                }
            } else {
                if (readUnsignedByte <= i9) {
                    z9 = false;
                }
                i8 = readUnsignedByte * readUnsignedIntToInt;
                Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, z9);
            }
            trackFragment.initEncryptionData(i8);
            return;
        }
        throw new ParserException("Length mismatch: " + readUnsignedIntToInt + ", " + trackFragment.sampleCount);
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parseSenc(parsableByteArray, 0, trackFragment);
    }

    private static void parseSgpd(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, String str, TrackFragment trackFragment) throws ParserException {
        boolean z8;
        byte[] bArr;
        parsableByteArray.setPosition(8);
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        int i8 = SAMPLE_GROUP_TYPE_seig;
        if (readInt2 != i8) {
            return;
        }
        if (Atom.parseFullAtomVersion(readInt) == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() == 1) {
            parsableByteArray2.setPosition(8);
            int readInt3 = parsableByteArray2.readInt();
            if (parsableByteArray2.readInt() != i8) {
                return;
            }
            int parseFullAtomVersion = Atom.parseFullAtomVersion(readInt3);
            if (parseFullAtomVersion == 1) {
                if (parsableByteArray2.readUnsignedInt() == 0) {
                    throw new ParserException("Variable length description in sgpd found (unsupported)");
                }
            } else if (parseFullAtomVersion >= 2) {
                parsableByteArray2.skipBytes(4);
            }
            if (parsableByteArray2.readUnsignedInt() == 1) {
                parsableByteArray2.skipBytes(1);
                int readUnsignedByte = parsableByteArray2.readUnsignedByte();
                int i9 = (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                int i10 = readUnsignedByte & 15;
                if (parsableByteArray2.readUnsignedByte() == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    return;
                }
                int readUnsignedByte2 = parsableByteArray2.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray2.readBytes(bArr2, 0, 16);
                if (z8 && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray2.readUnsignedByte();
                    byte[] bArr3 = new byte[readUnsignedByte3];
                    parsableByteArray2.readBytes(bArr3, 0, readUnsignedByte3);
                    bArr = bArr3;
                } else {
                    bArr = null;
                }
                trackFragment.definesEncryptionData = true;
                trackFragment.trackEncryptionBox = new TrackEncryptionBox(z8, str, readUnsignedByte2, bArr2, i9, i10, bArr);
                return;
            }
            throw new ParserException("Entry count in sgpd != 1 (unsupported).");
        }
        throw new ParserException("Entry count in sbgp != 1 (unsupported).");
    }

    private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray parsableByteArray, long j8) throws ParserException {
        long readUnsignedLongToLong;
        long readUnsignedLongToLong2;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (parseFullAtomVersion == 0) {
            readUnsignedLongToLong = parsableByteArray.readUnsignedInt();
            readUnsignedLongToLong2 = parsableByteArray.readUnsignedInt();
        } else {
            readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            readUnsignedLongToLong2 = parsableByteArray.readUnsignedLongToLong();
        }
        long j9 = readUnsignedLongToLong;
        long j10 = j8 + readUnsignedLongToLong2;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j9, 1000000L, readUnsignedInt);
        parsableByteArray.skipBytes(2);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr = new int[readUnsignedShort];
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        long[] jArr3 = new long[readUnsignedShort];
        long j11 = j9;
        long j12 = scaleLargeTimestamp;
        int i8 = 0;
        while (i8 < readUnsignedShort) {
            int readInt = parsableByteArray.readInt();
            if ((readInt & Integer.MIN_VALUE) == 0) {
                long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
                iArr[i8] = readInt & Integer.MAX_VALUE;
                jArr[i8] = j10;
                jArr3[i8] = j12;
                long j13 = j11 + readUnsignedInt2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i9 = readUnsignedShort;
                long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(j13, 1000000L, readUnsignedInt);
                jArr4[i8] = scaleLargeTimestamp2 - jArr5[i8];
                parsableByteArray.skipBytes(4);
                j10 += r1[i8];
                i8++;
                iArr = iArr;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                readUnsignedShort = i9;
                j11 = j13;
                j12 = scaleLargeTimestamp2;
            } else {
                throw new ParserException("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(scaleLargeTimestamp), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private static long parseTfdt(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 1) {
            return parsableByteArray.readUnsignedLongToLong();
        }
        return parsableByteArray.readUnsignedInt();
    }

    private static TrackBundle parseTfhd(ParsableByteArray parsableByteArray, SparseArray<TrackBundle> sparseArray) {
        int i8;
        int i9;
        int i10;
        int i11;
        parsableByteArray.setPosition(8);
        int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        TrackBundle trackBundle = getTrackBundle(sparseArray, parsableByteArray.readInt());
        if (trackBundle == null) {
            return null;
        }
        if ((parseFullAtomFlags & 1) != 0) {
            long readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            TrackFragment trackFragment = trackBundle.fragment;
            trackFragment.dataPosition = readUnsignedLongToLong;
            trackFragment.auxiliaryDataPosition = readUnsignedLongToLong;
        }
        DefaultSampleValues defaultSampleValues = trackBundle.defaultSampleValues;
        if ((parseFullAtomFlags & 2) != 0) {
            i8 = parsableByteArray.readUnsignedIntToInt() - 1;
        } else {
            i8 = defaultSampleValues.sampleDescriptionIndex;
        }
        if ((parseFullAtomFlags & 8) != 0) {
            i9 = parsableByteArray.readUnsignedIntToInt();
        } else {
            i9 = defaultSampleValues.duration;
        }
        if ((parseFullAtomFlags & 16) != 0) {
            i10 = parsableByteArray.readUnsignedIntToInt();
        } else {
            i10 = defaultSampleValues.size;
        }
        if ((parseFullAtomFlags & 32) != 0) {
            i11 = parsableByteArray.readUnsignedIntToInt();
        } else {
            i11 = defaultSampleValues.flags;
        }
        trackBundle.fragment.header = new DefaultSampleValues(i8, i9, i10, i11);
        return trackBundle;
    }

    private static void parseTraf(Atom.ContainerAtom containerAtom, SparseArray<TrackBundle> sparseArray, int i8, byte[] bArr) throws ParserException {
        String str;
        TrackBundle parseTfhd = parseTfhd(containerAtom.getLeafAtomOfType(Atom.TYPE_tfhd).data, sparseArray);
        if (parseTfhd == null) {
            return;
        }
        TrackFragment trackFragment = parseTfhd.fragment;
        long j8 = trackFragment.nextFragmentDecodeTime;
        parseTfhd.reset();
        int i9 = Atom.TYPE_tfdt;
        if (containerAtom.getLeafAtomOfType(i9) != null && (i8 & 2) == 0) {
            j8 = parseTfdt(containerAtom.getLeafAtomOfType(i9).data);
        }
        parseTruns(containerAtom, parseTfhd, j8, i8);
        TrackEncryptionBox sampleDescriptionEncryptionBox = parseTfhd.track.getSampleDescriptionEncryptionBox(trackFragment.header.sampleDescriptionIndex);
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_saiz);
        if (leafAtomOfType != null) {
            parseSaiz(sampleDescriptionEncryptionBox, leafAtomOfType.data, trackFragment);
        }
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_saio);
        if (leafAtomOfType2 != null) {
            parseSaio(leafAtomOfType2.data, trackFragment);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_senc);
        if (leafAtomOfType3 != null) {
            parseSenc(leafAtomOfType3.data, trackFragment);
        }
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_sbgp);
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_sgpd);
        if (leafAtomOfType4 != null && leafAtomOfType5 != null) {
            ParsableByteArray parsableByteArray = leafAtomOfType4.data;
            ParsableByteArray parsableByteArray2 = leafAtomOfType5.data;
            if (sampleDescriptionEncryptionBox != null) {
                str = sampleDescriptionEncryptionBox.schemeType;
            } else {
                str = null;
            }
            parseSgpd(parsableByteArray, parsableByteArray2, str, trackFragment);
        }
        int size = containerAtom.leafChildren.size();
        for (int i10 = 0; i10 < size; i10++) {
            Atom.LeafAtom leafAtom = containerAtom.leafChildren.get(i10);
            if (leafAtom.type == Atom.TYPE_uuid) {
                parseUuid(leafAtom.data, trackFragment, bArr);
            }
        }
    }

    private static Pair<Integer, DefaultSampleValues> parseTrex(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        return Pair.create(Integer.valueOf(parsableByteArray.readInt()), new DefaultSampleValues(parsableByteArray.readUnsignedIntToInt() - 1, parsableByteArray.readUnsignedIntToInt(), parsableByteArray.readUnsignedIntToInt(), parsableByteArray.readInt()));
    }

    private static int parseTrun(TrackBundle trackBundle, int i8, long j8, int i9, ParsableByteArray parsableByteArray, int i10) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j9;
        int i11;
        boolean z14;
        int i12;
        boolean z15;
        int i13;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        parsableByteArray.setPosition(8);
        int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        Track track = trackBundle.track;
        TrackFragment trackFragment = trackBundle.fragment;
        DefaultSampleValues defaultSampleValues = trackFragment.header;
        trackFragment.trunLength[i8] = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = trackFragment.trunDataPosition;
        long j10 = trackFragment.dataPosition;
        jArr[i8] = j10;
        if ((parseFullAtomFlags & 1) != 0) {
            jArr[i8] = j10 + parsableByteArray.readInt();
        }
        if ((parseFullAtomFlags & 4) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i14 = defaultSampleValues.flags;
        if (z8) {
            i14 = parsableByteArray.readUnsignedIntToInt();
        }
        if ((parseFullAtomFlags & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((parseFullAtomFlags & 512) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((parseFullAtomFlags & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((parseFullAtomFlags & 2048) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        long[] jArr2 = track.editListDurations;
        long j11 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j11 = Util.scaleLargeTimestamp(track.editListMediaTimes[0], 1000L, track.timescale);
        }
        int[] iArr = trackFragment.sampleSizeTable;
        int[] iArr2 = trackFragment.sampleCompositionTimeOffsetTable;
        long[] jArr3 = trackFragment.sampleDecodingTimeTable;
        boolean[] zArr = trackFragment.sampleIsSyncFrameTable;
        int i15 = i14;
        if (track.type == 2 && (i9 & 1) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i16 = i10 + trackFragment.trunLength[i8];
        long j12 = track.timescale;
        long j13 = j11;
        if (i8 > 0) {
            j9 = trackFragment.nextFragmentDecodeTime;
        } else {
            j9 = j8;
        }
        long j14 = j9;
        int i17 = i10;
        while (i17 < i16) {
            if (z9) {
                i11 = parsableByteArray.readUnsignedIntToInt();
            } else {
                i11 = defaultSampleValues.duration;
            }
            if (z10) {
                z14 = z9;
                i12 = parsableByteArray.readUnsignedIntToInt();
            } else {
                z14 = z9;
                i12 = defaultSampleValues.size;
            }
            if (i17 == 0 && z8) {
                z15 = z8;
                i13 = i15;
            } else if (z11) {
                z15 = z8;
                i13 = parsableByteArray.readInt();
            } else {
                z15 = z8;
                i13 = defaultSampleValues.flags;
            }
            if (z12) {
                z16 = z12;
                z17 = z10;
                z18 = z11;
                iArr2[i17] = (int) ((parsableByteArray.readInt() * 1000) / j12);
            } else {
                z16 = z12;
                z17 = z10;
                z18 = z11;
                iArr2[i17] = 0;
            }
            jArr3[i17] = Util.scaleLargeTimestamp(j14, 1000L, j12) - j13;
            iArr[i17] = i12;
            if (((i13 >> 16) & 1) == 0 && (!z13 || i17 == 0)) {
                z19 = true;
            } else {
                z19 = false;
            }
            zArr[i17] = z19;
            i17++;
            j14 += i11;
            j12 = j12;
            z9 = z14;
            z8 = z15;
            z12 = z16;
            z10 = z17;
            z11 = z18;
        }
        trackFragment.nextFragmentDecodeTime = j14;
        return i16;
    }

    private static void parseTruns(Atom.ContainerAtom containerAtom, TrackBundle trackBundle, long j8, int i8) {
        List<Atom.LeafAtom> list = containerAtom.leafChildren;
        int size = list.size();
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Atom.LeafAtom leafAtom = list.get(i11);
            if (leafAtom.type == Atom.TYPE_trun) {
                ParsableByteArray parsableByteArray = leafAtom.data;
                parsableByteArray.setPosition(12);
                int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (readUnsignedIntToInt > 0) {
                    i10 += readUnsignedIntToInt;
                    i9++;
                }
            }
        }
        trackBundle.currentTrackRunIndex = 0;
        trackBundle.currentSampleInTrackRun = 0;
        trackBundle.currentSampleIndex = 0;
        trackBundle.fragment.initTables(i9, i10);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Atom.LeafAtom leafAtom2 = list.get(i14);
            if (leafAtom2.type == Atom.TYPE_trun) {
                i13 = parseTrun(trackBundle, i12, j8, i8, leafAtom2.data, i13);
                i12++;
            }
        }
    }

    private static void parseUuid(ParsableByteArray parsableByteArray, TrackFragment trackFragment, byte[] bArr) throws ParserException {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (!Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            return;
        }
        parseSenc(parsableByteArray, 16, trackFragment);
    }

    private void processAtomEnded(long j8) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j8) {
            onContainerAtomRead(this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.data, 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j8 = this.atomSize;
        if (j8 == 1) {
            extractorInput.readFully(this.atomHeader.data, 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j8 == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = this.containerAtoms.peek().endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        if (this.atomSize >= this.atomHeaderBytesRead) {
            long position = extractorInput.getPosition() - this.atomHeaderBytesRead;
            if (this.atomType == Atom.TYPE_moof) {
                int size = this.trackBundles.size();
                for (int i8 = 0; i8 < size; i8++) {
                    TrackFragment trackFragment = this.trackBundles.valueAt(i8).fragment;
                    trackFragment.atomPosition = position;
                    trackFragment.auxiliaryDataPosition = position;
                    trackFragment.dataPosition = position;
                }
            }
            int i9 = this.atomType;
            if (i9 == Atom.TYPE_mdat) {
                this.currentTrackBundle = null;
                this.endOfMdatPosition = this.atomSize + position;
                if (!this.haveOutputSeekMap) {
                    this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs, position));
                    this.haveOutputSeekMap = true;
                }
                this.parserState = 2;
                return true;
            }
            if (shouldParseContainerAtom(i9)) {
                long position2 = (extractorInput.getPosition() + this.atomSize) - 8;
                this.containerAtoms.push(new Atom.ContainerAtom(this.atomType, position2));
                if (this.atomSize == this.atomHeaderBytesRead) {
                    processAtomEnded(position2);
                } else {
                    enterReadingAtomHeaderState();
                }
            } else if (shouldParseLeafAtom(this.atomType)) {
                if (this.atomHeaderBytesRead == 8) {
                    long j9 = this.atomSize;
                    if (j9 <= 2147483647L) {
                        ParsableByteArray parsableByteArray = new ParsableByteArray((int) j9);
                        this.atomData = parsableByteArray;
                        System.arraycopy(this.atomHeader.data, 0, parsableByteArray.data, 0, 8);
                        this.parserState = 1;
                    } else {
                        throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw new ParserException("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.atomSize <= 2147483647L) {
                this.atomData = null;
                this.parserState = 1;
            } else {
                throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw new ParserException("Atom size less than header length (unsupported).");
    }

    private void readAtomPayload(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i8 = ((int) this.atomSize) - this.atomHeaderBytesRead;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.data, 8, i8);
            onLeafAtomRead(new Atom.LeafAtom(this.atomType, this.atomData), extractorInput.getPosition());
        } else {
            extractorInput.skipFully(i8);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void readEncryptionData(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int size = this.trackBundles.size();
        TrackBundle trackBundle = null;
        long j8 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < size; i8++) {
            TrackFragment trackFragment = this.trackBundles.valueAt(i8).fragment;
            if (trackFragment.sampleEncryptionDataNeedsFill) {
                long j9 = trackFragment.auxiliaryDataPosition;
                if (j9 < j8) {
                    trackBundle = this.trackBundles.valueAt(i8);
                    j8 = j9;
                }
            }
        }
        if (trackBundle == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j8 - extractorInput.getPosition());
        if (position >= 0) {
            extractorInput.skipFully(position);
            trackBundle.fragment.fillEncryptionData(extractorInput);
            return;
        }
        throw new ParserException("Offset to encryption data was negative.");
    }

    private boolean readSample(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i8;
        TrackOutput.CryptoData cryptoData;
        boolean z8;
        int sampleData;
        int i9 = 4;
        int i10 = 1;
        int i11 = 0;
        if (this.parserState == 3) {
            if (this.currentTrackBundle == null) {
                TrackBundle nextFragmentRun = getNextFragmentRun(this.trackBundles);
                if (nextFragmentRun == null) {
                    int position = (int) (this.endOfMdatPosition - extractorInput.getPosition());
                    if (position >= 0) {
                        extractorInput.skipFully(position);
                        enterReadingAtomHeaderState();
                        return false;
                    }
                    throw new ParserException("Offset to end of mdat was negative.");
                }
                int position2 = (int) (nextFragmentRun.fragment.trunDataPosition[nextFragmentRun.currentTrackRunIndex] - extractorInput.getPosition());
                if (position2 < 0) {
                    Log.w(TAG, "Ignoring negative offset to sample data.");
                    position2 = 0;
                }
                extractorInput.skipFully(position2);
                this.currentTrackBundle = nextFragmentRun;
            }
            TrackBundle trackBundle = this.currentTrackBundle;
            int[] iArr = trackBundle.fragment.sampleSizeTable;
            int i12 = trackBundle.currentSampleIndex;
            int i13 = iArr[i12];
            this.sampleSize = i13;
            if (i12 < trackBundle.firstSampleToOutputIndex) {
                extractorInput.skipFully(i13);
                this.currentTrackBundle.skipSampleEncryptionData();
                if (!this.currentTrackBundle.next()) {
                    this.currentTrackBundle = null;
                }
                this.parserState = 3;
                return true;
            }
            if (trackBundle.track.sampleTransformation == 1) {
                this.sampleSize = i13 - 8;
                extractorInput.skipFully(8);
            }
            int outputSampleEncryptionData = this.currentTrackBundle.outputSampleEncryptionData();
            this.sampleBytesWritten = outputSampleEncryptionData;
            this.sampleSize += outputSampleEncryptionData;
            this.parserState = 4;
            this.sampleCurrentNalBytesRemaining = 0;
        }
        TrackBundle trackBundle2 = this.currentTrackBundle;
        TrackFragment trackFragment = trackBundle2.fragment;
        Track track = trackBundle2.track;
        TrackOutput trackOutput = trackBundle2.output;
        int i14 = trackBundle2.currentSampleIndex;
        long samplePresentationTime = trackFragment.getSamplePresentationTime(i14) * 1000;
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            samplePresentationTime = timestampAdjuster.adjustSampleTimestamp(samplePresentationTime);
        }
        long j8 = samplePresentationTime;
        int i15 = track.nalUnitLengthFieldLength;
        if (i15 == 0) {
            while (true) {
                int i16 = this.sampleBytesWritten;
                int i17 = this.sampleSize;
                if (i16 >= i17) {
                    break;
                }
                this.sampleBytesWritten += trackOutput.sampleData(extractorInput, i17 - i16, false);
            }
        } else {
            byte[] bArr = this.nalPrefix.data;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i18 = i15 + 1;
            int i19 = 4 - i15;
            while (this.sampleBytesWritten < this.sampleSize) {
                int i20 = this.sampleCurrentNalBytesRemaining;
                if (i20 == 0) {
                    extractorInput.readFully(bArr, i19, i18);
                    this.nalPrefix.setPosition(i11);
                    this.sampleCurrentNalBytesRemaining = this.nalPrefix.readUnsignedIntToInt() - i10;
                    this.nalStartCode.setPosition(i11);
                    trackOutput.sampleData(this.nalStartCode, i9);
                    trackOutput.sampleData(this.nalPrefix, i10);
                    if (this.cea608TrackOutputs.length > 0 && NalUnitUtil.isNalUnitSei(track.format.sampleMimeType, bArr[i9])) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.processSeiNalUnitPayload = z8;
                    this.sampleBytesWritten += 5;
                    this.sampleSize += i19;
                } else {
                    if (this.processSeiNalUnitPayload) {
                        this.nalBuffer.reset(i20);
                        extractorInput.readFully(this.nalBuffer.data, i11, this.sampleCurrentNalBytesRemaining);
                        trackOutput.sampleData(this.nalBuffer, this.sampleCurrentNalBytesRemaining);
                        sampleData = this.sampleCurrentNalBytesRemaining;
                        ParsableByteArray parsableByteArray = this.nalBuffer;
                        int unescapeStream = NalUnitUtil.unescapeStream(parsableByteArray.data, parsableByteArray.limit());
                        this.nalBuffer.setPosition(MimeTypes.VIDEO_H265.equals(track.format.sampleMimeType) ? 1 : 0);
                        this.nalBuffer.setLimit(unescapeStream);
                        CeaUtil.consume(j8, this.nalBuffer, this.cea608TrackOutputs);
                    } else {
                        sampleData = trackOutput.sampleData(extractorInput, i20, false);
                    }
                    this.sampleBytesWritten += sampleData;
                    this.sampleCurrentNalBytesRemaining -= sampleData;
                    i9 = 4;
                    i10 = 1;
                    i11 = 0;
                }
            }
        }
        boolean z9 = trackFragment.sampleIsSyncFrameTable[i14];
        if (trackFragment.definesEncryptionData) {
            int i21 = (z9 ? 1 : 0) | 1073741824;
            TrackEncryptionBox trackEncryptionBox = trackFragment.trackEncryptionBox;
            if (trackEncryptionBox == null) {
                trackEncryptionBox = track.getSampleDescriptionEncryptionBox(trackFragment.header.sampleDescriptionIndex);
            }
            i8 = i21;
            cryptoData = trackEncryptionBox.cryptoData;
        } else {
            i8 = z9 ? 1 : 0;
            cryptoData = null;
        }
        trackOutput.sampleMetadata(j8, i8, this.sampleSize, 0, cryptoData);
        outputPendingMetadataSamples(j8);
        if (!this.currentTrackBundle.next()) {
            this.currentTrackBundle = null;
        }
        this.parserState = 3;
        return true;
    }

    private static boolean shouldParseContainerAtom(int i8) {
        if (i8 != Atom.TYPE_moov && i8 != Atom.TYPE_trak && i8 != Atom.TYPE_mdia && i8 != Atom.TYPE_minf && i8 != Atom.TYPE_stbl && i8 != Atom.TYPE_moof && i8 != Atom.TYPE_traf && i8 != Atom.TYPE_mvex && i8 != Atom.TYPE_edts) {
            return false;
        }
        return true;
    }

    private static boolean shouldParseLeafAtom(int i8) {
        if (i8 != Atom.TYPE_hdlr && i8 != Atom.TYPE_mdhd && i8 != Atom.TYPE_mvhd && i8 != Atom.TYPE_sidx && i8 != Atom.TYPE_stsd && i8 != Atom.TYPE_tfdt && i8 != Atom.TYPE_tfhd && i8 != Atom.TYPE_tkhd && i8 != Atom.TYPE_trex && i8 != Atom.TYPE_trun && i8 != Atom.TYPE_pssh && i8 != Atom.TYPE_saiz && i8 != Atom.TYPE_saio && i8 != Atom.TYPE_senc && i8 != Atom.TYPE_uuid && i8 != Atom.TYPE_sbgp && i8 != Atom.TYPE_sgpd && i8 != Atom.TYPE_elst && i8 != Atom.TYPE_mehd && i8 != Atom.TYPE_emsg) {
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        Track track = this.sideloadedTrack;
        if (track != null) {
            TrackBundle trackBundle = new TrackBundle(extractorOutput.track(0, track.type));
            trackBundle.init(this.sideloadedTrack, new DefaultSampleValues(0, 0, 0, 0));
            this.trackBundles.put(0, trackBundle);
            maybeInitExtraTracks();
            this.extractorOutput.endTracks();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        while (true) {
            int i8 = this.parserState;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (readSample(extractorInput)) {
                            return 0;
                        }
                    } else {
                        readEncryptionData(extractorInput);
                    }
                } else {
                    readAtomPayload(extractorInput);
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void seek(long j8, long j9) {
        int size = this.trackBundles.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.trackBundles.valueAt(i8).reset();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.pendingSeekTimeUs = j9;
        this.containerAtoms.clear();
        enterReadingAtomHeaderState();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return Sniffer.sniffFragmented(extractorInput);
    }

    public FragmentedMp4Extractor(int i8) {
        this(i8, null);
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, int i8, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(i8 + 8);
        int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        if ((parseFullAtomFlags & 1) == 0) {
            boolean z8 = (parseFullAtomFlags & 2) != 0;
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (readUnsignedIntToInt == trackFragment.sampleCount) {
                Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, z8);
                trackFragment.initEncryptionData(parsableByteArray.bytesLeft());
                trackFragment.fillEncryptionData(parsableByteArray);
                return;
            } else {
                throw new ParserException("Length mismatch: " + readUnsignedIntToInt + ", " + trackFragment.sampleCount);
            }
        }
        throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public FragmentedMp4Extractor(int i8, TimestampAdjuster timestampAdjuster) {
        this(i8, timestampAdjuster, null, null);
    }

    public FragmentedMp4Extractor(int i8, TimestampAdjuster timestampAdjuster, Track track, DrmInitData drmInitData) {
        this(i8, timestampAdjuster, track, drmInitData, Collections.emptyList());
    }

    public FragmentedMp4Extractor(int i8, TimestampAdjuster timestampAdjuster, Track track, DrmInitData drmInitData, List<Format> list) {
        this(i8, timestampAdjuster, track, drmInitData, list, null);
    }

    public FragmentedMp4Extractor(int i8, TimestampAdjuster timestampAdjuster, Track track, DrmInitData drmInitData, List<Format> list, TrackOutput trackOutput) {
        this.flags = i8 | (track != null ? 8 : 0);
        this.timestampAdjuster = timestampAdjuster;
        this.sideloadedTrack = track;
        this.sideloadedDrmInitData = drmInitData;
        this.closedCaptionFormats = DesugarCollections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(5);
        this.nalBuffer = new ParsableByteArray();
        this.extendedTypeScratch = new byte[16];
        this.containerAtoms = new ArrayDeque<>();
        this.pendingMetadataSampleInfos = new ArrayDeque<>();
        this.trackBundles = new SparseArray<>();
        this.durationUs = C.TIME_UNSET;
        this.pendingSeekTimeUs = C.TIME_UNSET;
        this.segmentIndexEarliestPresentationTimeUs = C.TIME_UNSET;
        enterReadingAtomHeaderState();
    }
}
