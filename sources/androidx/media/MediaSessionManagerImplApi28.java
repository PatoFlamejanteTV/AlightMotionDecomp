package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import androidx.media.MediaSessionManager;

@RequiresApi(28)
/* loaded from: classes3.dex */
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {
    android.media.session.MediaSessionManager mObject;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaSessionManagerImplApi28(Context context) {
        super(context);
        this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        boolean isTrustedForMediaControl;
        if (remoteUserInfoImpl instanceof RemoteUserInfoImplApi28) {
            isTrustedForMediaControl = this.mObject.isTrustedForMediaControl(((RemoteUserInfoImplApi28) remoteUserInfoImpl).mObject);
            return isTrustedForMediaControl;
        }
        return false;
    }

    /* loaded from: classes3.dex */
    static final class RemoteUserInfoImplApi28 implements MediaSessionManager.RemoteUserInfoImpl {
        final MediaSessionManager.RemoteUserInfo mObject;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RemoteUserInfoImplApi28(String str, int i8, int i9) {
            this.mObject = j.a(str, i8, i9);
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteUserInfoImplApi28) {
                equals = this.mObject.equals(((RemoteUserInfoImplApi28) obj).mObject);
                return equals;
            }
            return false;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public String getPackageName() {
            String packageName;
            packageName = this.mObject.getPackageName();
            return packageName;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getPid() {
            int pid;
            pid = this.mObject.getPid();
            return pid;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getUid() {
            int uid;
            uid = this.mObject.getUid();
            return uid;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mObject);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RemoteUserInfoImplApi28(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.mObject = remoteUserInfo;
        }
    }
}
