package com.mbridge.msdk.playercommon.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class DvbParser {
    private static final int DATA_TYPE_24_TABLE_DATA = 32;
    private static final int DATA_TYPE_28_TABLE_DATA = 33;
    private static final int DATA_TYPE_2BP_CODE_STRING = 16;
    private static final int DATA_TYPE_48_TABLE_DATA = 34;
    private static final int DATA_TYPE_4BP_CODE_STRING = 17;
    private static final int DATA_TYPE_8BP_CODE_STRING = 18;
    private static final int DATA_TYPE_END_LINE = 240;
    private static final int OBJECT_CODING_PIXELS = 0;
    private static final int OBJECT_CODING_STRING = 1;
    private static final int PAGE_STATE_NORMAL = 0;
    private static final int REGION_DEPTH_4_BIT = 2;
    private static final int REGION_DEPTH_8_BIT = 3;
    private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
    private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
    private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
    private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
    private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
    private static final String TAG = "DvbParser";
    private static final byte[] defaultMap2To4 = {0, 7, 8, 15};
    private static final byte[] defaultMap2To8 = {0, 119, -120, -1};
    private static final byte[] defaultMap4To8 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private Bitmap bitmap;
    private final Canvas canvas;
    private final ClutDefinition defaultClutDefinition;
    private final DisplayDefinition defaultDisplayDefinition;
    private final Paint defaultPaint;
    private final Paint fillRegionPaint;
    private final SubtitleService subtitleService;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;
        public final int id;

        public ClutDefinition(int i8, int[] iArr, int[] iArr2, int[] iArr3) {
            this.id = i8;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class DisplayDefinition {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public DisplayDefinition(int i8, int i9, int i10, int i11, int i12, int i13) {
            this.width = i8;
            this.height = i9;
            this.horizontalPositionMinimum = i10;
            this.horizontalPositionMaximum = i11;
            this.verticalPositionMinimum = i12;
            this.verticalPositionMaximum = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ObjectData {
        public final byte[] bottomFieldData;
        public final int id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(int i8, boolean z8, byte[] bArr, byte[] bArr2) {
            this.id = i8;
            this.nonModifyingColorFlag = z8;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class PageComposition {
        public final SparseArray<PageRegion> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public PageComposition(int i8, int i9, int i10, SparseArray<PageRegion> sparseArray) {
            this.timeOutSecs = i8;
            this.version = i9;
            this.state = i10;
            this.regions = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int i8, int i9) {
            this.horizontalAddress = i8;
            this.verticalAddress = i9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;
        public final int id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final SparseArray<RegionObject> regionObjects;
        public final int width;

        public RegionComposition(int i8, boolean z8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, SparseArray<RegionObject> sparseArray) {
            this.id = i8;
            this.fillFlag = z8;
            this.width = i9;
            this.height = i10;
            this.levelOfCompatibility = i11;
            this.depth = i12;
            this.clutId = i13;
            this.pixelCode8Bit = i14;
            this.pixelCode4Bit = i15;
            this.pixelCode2Bit = i16;
            this.regionObjects = sparseArray;
        }

        public final void mergeFrom(RegionComposition regionComposition) {
            if (regionComposition == null) {
                return;
            }
            SparseArray<RegionObject> sparseArray = regionComposition.regionObjects;
            for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                this.regionObjects.put(sparseArray.keyAt(i8), sparseArray.valueAt(i8));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class RegionObject {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public RegionObject(int i8, int i9, int i10, int i11, int i12, int i13) {
            this.type = i8;
            this.provider = i9;
            this.horizontalPosition = i10;
            this.verticalPosition = i11;
            this.foregroundPixelCode = i12;
            this.backgroundPixelCode = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SubtitleService {
        public final int ancillaryPageId;
        public DisplayDefinition displayDefinition;
        public PageComposition pageComposition;
        public final int subtitlePageId;
        public final SparseArray<RegionComposition> regions = new SparseArray<>();
        public final SparseArray<ClutDefinition> cluts = new SparseArray<>();
        public final SparseArray<ObjectData> objects = new SparseArray<>();
        public final SparseArray<ClutDefinition> ancillaryCluts = new SparseArray<>();
        public final SparseArray<ObjectData> ancillaryObjects = new SparseArray<>();

        public SubtitleService(int i8, int i9) {
            this.subtitlePageId = i8;
            this.ancillaryPageId = i9;
        }

        public final void reset() {
            this.regions.clear();
            this.cluts.clear();
            this.objects.clear();
            this.ancillaryCluts.clear();
            this.ancillaryObjects.clear();
            this.displayDefinition = null;
            this.pageComposition = null;
        }
    }

    public DvbParser(int i8, int i9) {
        Paint paint = new Paint();
        this.defaultPaint = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.fillRegionPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.canvas = new Canvas();
        this.defaultDisplayDefinition = new DisplayDefinition(719, 575, 0, 719, 0, 575);
        this.defaultClutDefinition = new ClutDefinition(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.subtitleService = new SubtitleService(i8, i9);
    }

    private static byte[] buildClutMapTable(int i8, int i9, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            bArr[i10] = (byte) parsableBitArray.readBits(i9);
        }
        return bArr;
    }

    private static int[] generateDefault2BitClutEntries() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] generateDefault4BitClutEntries() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i13 = 1; i13 < 16; i13++) {
            if (i13 < 8) {
                if ((i13 & 1) != 0) {
                    i10 = 255;
                } else {
                    i10 = 0;
                }
                if ((i13 & 2) != 0) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                if ((i13 & 4) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                iArr[i13] = getColor(255, i10, i11, i12);
            } else {
                int i14 = i13 & 1;
                int i15 = ModuleDescriptor.MODULE_VERSION;
                if (i14 != 0) {
                    i8 = ModuleDescriptor.MODULE_VERSION;
                } else {
                    i8 = 0;
                }
                if ((i13 & 2) != 0) {
                    i9 = ModuleDescriptor.MODULE_VERSION;
                } else {
                    i9 = 0;
                }
                if ((i13 & 4) == 0) {
                    i15 = 0;
                }
                iArr[i13] = getColor(255, i8, i9, i15);
            }
        }
        return iArr;
    }

    private static int[] generateDefault8BitClutEntries() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i26 = 0; i26 < 256; i26++) {
            int i27 = 255;
            if (i26 < 8) {
                if ((i26 & 1) != 0) {
                    i24 = 255;
                } else {
                    i24 = 0;
                }
                if ((i26 & 2) != 0) {
                    i25 = 255;
                } else {
                    i25 = 0;
                }
                if ((i26 & 4) == 0) {
                    i27 = 0;
                }
                iArr[i26] = getColor(63, i24, i25, i27);
            } else {
                int i28 = i26 & 136;
                int i29 = 170;
                int i30 = 85;
                if (i28 != 0) {
                    if (i28 != 8) {
                        int i31 = 43;
                        if (i28 != 128) {
                            if (i28 == 136) {
                                if ((i26 & 1) != 0) {
                                    i20 = 43;
                                } else {
                                    i20 = 0;
                                }
                                if ((i26 & 16) != 0) {
                                    i21 = 85;
                                } else {
                                    i21 = 0;
                                }
                                int i32 = i20 + i21;
                                if ((i26 & 2) != 0) {
                                    i22 = 43;
                                } else {
                                    i22 = 0;
                                }
                                if ((i26 & 32) != 0) {
                                    i23 = 85;
                                } else {
                                    i23 = 0;
                                }
                                int i33 = i22 + i23;
                                if ((i26 & 4) == 0) {
                                    i31 = 0;
                                }
                                if ((i26 & 64) == 0) {
                                    i30 = 0;
                                }
                                iArr[i26] = getColor(255, i32, i33, i31 + i30);
                            }
                        } else {
                            if ((i26 & 1) != 0) {
                                i16 = 43;
                            } else {
                                i16 = 0;
                            }
                            int i34 = i16 + ModuleDescriptor.MODULE_VERSION;
                            if ((i26 & 16) != 0) {
                                i17 = 85;
                            } else {
                                i17 = 0;
                            }
                            int i35 = i34 + i17;
                            if ((i26 & 2) != 0) {
                                i18 = 43;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i18 + ModuleDescriptor.MODULE_VERSION;
                            if ((i26 & 32) != 0) {
                                i19 = 85;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i36 + i19;
                            if ((i26 & 4) == 0) {
                                i31 = 0;
                            }
                            int i38 = i31 + ModuleDescriptor.MODULE_VERSION;
                            if ((i26 & 64) == 0) {
                                i30 = 0;
                            }
                            iArr[i26] = getColor(255, i35, i37, i38 + i30);
                        }
                    } else {
                        if ((i26 & 1) != 0) {
                            i12 = 85;
                        } else {
                            i12 = 0;
                        }
                        if ((i26 & 16) != 0) {
                            i13 = 170;
                        } else {
                            i13 = 0;
                        }
                        int i39 = i12 + i13;
                        if ((i26 & 2) != 0) {
                            i14 = 85;
                        } else {
                            i14 = 0;
                        }
                        if ((i26 & 32) != 0) {
                            i15 = 170;
                        } else {
                            i15 = 0;
                        }
                        int i40 = i14 + i15;
                        if ((i26 & 4) == 0) {
                            i30 = 0;
                        }
                        if ((i26 & 64) == 0) {
                            i29 = 0;
                        }
                        iArr[i26] = getColor(ModuleDescriptor.MODULE_VERSION, i39, i40, i30 + i29);
                    }
                } else {
                    if ((i26 & 1) != 0) {
                        i8 = 85;
                    } else {
                        i8 = 0;
                    }
                    if ((i26 & 16) != 0) {
                        i9 = 170;
                    } else {
                        i9 = 0;
                    }
                    int i41 = i8 + i9;
                    if ((i26 & 2) != 0) {
                        i10 = 85;
                    } else {
                        i10 = 0;
                    }
                    if ((i26 & 32) != 0) {
                        i11 = 170;
                    } else {
                        i11 = 0;
                    }
                    int i42 = i10 + i11;
                    if ((i26 & 4) == 0) {
                        i30 = 0;
                    }
                    if ((i26 & 64) == 0) {
                        i29 = 0;
                    }
                    iArr[i26] = getColor(255, i41, i42, i30 + i29);
                }
            }
        }
        return iArr;
    }

    private static int getColor(int i8, int i9, int i10, int i11) {
        return (i8 << 24) | (i9 << 16) | (i10 << 8) | i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0083 A[LOOP:0: B:2:0x0009->B:13:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int paint2BitPixelCodeString(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 2
            int r4 = r13.readBits(r3)
            r5 = 1
            if (r4 == 0) goto L14
            r11 = r2
        L12:
            r12 = 1
            goto L61
        L14:
            boolean r4 = r13.readBit()
            r6 = 3
            if (r4 == 0) goto L28
            int r4 = r13.readBits(r6)
            int r4 = r4 + r6
            int r3 = r13.readBits(r3)
        L24:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L61
        L28:
            boolean r4 = r13.readBit()
            if (r4 == 0) goto L31
            r11 = r2
            r4 = 0
            goto L12
        L31:
            int r4 = r13.readBits(r3)
            if (r4 == 0) goto L5e
            if (r4 == r5) goto L5a
            if (r4 == r3) goto L4e
            if (r4 == r6) goto L41
            r11 = r2
            r4 = 0
        L3f:
            r12 = 0
            goto L61
        L41:
            r4 = 8
            int r4 = r13.readBits(r4)
            int r4 = r4 + 29
            int r3 = r13.readBits(r3)
            goto L24
        L4e:
            r4 = 4
            int r4 = r13.readBits(r4)
            int r4 = r4 + 12
            int r3 = r13.readBits(r3)
            goto L24
        L5a:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L61
        L5e:
            r4 = 0
            r11 = 1
            goto L3f
        L61:
            if (r12 == 0) goto L7f
            if (r8 == 0) goto L7f
            if (r15 == 0) goto L69
            r4 = r15[r4]
        L69:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L7f:
            int r10 = r10 + r12
            if (r11 == 0) goto L83
            return r10
        L83:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.text.dvb.DvbParser.paint2BitPixelCodeString(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[LOOP:0: B:2:0x0009->B:13:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int paint4BitPixelCodeString(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 4
            int r4 = r13.readBits(r3)
            r5 = 1
            if (r4 == 0) goto L15
            r11 = r2
        L12:
            r12 = 1
            goto L6e
        L15:
            boolean r4 = r13.readBit()
            r6 = 3
            if (r4 != 0) goto L2c
            int r3 = r13.readBits(r6)
            if (r3 == 0) goto L28
            int r3 = r3 + 2
            r11 = r2
            r12 = r3
            r4 = 0
            goto L6e
        L28:
            r4 = 0
            r11 = 1
        L2a:
            r12 = 0
            goto L6e
        L2c:
            boolean r4 = r13.readBit()
            r7 = 2
            if (r4 != 0) goto L40
            int r4 = r13.readBits(r7)
            int r4 = r4 + r3
            int r3 = r13.readBits(r3)
        L3c:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L6e
        L40:
            int r4 = r13.readBits(r7)
            if (r4 == 0) goto L6b
            if (r4 == r5) goto L67
            if (r4 == r7) goto L5c
            if (r4 == r6) goto L4f
            r11 = r2
            r4 = 0
            goto L2a
        L4f:
            r4 = 8
            int r4 = r13.readBits(r4)
            int r4 = r4 + 25
            int r3 = r13.readBits(r3)
            goto L3c
        L5c:
            int r4 = r13.readBits(r3)
            int r4 = r4 + 9
            int r3 = r13.readBits(r3)
            goto L3c
        L67:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L6e
        L6b:
            r11 = r2
            r4 = 0
            goto L12
        L6e:
            if (r12 == 0) goto L8c
            if (r8 == 0) goto L8c
            if (r15 == 0) goto L76
            r4 = r15[r4]
        L76:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L8c:
            int r10 = r10 + r12
            if (r11 == 0) goto L90
            return r10
        L90:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.text.dvb.DvbParser.paint4BitPixelCodeString(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static int paint8BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i8, int i9, Paint paint, Canvas canvas) {
        boolean z8;
        int readBits;
        int i10 = i8;
        boolean z9 = false;
        while (true) {
            int readBits2 = parsableBitArray.readBits(8);
            if (readBits2 != 0) {
                z8 = z9;
                readBits = 1;
            } else if (!parsableBitArray.readBit()) {
                int readBits3 = parsableBitArray.readBits(7);
                if (readBits3 != 0) {
                    z8 = z9;
                    readBits = readBits3;
                    readBits2 = 0;
                } else {
                    readBits2 = 0;
                    z8 = true;
                    readBits = 0;
                }
            } else {
                z8 = z9;
                readBits = parsableBitArray.readBits(7);
                readBits2 = parsableBitArray.readBits(8);
            }
            if (readBits != 0 && paint != null) {
                if (bArr != null) {
                    readBits2 = bArr[readBits2];
                }
                paint.setColor(iArr[readBits2]);
                canvas.drawRect(i10, i9, i10 + readBits, i9 + 1, paint);
            }
            i10 += readBits;
            if (z8) {
                return i10;
            }
            z9 = z8;
        }
    }

    private static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i8, int i9, int i10, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        int i11 = i9;
        int i12 = i10;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int readBits = parsableBitArray.readBits(8);
            if (readBits != 240) {
                switch (readBits) {
                    case 16:
                        if (i8 == 3) {
                            if (bArr5 == null) {
                                bArr3 = defaultMap2To8;
                            } else {
                                bArr3 = bArr5;
                            }
                        } else if (i8 == 2) {
                            if (bArr6 == null) {
                                bArr3 = defaultMap2To4;
                            } else {
                                bArr3 = bArr6;
                            }
                        } else {
                            bArr2 = null;
                            i11 = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, i11, i12, paint, canvas);
                            parsableBitArray.byteAlign();
                            break;
                        }
                        bArr2 = bArr3;
                        i11 = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, i11, i12, paint, canvas);
                        parsableBitArray.byteAlign();
                    case 17:
                        if (i8 == 3) {
                            bArr4 = defaultMap4To8;
                        } else {
                            bArr4 = null;
                        }
                        i11 = paint4BitPixelCodeString(parsableBitArray, iArr, bArr4, i11, i12, paint, canvas);
                        parsableBitArray.byteAlign();
                        break;
                    case 18:
                        i11 = paint8BitPixelCodeString(parsableBitArray, iArr, null, i11, i12, paint, canvas);
                        break;
                    default:
                        switch (readBits) {
                            case 32:
                                bArr6 = buildClutMapTable(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArr5 = buildClutMapTable(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArr5 = buildClutMapTable(16, 8, parsableBitArray);
                                break;
                        }
                }
            } else {
                i12 += 2;
                i11 = i9;
            }
        }
    }

    private static void paintPixelDataSubBlocks(ObjectData objectData, ClutDefinition clutDefinition, int i8, int i9, int i10, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i8 == 3) {
            iArr = clutDefinition.clutEntries8Bit;
        } else if (i8 == 2) {
            iArr = clutDefinition.clutEntries4Bit;
        } else {
            iArr = clutDefinition.clutEntries2Bit;
        }
        int[] iArr2 = iArr;
        paintPixelDataSubBlock(objectData.topFieldData, iArr2, i8, i9, i10, paint, canvas);
        paintPixelDataSubBlock(objectData.bottomFieldData, iArr2, i8, i9, i10 + 1, paint, canvas);
    }

    private static ClutDefinition parseClutDefinition(ParsableBitArray parsableBitArray, int i8) {
        int[] iArr;
        int readBits;
        int i9;
        int readBits2;
        int i10;
        int i11;
        int i12 = 8;
        int readBits3 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i13 = 2;
        int i14 = i8 - 2;
        int[] generateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] generateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] generateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i14 > 0) {
            int readBits4 = parsableBitArray.readBits(i12);
            int readBits5 = parsableBitArray.readBits(i12);
            if ((readBits5 & 128) != 0) {
                iArr = generateDefault2BitClutEntries;
            } else if ((readBits5 & 64) != 0) {
                iArr = generateDefault4BitClutEntries;
            } else {
                iArr = generateDefault8BitClutEntries;
            }
            if ((readBits5 & 1) != 0) {
                i10 = parsableBitArray.readBits(i12);
                i11 = parsableBitArray.readBits(i12);
                readBits = parsableBitArray.readBits(i12);
                readBits2 = parsableBitArray.readBits(i12);
                i9 = i14 - 6;
            } else {
                int readBits6 = parsableBitArray.readBits(6) << i13;
                int readBits7 = parsableBitArray.readBits(4) << 4;
                readBits = parsableBitArray.readBits(4) << 4;
                i9 = i14 - 4;
                readBits2 = parsableBitArray.readBits(i13) << 6;
                i10 = readBits6;
                i11 = readBits7;
            }
            if (i10 == 0) {
                i11 = 0;
                readBits = 0;
                readBits2 = 255;
            }
            double d8 = i10;
            double d9 = i11 - 128;
            double d10 = readBits - 128;
            iArr[readBits4] = getColor((byte) (255 - (readBits2 & 255)), Util.constrainValue((int) (d8 + (1.402d * d9)), 0, 255), Util.constrainValue((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 0, 255), Util.constrainValue((int) (d8 + (d10 * 1.772d)), 0, 255));
            i14 = i9;
            readBits3 = readBits3;
            i12 = 8;
            i13 = 2;
        }
        return new ClutDefinition(readBits3, generateDefault2BitClutEntries, generateDefault4BitClutEntries, generateDefault8BitClutEntries);
    }

    private static DisplayDefinition parseDisplayDefinition(ParsableBitArray parsableBitArray) {
        int i8;
        int i9;
        int i10;
        int i11;
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int readBits = parsableBitArray.readBits(16);
        int readBits2 = parsableBitArray.readBits(16);
        if (readBit) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            int readBits5 = parsableBitArray.readBits(16);
            i9 = parsableBitArray.readBits(16);
            i8 = readBits4;
            i11 = readBits5;
            i10 = readBits3;
        } else {
            i8 = readBits;
            i9 = readBits2;
            i10 = 0;
            i11 = 0;
        }
        return new DisplayDefinition(readBits, readBits2, i10, i8, i11, i9);
    }

    private static ObjectData parseObjectData(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int readBits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int readBits2 = parsableBitArray.readBits(2);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr2 = null;
        if (readBits2 == 1) {
            parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        } else if (readBits2 == 0) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            if (readBits3 > 0) {
                bArr2 = new byte[readBits3];
                parsableBitArray.readBytes(bArr2, 0, readBits3);
            }
            if (readBits4 > 0) {
                bArr = new byte[readBits4];
                parsableBitArray.readBytes(bArr, 0, readBits4);
                return new ObjectData(readBits, readBit, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new ObjectData(readBits, readBit, bArr2, bArr);
    }

    private static PageComposition parsePageComposition(ParsableBitArray parsableBitArray, int i8) {
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(4);
        int readBits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i9 = i8 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i9 > 0) {
            int readBits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            i9 -= 6;
            sparseArray.put(readBits4, new PageRegion(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new PageComposition(readBits, readBits2, readBits3, sparseArray);
    }

    private static RegionComposition parseRegionComposition(ParsableBitArray parsableBitArray, int i8) {
        int i9;
        int i10;
        int readBits = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i11 = 16;
        int readBits2 = parsableBitArray.readBits(16);
        int readBits3 = parsableBitArray.readBits(16);
        int readBits4 = parsableBitArray.readBits(3);
        int readBits5 = parsableBitArray.readBits(3);
        int i12 = 2;
        parsableBitArray.skipBits(2);
        int readBits6 = parsableBitArray.readBits(8);
        int readBits7 = parsableBitArray.readBits(8);
        int readBits8 = parsableBitArray.readBits(4);
        int readBits9 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i13 = i8 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int readBits10 = parsableBitArray.readBits(i11);
            int readBits11 = parsableBitArray.readBits(i12);
            int readBits12 = parsableBitArray.readBits(i12);
            int readBits13 = parsableBitArray.readBits(12);
            int i14 = readBits9;
            parsableBitArray.skipBits(4);
            int readBits14 = parsableBitArray.readBits(12);
            int i15 = i13 - 6;
            if (readBits11 != 1 && readBits11 != 2) {
                i13 = i15;
                i10 = 0;
                i9 = 0;
                sparseArray.put(readBits10, new RegionObject(readBits11, readBits12, readBits13, readBits14, i10, i9));
                readBits9 = i14;
                i12 = 2;
                i11 = 16;
            }
            i13 -= 8;
            i10 = parsableBitArray.readBits(8);
            i9 = parsableBitArray.readBits(8);
            sparseArray.put(readBits10, new RegionObject(readBits11, readBits12, readBits13, readBits14, i10, i9));
            readBits9 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new RegionComposition(readBits, readBit, readBits2, readBits3, readBits4, readBits5, readBits6, readBits7, readBits8, readBits9, sparseArray);
    }

    private static void parseSubtitlingSegment(ParsableBitArray parsableBitArray, SubtitleService subtitleService) {
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(16);
        int readBits3 = parsableBitArray.readBits(16);
        int bytePosition = parsableBitArray.getBytePosition() + readBits3;
        if (readBits3 * 8 > parsableBitArray.bitsLeft()) {
            Log.w(TAG, "Data field length exceeds limit");
            parsableBitArray.skipBits(parsableBitArray.bitsLeft());
            return;
        }
        switch (readBits) {
            case 16:
                if (readBits2 == subtitleService.subtitlePageId) {
                    PageComposition pageComposition = subtitleService.pageComposition;
                    PageComposition parsePageComposition = parsePageComposition(parsableBitArray, readBits3);
                    if (parsePageComposition.state != 0) {
                        subtitleService.pageComposition = parsePageComposition;
                        subtitleService.regions.clear();
                        subtitleService.cluts.clear();
                        subtitleService.objects.clear();
                        break;
                    } else if (pageComposition != null && pageComposition.version != parsePageComposition.version) {
                        subtitleService.pageComposition = parsePageComposition;
                        break;
                    }
                }
                break;
            case 17:
                PageComposition pageComposition2 = subtitleService.pageComposition;
                if (readBits2 == subtitleService.subtitlePageId && pageComposition2 != null) {
                    RegionComposition parseRegionComposition = parseRegionComposition(parsableBitArray, readBits3);
                    if (pageComposition2.state == 0) {
                        parseRegionComposition.mergeFrom(subtitleService.regions.get(parseRegionComposition.id));
                    }
                    subtitleService.regions.put(parseRegionComposition.id, parseRegionComposition);
                    break;
                }
                break;
            case 18:
                if (readBits2 == subtitleService.subtitlePageId) {
                    ClutDefinition parseClutDefinition = parseClutDefinition(parsableBitArray, readBits3);
                    subtitleService.cluts.put(parseClutDefinition.id, parseClutDefinition);
                    break;
                } else if (readBits2 == subtitleService.ancillaryPageId) {
                    ClutDefinition parseClutDefinition2 = parseClutDefinition(parsableBitArray, readBits3);
                    subtitleService.ancillaryCluts.put(parseClutDefinition2.id, parseClutDefinition2);
                    break;
                }
                break;
            case 19:
                if (readBits2 == subtitleService.subtitlePageId) {
                    ObjectData parseObjectData = parseObjectData(parsableBitArray);
                    subtitleService.objects.put(parseObjectData.id, parseObjectData);
                    break;
                } else if (readBits2 == subtitleService.ancillaryPageId) {
                    ObjectData parseObjectData2 = parseObjectData(parsableBitArray);
                    subtitleService.ancillaryObjects.put(parseObjectData2.id, parseObjectData2);
                    break;
                }
                break;
            case 20:
                if (readBits2 == subtitleService.subtitlePageId) {
                    subtitleService.displayDefinition = parseDisplayDefinition(parsableBitArray);
                    break;
                }
                break;
        }
        parsableBitArray.skipBytes(bytePosition - parsableBitArray.getBytePosition());
    }

    public final List<Cue> decode(byte[] bArr, int i8) {
        int i9;
        ObjectData objectData;
        int i10;
        SparseArray<RegionObject> sparseArray;
        Paint paint;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i8);
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            parseSubtitlingSegment(parsableBitArray, this.subtitleService);
        }
        SubtitleService subtitleService = this.subtitleService;
        if (subtitleService.pageComposition == null) {
            return Collections.emptyList();
        }
        DisplayDefinition displayDefinition = subtitleService.displayDefinition;
        if (displayDefinition == null) {
            displayDefinition = this.defaultDisplayDefinition;
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || displayDefinition.width + 1 != bitmap.getWidth() || displayDefinition.height + 1 != this.bitmap.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(displayDefinition.width + 1, displayDefinition.height + 1, Bitmap.Config.ARGB_8888);
            this.bitmap = createBitmap;
            this.canvas.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<PageRegion> sparseArray2 = this.subtitleService.pageComposition.regions;
        for (int i11 = 0; i11 < sparseArray2.size(); i11++) {
            PageRegion valueAt = sparseArray2.valueAt(i11);
            RegionComposition regionComposition = this.subtitleService.regions.get(sparseArray2.keyAt(i11));
            int i12 = valueAt.horizontalAddress + displayDefinition.horizontalPositionMinimum;
            int i13 = valueAt.verticalAddress + displayDefinition.verticalPositionMinimum;
            float f8 = i12;
            float f9 = i13;
            this.canvas.clipRect(f8, f9, Math.min(regionComposition.width + i12, displayDefinition.horizontalPositionMaximum), Math.min(regionComposition.height + i13, displayDefinition.verticalPositionMaximum), Region.Op.REPLACE);
            ClutDefinition clutDefinition = this.subtitleService.cluts.get(regionComposition.clutId);
            if (clutDefinition == null && (clutDefinition = this.subtitleService.ancillaryCluts.get(regionComposition.clutId)) == null) {
                clutDefinition = this.defaultClutDefinition;
            }
            SparseArray<RegionObject> sparseArray3 = regionComposition.regionObjects;
            int i14 = 0;
            while (i14 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i14);
                RegionObject valueAt2 = sparseArray3.valueAt(i14);
                ObjectData objectData2 = this.subtitleService.objects.get(keyAt);
                if (objectData2 == null) {
                    objectData = this.subtitleService.ancillaryObjects.get(keyAt);
                } else {
                    objectData = objectData2;
                }
                if (objectData != null) {
                    if (objectData.nonModifyingColorFlag) {
                        paint = null;
                    } else {
                        paint = this.defaultPaint;
                    }
                    i10 = i14;
                    sparseArray = sparseArray3;
                    paintPixelDataSubBlocks(objectData, clutDefinition, regionComposition.depth, valueAt2.horizontalPosition + i12, i13 + valueAt2.verticalPosition, paint, this.canvas);
                } else {
                    i10 = i14;
                    sparseArray = sparseArray3;
                }
                i14 = i10 + 1;
                sparseArray3 = sparseArray;
            }
            if (regionComposition.fillFlag) {
                int i15 = regionComposition.depth;
                if (i15 == 3) {
                    i9 = clutDefinition.clutEntries8Bit[regionComposition.pixelCode8Bit];
                } else if (i15 == 2) {
                    i9 = clutDefinition.clutEntries4Bit[regionComposition.pixelCode4Bit];
                } else {
                    i9 = clutDefinition.clutEntries2Bit[regionComposition.pixelCode2Bit];
                }
                this.fillRegionPaint.setColor(i9);
                this.canvas.drawRect(f8, f9, regionComposition.width + i12, regionComposition.height + i13, this.fillRegionPaint);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(this.bitmap, i12, i13, regionComposition.width, regionComposition.height);
            int i16 = displayDefinition.width;
            int i17 = displayDefinition.height;
            arrayList.add(new Cue(createBitmap2, f8 / i16, 0, f9 / i17, 0, regionComposition.width / i16, regionComposition.height / i17));
            this.canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    public final void reset() {
        this.subtitleService.reset();
    }
}
