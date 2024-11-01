package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import com.mbridge.msdk.system.NoProGuard;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes4.dex */
public class SameMD5 implements NoProGuard {
    public static final String TAG = "MD5";

    public static String ByteArrayToHexString(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        int length = bArr.length * 2;
        byte[] bArr2 = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr2[i8] = 48;
        }
        byte[] bArr3 = new byte[bArr.length + 1];
        bArr3[0] = 0;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        byte[] bytes = new BigInteger(bArr3).toString(16).getBytes();
        System.arraycopy(bytes, 0, bArr2, length - bytes.length, bytes.length);
        return new String(bArr2);
    }

    private static String UpHexEncode(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            sb.append(Integer.toHexString((b9 & 240) >>> 4));
            sb.append(Integer.toHexString(b9 & 15));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    public static String getMD5(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            ad.a(TAG, str);
            MessageDigest messageDigest = MessageDigest.getInstance(TAG);
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            return hexEncode(messageDigest.digest());
        } catch (NoSuchAlgorithmException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static String getQftJSMD5(String str) {
        try {
            byte[] qftJSMD5Bytes = getQftJSMD5Bytes(str);
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            MessageDigest messageDigest = MessageDigest.getInstance(TAG);
            messageDigest.update(qftJSMD5Bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i8 = 0;
            for (byte b9 : digest) {
                int i9 = i8 + 1;
                cArr2[i8] = cArr[(b9 >>> 4) & 15];
                i8 += 2;
                cArr2[i9] = cArr[b9 & 15];
            }
            return new String(cArr2);
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static byte[] getQftJSMD5Bytes(String str) throws UnsupportedEncodingException {
        int length = str.length();
        byte[] bytes = str.getBytes("UTF-16LE");
        ad.c(InternalFrame.ID, "b = " + ByteArrayToHexString(bytes));
        byte[] bArr = new byte[length];
        int i8 = 0;
        for (int i9 = 0; i9 < bytes.length; i9 += 2) {
            byte b9 = bytes[i9];
            if (b9 != -1 && b9 != -2) {
                bArr[i8] = b9;
                i8++;
                if (i8 == length) {
                    break;
                }
            }
        }
        ad.c(InternalFrame.ID, "source = " + ByteArrayToHexString(bArr));
        return bArr;
    }

    public static String getUPMD5(String str) {
        try {
            ad.a(TAG, str);
            MessageDigest messageDigest = MessageDigest.getInstance(TAG);
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            return UpHexEncode(messageDigest.digest());
        } catch (NoSuchAlgorithmException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static String hexEncode(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            sb.append(Integer.toHexString((b9 & 240) >>> 4));
            sb.append(Integer.toHexString(b9 & 15));
        }
        return sb.toString().toLowerCase(Locale.US);
    }
}
