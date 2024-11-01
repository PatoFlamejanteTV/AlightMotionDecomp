package com.mbridge.msdk.playercommon.exoplayer2.drm;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public interface DefaultDrmSessionEventListener {

    /* loaded from: classes4.dex */
    public static final class EventDispatcher {
        private final CopyOnWriteArrayList<HandlerAndListener> listeners = new CopyOnWriteArrayList<>();

        /* loaded from: classes4.dex */
        private static final class HandlerAndListener {
            public final Handler handler;
            public final DefaultDrmSessionEventListener listener;

            public HandlerAndListener(Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
                this.handler = handler;
                this.listener = defaultDrmSessionEventListener;
            }
        }

        public final void addListener(Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
            boolean z8;
            if (handler != null && defaultDrmSessionEventListener != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkArgument(z8);
            this.listeners.add(new HandlerAndListener(handler, defaultDrmSessionEventListener));
        }

        public final void drmKeysLoaded() {
            Iterator<HandlerAndListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                HandlerAndListener next = it.next();
                final DefaultDrmSessionEventListener defaultDrmSessionEventListener = next.listener;
                next.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener.EventDispatcher.1
                    @Override // java.lang.Runnable
                    public void run() {
                        defaultDrmSessionEventListener.onDrmKeysLoaded();
                    }
                });
            }
        }

        public final void drmKeysRemoved() {
            Iterator<HandlerAndListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                HandlerAndListener next = it.next();
                final DefaultDrmSessionEventListener defaultDrmSessionEventListener = next.listener;
                next.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener.EventDispatcher.4
                    @Override // java.lang.Runnable
                    public void run() {
                        defaultDrmSessionEventListener.onDrmKeysRemoved();
                    }
                });
            }
        }

        public final void drmKeysRestored() {
            Iterator<HandlerAndListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                HandlerAndListener next = it.next();
                final DefaultDrmSessionEventListener defaultDrmSessionEventListener = next.listener;
                next.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener.EventDispatcher.3
                    @Override // java.lang.Runnable
                    public void run() {
                        defaultDrmSessionEventListener.onDrmKeysRestored();
                    }
                });
            }
        }

        public final void drmSessionManagerError(final Exception exc) {
            Iterator<HandlerAndListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                HandlerAndListener next = it.next();
                final DefaultDrmSessionEventListener defaultDrmSessionEventListener = next.listener;
                next.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener.EventDispatcher.2
                    @Override // java.lang.Runnable
                    public void run() {
                        defaultDrmSessionEventListener.onDrmSessionManagerError(exc);
                    }
                });
            }
        }

        public final void removeListener(DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
            Iterator<HandlerAndListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                HandlerAndListener next = it.next();
                if (next.listener == defaultDrmSessionEventListener) {
                    this.listeners.remove(next);
                }
            }
        }
    }

    void onDrmKeysLoaded();

    void onDrmKeysRemoved();

    void onDrmKeysRestored();

    void onDrmSessionManagerError(Exception exc);
}
