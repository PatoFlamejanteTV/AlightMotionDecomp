package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes4.dex */
final class Sniffer {
    private static final int[] COMPATIBLE_BRANDS = {Util.getIntegerCodeForString("isom"), Util.getIntegerCodeForString("iso2"), Util.getIntegerCodeForString("iso3"), Util.getIntegerCodeForString("iso4"), Util.getIntegerCodeForString("iso5"), Util.getIntegerCodeForString("iso6"), Util.getIntegerCodeForString("avc1"), Util.getIntegerCodeForString("hvc1"), Util.getIntegerCodeForString("hev1"), Util.getIntegerCodeForString("mp41"), Util.getIntegerCodeForString("mp42"), Util.getIntegerCodeForString("3g2a"), Util.getIntegerCodeForString("3g2b"), Util.getIntegerCodeForString("3gr6"), Util.getIntegerCodeForString("3gs6"), Util.getIntegerCodeForString("3ge6"), Util.getIntegerCodeForString("3gg6"), Util.getIntegerCodeForString("M4V "), Util.getIntegerCodeForString("M4A "), Util.getIntegerCodeForString("f4v "), Util.getIntegerCodeForString("kddi"), Util.getIntegerCodeForString("M4VP"), Util.getIntegerCodeForString("qt  "), Util.getIntegerCodeForString("MSNV")};
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int i8) {
        if ((i8 >>> 8) == Util.getIntegerCodeForString("3gp")) {
            return true;
        }
        for (int i9 : COMPATIBLE_BRANDS) {
            if (i9 == i8) {
                return true;
            }
        }
        return false;
    }

    public static boolean sniffFragmented(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return sniffInternal(extractorInput, true);
    }

    private static boolean sniffInternal(ExtractorInput extractorInput, boolean z8) throws IOException, InterruptedException {
        boolean z9;
        int i8;
        long length = extractorInput.getLength();
        long j8 = -1;
        if (length == -1 || length > 4096) {
            length = 4096;
        }
        int i9 = (int) length;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i9) {
            parsableByteArray.reset(8);
            extractorInput.peekFully(parsableByteArray.data, 0, 8);
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            if (readUnsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.data, 8, 8);
                parsableByteArray.setLimit(16);
                readUnsignedInt = parsableByteArray.readUnsignedLongToLong();
                i8 = 16;
            } else {
                if (readUnsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j8) {
                        readUnsignedInt = 8 + (length2 - extractorInput.getPosition());
                    }
                }
                i8 = 8;
            }
            long j9 = i8;
            if (readUnsignedInt < j9) {
                return false;
            }
            i10 += i8;
            if (readInt != Atom.TYPE_moov) {
                if (readInt != Atom.TYPE_moof && readInt != Atom.TYPE_mvex) {
                    if ((i10 + readUnsignedInt) - j9 >= i9) {
                        break;
                    }
                    int i11 = (int) (readUnsignedInt - j9);
                    i10 += i11;
                    if (readInt == Atom.TYPE_ftyp) {
                        if (i11 < 8) {
                            return false;
                        }
                        parsableByteArray.reset(i11);
                        extractorInput.peekFully(parsableByteArray.data, 0, i11);
                        int i12 = i11 / 4;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= i12) {
                                break;
                            }
                            if (i13 == 1) {
                                parsableByteArray.skipBytes(4);
                            } else if (isCompatibleBrand(parsableByteArray.readInt())) {
                                z10 = true;
                                break;
                            }
                            i13++;
                        }
                        if (!z10) {
                            return false;
                        }
                    } else if (i11 != 0) {
                        extractorInput.advancePeekPosition(i11);
                    }
                    j8 = -1;
                } else {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        if (!z10 || z8 != z9) {
            return false;
        }
        return true;
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return sniffInternal(extractorInput, false);
    }
}
