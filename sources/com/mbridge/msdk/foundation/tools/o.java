package com.mbridge.msdk.foundation.tools;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Array;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static int f21330a = 2048;

    public static Bitmap a(Bitmap bitmap, int i8) {
        int i9;
        int[] iArr;
        if (i8 <= 0) {
            i9 = 10;
        } else {
            i9 = i8;
        }
        int width = bitmap.getWidth() / i9;
        int height = bitmap.getHeight() / i9;
        int i10 = 0;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, false);
        int width2 = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int i11 = width2 * height2;
        int[] iArr2 = new int[i11];
        createScaledBitmap.getPixels(iArr2, 0, width2, 0, 0, width2, height2);
        int i12 = width2 - 1;
        int i13 = height2 - 1;
        int[] iArr3 = new int[i11];
        int[] iArr4 = new int[i11];
        int[] iArr5 = new int[i11];
        int[] iArr6 = new int[Math.max(width2, height2)];
        int[] iArr7 = new int[20736];
        for (int i14 = 0; i14 < 20736; i14++) {
            iArr7[i14] = i14 / 81;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 17, 3);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            if (i15 >= height2) {
                break;
            }
            int i18 = -8;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 8; i18 <= i28; i28 = 8) {
                int i29 = iArr2[i16 + Math.min(i12, Math.max(i18, i10))];
                int[] iArr9 = iArr8[i18 + 8];
                iArr9[i10] = (i29 & 16711680) >> 16;
                iArr9[1] = (i29 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[2] = i29 & 255;
                int abs = 9 - Math.abs(i18);
                int i30 = iArr9[i10];
                i19 += i30 * abs;
                int i31 = iArr9[1];
                i20 += i31 * abs;
                int i32 = iArr9[2];
                i21 += abs * i32;
                if (i18 > 0) {
                    i25 += i30;
                    i26 += i31;
                    i27 += i32;
                } else {
                    i22 += i30;
                    i23 += i31;
                    i24 += i32;
                }
                i18++;
            }
            int i33 = 8;
            int i34 = 0;
            while (i34 < width2) {
                iArr3[i16] = iArr7[i19];
                iArr4[i16] = iArr7[i20];
                iArr5[i16] = iArr7[i21];
                int i35 = i19 - i22;
                int i36 = i20 - i23;
                int i37 = i21 - i24;
                int[] iArr10 = iArr8[(i33 + 9) % 17];
                int i38 = i22 - iArr10[i10];
                int i39 = i23 - iArr10[1];
                int i40 = i24 - iArr10[2];
                if (i15 == 0) {
                    iArr6[i34] = Math.min(i34 + 9, i12);
                }
                int i41 = iArr2[i17 + iArr6[i34]];
                int i42 = (i41 & 16711680) >> 16;
                iArr10[0] = i42;
                int i43 = (i41 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[1] = i43;
                int i44 = i41 & 255;
                iArr10[2] = i44;
                int i45 = i25 + i42;
                int i46 = i26 + i43;
                int i47 = i27 + i44;
                i19 = i35 + i45;
                i20 = i36 + i46;
                i21 = i37 + i47;
                i33 = (i33 + 1) % 17;
                int[] iArr11 = iArr8[i33 % 17];
                int i48 = iArr11[0];
                i22 = i38 + i48;
                int i49 = iArr11[1];
                i23 = i39 + i49;
                int i50 = iArr11[2];
                i24 = i40 + i50;
                i25 = i45 - i48;
                i26 = i46 - i49;
                i27 = i47 - i50;
                i16++;
                i34++;
                i10 = 0;
            }
            i17 += width2;
            i15++;
            i10 = 0;
        }
        int i51 = 0;
        while (i51 < width2) {
            int i52 = (-8) * width2;
            Bitmap bitmap2 = createScaledBitmap;
            int[] iArr12 = iArr6;
            int i53 = -8;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            for (int i63 = 8; i53 <= i63; i63 = 8) {
                int max = Math.max(0, i52) + i51;
                int[] iArr13 = iArr8[i53 + 8];
                iArr13[0] = iArr3[max];
                iArr13[1] = iArr4[max];
                iArr13[2] = iArr5[max];
                int abs2 = 9 - Math.abs(i53);
                i54 += iArr3[max] * abs2;
                i55 += iArr4[max] * abs2;
                i56 += iArr5[max] * abs2;
                if (i53 > 0) {
                    i60 += iArr13[0];
                    i61 += iArr13[1];
                    i62 += iArr13[2];
                } else {
                    i57 += iArr13[0];
                    i58 += iArr13[1];
                    i59 += iArr13[2];
                }
                if (i53 < i13) {
                    i52 += width2;
                }
                i53++;
            }
            int i64 = i51;
            int i65 = 0;
            int i66 = 8;
            while (i65 < height2) {
                iArr2[i64] = (iArr2[i64] & ViewCompat.MEASURED_STATE_MASK) | (iArr7[i54] << 16) | (iArr7[i55] << 8) | iArr7[i56];
                int i67 = i54 - i57;
                int i68 = i55 - i58;
                int i69 = i56 - i59;
                int[] iArr14 = iArr8[(i66 + 9) % 17];
                int i70 = i57 - iArr14[0];
                int i71 = i58 - iArr14[1];
                int i72 = i59 - iArr14[2];
                if (i51 == 0) {
                    iArr = iArr7;
                    iArr12[i65] = Math.min(i65 + 9, i13) * width2;
                } else {
                    iArr = iArr7;
                }
                int i73 = iArr12[i65] + i51;
                int i74 = iArr3[i73];
                iArr14[0] = i74;
                int i75 = iArr4[i73];
                iArr14[1] = i75;
                int i76 = iArr5[i73];
                iArr14[2] = i76;
                int i77 = i60 + i74;
                int i78 = i61 + i75;
                int i79 = i62 + i76;
                i54 = i67 + i77;
                i55 = i68 + i78;
                i56 = i69 + i79;
                i66 = (i66 + 1) % 17;
                int[] iArr15 = iArr8[i66];
                int i80 = iArr15[0];
                i57 = i70 + i80;
                int i81 = iArr15[1];
                i58 = i71 + i81;
                int i82 = iArr15[2];
                i59 = i72 + i82;
                i60 = i77 - i80;
                i61 = i78 - i81;
                i62 = i79 - i82;
                i64 += width2;
                i65++;
                iArr7 = iArr;
            }
            i51++;
            createScaledBitmap = bitmap2;
            iArr6 = iArr12;
        }
        Bitmap bitmap3 = createScaledBitmap;
        bitmap3.setPixels(iArr2, 0, width2, 0, 0, width2, height2);
        return bitmap3;
    }
}
