package android.support.v4.media.session;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
abstract class c {

    /* loaded from: classes.dex */
    public interface a {
        void a(Bundle bundle);

        void b(Object obj);

        void c(List list);

        void d(int i8, int i9, int i10, int i11, int i12);

        void e(CharSequence charSequence);

        void f(Object obj);

        void g();

        void h(String str, Bundle bundle);
    }

    /* loaded from: classes.dex */
    static class b extends MediaController.Callback {

        /* renamed from: a, reason: collision with root package name */
        protected final a f14331a;

        public b(a aVar) {
            this.f14331a = aVar;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f14331a.d(playbackInfo.getPlaybackType(), C0296c.b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.f14331a.a(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f14331a.b(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f14331a.f(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List list) {
            this.f14331a.c(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f14331a.e(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.f14331a.g();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.f14331a.h(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0296c {
        public static AudioAttributes a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        public static int b(Object obj) {
            return c(a(obj));
        }

        private static int c(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static void a(Object obj) {
            ((MediaController.TransportControls) obj).fastForward();
        }

        public static void b(Object obj) {
            ((MediaController.TransportControls) obj).pause();
        }

        public static void c(Object obj) {
            ((MediaController.TransportControls) obj).play();
        }

        public static void d(Object obj) {
            ((MediaController.TransportControls) obj).rewind();
        }

        public static void e(Object obj, long j8) {
            ((MediaController.TransportControls) obj).seekTo(j8);
        }

        public static void f(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).sendCustomAction(str, bundle);
        }

        public static void g(Object obj) {
            ((MediaController.TransportControls) obj).skipToNext();
        }

        public static void h(Object obj) {
            ((MediaController.TransportControls) obj).skipToPrevious();
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static boolean b(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    public static Object c(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    public static Object d(Object obj) {
        return ((MediaController) obj).getMetadata();
    }

    public static Object e(Object obj) {
        return ((MediaController) obj).getPlaybackState();
    }

    public static Object f(Object obj) {
        return ((MediaController) obj).getTransportControls();
    }

    public static void g(Object obj, Object obj2, Handler handler) {
        ((MediaController) obj).registerCallback((MediaController.Callback) obj2, handler);
    }

    public static void h(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }

    public static void i(Object obj, Object obj2) {
        ((MediaController) obj).unregisterCallback((MediaController.Callback) obj2);
    }
}
