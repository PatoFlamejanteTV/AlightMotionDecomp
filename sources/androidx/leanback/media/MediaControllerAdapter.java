package androidx.leanback.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;

/* loaded from: classes3.dex */
public class MediaControllerAdapter extends PlayerAdapter {
    private static final boolean DEBUG = false;
    private static final String TAG = "MediaControllerAdapter";
    private MediaControllerCompat mController;
    Handler mHandler = new Handler();
    private final Runnable mPositionUpdaterRunnable = new Runnable() { // from class: androidx.leanback.media.MediaControllerAdapter.1
        @Override // java.lang.Runnable
        public void run() {
            MediaControllerAdapter.this.getCallback().onCurrentPositionChanged(MediaControllerAdapter.this);
            MediaControllerAdapter.this.mHandler.postDelayed(this, r0.getUpdatePeriod());
        }
    };
    boolean mIsBuffering = false;
    MediaControllerCompat.a mMediaControllerCallback = new MediaControllerCompat.a() { // from class: androidx.leanback.media.MediaControllerAdapter.2
        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaControllerAdapter.this.getCallback().onMetadataChanged(MediaControllerAdapter.this);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            if (MediaControllerAdapter.this.mIsBuffering && playbackStateCompat.s() != 6) {
                MediaControllerAdapter.this.getCallback().onBufferingStateChanged(MediaControllerAdapter.this, false);
                MediaControllerAdapter.this.getCallback().onBufferedPositionChanged(MediaControllerAdapter.this);
                MediaControllerAdapter.this.mIsBuffering = false;
            }
            if (playbackStateCompat.s() != 0) {
                if (playbackStateCompat.s() == 1) {
                    MediaControllerAdapter.this.getCallback().onPlayCompleted(MediaControllerAdapter.this);
                    return;
                }
                if (playbackStateCompat.s() == 2) {
                    MediaControllerAdapter.this.getCallback().onPlayStateChanged(MediaControllerAdapter.this);
                    MediaControllerAdapter.this.getCallback().onCurrentPositionChanged(MediaControllerAdapter.this);
                    return;
                }
                if (playbackStateCompat.s() == 3) {
                    MediaControllerAdapter.this.getCallback().onPlayStateChanged(MediaControllerAdapter.this);
                    MediaControllerAdapter.this.getCallback().onCurrentPositionChanged(MediaControllerAdapter.this);
                    return;
                }
                if (playbackStateCompat.s() == 6) {
                    MediaControllerAdapter mediaControllerAdapter = MediaControllerAdapter.this;
                    mediaControllerAdapter.mIsBuffering = true;
                    mediaControllerAdapter.getCallback().onBufferingStateChanged(MediaControllerAdapter.this, true);
                    MediaControllerAdapter.this.getCallback().onBufferedPositionChanged(MediaControllerAdapter.this);
                    return;
                }
                if (playbackStateCompat.s() == 7) {
                    if (playbackStateCompat.i() == null) {
                        MediaControllerAdapter.this.getCallback().onError(MediaControllerAdapter.this, playbackStateCompat.h(), "");
                        return;
                    } else {
                        MediaControllerAdapter.this.getCallback().onError(MediaControllerAdapter.this, playbackStateCompat.h(), playbackStateCompat.i().toString());
                        return;
                    }
                }
                if (playbackStateCompat.s() == 4) {
                    MediaControllerAdapter.this.getCallback().onPlayStateChanged(MediaControllerAdapter.this);
                    MediaControllerAdapter.this.getCallback().onCurrentPositionChanged(MediaControllerAdapter.this);
                } else if (playbackStateCompat.s() == 5) {
                    MediaControllerAdapter.this.getCallback().onPlayStateChanged(MediaControllerAdapter.this);
                    MediaControllerAdapter.this.getCallback().onCurrentPositionChanged(MediaControllerAdapter.this);
                }
            }
        }
    };

    public MediaControllerAdapter(MediaControllerCompat mediaControllerCompat) {
        if (mediaControllerCompat != null) {
            this.mController = mediaControllerCompat;
            return;
        }
        throw new NullPointerException("Object of MediaControllerCompat is null");
    }

    private int mapRepeatActionToRepeatMode(int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (i8 != 1) {
            return i8 != 2 ? -1 : 1;
        }
        return 2;
    }

    private int mapShuffleActionToShuffleMode(int i8) {
        if (i8 != 0) {
            return i8 != 1 ? -1 : 1;
        }
        return 0;
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void fastForward() {
        this.mController.d().a();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getBufferedPosition() {
        if (this.mController.c() == null) {
            return 0L;
        }
        return this.mController.c().f();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getCurrentPosition() {
        if (this.mController.c() == null) {
            return 0L;
        }
        return this.mController.c().p();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getDuration() {
        if (this.mController.b() == null) {
            return 0L;
        }
        return (int) this.mController.b().h("android.media.metadata.DURATION");
    }

    public Drawable getMediaArt(Context context) {
        Bitmap b9;
        if (this.mController.b() == null || (b9 = this.mController.b().f().b()) == null) {
            return null;
        }
        return new BitmapDrawable(context.getResources(), b9);
    }

    public MediaControllerCompat getMediaController() {
        return this.mController;
    }

    public CharSequence getMediaSubtitle() {
        if (this.mController.b() == null) {
            return "";
        }
        return this.mController.b().f().h();
    }

    public CharSequence getMediaTitle() {
        if (this.mController.b() == null) {
            return "";
        }
        return this.mController.b().f().i();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getSupportedActions() {
        long j8;
        if (this.mController.c() == null) {
            return 0L;
        }
        long b9 = this.mController.c().b();
        if ((b9 & 512) != 0) {
            j8 = 64;
        } else {
            j8 = 0;
        }
        if ((b9 & 32) != 0) {
            j8 |= 256;
        }
        if ((b9 & 16) != 0) {
            j8 |= 16;
        }
        if ((64 & b9) != 0) {
            j8 |= 128;
        }
        if ((8 & b9) != 0) {
            j8 |= 32;
        }
        if ((262144 & b9) != 0) {
            j8 |= 512;
        }
        if ((b9 & CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) != 0) {
            return j8 | 1024;
        }
        return j8;
    }

    int getUpdatePeriod() {
        return 16;
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public boolean isPlaying() {
        if (this.mController.c() == null) {
            return false;
        }
        if (this.mController.c().s() != 3 && this.mController.c().s() != 4 && this.mController.c().s() != 5) {
            return false;
        }
        return true;
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void next() {
        this.mController.d().h();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void onAttachedToHost(PlaybackGlueHost playbackGlueHost) {
        this.mController.e(this.mMediaControllerCallback);
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void onDetachedFromHost() {
        this.mController.g(this.mMediaControllerCallback);
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void pause() {
        this.mController.d().b();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void play() {
        this.mController.d().c();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void previous() {
        this.mController.d().i();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void rewind() {
        this.mController.d().d();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void seekTo(long j8) {
        this.mController.d().e(j8);
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void setProgressUpdatingEnabled(boolean z8) {
        this.mHandler.removeCallbacks(this.mPositionUpdaterRunnable);
        if (!z8) {
            return;
        }
        this.mHandler.postDelayed(this.mPositionUpdaterRunnable, getUpdatePeriod());
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void setRepeatAction(int i8) {
        this.mController.d().f(mapRepeatActionToRepeatMode(i8));
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void setShuffleAction(int i8) {
        this.mController.d().g(mapShuffleActionToShuffleMode(i8));
    }
}
