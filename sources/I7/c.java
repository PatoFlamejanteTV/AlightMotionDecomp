package I7;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public abstract class c {
    public static a a(b bVar, i iVar) {
        int d8 = bVar.d();
        int i8 = 1 << d8;
        int g8 = iVar.g();
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, g8, i8);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, g8, i8);
        for (int i9 = 0; i9 < i8; i9++) {
            iArr2[0][i9] = bVar.f(iVar.e(i9));
        }
        for (int i10 = 1; i10 < g8; i10++) {
            for (int i11 = 0; i11 < i8; i11++) {
                iArr2[i10][i11] = bVar.h(iArr2[i10 - 1][i11], i11);
            }
        }
        for (int i12 = 0; i12 < g8; i12++) {
            for (int i13 = 0; i13 < i8; i13++) {
                for (int i14 = 0; i14 <= i12; i14++) {
                    int[] iArr3 = iArr[i12];
                    iArr3[i13] = bVar.a(iArr3[i13], bVar.h(iArr2[i14][i13], iVar.f((g8 + i14) - i12)));
                }
            }
        }
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, g8 * d8, (i8 + 31) >>> 5);
        for (int i15 = 0; i15 < i8; i15++) {
            int i16 = i15 >>> 5;
            int i17 = 1 << (i15 & 31);
            for (int i18 = 0; i18 < g8; i18++) {
                int i19 = iArr[i18][i15];
                for (int i20 = 0; i20 < d8; i20++) {
                    if (((i19 >>> i20) & 1) != 0) {
                        int[] iArr5 = iArr4[(((i18 + 1) * d8) - i20) - 1];
                        iArr5[i16] = iArr5[i16] ^ i17;
                    }
                }
            }
        }
        return new a(i8, iArr4);
    }
}
