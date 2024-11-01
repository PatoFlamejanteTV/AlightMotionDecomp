package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public final class TrackEncryptionBox {
    private static final String TAG = "TrackEncryptionBox";
    public final TrackOutput.CryptoData cryptoData;
    public final byte[] defaultInitializationVector;
    public final int initializationVectorSize;
    public final boolean isEncrypted;
    public final String schemeType;

    public TrackEncryptionBox(boolean z8, String str, int i8, byte[] bArr, int i9, int i10, byte[] bArr2) {
        boolean z9;
        if (i8 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Assertions.checkArgument((bArr2 == null) ^ z9);
        this.isEncrypted = z8;
        this.schemeType = str;
        this.initializationVectorSize = i8;
        this.defaultInitializationVector = bArr2;
        this.cryptoData = new TrackOutput.CryptoData(schemeToCryptoMode(str), bArr, i9, i10);
    }

    private static int schemeToCryptoMode(String str) {
        if (str == null) {
            return 1;
        }
        char c8 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C.CENC_TYPE_cbc1)) {
                    c8 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(C.CENC_TYPE_cbcs)) {
                    c8 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals(C.CENC_TYPE_cenc)) {
                    c8 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(C.CENC_TYPE_cens)) {
                    c8 = 3;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
            case 1:
                return 2;
            default:
                Log.w(TAG, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
