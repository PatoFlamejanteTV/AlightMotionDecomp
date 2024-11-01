package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* loaded from: classes4.dex */
final class SeiReader {
    private final List<Format> closedCaptionFormats;
    private final TrackOutput[] outputs;

    public SeiReader(List<Format> list) {
        this.closedCaptionFormats = list;
        this.outputs = new TrackOutput[list.size()];
    }

    public final void consume(long j8, ParsableByteArray parsableByteArray) {
        CeaUtil.consume(j8, parsableByteArray, this.outputs);
    }

    public final void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        boolean z8;
        for (int i8 = 0; i8 < this.outputs.length; i8++) {
            trackIdGenerator.generateNewId();
            TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            Format format = this.closedCaptionFormats.get(i8);
            String str = format.sampleMimeType;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z8 = false;
            } else {
                z8 = true;
            }
            Assertions.checkArgument(z8, "Invalid closed caption mime type provided: " + str);
            String str2 = format.id;
            if (str2 == null) {
                str2 = trackIdGenerator.getFormatId();
            }
            track.format(Format.createTextSampleFormat(str2, str, (String) null, -1, format.selectionFlags, format.language, format.accessibilityChannel, (DrmInitData) null));
            this.outputs[i8] = track;
        }
    }
}
