package com.mbridge.msdk.playercommon.exoplayer2.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes4.dex */
public final class Tx3gDecoder extends SimpleSubtitleDecoder {
    private static final char BOM_UTF16_BE = 65279;
    private static final char BOM_UTF16_LE = 65534;
    private static final int DEFAULT_COLOR = -1;
    private static final int DEFAULT_FONT_FACE = 0;
    private static final String DEFAULT_FONT_FAMILY = "sans-serif";
    private static final float DEFAULT_VERTICAL_PLACEMENT = 0.85f;
    private static final int FONT_FACE_BOLD = 1;
    private static final int FONT_FACE_ITALIC = 2;
    private static final int FONT_FACE_UNDERLINE = 4;
    private static final int SIZE_ATOM_HEADER = 8;
    private static final int SIZE_BOM_UTF16 = 2;
    private static final int SIZE_SHORT = 2;
    private static final int SIZE_STYLE_RECORD = 12;
    private static final int SPAN_PRIORITY_HIGH = 0;
    private static final int SPAN_PRIORITY_LOW = 16711680;
    private static final String TX3G_SERIF = "Serif";
    private static final int TYPE_STYL = Util.getIntegerCodeForString("styl");
    private static final int TYPE_TBOX = Util.getIntegerCodeForString("tbox");
    private int calculatedVideoTrackHeight;
    private boolean customVerticalPlacement;
    private int defaultColorRgba;
    private int defaultFontFace;
    private String defaultFontFamily;
    private float defaultVerticalPlacement;
    private final ParsableByteArray parsableByteArray;

    public Tx3gDecoder(List<byte[]> list) {
        super("Tx3gDecoder");
        this.parsableByteArray = new ParsableByteArray();
        decodeInitializationData(list);
    }

    private void applyStyleRecord(ParsableByteArray parsableByteArray, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        boolean z8;
        if (parsableByteArray.bytesLeft() >= 12) {
            z8 = true;
        } else {
            z8 = false;
        }
        assertTrue(z8);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int readInt = parsableByteArray.readInt();
        attachFontFace(spannableStringBuilder, readUnsignedByte, this.defaultFontFace, readUnsignedShort, readUnsignedShort2, 0);
        attachColor(spannableStringBuilder, readInt, this.defaultColorRgba, readUnsignedShort, readUnsignedShort2, 0);
    }

    private static void assertTrue(boolean z8) throws SubtitleDecoderException {
        if (z8) {
        } else {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    private static void attachColor(SpannableStringBuilder spannableStringBuilder, int i8, int i9, int i10, int i11, int i12) {
        if (i8 != i9) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i8 >>> 8) | ((i8 & 255) << 24)), i10, i11, i12 | 33);
        }
    }

    private static void attachFontFace(SpannableStringBuilder spannableStringBuilder, int i8, int i9, int i10, int i11, int i12) {
        boolean z8;
        boolean z9;
        if (i8 != i9) {
            int i13 = i12 | 33;
            boolean z10 = true;
            if ((i8 & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i8 & 2) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z8) {
                if (z9) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i10, i11, i13);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i10, i11, i13);
                }
            } else if (z9) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, i13);
            }
            if ((i8 & 4) == 0) {
                z10 = false;
            }
            if (z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, i13);
            }
            if (!z10 && !z8 && !z9) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i10, i11, i13);
            }
        }
    }

    private static void attachFontFamily(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i8, int i9, int i10) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i8, i9, i10 | 33);
        }
    }

    private void decodeInitializationData(List<byte[]> list) {
        String str = "sans-serif";
        boolean z8 = false;
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.defaultFontFace = bArr[24];
            this.defaultColorRgba = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            if (TX3G_SERIF.equals(Util.fromUtf8Bytes(bArr, 43, bArr.length - 43))) {
                str = C.SERIF_NAME;
            }
            this.defaultFontFamily = str;
            int i8 = bArr[25] * 20;
            this.calculatedVideoTrackHeight = i8;
            if ((bArr[0] & 32) != 0) {
                z8 = true;
            }
            this.customVerticalPlacement = z8;
            if (z8) {
                float f8 = ((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i8;
                this.defaultVerticalPlacement = f8;
                this.defaultVerticalPlacement = Util.constrainValue(f8, 0.0f, 0.95f);
                return;
            }
            this.defaultVerticalPlacement = DEFAULT_VERTICAL_PLACEMENT;
            return;
        }
        this.defaultFontFace = 0;
        this.defaultColorRgba = -1;
        this.defaultFontFamily = "sans-serif";
        this.customVerticalPlacement = false;
        this.defaultVerticalPlacement = DEFAULT_VERTICAL_PLACEMENT;
    }

    private static String readSubtitleText(ParsableByteArray parsableByteArray) throws SubtitleDecoderException {
        boolean z8;
        char peekChar;
        if (parsableByteArray.bytesLeft() >= 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        assertTrue(z8);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        if (readUnsignedShort == 0) {
            return "";
        }
        if (parsableByteArray.bytesLeft() >= 2 && ((peekChar = parsableByteArray.peekChar()) == 65279 || peekChar == 65534)) {
            return parsableByteArray.readString(readUnsignedShort, Charset.forName(C.UTF16_NAME));
        }
        return parsableByteArray.readString(readUnsignedShort, Charset.forName(C.UTF8_NAME));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder
    protected final Subtitle decode(byte[] bArr, int i8, boolean z8) throws SubtitleDecoderException {
        this.parsableByteArray.reset(bArr, i8);
        String readSubtitleText = readSubtitleText(this.parsableByteArray);
        if (readSubtitleText.isEmpty()) {
            return Tx3gSubtitle.EMPTY;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(readSubtitleText);
        attachFontFace(spannableStringBuilder, this.defaultFontFace, 0, 0, spannableStringBuilder.length(), SPAN_PRIORITY_LOW);
        attachColor(spannableStringBuilder, this.defaultColorRgba, -1, 0, spannableStringBuilder.length(), SPAN_PRIORITY_LOW);
        attachFontFamily(spannableStringBuilder, this.defaultFontFamily, "sans-serif", 0, spannableStringBuilder.length(), SPAN_PRIORITY_LOW);
        float f8 = this.defaultVerticalPlacement;
        while (this.parsableByteArray.bytesLeft() >= 8) {
            int position = this.parsableByteArray.getPosition();
            int readInt = this.parsableByteArray.readInt();
            int readInt2 = this.parsableByteArray.readInt();
            boolean z9 = false;
            boolean z10 = true;
            if (readInt2 == TYPE_STYL) {
                if (this.parsableByteArray.bytesLeft() < 2) {
                    z10 = false;
                }
                assertTrue(z10);
                int readUnsignedShort = this.parsableByteArray.readUnsignedShort();
                for (int i9 = 0; i9 < readUnsignedShort; i9++) {
                    applyStyleRecord(this.parsableByteArray, spannableStringBuilder);
                }
            } else if (readInt2 == TYPE_TBOX && this.customVerticalPlacement) {
                if (this.parsableByteArray.bytesLeft() >= 2) {
                    z9 = true;
                }
                assertTrue(z9);
                f8 = Util.constrainValue(this.parsableByteArray.readUnsignedShort() / this.calculatedVideoTrackHeight, 0.0f, 0.95f);
            }
            this.parsableByteArray.setPosition(position + readInt);
        }
        return new Tx3gSubtitle(new Cue(spannableStringBuilder, null, f8, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }
}
