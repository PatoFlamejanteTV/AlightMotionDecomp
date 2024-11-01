package com.mbridge.msdk.playercommon.exoplayer2.video;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.util.CodecSpecificDataUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class AvcConfig {
    public final int height;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthAspectRatio;
    public final int width;

    private AvcConfig(List<byte[]> list, int i8, int i9, int i10, float f8) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i8;
        this.width = i9;
        this.height = i10;
        this.pixelWidthAspectRatio = f8;
    }

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(readUnsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(parsableByteArray.data, position, readUnsignedShort);
    }

    public static AvcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        int i8;
        int i9;
        float f8;
        try {
            parsableByteArray.skipBytes(4);
            int readUnsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte != 3) {
                ArrayList arrayList = new ArrayList();
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
                for (int i10 = 0; i10 < readUnsignedByte2; i10++) {
                    arrayList.add(buildNalUnitForChild(parsableByteArray));
                }
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                for (int i11 = 0; i11 < readUnsignedByte3; i11++) {
                    arrayList.add(buildNalUnitForChild(parsableByteArray));
                }
                if (readUnsignedByte2 > 0) {
                    NalUnitUtil.SpsData parseSpsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), readUnsignedByte, ((byte[]) arrayList.get(0)).length);
                    int i12 = parseSpsNalUnit.width;
                    int i13 = parseSpsNalUnit.height;
                    f8 = parseSpsNalUnit.pixelWidthAspectRatio;
                    i8 = i12;
                    i9 = i13;
                } else {
                    i8 = -1;
                    i9 = -1;
                    f8 = 1.0f;
                }
                return new AvcConfig(arrayList, readUnsignedByte, i8, i9, f8);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw new ParserException("Error parsing AVC config", e8);
        }
    }
}
