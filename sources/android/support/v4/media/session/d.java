package android.support.v4.media.session;

import android.media.session.MediaSession;

/* loaded from: classes.dex */
abstract class d {

    /* loaded from: classes.dex */
    static class a {
        public static Object a(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }

        public static long b(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }
    }

    public static Object a(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
