package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Mp4Extractor implements Extractor, SeekMap {
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private long[][] accumulatedSampleSizes;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
    private long durationUs;
    private ExtractorOutput extractorOutput;
    private int firstVideoTrackIndex;
    private final int flags;
    private boolean isQuickTime;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleTrackIndex;
    private Mp4Track[] tracks;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Mp4Extractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new Mp4Extractor()};
        }
    };
    private static final int BRAND_QUICKTIME = Util.getIntegerCodeForString("qt  ");

    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Mp4Track {
        public int sampleIndex;
        public final TrackSampleTable sampleTable;
        public final Track track;
        public final TrackOutput trackOutput;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
        }
    }

    /* loaded from: classes4.dex */
    private @interface State {
    }

    public Mp4Extractor() {
        this(0);
    }

    private static long[][] calculateAccumulatedSampleSizes(Mp4Track[] mp4TrackArr) {
        long[][] jArr = new long[mp4TrackArr.length];
        int[] iArr = new int[mp4TrackArr.length];
        long[] jArr2 = new long[mp4TrackArr.length];
        boolean[] zArr = new boolean[mp4TrackArr.length];
        for (int i8 = 0; i8 < mp4TrackArr.length; i8++) {
            jArr[i8] = new long[mp4TrackArr[i8].sampleTable.sampleCount];
            jArr2[i8] = mp4TrackArr[i8].sampleTable.timestampsUs[0];
        }
        long j8 = 0;
        int i9 = 0;
        while (i9 < mp4TrackArr.length) {
            long j9 = Long.MAX_VALUE;
            int i10 = -1;
            for (int i11 = 0; i11 < mp4TrackArr.length; i11++) {
                if (!zArr[i11]) {
                    long j10 = jArr2[i11];
                    if (j10 <= j9) {
                        i10 = i11;
                        j9 = j10;
                    }
                }
            }
            int i12 = iArr[i10];
            long[] jArr3 = jArr[i10];
            jArr3[i12] = j8;
            TrackSampleTable trackSampleTable = mp4TrackArr[i10].sampleTable;
            j8 += trackSampleTable.sizes[i12];
            int i13 = i12 + 1;
            iArr[i10] = i13;
            if (i13 < jArr3.length) {
                jArr2[i10] = trackSampleTable.timestampsUs[i13];
            } else {
                zArr[i10] = true;
                i9++;
            }
        }
        return jArr;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private static int getSynchronizationSampleIndex(TrackSampleTable trackSampleTable, long j8) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j8);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            return trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j8);
        }
        return indexOfEarlierOrEqualSynchronizationSample;
    }

    private int getTrackIndexOfNextReadSample(long j8) {
        boolean z8;
        int i8 = -1;
        int i9 = -1;
        int i10 = 0;
        long j9 = Long.MAX_VALUE;
        boolean z9 = true;
        long j10 = Long.MAX_VALUE;
        boolean z10 = true;
        long j11 = Long.MAX_VALUE;
        while (true) {
            Mp4Track[] mp4TrackArr = this.tracks;
            if (i10 >= mp4TrackArr.length) {
                break;
            }
            Mp4Track mp4Track = mp4TrackArr[i10];
            int i11 = mp4Track.sampleIndex;
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            if (i11 != trackSampleTable.sampleCount) {
                long j12 = trackSampleTable.offsets[i11];
                long j13 = this.accumulatedSampleSizes[i10][i11];
                long j14 = j12 - j8;
                if (j14 >= 0 && j14 < RELOAD_MINIMUM_SEEK_DISTANCE) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if ((!z8 && z10) || (z8 == z10 && j14 < j11)) {
                    z10 = z8;
                    j11 = j14;
                    i9 = i10;
                    j10 = j13;
                }
                if (j13 < j9) {
                    z9 = z8;
                    i8 = i10;
                    j9 = j13;
                }
            }
            i10++;
        }
        if (j9 == Long.MAX_VALUE || !z9 || j10 < j9 + MAXIMUM_READ_AHEAD_BYTES_STREAM) {
            return i9;
        }
        return i8;
    }

    private ArrayList<TrackSampleTable> getTrackSampleTables(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, boolean z8) throws ParserException {
        Track parseTrak;
        ArrayList<TrackSampleTable> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < containerAtom.containerChildren.size(); i8++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i8);
            if (containerAtom2.type == Atom.TYPE_trak && (parseTrak = AtomParsers.parseTrak(containerAtom2, containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd), C.TIME_UNSET, null, z8, this.isQuickTime)) != null) {
                TrackSampleTable parseStbl = AtomParsers.parseStbl(parseTrak, containerAtom2.getContainerAtomOfType(Atom.TYPE_mdia).getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl), gaplessInfoHolder);
                if (parseStbl.sampleCount != 0) {
                    arrayList.add(parseStbl);
                }
            }
        }
        return arrayList;
    }

    private static long maybeAdjustSeekOffset(TrackSampleTable trackSampleTable, long j8, long j9) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j8);
        if (synchronizationSampleIndex == -1) {
            return j9;
        }
        return Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j9);
    }

    private void processAtomEnded(long j8) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j8) {
            Atom.ContainerAtom pop = this.containerAtoms.pop();
            if (pop.type == Atom.TYPE_moov) {
                processMoovAtom(pop);
                this.containerAtoms.clear();
                this.parserState = 2;
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(pop);
            }
        }
        if (this.parserState != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private static boolean processFtypAtom(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        if (parsableByteArray.readInt() == BRAND_QUICKTIME) {
            return true;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            if (parsableByteArray.readInt() == BRAND_QUICKTIME) {
                return true;
            }
        }
        return false;
    }

    private void processMoovAtom(Atom.ContainerAtom containerAtom) throws ParserException {
        Metadata metadata;
        boolean z8;
        ArrayList<TrackSampleTable> trackSampleTables;
        ArrayList arrayList = new ArrayList();
        GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_udta);
        if (leafAtomOfType != null) {
            metadata = AtomParsers.parseUdta(leafAtomOfType, this.isQuickTime);
            if (metadata != null) {
                gaplessInfoHolder.setFromMetadata(metadata);
            }
        } else {
            metadata = null;
        }
        int i8 = 1;
        int i9 = 0;
        if ((this.flags & 1) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        try {
            trackSampleTables = getTrackSampleTables(containerAtom, gaplessInfoHolder, z8);
        } catch (AtomParsers.UnhandledEditListException unused) {
            gaplessInfoHolder = new GaplessInfoHolder();
            trackSampleTables = getTrackSampleTables(containerAtom, gaplessInfoHolder, true);
        }
        int size = trackSampleTables.size();
        int i10 = -1;
        long j8 = C.TIME_UNSET;
        while (i9 < size) {
            TrackSampleTable trackSampleTable = trackSampleTables.get(i9);
            Track track = trackSampleTable.track;
            Mp4Track mp4Track = new Mp4Track(track, trackSampleTable, this.extractorOutput.track(i9, track.type));
            Format copyWithMaxInputSize = track.format.copyWithMaxInputSize(trackSampleTable.maximumSize + 30);
            if (track.type == i8) {
                if (gaplessInfoHolder.hasGaplessInfo()) {
                    copyWithMaxInputSize = copyWithMaxInputSize.copyWithGaplessInfo(gaplessInfoHolder.encoderDelay, gaplessInfoHolder.encoderPadding);
                }
                if (metadata != null) {
                    copyWithMaxInputSize = copyWithMaxInputSize.copyWithMetadata(metadata);
                }
            }
            mp4Track.trackOutput.format(copyWithMaxInputSize);
            long j9 = track.durationUs;
            if (j9 == C.TIME_UNSET) {
                j9 = trackSampleTable.durationUs;
            }
            j8 = Math.max(j8, j9);
            if (track.type == 2 && i10 == -1) {
                i10 = arrayList.size();
            }
            arrayList.add(mp4Track);
            i9++;
            i8 = 1;
        }
        this.firstVideoTrackIndex = i10;
        this.durationUs = j8;
        Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList.toArray(new Mp4Track[arrayList.size()]);
        this.tracks = mp4TrackArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(mp4TrackArr);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(this);
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException, InterruptedException {
        boolean z8;
        boolean z9;
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
            if (shouldParseContainerAtom(this.atomType)) {
                long position = (extractorInput.getPosition() + this.atomSize) - this.atomHeaderBytesRead;
                this.containerAtoms.push(new Atom.ContainerAtom(this.atomType, position));
                if (this.atomSize == this.atomHeaderBytesRead) {
                    processAtomEnded(position);
                } else {
                    enterReadingAtomHeaderState();
                }
            } else if (shouldParseLeafAtom(this.atomType)) {
                if (this.atomHeaderBytesRead == 8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Assertions.checkState(z8);
                if (this.atomSize <= 2147483647L) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Assertions.checkState(z9);
                ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
                this.atomData = parsableByteArray;
                System.arraycopy(this.atomHeader.data, 0, parsableByteArray.data, 0, 8);
                this.parserState = 1;
            } else {
                this.atomData = null;
                this.parserState = 1;
            }
            return true;
        }
        throw new ParserException("Atom size less than header length (unsupported).");
    }

    private boolean readAtomPayload(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        boolean z8;
        long j8 = this.atomSize - this.atomHeaderBytesRead;
        long position = extractorInput.getPosition() + j8;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.data, this.atomHeaderBytesRead, (int) j8);
            if (this.atomType == Atom.TYPE_ftyp) {
                this.isQuickTime = processFtypAtom(this.atomData);
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(new Atom.LeafAtom(this.atomType, this.atomData));
            }
        } else if (j8 < RELOAD_MINIMUM_SEEK_DISTANCE) {
            extractorInput.skipFully((int) j8);
        } else {
            positionHolder.position = extractorInput.getPosition() + j8;
            z8 = true;
            processAtomEnded(position);
            if (!z8 && this.parserState != 2) {
                return true;
            }
            return false;
        }
        z8 = false;
        processAtomEnded(position);
        if (!z8) {
        }
        return false;
    }

    private int readSample(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        long position = extractorInput.getPosition();
        if (this.sampleTrackIndex == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        Mp4Track mp4Track = this.tracks[this.sampleTrackIndex];
        TrackOutput trackOutput = mp4Track.trackOutput;
        int i8 = mp4Track.sampleIndex;
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        long j8 = trackSampleTable.offsets[i8];
        int i9 = trackSampleTable.sizes[i8];
        long j9 = (j8 - position) + this.sampleBytesWritten;
        if (j9 >= 0 && j9 < RELOAD_MINIMUM_SEEK_DISTANCE) {
            if (mp4Track.track.sampleTransformation == 1) {
                j9 += 8;
                i9 -= 8;
            }
            extractorInput.skipFully((int) j9);
            int i10 = mp4Track.track.nalUnitLengthFieldLength;
            if (i10 == 0) {
                while (true) {
                    int i11 = this.sampleBytesWritten;
                    if (i11 >= i9) {
                        break;
                    }
                    int sampleData = trackOutput.sampleData(extractorInput, i9 - i11, false);
                    this.sampleBytesWritten += sampleData;
                    this.sampleCurrentNalBytesRemaining -= sampleData;
                }
            } else {
                byte[] bArr = this.nalLength.data;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                int i12 = 4 - i10;
                while (this.sampleBytesWritten < i9) {
                    int i13 = this.sampleCurrentNalBytesRemaining;
                    if (i13 == 0) {
                        extractorInput.readFully(this.nalLength.data, i12, i10);
                        this.nalLength.setPosition(0);
                        this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                        this.nalStartCode.setPosition(0);
                        trackOutput.sampleData(this.nalStartCode, 4);
                        this.sampleBytesWritten += 4;
                        i9 += i12;
                    } else {
                        int sampleData2 = trackOutput.sampleData(extractorInput, i13, false);
                        this.sampleBytesWritten += sampleData2;
                        this.sampleCurrentNalBytesRemaining -= sampleData2;
                    }
                }
            }
            int i14 = i9;
            TrackSampleTable trackSampleTable2 = mp4Track.sampleTable;
            trackOutput.sampleMetadata(trackSampleTable2.timestampsUs[i8], trackSampleTable2.flags[i8], i14, 0, null);
            mp4Track.sampleIndex++;
            this.sampleTrackIndex = -1;
            this.sampleBytesWritten = 0;
            this.sampleCurrentNalBytesRemaining = 0;
            return 0;
        }
        positionHolder.position = j8;
        return 1;
    }

    private static boolean shouldParseContainerAtom(int i8) {
        if (i8 != Atom.TYPE_moov && i8 != Atom.TYPE_trak && i8 != Atom.TYPE_mdia && i8 != Atom.TYPE_minf && i8 != Atom.TYPE_stbl && i8 != Atom.TYPE_edts) {
            return false;
        }
        return true;
    }

    private static boolean shouldParseLeafAtom(int i8) {
        if (i8 != Atom.TYPE_mdhd && i8 != Atom.TYPE_mvhd && i8 != Atom.TYPE_hdlr && i8 != Atom.TYPE_stsd && i8 != Atom.TYPE_stts && i8 != Atom.TYPE_stss && i8 != Atom.TYPE_ctts && i8 != Atom.TYPE_elst && i8 != Atom.TYPE_stsc && i8 != Atom.TYPE_stsz && i8 != Atom.TYPE_stz2 && i8 != Atom.TYPE_stco && i8 != Atom.TYPE_co64 && i8 != Atom.TYPE_tkhd && i8 != Atom.TYPE_ftyp && i8 != Atom.TYPE_udta) {
            return false;
        }
        return true;
    }

    private void updateSampleIndices(long j8) {
        for (Mp4Track mp4Track : this.tracks) {
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j8);
            if (indexOfEarlierOrEqualSynchronizationSample == -1) {
                indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j8);
            }
            mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j8) {
        long j9;
        long j10;
        int indexOfLaterOrEqualSynchronizationSample;
        Mp4Track[] mp4TrackArr = this.tracks;
        if (mp4TrackArr.length == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int i8 = this.firstVideoTrackIndex;
        long j11 = -1;
        if (i8 != -1) {
            TrackSampleTable trackSampleTable = mp4TrackArr[i8].sampleTable;
            int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j8);
            if (synchronizationSampleIndex == -1) {
                return new SeekMap.SeekPoints(SeekPoint.START);
            }
            long j12 = trackSampleTable.timestampsUs[synchronizationSampleIndex];
            j9 = trackSampleTable.offsets[synchronizationSampleIndex];
            if (j12 < j8 && synchronizationSampleIndex < trackSampleTable.sampleCount - 1 && (indexOfLaterOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j8)) != -1 && indexOfLaterOrEqualSynchronizationSample != synchronizationSampleIndex) {
                j10 = trackSampleTable.timestampsUs[indexOfLaterOrEqualSynchronizationSample];
                j11 = trackSampleTable.offsets[indexOfLaterOrEqualSynchronizationSample];
            } else {
                j10 = -9223372036854775807L;
            }
            j8 = j12;
        } else {
            j9 = Long.MAX_VALUE;
            j10 = -9223372036854775807L;
        }
        int i9 = 0;
        while (true) {
            Mp4Track[] mp4TrackArr2 = this.tracks;
            if (i9 >= mp4TrackArr2.length) {
                break;
            }
            if (i9 != this.firstVideoTrackIndex) {
                TrackSampleTable trackSampleTable2 = mp4TrackArr2[i9].sampleTable;
                long maybeAdjustSeekOffset = maybeAdjustSeekOffset(trackSampleTable2, j8, j9);
                if (j10 != C.TIME_UNSET) {
                    j11 = maybeAdjustSeekOffset(trackSampleTable2, j10, j11);
                }
                j9 = maybeAdjustSeekOffset;
            }
            i9++;
        }
        SeekPoint seekPoint = new SeekPoint(j8, j9);
        if (j10 == C.TIME_UNSET) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(j10, j11));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        while (true) {
            int i8 = this.parserState;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    throw new IllegalStateException();
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
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
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        if (j8 == 0) {
            enterReadingAtomHeaderState();
        } else if (this.tracks != null) {
            updateSampleIndices(j9);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return Sniffer.sniffUnfragmented(extractorInput);
    }

    public Mp4Extractor(int i8) {
        this.flags = i8;
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleTrackIndex = -1;
    }
}
