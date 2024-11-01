package com.mbridge.msdk.playercommon.exoplayer2.text.cea;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleOutputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Cea708Decoder extends CeaDecoder {
    private static final int CC_VALID_FLAG = 4;
    private static final int CHARACTER_BIG_CARONS = 42;
    private static final int CHARACTER_BIG_OE = 44;
    private static final int CHARACTER_BOLD_BULLET = 53;
    private static final int CHARACTER_CLOSE_DOUBLE_QUOTE = 52;
    private static final int CHARACTER_CLOSE_SINGLE_QUOTE = 50;
    private static final int CHARACTER_DIAERESIS_Y = 63;
    private static final int CHARACTER_ELLIPSIS = 37;
    private static final int CHARACTER_FIVE_EIGHTHS = 120;
    private static final int CHARACTER_HORIZONTAL_BORDER = 125;
    private static final int CHARACTER_LOWER_LEFT_BORDER = 124;
    private static final int CHARACTER_LOWER_RIGHT_BORDER = 126;
    private static final int CHARACTER_MN = 127;
    private static final int CHARACTER_NBTSP = 33;
    private static final int CHARACTER_ONE_EIGHTH = 118;
    private static final int CHARACTER_OPEN_DOUBLE_QUOTE = 51;
    private static final int CHARACTER_OPEN_SINGLE_QUOTE = 49;
    private static final int CHARACTER_SEVEN_EIGHTHS = 121;
    private static final int CHARACTER_SM = 61;
    private static final int CHARACTER_SMALL_CARONS = 58;
    private static final int CHARACTER_SMALL_OE = 60;
    private static final int CHARACTER_SOLID_BLOCK = 48;
    private static final int CHARACTER_THREE_EIGHTHS = 119;
    private static final int CHARACTER_TM = 57;
    private static final int CHARACTER_TSP = 32;
    private static final int CHARACTER_UPPER_LEFT_BORDER = 127;
    private static final int CHARACTER_UPPER_RIGHT_BORDER = 123;
    private static final int CHARACTER_VERTICAL_BORDER = 122;
    private static final int COMMAND_BS = 8;
    private static final int COMMAND_CLW = 136;
    private static final int COMMAND_CR = 13;
    private static final int COMMAND_CW0 = 128;
    private static final int COMMAND_CW1 = 129;
    private static final int COMMAND_CW2 = 130;
    private static final int COMMAND_CW3 = 131;
    private static final int COMMAND_CW4 = 132;
    private static final int COMMAND_CW5 = 133;
    private static final int COMMAND_CW6 = 134;
    private static final int COMMAND_CW7 = 135;
    private static final int COMMAND_DF0 = 152;
    private static final int COMMAND_DF1 = 153;
    private static final int COMMAND_DF2 = 154;
    private static final int COMMAND_DF3 = 155;
    private static final int COMMAND_DF4 = 156;
    private static final int COMMAND_DF5 = 157;
    private static final int COMMAND_DF6 = 158;
    private static final int COMMAND_DF7 = 159;
    private static final int COMMAND_DLC = 142;
    private static final int COMMAND_DLW = 140;
    private static final int COMMAND_DLY = 141;
    private static final int COMMAND_DSW = 137;
    private static final int COMMAND_ETX = 3;
    private static final int COMMAND_EXT1 = 16;
    private static final int COMMAND_EXT1_END = 23;
    private static final int COMMAND_EXT1_START = 17;
    private static final int COMMAND_FF = 12;
    private static final int COMMAND_HCR = 14;
    private static final int COMMAND_HDW = 138;
    private static final int COMMAND_NUL = 0;
    private static final int COMMAND_P16_END = 31;
    private static final int COMMAND_P16_START = 24;
    private static final int COMMAND_RST = 143;
    private static final int COMMAND_SPA = 144;
    private static final int COMMAND_SPC = 145;
    private static final int COMMAND_SPL = 146;
    private static final int COMMAND_SWA = 151;
    private static final int COMMAND_TGW = 139;
    private static final int DTVCC_PACKET_DATA = 2;
    private static final int DTVCC_PACKET_START = 3;
    private static final int GROUP_C0_END = 31;
    private static final int GROUP_C1_END = 159;
    private static final int GROUP_C2_END = 31;
    private static final int GROUP_C3_END = 159;
    private static final int GROUP_G0_END = 127;
    private static final int GROUP_G1_END = 255;
    private static final int GROUP_G2_END = 127;
    private static final int GROUP_G3_END = 255;
    private static final int NUM_WINDOWS = 8;
    private static final String TAG = "Cea708Decoder";
    private final CueBuilder[] cueBuilders;
    private List<Cue> cues;
    private CueBuilder currentCueBuilder;
    private DtvCcPacket currentDtvCcPacket;
    private int currentWindow;
    private List<Cue> lastCues;
    private final int selectedServiceNumber;
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ParsableBitArray serviceBlockPacket = new ParsableBitArray();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class CueBuilder {
        private static final int BORDER_AND_EDGE_TYPE_NONE = 0;
        private static final int BORDER_AND_EDGE_TYPE_UNIFORM = 3;
        public static final int COLOR_SOLID_BLACK;
        public static final int COLOR_SOLID_WHITE = getArgbColorFromCeaColor(2, 2, 2, 0);
        public static final int COLOR_TRANSPARENT;
        private static final int DEFAULT_PRIORITY = 4;
        private static final int DIRECTION_BOTTOM_TO_TOP = 3;
        private static final int DIRECTION_LEFT_TO_RIGHT = 0;
        private static final int DIRECTION_RIGHT_TO_LEFT = 1;
        private static final int DIRECTION_TOP_TO_BOTTOM = 2;
        private static final int HORIZONTAL_SIZE = 209;
        private static final int JUSTIFICATION_CENTER = 2;
        private static final int JUSTIFICATION_FULL = 3;
        private static final int JUSTIFICATION_LEFT = 0;
        private static final int JUSTIFICATION_RIGHT = 1;
        private static final int MAXIMUM_ROW_COUNT = 15;
        private static final int PEN_FONT_STYLE_DEFAULT = 0;
        private static final int PEN_FONT_STYLE_MONOSPACED_WITHOUT_SERIFS = 3;
        private static final int PEN_FONT_STYLE_MONOSPACED_WITH_SERIFS = 1;
        private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITHOUT_SERIFS = 4;
        private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITH_SERIFS = 2;
        private static final int PEN_OFFSET_NORMAL = 1;
        private static final int PEN_SIZE_STANDARD = 1;
        private static final int[] PEN_STYLE_BACKGROUND;
        private static final int[] PEN_STYLE_EDGE_TYPE;
        private static final int[] PEN_STYLE_FONT_STYLE;
        private static final int RELATIVE_CUE_SIZE = 99;
        private static final int VERTICAL_SIZE = 74;
        private static final int[] WINDOW_STYLE_FILL;
        private static final int[] WINDOW_STYLE_JUSTIFICATION;
        private static final int[] WINDOW_STYLE_PRINT_DIRECTION;
        private static final int[] WINDOW_STYLE_SCROLL_DIRECTION;
        private static final boolean[] WINDOW_STYLE_WORD_WRAP;
        private int anchorId;
        private int backgroundColor;
        private int backgroundColorStartPosition;
        private boolean defined;
        private int foregroundColor;
        private int foregroundColorStartPosition;
        private int horizontalAnchor;
        private int italicsStartPosition;
        private int justification;
        private int penStyleId;
        private int priority;
        private boolean relativePositioning;
        private int row;
        private int rowCount;
        private boolean rowLock;
        private int underlineStartPosition;
        private int verticalAnchor;
        private boolean visible;
        private int windowFillColor;
        private int windowStyleId;
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final SpannableStringBuilder captionStringBuilder = new SpannableStringBuilder();

        static {
            int argbColorFromCeaColor = getArgbColorFromCeaColor(0, 0, 0, 0);
            COLOR_SOLID_BLACK = argbColorFromCeaColor;
            int argbColorFromCeaColor2 = getArgbColorFromCeaColor(0, 0, 0, 3);
            COLOR_TRANSPARENT = argbColorFromCeaColor2;
            WINDOW_STYLE_JUSTIFICATION = new int[]{0, 0, 0, 0, 0, 2, 0};
            WINDOW_STYLE_PRINT_DIRECTION = new int[]{0, 0, 0, 0, 0, 0, 2};
            WINDOW_STYLE_SCROLL_DIRECTION = new int[]{3, 3, 3, 3, 3, 3, 1};
            WINDOW_STYLE_WORD_WRAP = new boolean[]{false, false, false, true, true, true, false};
            WINDOW_STYLE_FILL = new int[]{argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor};
            PEN_STYLE_FONT_STYLE = new int[]{0, 1, 2, 3, 4, 3, 4};
            PEN_STYLE_EDGE_TYPE = new int[]{0, 0, 0, 0, 0, 3, 3};
            PEN_STYLE_BACKGROUND = new int[]{argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor2};
        }

        public CueBuilder() {
            reset();
        }

        public static int getArgbColorFromCeaColor(int i8, int i9, int i10) {
            return getArgbColorFromCeaColor(i8, i9, i10, 0);
        }

        public final void append(char c8) {
            if (c8 == '\n') {
                this.rolledUpCaptions.add(buildSpannableString());
                this.captionStringBuilder.clear();
                if (this.italicsStartPosition != -1) {
                    this.italicsStartPosition = 0;
                }
                if (this.underlineStartPosition != -1) {
                    this.underlineStartPosition = 0;
                }
                if (this.foregroundColorStartPosition != -1) {
                    this.foregroundColorStartPosition = 0;
                }
                if (this.backgroundColorStartPosition != -1) {
                    this.backgroundColorStartPosition = 0;
                }
                while (true) {
                    if ((this.rowLock && this.rolledUpCaptions.size() >= this.rowCount) || this.rolledUpCaptions.size() >= 15) {
                        this.rolledUpCaptions.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.captionStringBuilder.append(c8);
            }
        }

        public final void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.mbridge.msdk.playercommon.exoplayer2.text.cea.Cea708Cue build() {
            /*
                Method dump skipped, instructions count: 193
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.text.cea.Cea708Decoder.CueBuilder.build():com.mbridge.msdk.playercommon.exoplayer2.text.cea.Cea708Cue");
        }

        public final SpannableString buildSpannableString() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.italicsStartPosition != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.italicsStartPosition, length, 33);
                }
                if (this.underlineStartPosition != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, length, 33);
                }
                if (this.foregroundColorStartPosition != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), this.foregroundColorStartPosition, length, 33);
                }
                if (this.backgroundColorStartPosition != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), this.backgroundColorStartPosition, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void clear() {
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.clear();
            this.italicsStartPosition = -1;
            this.underlineStartPosition = -1;
            this.foregroundColorStartPosition = -1;
            this.backgroundColorStartPosition = -1;
            this.row = 0;
        }

        public final void defineWindow(boolean z8, boolean z9, boolean z10, int i8, boolean z11, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.defined = true;
            this.visible = z8;
            this.rowLock = z9;
            this.priority = i8;
            this.relativePositioning = z11;
            this.verticalAnchor = i9;
            this.horizontalAnchor = i10;
            this.anchorId = i13;
            int i16 = i11 + 1;
            if (this.rowCount != i16) {
                this.rowCount = i16;
                while (true) {
                    if ((!z9 || this.rolledUpCaptions.size() < this.rowCount) && this.rolledUpCaptions.size() < 15) {
                        break;
                    } else {
                        this.rolledUpCaptions.remove(0);
                    }
                }
            }
            if (i14 != 0 && this.windowStyleId != i14) {
                this.windowStyleId = i14;
                int i17 = i14 - 1;
                setWindowAttributes(WINDOW_STYLE_FILL[i17], COLOR_TRANSPARENT, WINDOW_STYLE_WORD_WRAP[i17], 0, WINDOW_STYLE_PRINT_DIRECTION[i17], WINDOW_STYLE_SCROLL_DIRECTION[i17], WINDOW_STYLE_JUSTIFICATION[i17]);
            }
            if (i15 != 0 && this.penStyleId != i15) {
                this.penStyleId = i15;
                int i18 = i15 - 1;
                setPenAttributes(0, 1, 1, false, false, PEN_STYLE_EDGE_TYPE[i18], PEN_STYLE_FONT_STYLE[i18]);
                setPenColor(COLOR_SOLID_WHITE, PEN_STYLE_BACKGROUND[i18], COLOR_SOLID_BLACK);
            }
        }

        public final boolean isDefined() {
            return this.defined;
        }

        public final boolean isEmpty() {
            if (isDefined() && (!this.rolledUpCaptions.isEmpty() || this.captionStringBuilder.length() != 0)) {
                return false;
            }
            return true;
        }

        public final boolean isVisible() {
            return this.visible;
        }

        public final void reset() {
            clear();
            this.defined = false;
            this.visible = false;
            this.priority = 4;
            this.relativePositioning = false;
            this.verticalAnchor = 0;
            this.horizontalAnchor = 0;
            this.anchorId = 0;
            this.rowCount = 15;
            this.rowLock = true;
            this.justification = 0;
            this.windowStyleId = 0;
            this.penStyleId = 0;
            int i8 = COLOR_SOLID_BLACK;
            this.windowFillColor = i8;
            this.foregroundColor = COLOR_SOLID_WHITE;
            this.backgroundColor = i8;
        }

        public final void setPenAttributes(int i8, int i9, int i10, boolean z8, boolean z9, int i11, int i12) {
            if (this.italicsStartPosition != -1) {
                if (!z8) {
                    this.captionStringBuilder.setSpan(new StyleSpan(2), this.italicsStartPosition, this.captionStringBuilder.length(), 33);
                    this.italicsStartPosition = -1;
                }
            } else if (z8) {
                this.italicsStartPosition = this.captionStringBuilder.length();
            }
            if (this.underlineStartPosition != -1) {
                if (!z9) {
                    this.captionStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, this.captionStringBuilder.length(), 33);
                    this.underlineStartPosition = -1;
                    return;
                }
                return;
            }
            if (z9) {
                this.underlineStartPosition = this.captionStringBuilder.length();
            }
        }

        public final void setPenColor(int i8, int i9, int i10) {
            if (this.foregroundColorStartPosition != -1 && this.foregroundColor != i8) {
                this.captionStringBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), this.foregroundColorStartPosition, this.captionStringBuilder.length(), 33);
            }
            if (i8 != COLOR_SOLID_WHITE) {
                this.foregroundColorStartPosition = this.captionStringBuilder.length();
                this.foregroundColor = i8;
            }
            if (this.backgroundColorStartPosition != -1 && this.backgroundColor != i9) {
                this.captionStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), this.backgroundColorStartPosition, this.captionStringBuilder.length(), 33);
            }
            if (i9 != COLOR_SOLID_BLACK) {
                this.backgroundColorStartPosition = this.captionStringBuilder.length();
                this.backgroundColor = i9;
            }
        }

        public final void setPenLocation(int i8, int i9) {
            if (this.row != i8) {
                append('\n');
            }
            this.row = i8;
        }

        public final void setVisibility(boolean z8) {
            this.visible = z8;
        }

        public final void setWindowAttributes(int i8, int i9, boolean z8, int i10, int i11, int i12, int i13) {
            this.windowFillColor = i8;
            this.justification = i13;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getArgbColorFromCeaColor(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkIndex(r4, r0, r1)
                com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkIndex(r5, r0, r1)
                com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkIndex(r6, r0, r1)
                com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkIndex(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L20
                r3 = 3
                if (r7 == r3) goto L1e
            L1b:
                r7 = 255(0xff, float:3.57E-43)
                goto L22
            L1e:
                r7 = 0
                goto L22
            L20:
                r7 = 127(0x7f, float:1.78E-43)
            L22:
                if (r4 <= r1) goto L27
                r4 = 255(0xff, float:3.57E-43)
                goto L28
            L27:
                r4 = 0
            L28:
                if (r5 <= r1) goto L2d
                r5 = 255(0xff, float:3.57E-43)
                goto L2e
            L2d:
                r5 = 0
            L2e:
                if (r6 <= r1) goto L32
                r0 = 255(0xff, float:3.57E-43)
            L32:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.text.cea.Cea708Decoder.CueBuilder.getArgbColorFromCeaColor(int, int, int, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class DtvCcPacket {
        int currentIndex = 0;
        public final byte[] packetData;
        public final int packetSize;
        public final int sequenceNumber;

        public DtvCcPacket(int i8, int i9) {
            this.sequenceNumber = i8;
            this.packetSize = i9;
            this.packetData = new byte[(i9 * 2) - 1];
        }
    }

    public Cea708Decoder(int i8) {
        this.selectedServiceNumber = i8 == -1 ? 1 : i8;
        this.cueBuilders = new CueBuilder[8];
        for (int i9 = 0; i9 < 8; i9++) {
            this.cueBuilders[i9] = new CueBuilder();
        }
        this.currentCueBuilder = this.cueBuilders[0];
        resetCueBuilders();
    }

    private void finalizeCurrentPacket() {
        if (this.currentDtvCcPacket == null) {
            return;
        }
        processCurrentPacket();
        this.currentDtvCcPacket = null;
    }

    private List<Cue> getDisplayCues() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < 8; i8++) {
            if (!this.cueBuilders[i8].isEmpty() && this.cueBuilders[i8].isVisible()) {
                arrayList.add(this.cueBuilders[i8].build());
            }
        }
        Collections.sort(arrayList);
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private void handleC0Command(int i8) {
        if (i8 != 0) {
            if (i8 != 3) {
                if (i8 != 8) {
                    switch (i8) {
                        case 12:
                            resetCueBuilders();
                            return;
                        case 13:
                            this.currentCueBuilder.append('\n');
                            return;
                        case 14:
                            return;
                        default:
                            if (i8 >= 17 && i8 <= 23) {
                                Log.w(TAG, "Currently unsupported COMMAND_EXT1 Command: " + i8);
                                this.serviceBlockPacket.skipBits(8);
                                return;
                            }
                            if (i8 >= 24 && i8 <= 31) {
                                Log.w(TAG, "Currently unsupported COMMAND_P16 Command: " + i8);
                                this.serviceBlockPacket.skipBits(16);
                                return;
                            }
                            Log.w(TAG, "Invalid C0 command: " + i8);
                            return;
                    }
                }
                this.currentCueBuilder.backspace();
                return;
            }
            this.cues = getDisplayCues();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    private void handleC1Command(int i8) {
        int i9 = 1;
        switch (i8) {
            case 128:
            case 129:
            case 130:
            case COMMAND_CW3 /* 131 */:
            case COMMAND_CW4 /* 132 */:
            case COMMAND_CW5 /* 133 */:
            case 134:
            case 135:
                int i10 = i8 - 128;
                if (this.currentWindow != i10) {
                    this.currentWindow = i10;
                    this.currentCueBuilder = this.cueBuilders[i10];
                    return;
                }
                return;
            case COMMAND_CLW /* 136 */:
                while (i9 <= 8) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueBuilders[8 - i9].clear();
                    }
                    i9++;
                }
                return;
            case COMMAND_DSW /* 137 */:
                for (int i11 = 1; i11 <= 8; i11++) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueBuilders[8 - i11].setVisibility(true);
                    }
                }
                return;
            case 138:
                while (i9 <= 8) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueBuilders[8 - i9].setVisibility(false);
                    }
                    i9++;
                }
                return;
            case COMMAND_TGW /* 139 */:
                for (int i12 = 1; i12 <= 8; i12++) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueBuilders[8 - i12].setVisibility(!r0.isVisible());
                    }
                }
                return;
            case COMMAND_DLW /* 140 */:
                while (i9 <= 8) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueBuilders[8 - i9].reset();
                    }
                    i9++;
                }
                return;
            case COMMAND_DLY /* 141 */:
                this.serviceBlockPacket.skipBits(8);
                return;
            case COMMAND_DLC /* 142 */:
                return;
            case COMMAND_RST /* 143 */:
                resetCueBuilders();
                return;
            case COMMAND_SPA /* 144 */:
                if (!this.currentCueBuilder.isDefined()) {
                    this.serviceBlockPacket.skipBits(16);
                    return;
                } else {
                    handleSetPenAttributes();
                    return;
                }
            case COMMAND_SPC /* 145 */:
                if (!this.currentCueBuilder.isDefined()) {
                    this.serviceBlockPacket.skipBits(24);
                    return;
                } else {
                    handleSetPenColor();
                    return;
                }
            case COMMAND_SPL /* 146 */:
                if (!this.currentCueBuilder.isDefined()) {
                    this.serviceBlockPacket.skipBits(16);
                    return;
                } else {
                    handleSetPenLocation();
                    return;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                Log.w(TAG, "Invalid C1 command: " + i8);
                return;
            case COMMAND_SWA /* 151 */:
                if (!this.currentCueBuilder.isDefined()) {
                    this.serviceBlockPacket.skipBits(32);
                    return;
                } else {
                    handleSetWindowAttributes();
                    return;
                }
            case COMMAND_DF0 /* 152 */:
            case COMMAND_DF1 /* 153 */:
            case COMMAND_DF2 /* 154 */:
            case COMMAND_DF3 /* 155 */:
            case COMMAND_DF4 /* 156 */:
            case COMMAND_DF5 /* 157 */:
            case COMMAND_DF6 /* 158 */:
            case 159:
                int i13 = i8 - 152;
                handleDefineWindow(i13);
                if (this.currentWindow != i13) {
                    this.currentWindow = i13;
                    this.currentCueBuilder = this.cueBuilders[i13];
                    return;
                }
                return;
        }
    }

    private void handleC2Command(int i8) {
        if (i8 > 7) {
            if (i8 <= 15) {
                this.serviceBlockPacket.skipBits(8);
            } else if (i8 <= 23) {
                this.serviceBlockPacket.skipBits(16);
            } else if (i8 <= 31) {
                this.serviceBlockPacket.skipBits(24);
            }
        }
    }

    private void handleC3Command(int i8) {
        if (i8 <= 135) {
            this.serviceBlockPacket.skipBits(32);
            return;
        }
        if (i8 <= COMMAND_RST) {
            this.serviceBlockPacket.skipBits(40);
        } else if (i8 <= 159) {
            this.serviceBlockPacket.skipBits(2);
            this.serviceBlockPacket.skipBits(this.serviceBlockPacket.readBits(6) * 8);
        }
    }

    private void handleDefineWindow(int i8) {
        CueBuilder cueBuilder = this.cueBuilders[i8];
        this.serviceBlockPacket.skipBits(2);
        boolean readBit = this.serviceBlockPacket.readBit();
        boolean readBit2 = this.serviceBlockPacket.readBit();
        boolean readBit3 = this.serviceBlockPacket.readBit();
        int readBits = this.serviceBlockPacket.readBits(3);
        boolean readBit4 = this.serviceBlockPacket.readBit();
        int readBits2 = this.serviceBlockPacket.readBits(7);
        int readBits3 = this.serviceBlockPacket.readBits(8);
        int readBits4 = this.serviceBlockPacket.readBits(4);
        int readBits5 = this.serviceBlockPacket.readBits(4);
        this.serviceBlockPacket.skipBits(2);
        int readBits6 = this.serviceBlockPacket.readBits(6);
        this.serviceBlockPacket.skipBits(2);
        cueBuilder.defineWindow(readBit, readBit2, readBit3, readBits, readBit4, readBits2, readBits3, readBits5, readBits6, readBits4, this.serviceBlockPacket.readBits(3), this.serviceBlockPacket.readBits(3));
    }

    private void handleG0Character(int i8) {
        if (i8 == 127) {
            this.currentCueBuilder.append((char) 9835);
        } else {
            this.currentCueBuilder.append((char) (i8 & 255));
        }
    }

    private void handleG1Character(int i8) {
        this.currentCueBuilder.append((char) (i8 & 255));
    }

    private void handleG2Character(int i8) {
        if (i8 != 32) {
            if (i8 != 33) {
                if (i8 != 37) {
                    if (i8 != 42) {
                        if (i8 != 44) {
                            if (i8 != 63) {
                                if (i8 != 57) {
                                    if (i8 != 58) {
                                        if (i8 != 60) {
                                            if (i8 != 61) {
                                                switch (i8) {
                                                    case 48:
                                                        this.currentCueBuilder.append((char) 9608);
                                                        return;
                                                    case 49:
                                                        this.currentCueBuilder.append((char) 8216);
                                                        return;
                                                    case 50:
                                                        this.currentCueBuilder.append((char) 8217);
                                                        return;
                                                    case 51:
                                                        this.currentCueBuilder.append((char) 8220);
                                                        return;
                                                    case 52:
                                                        this.currentCueBuilder.append((char) 8221);
                                                        return;
                                                    case 53:
                                                        this.currentCueBuilder.append((char) 8226);
                                                        return;
                                                    default:
                                                        switch (i8) {
                                                            case 118:
                                                                this.currentCueBuilder.append((char) 8539);
                                                                return;
                                                            case 119:
                                                                this.currentCueBuilder.append((char) 8540);
                                                                return;
                                                            case 120:
                                                                this.currentCueBuilder.append((char) 8541);
                                                                return;
                                                            case 121:
                                                                this.currentCueBuilder.append((char) 8542);
                                                                return;
                                                            case 122:
                                                                this.currentCueBuilder.append((char) 9474);
                                                                return;
                                                            case 123:
                                                                this.currentCueBuilder.append((char) 9488);
                                                                return;
                                                            case 124:
                                                                this.currentCueBuilder.append((char) 9492);
                                                                return;
                                                            case 125:
                                                                this.currentCueBuilder.append((char) 9472);
                                                                return;
                                                            case 126:
                                                                this.currentCueBuilder.append((char) 9496);
                                                                return;
                                                            case ModuleDescriptor.MODULE_VERSION /* 127 */:
                                                                this.currentCueBuilder.append((char) 9484);
                                                                return;
                                                            default:
                                                                Log.w(TAG, "Invalid G2 character: " + i8);
                                                                return;
                                                        }
                                                }
                                            }
                                            this.currentCueBuilder.append((char) 8480);
                                            return;
                                        }
                                        this.currentCueBuilder.append((char) 339);
                                        return;
                                    }
                                    this.currentCueBuilder.append((char) 353);
                                    return;
                                }
                                this.currentCueBuilder.append((char) 8482);
                                return;
                            }
                            this.currentCueBuilder.append((char) 376);
                            return;
                        }
                        this.currentCueBuilder.append((char) 338);
                        return;
                    }
                    this.currentCueBuilder.append((char) 352);
                    return;
                }
                this.currentCueBuilder.append((char) 8230);
                return;
            }
            this.currentCueBuilder.append((char) 160);
            return;
        }
        this.currentCueBuilder.append(' ');
    }

    private void handleG3Character(int i8) {
        if (i8 == 160) {
            this.currentCueBuilder.append((char) 13252);
            return;
        }
        Log.w(TAG, "Invalid G3 character: " + i8);
        this.currentCueBuilder.append('_');
    }

    private void handleSetPenAttributes() {
        this.currentCueBuilder.setPenAttributes(this.serviceBlockPacket.readBits(4), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBit(), this.serviceBlockPacket.readBit(), this.serviceBlockPacket.readBits(3), this.serviceBlockPacket.readBits(3));
    }

    private void handleSetPenColor() {
        int argbColorFromCeaColor = CueBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2));
        int argbColorFromCeaColor2 = CueBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2));
        this.serviceBlockPacket.skipBits(2);
        this.currentCueBuilder.setPenColor(argbColorFromCeaColor, argbColorFromCeaColor2, CueBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2)));
    }

    private void handleSetPenLocation() {
        this.serviceBlockPacket.skipBits(4);
        int readBits = this.serviceBlockPacket.readBits(4);
        this.serviceBlockPacket.skipBits(2);
        this.currentCueBuilder.setPenLocation(readBits, this.serviceBlockPacket.readBits(6));
    }

    private void handleSetWindowAttributes() {
        int argbColorFromCeaColor = CueBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2));
        int readBits = this.serviceBlockPacket.readBits(2);
        int argbColorFromCeaColor2 = CueBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2));
        if (this.serviceBlockPacket.readBit()) {
            readBits |= 4;
        }
        boolean readBit = this.serviceBlockPacket.readBit();
        int readBits2 = this.serviceBlockPacket.readBits(2);
        int readBits3 = this.serviceBlockPacket.readBits(2);
        int readBits4 = this.serviceBlockPacket.readBits(2);
        this.serviceBlockPacket.skipBits(8);
        this.currentCueBuilder.setWindowAttributes(argbColorFromCeaColor, argbColorFromCeaColor2, readBit, readBits, readBits2, readBits3, readBits4);
    }

    private void processCurrentPacket() {
        DtvCcPacket dtvCcPacket = this.currentDtvCcPacket;
        int i8 = dtvCcPacket.currentIndex;
        if (i8 != (dtvCcPacket.packetSize * 2) - 1) {
            Log.w(TAG, "DtvCcPacket ended prematurely; size is " + ((this.currentDtvCcPacket.packetSize * 2) - 1) + ", but current index is " + this.currentDtvCcPacket.currentIndex + " (sequence number " + this.currentDtvCcPacket.sequenceNumber + "); ignoring packet");
            return;
        }
        this.serviceBlockPacket.reset(dtvCcPacket.packetData, i8);
        int readBits = this.serviceBlockPacket.readBits(3);
        int readBits2 = this.serviceBlockPacket.readBits(5);
        if (readBits == 7) {
            this.serviceBlockPacket.skipBits(2);
            readBits += this.serviceBlockPacket.readBits(6);
        }
        if (readBits2 == 0) {
            if (readBits != 0) {
                Log.w(TAG, "serviceNumber is non-zero (" + readBits + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (readBits != this.selectedServiceNumber) {
            return;
        }
        boolean z8 = false;
        while (this.serviceBlockPacket.bitsLeft() > 0) {
            int readBits3 = this.serviceBlockPacket.readBits(8);
            if (readBits3 != 16) {
                if (readBits3 <= 31) {
                    handleC0Command(readBits3);
                } else {
                    if (readBits3 <= 127) {
                        handleG0Character(readBits3);
                    } else if (readBits3 <= 159) {
                        handleC1Command(readBits3);
                    } else if (readBits3 <= 255) {
                        handleG1Character(readBits3);
                    } else {
                        Log.w(TAG, "Invalid base command: " + readBits3);
                    }
                    z8 = true;
                }
            } else {
                int readBits4 = this.serviceBlockPacket.readBits(8);
                if (readBits4 <= 31) {
                    handleC2Command(readBits4);
                } else {
                    if (readBits4 <= 127) {
                        handleG2Character(readBits4);
                    } else if (readBits4 <= 159) {
                        handleC3Command(readBits4);
                    } else if (readBits4 <= 255) {
                        handleG3Character(readBits4);
                    } else {
                        Log.w(TAG, "Invalid extended command: " + readBits4);
                    }
                    z8 = true;
                }
            }
        }
        if (z8) {
            this.cues = getDisplayCues();
        }
    }

    private void resetCueBuilders() {
        for (int i8 = 0; i8 < 8; i8++) {
            this.cueBuilders[i8].reset();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder
    protected final Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle(list);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder
    protected final void decode(SubtitleInputBuffer subtitleInputBuffer) {
        boolean z8;
        this.ccData.reset(subtitleInputBuffer.data.array(), subtitleInputBuffer.data.limit());
        while (this.ccData.bytesLeft() >= 3) {
            int readUnsignedByte = this.ccData.readUnsignedByte();
            int i8 = readUnsignedByte & 3;
            boolean z9 = false;
            if ((readUnsignedByte & 4) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            byte readUnsignedByte2 = (byte) this.ccData.readUnsignedByte();
            byte readUnsignedByte3 = (byte) this.ccData.readUnsignedByte();
            if (i8 == 2 || i8 == 3) {
                if (z8) {
                    if (i8 == 3) {
                        finalizeCurrentPacket();
                        int i9 = (readUnsignedByte2 & 192) >> 6;
                        int i10 = readUnsignedByte2 & 63;
                        if (i10 == 0) {
                            i10 = 64;
                        }
                        DtvCcPacket dtvCcPacket = new DtvCcPacket(i9, i10);
                        this.currentDtvCcPacket = dtvCcPacket;
                        byte[] bArr = dtvCcPacket.packetData;
                        int i11 = dtvCcPacket.currentIndex;
                        dtvCcPacket.currentIndex = i11 + 1;
                        bArr[i11] = readUnsignedByte3;
                    } else {
                        if (i8 == 2) {
                            z9 = true;
                        }
                        Assertions.checkArgument(z9);
                        DtvCcPacket dtvCcPacket2 = this.currentDtvCcPacket;
                        if (dtvCcPacket2 == null) {
                            Log.e(TAG, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = dtvCcPacket2.packetData;
                            int i12 = dtvCcPacket2.currentIndex;
                            int i13 = i12 + 1;
                            dtvCcPacket2.currentIndex = i13;
                            bArr2[i12] = readUnsignedByte2;
                            dtvCcPacket2.currentIndex = i12 + 2;
                            bArr2[i13] = readUnsignedByte3;
                        }
                    }
                    DtvCcPacket dtvCcPacket3 = this.currentDtvCcPacket;
                    if (dtvCcPacket3.currentIndex == (dtvCcPacket3.packetSize * 2) - 1) {
                        finalizeCurrentPacket();
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        return super.dequeueOutputBuffer();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        this.currentWindow = 0;
        this.currentCueBuilder = this.cueBuilders[0];
        resetCueBuilders();
        this.currentDtvCcPacket = null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final String getName() {
        return TAG;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder
    protected final boolean isNewSubtitleDataAvailable() {
        if (this.cues != this.lastCues) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder
    public final /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaDecoder, com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoder
    public final /* bridge */ /* synthetic */ void setPositionUs(long j8) {
        super.setPositionUs(j8);
    }
}
