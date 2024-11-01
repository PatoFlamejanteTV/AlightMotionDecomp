package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;

/* loaded from: classes4.dex */
public final class SpliceInfoSectionReader implements SectionPayloadReader {
    private boolean formatDeclared;
    private TrackOutput output;
    private TimestampAdjuster timestampAdjuster;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.SectionPayloadReader
    public final void consume(ParsableByteArray parsableByteArray) {
        if (!this.formatDeclared) {
            if (this.timestampAdjuster.getTimestampOffsetUs() == C.TIME_UNSET) {
                return;
            }
            this.output.format(Format.createSampleFormat(null, MimeTypes.APPLICATION_SCTE35, this.timestampAdjuster.getTimestampOffsetUs()));
            this.formatDeclared = true;
        }
        int bytesLeft = parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, bytesLeft);
        this.output.sampleMetadata(this.timestampAdjuster.getLastAdjustedTimestampUs(), 1, bytesLeft, 0, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.SectionPayloadReader
    public final void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        trackIdGenerator.generateNewId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 4);
        this.output = track;
        track.format(Format.createSampleFormat(trackIdGenerator.getFormatId(), MimeTypes.APPLICATION_SCTE35, null, -1, null));
    }
}
