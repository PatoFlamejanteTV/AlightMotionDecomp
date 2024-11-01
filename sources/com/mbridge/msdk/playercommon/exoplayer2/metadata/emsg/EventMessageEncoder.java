package com.mbridge.msdk.playercommon.exoplayer2.metadata.emsg;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class EventMessageEncoder {
    private final ByteArrayOutputStream byteArrayOutputStream;
    private final DataOutputStream dataOutputStream;

    public EventMessageEncoder() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.byteArrayOutputStream = byteArrayOutputStream;
        this.dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    }

    private static void writeNullTerminatedString(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    private static void writeUnsignedInt(DataOutputStream dataOutputStream, long j8) throws IOException {
        dataOutputStream.writeByte(((int) (j8 >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j8 >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j8 >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j8) & 255);
    }

    public final byte[] encode(EventMessage eventMessage, long j8) {
        boolean z8;
        if (j8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        this.byteArrayOutputStream.reset();
        try {
            writeNullTerminatedString(this.dataOutputStream, eventMessage.schemeIdUri);
            String str = eventMessage.value;
            if (str == null) {
                str = "";
            }
            writeNullTerminatedString(this.dataOutputStream, str);
            writeUnsignedInt(this.dataOutputStream, j8);
            writeUnsignedInt(this.dataOutputStream, Util.scaleLargeTimestamp(eventMessage.presentationTimeUs, j8, 1000000L));
            writeUnsignedInt(this.dataOutputStream, Util.scaleLargeTimestamp(eventMessage.durationMs, j8, 1000L));
            writeUnsignedInt(this.dataOutputStream, eventMessage.id);
            this.dataOutputStream.write(eventMessage.messageData);
            this.dataOutputStream.flush();
            return this.byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }
}
