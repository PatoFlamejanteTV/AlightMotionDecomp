package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class Id3Decoder implements MetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    private static final String TAG = "Id3Decoder";
    private final FramePredicate framePredicate;
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public boolean evaluate(int i8, int i9, int i10, int i11, int i12) {
            return false;
        }
    };
    public static final int ID3_TAG = Util.getIntegerCodeForString("ID3");

    /* loaded from: classes4.dex */
    public interface FramePredicate {
        boolean evaluate(int i8, int i9, int i10, int i11, int i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i8, boolean z8, int i9) {
            this.majorVersion = i8;
            this.isUnsynchronized = z8;
            this.framesSize = i9;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i8, int i9) {
        if (i9 <= i8) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i8, i9);
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i8, int i9) throws UnsupportedEncodingException {
        int indexOfZeroByte;
        String lowerInvariant;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        int i10 = i8 - 1;
        byte[] bArr = new byte[i10];
        parsableByteArray.readBytes(bArr, 0, i10);
        if (i9 == 2) {
            lowerInvariant = "image/" + Util.toLowerInvariant(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(lowerInvariant)) {
                lowerInvariant = "image/jpeg";
            }
            indexOfZeroByte = 2;
        } else {
            indexOfZeroByte = indexOfZeroByte(bArr, 0);
            lowerInvariant = Util.toLowerInvariant(new String(bArr, 0, indexOfZeroByte, "ISO-8859-1"));
            if (lowerInvariant.indexOf(47) == -1) {
                lowerInvariant = "image/" + lowerInvariant;
            }
        }
        int i11 = bArr[indexOfZeroByte + 1] & 255;
        int i12 = indexOfZeroByte + 2;
        int indexOfEos = indexOfEos(bArr, i12, readUnsignedByte);
        return new ApicFrame(lowerInvariant, new String(bArr, i12, indexOfEos - i12, charsetName), i11, copyOfRangeIfValid(bArr, indexOfEos + delimiterLength(readUnsignedByte), i10));
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i8, String str) {
        byte[] bArr = new byte[i8];
        parsableByteArray.readBytes(bArr, 0, i8);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i8, int i9, boolean z8, int i10, FramePredicate framePredicate) throws UnsupportedEncodingException {
        long j8;
        long j9;
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray.data, position);
        String str = new String(parsableByteArray.data, position, indexOfZeroByte - position, "ISO-8859-1");
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (readUnsignedInt == 4294967295L) {
            j8 = -1;
        } else {
            j8 = readUnsignedInt;
        }
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        if (readUnsignedInt2 == 4294967295L) {
            j9 = -1;
        } else {
            j9 = readUnsignedInt2;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = position + i8;
        while (parsableByteArray.getPosition() < i11) {
            Id3Frame decodeFrame = decodeFrame(i9, parsableByteArray, z8, i10, framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, readInt, readInt2, j8, j9, id3FrameArr);
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i8, int i9, boolean z8, int i10, FramePredicate framePredicate) throws UnsupportedEncodingException {
        boolean z9;
        boolean z10;
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray.data, position);
        String str = new String(parsableByteArray.data, position, indexOfZeroByte - position, "ISO-8859-1");
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((readUnsignedByte & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[readUnsignedByte2];
        for (int i11 = 0; i11 < readUnsignedByte2; i11++) {
            int position2 = parsableByteArray.getPosition();
            int indexOfZeroByte2 = indexOfZeroByte(parsableByteArray.data, position2);
            strArr[i11] = new String(parsableByteArray.data, position2, indexOfZeroByte2 - position2, "ISO-8859-1");
            parsableByteArray.setPosition(indexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i12 = position + i8;
        while (parsableByteArray.getPosition() < i12) {
            Id3Frame decodeFrame = decodeFrame(i9, parsableByteArray, z8, i10, framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z9, z10, strArr, id3FrameArr);
    }

    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i8) throws UnsupportedEncodingException {
        if (i8 < 4) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i9 = i8 - 4;
        byte[] bArr2 = new byte[i9];
        parsableByteArray.readBytes(bArr2, 0, i9);
        int indexOfEos = indexOfEos(bArr2, 0, readUnsignedByte);
        String str2 = new String(bArr2, 0, indexOfEos, charsetName);
        int delimiterLength = indexOfEos + delimiterLength(readUnsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, delimiterLength, indexOfEos(bArr2, delimiterLength, readUnsignedByte), charsetName));
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0192, code lost:            if (r13 == 67) goto L132;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame decodeFrame(int r19, com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r20, boolean r21, int r22, com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.FramePredicate r23) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.decodeFrame(int, com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray, boolean, int, com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder$FramePredicate):com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame");
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i8) throws UnsupportedEncodingException {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        int i9 = i8 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        String str = new String(bArr, 0, indexOfZeroByte, "ISO-8859-1");
        int i10 = indexOfZeroByte + 1;
        int indexOfEos = indexOfEos(bArr, i10, readUnsignedByte);
        String decodeStringIfValid = decodeStringIfValid(bArr, i10, indexOfEos, charsetName);
        int delimiterLength = indexOfEos + delimiterLength(readUnsignedByte);
        int indexOfEos2 = indexOfEos(bArr, delimiterLength, readUnsignedByte);
        return new GeobFrame(str, decodeStringIfValid, decodeStringIfValid(bArr, delimiterLength, indexOfEos2, charsetName), copyOfRangeIfValid(bArr, indexOfEos2 + delimiterLength(readUnsignedByte), i9));
    }

    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        if (readUnsignedInt24 != ID3_TAG) {
            Log.w(TAG, "Unexpected first three bytes of ID3 tag header: " + readUnsignedInt24);
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        boolean z8 = true;
        parsableByteArray.skipBytes(1);
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
        if (readUnsignedByte == 2) {
            if ((readUnsignedByte2 & 64) != 0) {
                Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (readUnsignedByte == 3) {
            if ((readUnsignedByte2 & 64) != 0) {
                int readInt = parsableByteArray.readInt();
                parsableByteArray.skipBytes(readInt);
                readSynchSafeInt -= readInt + 4;
            }
        } else if (readUnsignedByte == 4) {
            if ((readUnsignedByte2 & 64) != 0) {
                int readSynchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(readSynchSafeInt2 - 4);
                readSynchSafeInt -= readSynchSafeInt2;
            }
            if ((readUnsignedByte2 & 16) != 0) {
                readSynchSafeInt -= 10;
            }
        } else {
            Log.w(TAG, "Skipped ID3 tag with unsupported majorVersion=" + readUnsignedByte);
            return null;
        }
        if (readUnsignedByte >= 4 || (readUnsignedByte2 & 128) == 0) {
            z8 = false;
        }
        return new Id3Header(readUnsignedByte, z8, readSynchSafeInt);
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i8) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i8];
        parsableByteArray.readBytes(bArr, 0, i8);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, indexOfZeroByte, "ISO-8859-1"), copyOfRangeIfValid(bArr, indexOfZeroByte + 1, i8));
    }

    private static String decodeStringIfValid(byte[] bArr, int i8, int i9, String str) throws UnsupportedEncodingException {
        if (i9 > i8 && i9 <= bArr.length) {
            return new String(bArr, i8, i9 - i8, str);
        }
        return "";
    }

    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i8, String str) throws UnsupportedEncodingException {
        if (i8 < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        int i9 = i8 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        return new TextInformationFrame(str, null, new String(bArr, 0, indexOfEos(bArr, 0, readUnsignedByte), charsetName));
    }

    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i8) throws UnsupportedEncodingException {
        if (i8 < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        int i9 = i8 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        int indexOfEos = indexOfEos(bArr, 0, readUnsignedByte);
        String str = new String(bArr, 0, indexOfEos, charsetName);
        int delimiterLength = indexOfEos + delimiterLength(readUnsignedByte);
        return new TextInformationFrame("TXXX", str, decodeStringIfValid(bArr, delimiterLength, indexOfEos(bArr, delimiterLength, readUnsignedByte), charsetName));
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i8, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i8];
        parsableByteArray.readBytes(bArr, 0, i8);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), "ISO-8859-1"));
    }

    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i8) throws UnsupportedEncodingException {
        if (i8 < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        String charsetName = getCharsetName(readUnsignedByte);
        int i9 = i8 - 1;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        int indexOfEos = indexOfEos(bArr, 0, readUnsignedByte);
        String str = new String(bArr, 0, indexOfEos, charsetName);
        int delimiterLength = indexOfEos + delimiterLength(readUnsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, delimiterLength, indexOfZeroByte(bArr, delimiterLength), "ISO-8859-1"));
    }

    private static int delimiterLength(int i8) {
        return (i8 == 0 || i8 == 3) ? 1 : 2;
    }

    private static String getCharsetName(int i8) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return "ISO-8859-1";
                }
                return C.UTF8_NAME;
            }
            return "UTF-16BE";
        }
        return C.UTF16_NAME;
    }

    private static String getFrameId(int i8, int i9, int i10, int i11, int i12) {
        if (i8 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    private static int indexOfEos(byte[] bArr, int i8, int i9) {
        int indexOfZeroByte = indexOfZeroByte(bArr, i8);
        if (i9 != 0 && i9 != 3) {
            while (indexOfZeroByte < bArr.length - 1) {
                if (indexOfZeroByte % 2 == 0 && bArr[indexOfZeroByte + 1] == 0) {
                    return indexOfZeroByte;
                }
                indexOfZeroByte = indexOfZeroByte(bArr, indexOfZeroByte + 1);
            }
            return bArr.length;
        }
        return indexOfZeroByte;
    }

    private static int indexOfZeroByte(byte[] bArr, int i8) {
        while (i8 < bArr.length) {
            if (bArr[i8] == 0) {
                return i8;
            }
            i8++;
        }
        return bArr.length;
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i8) {
        byte[] bArr = parsableByteArray.data;
        int position = parsableByteArray.getPosition();
        while (true) {
            int i9 = position + 1;
            if (i9 < i8) {
                if ((bArr[position] & 255) == 255 && bArr[i9] == 0) {
                    System.arraycopy(bArr, position + 2, bArr, i9, (i8 - position) - 2);
                    i8--;
                }
                position = i9;
            } else {
                return i8;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:            if ((r10 & 1) != 0) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:            if ((r10 & 128) != 0) goto L45;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean validateFrames(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.getPosition()
        L8:
            int r3 = r18.bytesLeft()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r18.readInt()     // Catch: java.lang.Throwable -> L22
            long r8 = r18.readUnsignedInt()     // Catch: java.lang.Throwable -> L22
            int r10 = r18.readUnsignedShort()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb0
        L25:
            int r7 = r18.readUnsignedInt24()     // Catch: java.lang.Throwable -> L22
            int r8 = r18.readUnsignedInt24()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = 0
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.setPosition(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4e
            r1.setPosition(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = 1
            goto L77
        L76:
            r3 = 0
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L8b
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = 1
            goto L85
        L84:
            r3 = 0
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L8b
            goto L8c
        L8a:
            r3 = 0
        L8b:
            r4 = 0
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L99
            r1.setPosition(r2)
            return r6
        L99:
            int r3 = r18.bytesLeft()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La6
            r1.setPosition(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.skipBytes(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lac:
            r1.setPosition(r2)
            return r4
        Lb0:
            r1.setPosition(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.validateFrames(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray, int, int, boolean):boolean");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder
    public final Metadata decode(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.data;
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    public final Metadata decode(byte[] bArr, int i8) {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i8);
        Id3Header decodeHeader = decodeHeader(parsableByteArray);
        if (decodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i9 = decodeHeader.majorVersion == 2 ? 6 : 10;
        int i10 = decodeHeader.framesSize;
        if (decodeHeader.isUnsynchronized) {
            i10 = removeUnsynchronization(parsableByteArray, decodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + i10);
        boolean z8 = false;
        if (!validateFrames(parsableByteArray, decodeHeader.majorVersion, i9, false)) {
            if (decodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i9, true)) {
                Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + decodeHeader.majorVersion);
                return null;
            }
            z8 = true;
        }
        while (parsableByteArray.bytesLeft() >= i9) {
            Id3Frame decodeFrame = decodeFrame(decodeHeader.majorVersion, parsableByteArray, z8, i9, this.framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new Metadata(arrayList);
    }
}
