package com.mbridge.msdk.playercommon.exoplayer2.text;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.text.cea.Cea608Decoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.cea.Cea708Decoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.dvb.DvbDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.pgs.PgsDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.ssa.SsaDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.subrip.SubripDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.tx3g.Tx3gDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.webvtt.Mp4WebvttDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.webvtt.WebvttDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes4.dex */
public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory DEFAULT = new SubtitleDecoderFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderFactory.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderFactory
        public SubtitleDecoder createDecoder(Format format) {
            String str = format.sampleMimeType;
            str.hashCode();
            char c8 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals(MimeTypes.APPLICATION_PGS)) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals(MimeTypes.TEXT_VTT)) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals(MimeTypes.TEXT_SSA)) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 930165504:
                    if (str.equals(MimeTypes.APPLICATION_MP4CEA608)) {
                        c8 = 6;
                        break;
                    }
                    break;
                case 1566015601:
                    if (str.equals(MimeTypes.APPLICATION_CEA608)) {
                        c8 = 7;
                        break;
                    }
                    break;
                case 1566016562:
                    if (str.equals(MimeTypes.APPLICATION_CEA708)) {
                        c8 = '\b';
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                        c8 = '\t';
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals(MimeTypes.APPLICATION_TTML)) {
                        c8 = '\n';
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    return new DvbDecoder(format.initializationData);
                case 1:
                    return new PgsDecoder();
                case 2:
                    return new Mp4WebvttDecoder();
                case 3:
                    return new WebvttDecoder();
                case 4:
                    return new Tx3gDecoder(format.initializationData);
                case 5:
                    return new SsaDecoder(format.initializationData);
                case 6:
                case 7:
                    return new Cea608Decoder(format.sampleMimeType, format.accessibilityChannel);
                case '\b':
                    return new Cea708Decoder(format.accessibilityChannel);
                case '\t':
                    return new SubripDecoder();
                case '\n':
                    return new TtmlDecoder();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            if (!MimeTypes.TEXT_VTT.equals(str) && !MimeTypes.TEXT_SSA.equals(str) && !MimeTypes.APPLICATION_TTML.equals(str) && !MimeTypes.APPLICATION_MP4VTT.equals(str) && !MimeTypes.APPLICATION_SUBRIP.equals(str) && !MimeTypes.APPLICATION_TX3G.equals(str) && !MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_MP4CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str) && !MimeTypes.APPLICATION_DVBSUBS.equals(str) && !MimeTypes.APPLICATION_PGS.equals(str)) {
                return false;
            }
            return true;
        }
    };

    SubtitleDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
