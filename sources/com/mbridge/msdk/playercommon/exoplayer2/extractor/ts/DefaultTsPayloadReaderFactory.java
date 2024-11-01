package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {
    private static final int DESCRIPTOR_TAG_CAPTION_SERVICE = 134;
    public static final int FLAG_ALLOW_NON_IDR_KEYFRAMES = 1;
    public static final int FLAG_DETECT_ACCESS_UNITS = 8;
    public static final int FLAG_IGNORE_AAC_STREAM = 2;
    public static final int FLAG_IGNORE_H264_STREAM = 4;
    public static final int FLAG_IGNORE_SPLICE_INFO_STREAM = 16;
    public static final int FLAG_OVERRIDE_CAPTION_DESCRIPTORS = 32;
    private final List<Format> closedCaptionFormats;
    private final int flags;

    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    private SeiReader buildSeiReader(TsPayloadReader.EsInfo esInfo) {
        String str;
        int i8;
        if (isSet(32)) {
            return new SeiReader(this.closedCaptionFormats);
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.descriptorBytes);
        List<Format> list = this.closedCaptionFormats;
        while (parsableByteArray.bytesLeft() > 0) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
            if (readUnsignedByte == 134) {
                list = new ArrayList<>();
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
                for (int i9 = 0; i9 < readUnsignedByte2; i9++) {
                    String readString = parsableByteArray.readString(3);
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    if ((readUnsignedByte3 & 128) != 0) {
                        i8 = readUnsignedByte3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i8 = 1;
                    }
                    list.add(Format.createTextSampleFormat((String) null, str, (String) null, -1, 0, readString, i8, (DrmInitData) null));
                    parsableByteArray.skipBytes(2);
                }
            }
            parsableByteArray.setPosition(position);
        }
        return new SeiReader(list);
    }

    private boolean isSet(int i8) {
        if ((i8 & this.flags) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader.Factory
    public final SparseArray<TsPayloadReader> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader.Factory
    public final TsPayloadReader createPayloadReader(int i8, TsPayloadReader.EsInfo esInfo) {
        if (i8 != 2) {
            if (i8 != 3 && i8 != 4) {
                if (i8 != 15) {
                    if (i8 != 17) {
                        if (i8 != 21) {
                            if (i8 != 27) {
                                if (i8 != 36) {
                                    if (i8 != 89) {
                                        if (i8 != 138) {
                                            if (i8 != 129) {
                                                if (i8 != 130) {
                                                    if (i8 != 134) {
                                                        if (i8 != 135) {
                                                            return null;
                                                        }
                                                    } else {
                                                        if (isSet(16)) {
                                                            return null;
                                                        }
                                                        return new SectionReader(new SpliceInfoSectionReader());
                                                    }
                                                }
                                            }
                                            return new PesReader(new Ac3Reader(esInfo.language));
                                        }
                                        return new PesReader(new DtsReader(esInfo.language));
                                    }
                                    return new PesReader(new DvbSubtitleReader(esInfo.dvbSubtitleInfos));
                                }
                                return new PesReader(new H265Reader(buildSeiReader(esInfo)));
                            }
                            if (isSet(4)) {
                                return null;
                            }
                            return new PesReader(new H264Reader(buildSeiReader(esInfo), isSet(1), isSet(8)));
                        }
                        return new PesReader(new Id3Reader());
                    }
                    if (isSet(2)) {
                        return null;
                    }
                    return new PesReader(new LatmReader(esInfo.language));
                }
                if (isSet(2)) {
                    return null;
                }
                return new PesReader(new AdtsReader(false, esInfo.language));
            }
            return new PesReader(new MpegAudioReader(esInfo.language));
        }
        return new PesReader(new H262Reader());
    }

    public DefaultTsPayloadReaderFactory(int i8) {
        this(i8, Collections.emptyList());
    }

    public DefaultTsPayloadReaderFactory(int i8, List<Format> list) {
        this.flags = i8;
        if (!isSet(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.createTextSampleFormat(null, MimeTypes.APPLICATION_CEA608, 0, null));
        }
        this.closedCaptionFormats = list;
    }
}
