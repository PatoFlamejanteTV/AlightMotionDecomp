package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.VorbisUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
final class VorbisReader extends StreamReader {
    private VorbisUtil.CommentHeader commentHeader;
    private int previousPacketBlockSize;
    private boolean seenFirstAudioPacket;
    private VorbisUtil.VorbisIdHeader vorbisIdHeader;
    private VorbisSetup vorbisSetup;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class VorbisSetup {
        public final VorbisUtil.CommentHeader commentHeader;
        public final int iLogModes;
        public final VorbisUtil.VorbisIdHeader idHeader;
        public final VorbisUtil.Mode[] modes;
        public final byte[] setupHeaderData;

        public VorbisSetup(VorbisUtil.VorbisIdHeader vorbisIdHeader, VorbisUtil.CommentHeader commentHeader, byte[] bArr, VorbisUtil.Mode[] modeArr, int i8) {
            this.idHeader = vorbisIdHeader;
            this.commentHeader = commentHeader;
            this.setupHeaderData = bArr;
            this.modes = modeArr;
            this.iLogModes = i8;
        }
    }

    static void appendNumberOfSamples(ParsableByteArray parsableByteArray, long j8) {
        parsableByteArray.setLimit(parsableByteArray.limit() + 4);
        parsableByteArray.data[parsableByteArray.limit() - 4] = (byte) (j8 & 255);
        parsableByteArray.data[parsableByteArray.limit() - 3] = (byte) ((j8 >>> 8) & 255);
        parsableByteArray.data[parsableByteArray.limit() - 2] = (byte) ((j8 >>> 16) & 255);
        parsableByteArray.data[parsableByteArray.limit() - 1] = (byte) ((j8 >>> 24) & 255);
    }

    private static int decodeBlockSize(byte b9, VorbisSetup vorbisSetup) {
        if (!vorbisSetup.modes[readBits(b9, vorbisSetup.iLogModes, 1)].blockFlag) {
            return vorbisSetup.idHeader.blockSize0;
        }
        return vorbisSetup.idHeader.blockSize1;
    }

    static int readBits(byte b9, int i8, int i9) {
        return (b9 >> i9) & (255 >>> (8 - i8));
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        try {
            return VorbisUtil.verifyVorbisHeaderCapturePattern(1, parsableByteArray, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    public final void onSeekEnd(long j8) {
        boolean z8;
        super.onSeekEnd(j8);
        int i8 = 0;
        if (j8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.seenFirstAudioPacket = z8;
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        if (vorbisIdHeader != null) {
            i8 = vorbisIdHeader.blockSize0;
        }
        this.previousPacketBlockSize = i8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    protected final long preparePayload(ParsableByteArray parsableByteArray) {
        int i8 = 0;
        byte b9 = parsableByteArray.data[0];
        if ((b9 & 1) == 1) {
            return -1L;
        }
        int decodeBlockSize = decodeBlockSize(b9, this.vorbisSetup);
        if (this.seenFirstAudioPacket) {
            i8 = (this.previousPacketBlockSize + decodeBlockSize) / 4;
        }
        long j8 = i8;
        appendNumberOfSamples(parsableByteArray, j8);
        this.seenFirstAudioPacket = true;
        this.previousPacketBlockSize = decodeBlockSize;
        return j8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    protected final boolean readHeaders(ParsableByteArray parsableByteArray, long j8, StreamReader.SetupData setupData) throws IOException, InterruptedException {
        if (this.vorbisSetup != null) {
            return false;
        }
        VorbisSetup readSetupHeaders = readSetupHeaders(parsableByteArray);
        this.vorbisSetup = readSetupHeaders;
        if (readSetupHeaders == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.vorbisSetup.idHeader.data);
        arrayList.add(this.vorbisSetup.setupHeaderData);
        VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisSetup.idHeader;
        setupData.format = Format.createAudioSampleFormat(null, MimeTypes.AUDIO_VORBIS, null, vorbisIdHeader.bitrateNominal, -1, vorbisIdHeader.channels, (int) vorbisIdHeader.sampleRate, arrayList, null, 0, null);
        return true;
    }

    final VorbisSetup readSetupHeaders(ParsableByteArray parsableByteArray) throws IOException {
        if (this.vorbisIdHeader == null) {
            this.vorbisIdHeader = VorbisUtil.readVorbisIdentificationHeader(parsableByteArray);
            return null;
        }
        if (this.commentHeader == null) {
            this.commentHeader = VorbisUtil.readVorbisCommentHeader(parsableByteArray);
            return null;
        }
        byte[] bArr = new byte[parsableByteArray.limit()];
        System.arraycopy(parsableByteArray.data, 0, bArr, 0, parsableByteArray.limit());
        return new VorbisSetup(this.vorbisIdHeader, this.commentHeader, bArr, VorbisUtil.readVorbisModes(parsableByteArray, this.vorbisIdHeader.channels), VorbisUtil.iLog(r5.length - 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    public final void reset(boolean z8) {
        super.reset(z8);
        if (z8) {
            this.vorbisSetup = null;
            this.vorbisIdHeader = null;
            this.commentHeader = null;
        }
        this.previousPacketBlockSize = 0;
        this.seenFirstAudioPacket = false;
    }
}
