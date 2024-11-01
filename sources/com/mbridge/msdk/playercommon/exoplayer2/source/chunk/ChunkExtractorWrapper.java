package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.DummyTrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ChunkExtractorWrapper implements ExtractorOutput {
    private final SparseArray<BindingTrackOutput> bindingTrackOutputs = new SparseArray<>();
    public final Extractor extractor;
    private boolean extractorInitialized;
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private Format[] sampleFormats;
    private SeekMap seekMap;
    private TrackOutputProvider trackOutputProvider;

    /* loaded from: classes4.dex */
    private static final class BindingTrackOutput implements TrackOutput {
        private final int id;
        private final Format manifestFormat;
        public Format sampleFormat;
        private TrackOutput trackOutput;
        private final int type;

        public BindingTrackOutput(int i8, int i9, Format format) {
            this.id = i8;
            this.type = i9;
            this.manifestFormat = format;
        }

        public final void bind(TrackOutputProvider trackOutputProvider) {
            if (trackOutputProvider == null) {
                this.trackOutput = new DummyTrackOutput();
                return;
            }
            TrackOutput track = trackOutputProvider.track(this.id, this.type);
            this.trackOutput = track;
            Format format = this.sampleFormat;
            if (format != null) {
                track.format(format);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
        public final void format(Format format) {
            Format format2 = this.manifestFormat;
            if (format2 != null) {
                format = format.copyWithManifestFormatInfo(format2);
            }
            this.sampleFormat = format;
            this.trackOutput.format(format);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
        public final int sampleData(ExtractorInput extractorInput, int i8, boolean z8) throws IOException, InterruptedException {
            return this.trackOutput.sampleData(extractorInput, i8, z8);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
        public final void sampleMetadata(long j8, int i8, int i9, int i10, TrackOutput.CryptoData cryptoData) {
            this.trackOutput.sampleMetadata(j8, i8, i9, i10, cryptoData);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
        public final void sampleData(ParsableByteArray parsableByteArray, int i8) {
            this.trackOutput.sampleData(parsableByteArray, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface TrackOutputProvider {
        TrackOutput track(int i8, int i9);
    }

    public ChunkExtractorWrapper(Extractor extractor, int i8, Format format) {
        this.extractor = extractor;
        this.primaryTrackType = i8;
        this.primaryTrackManifestFormat = format;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput
    public final void endTracks() {
        Format[] formatArr = new Format[this.bindingTrackOutputs.size()];
        for (int i8 = 0; i8 < this.bindingTrackOutputs.size(); i8++) {
            formatArr[i8] = this.bindingTrackOutputs.valueAt(i8).sampleFormat;
        }
        this.sampleFormats = formatArr;
    }

    public final Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    public final SeekMap getSeekMap() {
        return this.seekMap;
    }

    public final void init(TrackOutputProvider trackOutputProvider, long j8) {
        this.trackOutputProvider = trackOutputProvider;
        if (!this.extractorInitialized) {
            this.extractor.init(this);
            if (j8 != C.TIME_UNSET) {
                this.extractor.seek(0L, j8);
            }
            this.extractorInitialized = true;
            return;
        }
        Extractor extractor = this.extractor;
        if (j8 == C.TIME_UNSET) {
            j8 = 0;
        }
        extractor.seek(0L, j8);
        for (int i8 = 0; i8 < this.bindingTrackOutputs.size(); i8++) {
            this.bindingTrackOutputs.valueAt(i8).bind(trackOutputProvider);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput
    public final void seekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput
    public final TrackOutput track(int i8, int i9) {
        boolean z8;
        Format format;
        BindingTrackOutput bindingTrackOutput = this.bindingTrackOutputs.get(i8);
        if (bindingTrackOutput == null) {
            if (this.sampleFormats == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkState(z8);
            if (i9 == this.primaryTrackType) {
                format = this.primaryTrackManifestFormat;
            } else {
                format = null;
            }
            bindingTrackOutput = new BindingTrackOutput(i8, i9, format);
            bindingTrackOutput.bind(this.trackOutputProvider);
            this.bindingTrackOutputs.put(i8, bindingTrackOutput);
        }
        return bindingTrackOutput;
    }
}
