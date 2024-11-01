package com.mbridge.msdk.playercommon.exoplayer2.video;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class HevcConfig {
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;

    private HevcConfig(List<byte[]> list, int i8) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i8;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        List singletonList;
        try {
            parsableByteArray.skipBytes(21);
            int readUnsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i8 = 0;
            for (int i9 = 0; i9 < readUnsignedByte2; i9++) {
                parsableByteArray.skipBytes(1);
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                for (int i10 = 0; i10 < readUnsignedShort; i10++) {
                    int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                    i8 += readUnsignedShort2 + 4;
                    parsableByteArray.skipBytes(readUnsignedShort2);
                }
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i8];
            int i11 = 0;
            for (int i12 = 0; i12 < readUnsignedByte2; i12++) {
                parsableByteArray.skipBytes(1);
                int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                for (int i13 = 0; i13 < readUnsignedShort3; i13++) {
                    int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                    int length = i11 + bArr2.length;
                    System.arraycopy(parsableByteArray.data, parsableByteArray.getPosition(), bArr, length, readUnsignedShort4);
                    i11 = length + readUnsignedShort4;
                    parsableByteArray.skipBytes(readUnsignedShort4);
                }
            }
            if (i8 == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new HevcConfig(singletonList, readUnsignedByte + 1);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw new ParserException("Error parsing HEVC config", e8);
        }
    }
}
