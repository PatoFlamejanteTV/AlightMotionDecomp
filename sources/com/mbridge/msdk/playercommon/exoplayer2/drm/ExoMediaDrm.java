package com.mbridge.msdk.playercommon.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface ExoMediaDrm<T extends ExoMediaCrypto> {
    public static final int EVENT_KEY_EXPIRED = 3;
    public static final int EVENT_KEY_REQUIRED = 2;
    public static final int EVENT_PROVISION_REQUIRED = 1;
    public static final int KEY_TYPE_OFFLINE = 2;
    public static final int KEY_TYPE_RELEASE = 3;
    public static final int KEY_TYPE_STREAMING = 1;

    /* loaded from: classes4.dex */
    public static final class DefaultKeyRequest implements KeyRequest {
        private final byte[] data;
        private final String defaultUrl;

        public DefaultKeyRequest(byte[] bArr, String str) {
            this.data = bArr;
            this.defaultUrl = str;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.KeyRequest
        public final byte[] getData() {
            return this.data;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.KeyRequest
        public final String getDefaultUrl() {
            return this.defaultUrl;
        }
    }

    /* loaded from: classes4.dex */
    public static final class DefaultKeyStatus implements KeyStatus {
        private final byte[] keyId;
        private final int statusCode;

        /* JADX INFO: Access modifiers changed from: package-private */
        public DefaultKeyStatus(int i8, byte[] bArr) {
            this.statusCode = i8;
            this.keyId = bArr;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.KeyStatus
        public final byte[] getKeyId() {
            return this.keyId;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.KeyStatus
        public final int getStatusCode() {
            return this.statusCode;
        }
    }

    /* loaded from: classes4.dex */
    public static final class DefaultProvisionRequest implements ProvisionRequest {
        private final byte[] data;
        private final String defaultUrl;

        public DefaultProvisionRequest(byte[] bArr, String str) {
            this.data = bArr;
            this.defaultUrl = str;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.ProvisionRequest
        public final byte[] getData() {
            return this.data;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.ProvisionRequest
        public final String getDefaultUrl() {
            return this.defaultUrl;
        }
    }

    /* loaded from: classes4.dex */
    public interface KeyRequest {
        byte[] getData();

        String getDefaultUrl();
    }

    /* loaded from: classes4.dex */
    public interface KeyStatus {
        byte[] getKeyId();

        int getStatusCode();
    }

    /* loaded from: classes4.dex */
    public interface OnEventListener<T extends ExoMediaCrypto> {
        void onEvent(ExoMediaDrm<? extends T> exoMediaDrm, byte[] bArr, int i8, int i9, byte[] bArr2);
    }

    /* loaded from: classes4.dex */
    public interface OnKeyStatusChangeListener<T extends ExoMediaCrypto> {
        void onKeyStatusChange(ExoMediaDrm<? extends T> exoMediaDrm, byte[] bArr, List<KeyStatus> list, boolean z8);
    }

    /* loaded from: classes4.dex */
    public interface ProvisionRequest {
        byte[] getData();

        String getDefaultUrl();
    }

    void closeSession(byte[] bArr);

    T createMediaCrypto(byte[] bArr) throws MediaCryptoException;

    KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i8, HashMap<String, String> hashMap) throws NotProvisionedException;

    byte[] getPropertyByteArray(String str);

    String getPropertyString(String str);

    ProvisionRequest getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnEventListener(OnEventListener<? super T> onEventListener);

    void setOnKeyStatusChangeListener(OnKeyStatusChangeListener<? super T> onKeyStatusChangeListener);

    void setPropertyByteArray(String str, byte[] bArr);

    void setPropertyString(String str, String str2);
}
