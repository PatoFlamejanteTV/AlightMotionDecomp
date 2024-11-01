package com.mbridge.msdk.playercommon.exoplayer2.text.cea;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class CeaUtil {
    private static final int COUNTRY_CODE = 181;
    private static final int PAYLOAD_TYPE_CC = 4;
    private static final int PROVIDER_CODE_ATSC = 49;
    private static final int PROVIDER_CODE_DIRECTV = 47;
    private static final String TAG = "CeaUtil";
    private static final int USER_DATA_TYPE_CODE = 3;
    private static final int USER_ID_GA94 = Util.getIntegerCodeForString("GA94");
    private static final int USER_ID_DTG1 = Util.getIntegerCodeForString("DTG1");

    private CeaUtil() {
    }

    public static void consume(long j8, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int i8;
        boolean z8;
        boolean z9;
        while (parsableByteArray.bytesLeft() > 1) {
            int readNon255TerminatedValue = readNon255TerminatedValue(parsableByteArray);
            int readNon255TerminatedValue2 = readNon255TerminatedValue(parsableByteArray);
            int position = parsableByteArray.getPosition() + readNon255TerminatedValue2;
            if (readNon255TerminatedValue2 != -1 && readNon255TerminatedValue2 <= parsableByteArray.bytesLeft()) {
                if (readNon255TerminatedValue == 4 && readNon255TerminatedValue2 >= 8) {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    int readUnsignedShort = parsableByteArray.readUnsignedShort();
                    if (readUnsignedShort == 49) {
                        i8 = parsableByteArray.readInt();
                    } else {
                        i8 = 0;
                    }
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (readUnsignedShort == 47) {
                        parsableByteArray.skipBytes(1);
                    }
                    if (readUnsignedByte == COUNTRY_CODE && ((readUnsignedShort == 49 || readUnsignedShort == 47) && readUnsignedByte2 == 3)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (readUnsignedShort == 49) {
                        if (i8 != USER_ID_GA94 && i8 != USER_ID_DTG1) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        z8 &= z9;
                    }
                    if (z8) {
                        int readUnsignedByte3 = parsableByteArray.readUnsignedByte() & 31;
                        parsableByteArray.skipBytes(1);
                        int i9 = readUnsignedByte3 * 3;
                        int position2 = parsableByteArray.getPosition();
                        for (TrackOutput trackOutput : trackOutputArr) {
                            parsableByteArray.setPosition(position2);
                            trackOutput.sampleData(parsableByteArray, i9);
                            trackOutput.sampleMetadata(j8, 1, i9, 0, null);
                        }
                    }
                }
            } else {
                Log.w(TAG, "Skipping remainder of malformed SEI NAL unit.");
                position = parsableByteArray.limit();
            }
            parsableByteArray.setPosition(position);
        }
    }

    private static int readNon255TerminatedValue(ParsableByteArray parsableByteArray) {
        int i8 = 0;
        while (parsableByteArray.bytesLeft() != 0) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            i8 += readUnsignedByte;
            if (readUnsignedByte != 255) {
                return i8;
            }
        }
        return -1;
    }
}
