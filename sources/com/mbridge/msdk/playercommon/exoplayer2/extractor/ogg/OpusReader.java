package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
final class OpusReader extends StreamReader {
    private static final int DEFAULT_SEEK_PRE_ROLL_SAMPLES = 3840;
    private static final int OPUS_CODE = Util.getIntegerCodeForString("Opus");
    private static final byte[] OPUS_SIGNATURE = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final int SAMPLE_RATE = 48000;
    private boolean headerRead;

    private long getPacketDurationUs(byte[] bArr) {
        int i8;
        int i9;
        byte b9 = bArr[0];
        int i10 = b9 & 255;
        int i11 = b9 & 3;
        if (i11 != 0) {
            i8 = 2;
            if (i11 != 1 && i11 != 2) {
                i8 = bArr[1] & 63;
            }
        } else {
            i8 = 1;
        }
        int i12 = i10 >> 3;
        int i13 = i12 & 3;
        if (i12 >= 16) {
            i9 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << i13;
        } else if (i12 >= 12) {
            i9 = 10000 << (i12 & 1);
        } else if (i13 == 3) {
            i9 = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        } else {
            i9 = 10000 << i13;
        }
        return i8 * i9;
    }

    private void putNativeOrderLong(List<byte[]> list, int i8) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i8 * C.NANOS_PER_SECOND) / 48000).array());
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        int bytesLeft = parsableByteArray.bytesLeft();
        byte[] bArr = OPUS_SIGNATURE;
        if (bytesLeft < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        parsableByteArray.readBytes(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    protected final long preparePayload(ParsableByteArray parsableByteArray) {
        return convertTimeToGranule(getPacketDurationUs(parsableByteArray.data));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    protected final boolean readHeaders(ParsableByteArray parsableByteArray, long j8, StreamReader.SetupData setupData) throws IOException, InterruptedException {
        boolean z8 = true;
        if (!this.headerRead) {
            byte[] copyOf = Arrays.copyOf(parsableByteArray.data, parsableByteArray.limit());
            int i8 = copyOf[9] & 255;
            int i9 = ((copyOf[11] & 255) << 8) | (copyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            putNativeOrderLong(arrayList, i9);
            putNativeOrderLong(arrayList, DEFAULT_SEEK_PRE_ROLL_SAMPLES);
            setupData.format = Format.createAudioSampleFormat(null, MimeTypes.AUDIO_OPUS, null, -1, -1, i8, SAMPLE_RATE, arrayList, null, 0, null);
            this.headerRead = true;
            return true;
        }
        if (parsableByteArray.readInt() != OPUS_CODE) {
            z8 = false;
        }
        parsableByteArray.setPosition(0);
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    public final void reset(boolean z8) {
        super.reset(z8);
        if (z8) {
            this.headerRead = false;
        }
    }
}
