package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class DvbSubtitleReader implements ElementaryStreamReader {
    private int bytesToCheck;
    private final TrackOutput[] outputs;
    private int sampleBytesWritten;
    private long sampleTimeUs;
    private final List<TsPayloadReader.DvbSubtitleInfo> subtitleInfos;
    private boolean writingSample;

    public DvbSubtitleReader(List<TsPayloadReader.DvbSubtitleInfo> list) {
        this.subtitleInfos = list;
        this.outputs = new TrackOutput[list.size()];
    }

    private boolean checkNextByte(ParsableByteArray parsableByteArray, int i8) {
        if (parsableByteArray.bytesLeft() == 0) {
            return false;
        }
        if (parsableByteArray.readUnsignedByte() != i8) {
            this.writingSample = false;
        }
        this.bytesToCheck--;
        return this.writingSample;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) {
        if (this.writingSample) {
            if (this.bytesToCheck == 2 && !checkNextByte(parsableByteArray, 32)) {
                return;
            }
            if (this.bytesToCheck == 1 && !checkNextByte(parsableByteArray, 0)) {
                return;
            }
            int position = parsableByteArray.getPosition();
            int bytesLeft = parsableByteArray.bytesLeft();
            for (TrackOutput trackOutput : this.outputs) {
                parsableByteArray.setPosition(position);
                trackOutput.sampleData(parsableByteArray, bytesLeft);
            }
            this.sampleBytesWritten += bytesLeft;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i8 = 0; i8 < this.outputs.length; i8++) {
            TsPayloadReader.DvbSubtitleInfo dvbSubtitleInfo = this.subtitleInfos.get(i8);
            trackIdGenerator.generateNewId();
            TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            track.format(Format.createImageSampleFormat(trackIdGenerator.getFormatId(), MimeTypes.APPLICATION_DVBSUBS, null, -1, 0, Collections.singletonList(dvbSubtitleInfo.initializationData), dvbSubtitleInfo.language, null));
            this.outputs[i8] = track;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
        if (this.writingSample) {
            for (TrackOutput trackOutput : this.outputs) {
                trackOutput.sampleMetadata(this.sampleTimeUs, 1, this.sampleBytesWritten, 0, null);
            }
            this.writingSample = false;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetStarted(long j8, boolean z8) {
        if (!z8) {
            return;
        }
        this.writingSample = true;
        this.sampleTimeUs = j8;
        this.sampleBytesWritten = 0;
        this.bytesToCheck = 2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.writingSample = false;
    }
}
