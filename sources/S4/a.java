package S4;

import android.util.Log;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.InputStream;
import java.util.jar.JarFile;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f9428a = new StringBuilder();

    private int a(byte[] bArr, int i8) {
        return (bArr[i8] & 255) | ((bArr[i8 + 3] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[i8 + 2] << 16) & 16711680) | ((bArr[i8 + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private String b(byte[] bArr, int i8, int i9, int i10) {
        if (i10 < 0) {
            return null;
        }
        return c(bArr, i9 + a(bArr, i8 + (i10 * 4)));
    }

    private String c(byte[] bArr, int i8) {
        int i9 = ((bArr[i8 + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr[i8] & 255);
        byte[] bArr2 = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr2[i10] = bArr[i8 + 2 + (i10 * 2)];
        }
        return new String(bArr2);
    }

    private void d(byte[] bArr) {
        String str;
        int a9 = (a(bArr, 16) * 4) + 36;
        int a10 = a(bArr, 12);
        int i8 = a10;
        while (true) {
            if (i8 >= bArr.length - 4) {
                break;
            }
            if (a(bArr, i8) == 1048834) {
                a10 = i8;
                break;
            }
            i8 += 4;
        }
        int i9 = 0;
        while (true) {
            if (a10 >= bArr.length) {
                break;
            }
            int a11 = a(bArr, a10);
            int a12 = a(bArr, a10 + 20);
            if (a11 == 1048834) {
                int a13 = a(bArr, a10 + 28);
                a10 += 36;
                String b9 = b(bArr, 36, a9, a12);
                StringBuilder sb = new StringBuilder();
                for (int i10 = 0; i10 < a13; i10++) {
                    int a14 = a(bArr, a10 + 4);
                    int a15 = a(bArr, a10 + 8);
                    int a16 = a(bArr, a10 + 16);
                    a10 += 20;
                    String b10 = b(bArr, 36, a9, a14);
                    if (a15 != -1) {
                        str = b(bArr, 36, a9, a15);
                    } else {
                        str = "resourceID 0x" + Integer.toHexString(a16);
                    }
                    sb.append(" " + b10 + "=\"" + str + "\"");
                }
                e(i9, "<" + b9 + ((Object) sb) + ">");
                i9++;
            } else if (a11 == 1048835) {
                i9--;
                a10 += 24;
                e(i9, "</" + b(bArr, 36, a9, a12) + ">");
            } else if (a11 != 1048833) {
                Log.d("decompressXml", "  Unrecognized tag code '" + Integer.toHexString(a11) + "' at offset " + a10);
            }
        }
        Log.d("decompressXml", "    end at offset " + a10);
    }

    private void e(int i8, String str) {
        String str2 = "                                             ".substring(0, Math.min(i8 * 2, 45)) + str;
        StringBuilder sb = this.f9428a;
        sb.append(str2);
        sb.append('\n');
    }

    public String f(String str) {
        try {
            JarFile jarFile = new JarFile(str);
            InputStream inputStream = jarFile.getInputStream(jarFile.getEntry("AndroidManifest.xml"));
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            d(bArr);
        } catch (Exception e8) {
            Log.d("decompressXml", "getIntents, ex: " + e8);
            e8.printStackTrace();
        }
        return this.f9428a.toString();
    }
}
