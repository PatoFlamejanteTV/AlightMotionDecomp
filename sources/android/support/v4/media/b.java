package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;

/* loaded from: classes.dex */
abstract class b {

    /* loaded from: classes.dex */
    interface a {
        void a();

        void c();

        void d();
    }

    /* renamed from: android.support.v4.media.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0292b extends MediaBrowser.ConnectionCallback {

        /* renamed from: a, reason: collision with root package name */
        protected final a f14281a;

        public C0292b(a aVar) {
            this.f14281a = aVar;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            this.f14281a.c();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            this.f14281a.d();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            this.f14281a.a();
        }
    }

    public static void a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    public static Object b(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    public static Object c(a aVar) {
        return new C0292b(aVar);
    }

    public static void d(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    public static Bundle e(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    public static Object f(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }
}
