package com.mbridge.msdk.playercommon.exoplayer2.metadata;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35.SpliceInfoDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes4.dex */
public interface MetadataDecoderFactory {
    public static final MetadataDecoderFactory DEFAULT = new MetadataDecoderFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoderFactory.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoderFactory
        public MetadataDecoder createDecoder(Format format) {
            String str = format.sampleMimeType;
            str.hashCode();
            char c8 = 65535;
            switch (str.hashCode()) {
                case -1248341703:
                    if (str.equals(MimeTypes.APPLICATION_ID3)) {
                        c8 = 0;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals(MimeTypes.APPLICATION_EMSG)) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals(MimeTypes.APPLICATION_SCTE35)) {
                        c8 = 2;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    return new Id3Decoder();
                case 1:
                    return new EventMessageDecoder();
                case 2:
                    return new SpliceInfoDecoder();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            if (!MimeTypes.APPLICATION_ID3.equals(str) && !MimeTypes.APPLICATION_EMSG.equals(str) && !MimeTypes.APPLICATION_SCTE35.equals(str)) {
                return false;
            }
            return true;
        }
    };

    MetadataDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
