package com.mbridge.msdk.playercommon.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class FrameworkMediaDrm implements ExoMediaDrm<FrameworkMediaCrypto> {
    private static final String CENC_SCHEME_MIME_TYPE = "cenc";
    private final MediaDrm mediaDrm;
    private final UUID uuid;

    private FrameworkMediaDrm(UUID uuid) throws UnsupportedSchemeException {
        Assertions.checkNotNull(uuid);
        UUID uuid2 = C.COMMON_PSSH_UUID;
        Assertions.checkArgument(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        if (Util.SDK_INT < 27 && C.CLEARKEY_UUID.equals(uuid)) {
            uuid = uuid2;
        }
        this.uuid = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.mediaDrm = mediaDrm;
        if (C.WIDEVINE_UUID.equals(uuid) && needsForceL3Workaround()) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    private static boolean needsForceL3Workaround() {
        return "ASUS_Z00AD".equals(Util.MODEL);
    }

    public static FrameworkMediaDrm newInstance(UUID uuid) throws UnsupportedDrmException {
        try {
            return new FrameworkMediaDrm(uuid);
        } catch (UnsupportedSchemeException e8) {
            throw new UnsupportedDrmException(1, e8);
        } catch (Exception e9) {
            throw new UnsupportedDrmException(2, e9);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final void closeSession(byte[] bArr) {
        this.mediaDrm.closeSession(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x003c, code lost:            if ("AFTM".equals(r1) == false) goto L20;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.KeyRequest getKeyRequest(byte[] r9, byte[] r10, java.lang.String r11, int r12, java.util.HashMap<java.lang.String, java.lang.String> r13) throws android.media.NotProvisionedException {
        /*
            r8 = this;
            int r0 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L10
            java.util.UUID r1 = com.mbridge.msdk.playercommon.exoplayer2.C.WIDEVINE_UUID
            java.util.UUID r2 = r8.uuid
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3e
        L10:
            java.util.UUID r1 = com.mbridge.msdk.playercommon.exoplayer2.C.PLAYREADY_UUID
            java.util.UUID r2 = r8.uuid
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L49
            java.lang.String r1 = "Amazon"
            java.lang.String r2 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.MANUFACTURER
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L49
            java.lang.String r1 = com.mbridge.msdk.playercommon.exoplayer2.util.Util.MODEL
            java.lang.String r2 = "AFTB"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L3e
            java.lang.String r2 = "AFTS"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L3e
            java.lang.String r2 = "AFTM"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L49
        L3e:
            java.util.UUID r1 = r8.uuid
            byte[] r1 = com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(r10, r1)
            if (r1 != 0) goto L47
            goto L49
        L47:
            r4 = r1
            goto L4a
        L49:
            r4 = r10
        L4a:
            r10 = 26
            if (r0 >= r10) goto L6a
            java.util.UUID r10 = com.mbridge.msdk.playercommon.exoplayer2.C.CLEARKEY_UUID
            java.util.UUID r0 = r8.uuid
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L6a
            java.lang.String r10 = "video/mp4"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L68
            java.lang.String r10 = "audio/mp4"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L6a
        L68:
            java.lang.String r11 = "cenc"
        L6a:
            r5 = r11
            android.media.MediaDrm r2 = r8.mediaDrm
            r3 = r9
            r6 = r12
            r7 = r13
            android.media.MediaDrm$KeyRequest r9 = r2.getKeyRequest(r3, r4, r5, r6, r7)
            byte[] r10 = r9.getData()
            java.util.UUID r11 = com.mbridge.msdk.playercommon.exoplayer2.C.CLEARKEY_UUID
            java.util.UUID r12 = r8.uuid
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L86
            byte[] r10 = com.mbridge.msdk.playercommon.exoplayer2.drm.ClearKeyUtil.adjustRequestData(r10)
        L86:
            com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm$DefaultKeyRequest r11 = new com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm$DefaultKeyRequest
            java.lang.String r9 = r9.getDefaultUrl()
            r11.<init>(r10, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaDrm.getKeyRequest(byte[], byte[], java.lang.String, int, java.util.HashMap):com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm$KeyRequest");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final byte[] getPropertyByteArray(String str) {
        return this.mediaDrm.getPropertyByteArray(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final String getPropertyString(String str) {
        return this.mediaDrm.getPropertyString(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.mediaDrm.getProvisionRequest();
        return new ExoMediaDrm.DefaultProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final byte[] openSession() throws MediaDrmException {
        return this.mediaDrm.openSession();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C.CLEARKEY_UUID.equals(this.uuid)) {
            bArr2 = ClearKeyUtil.adjustResponseData(bArr2);
        }
        return this.mediaDrm.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.mediaDrm.provideProvisionResponse(bArr);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final void release() {
        this.mediaDrm.release();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.mediaDrm.restoreKeys(bArr, bArr2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final void setOnEventListener(final ExoMediaDrm.OnEventListener<? super FrameworkMediaCrypto> onEventListener) {
        MediaDrm.OnEventListener onEventListener2;
        MediaDrm mediaDrm = this.mediaDrm;
        if (onEventListener == null) {
            onEventListener2 = null;
        } else {
            onEventListener2 = new MediaDrm.OnEventListener() { // from class: com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaDrm.1
                @Override // android.media.MediaDrm.OnEventListener
                public void onEvent(MediaDrm mediaDrm2, byte[] bArr, int i8, int i9, byte[] bArr2) {
                    onEventListener.onEvent(FrameworkMediaDrm.this, bArr, i8, i9, bArr2);
                }
            };
        }
        mediaDrm.setOnEventListener(onEventListener2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final void setOnKeyStatusChangeListener(final ExoMediaDrm.OnKeyStatusChangeListener<? super FrameworkMediaCrypto> onKeyStatusChangeListener) {
        MediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener2;
        if (Util.SDK_INT >= 23) {
            MediaDrm mediaDrm = this.mediaDrm;
            if (onKeyStatusChangeListener == null) {
                onKeyStatusChangeListener2 = null;
            } else {
                onKeyStatusChangeListener2 = new MediaDrm.OnKeyStatusChangeListener() { // from class: com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaDrm.2
                    @Override // android.media.MediaDrm.OnKeyStatusChangeListener
                    public void onKeyStatusChange(MediaDrm mediaDrm2, byte[] bArr, List<MediaDrm.KeyStatus> list, boolean z8) {
                        int statusCode;
                        byte[] keyId;
                        ArrayList arrayList = new ArrayList();
                        Iterator<MediaDrm.KeyStatus> it = list.iterator();
                        while (it.hasNext()) {
                            MediaDrm.KeyStatus a9 = b.a(it.next());
                            statusCode = a9.getStatusCode();
                            keyId = a9.getKeyId();
                            arrayList.add(new ExoMediaDrm.DefaultKeyStatus(statusCode, keyId));
                        }
                        onKeyStatusChangeListener.onKeyStatusChange(FrameworkMediaDrm.this, bArr, arrayList, z8);
                    }
                };
            }
            mediaDrm.setOnKeyStatusChangeListener(onKeyStatusChangeListener2, (Handler) null);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final void setPropertyByteArray(String str, byte[] bArr) {
        this.mediaDrm.setPropertyByteArray(str, bArr);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final void setPropertyString(String str, String str2) {
        this.mediaDrm.setPropertyString(str, str2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm
    public final FrameworkMediaCrypto createMediaCrypto(byte[] bArr) throws MediaCryptoException {
        return new FrameworkMediaCrypto(new MediaCrypto(this.uuid, bArr), Util.SDK_INT < 21 && C.WIDEVINE_UUID.equals(this.uuid) && "L3".equals(getPropertyString("securityLevel")));
    }
}
