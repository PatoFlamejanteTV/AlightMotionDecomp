package androidx.leanback.app;

import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.leanback.R;
import androidx.leanback.graphics.FitWidthBitmapDrawable;
import androidx.leanback.media.PlaybackGlue;
import androidx.leanback.media.PlaybackGlueHost;
import androidx.leanback.widget.DetailsParallaxDrawable;
import androidx.leanback.widget.ParallaxTarget;

/* loaded from: classes3.dex */
public class DetailsSupportFragmentBackgroundController {
    Bitmap mCoverBitmap;
    final DetailsSupportFragment mFragment;
    private Fragment mLastVideoSupportFragmentForGlueHost;
    DetailsParallaxDrawable mParallaxDrawable;
    int mParallaxDrawableMaxOffset;
    PlaybackGlue mPlaybackGlue;
    int mSolidColor;
    DetailsBackgroundVideoHelper mVideoHelper;
    boolean mCanUseHost = false;
    boolean mInitialControlVisible = false;

    public DetailsSupportFragmentBackgroundController(DetailsSupportFragment detailsSupportFragment) {
        if (detailsSupportFragment.mDetailsBackgroundController == null) {
            detailsSupportFragment.mDetailsBackgroundController = this;
            this.mFragment = detailsSupportFragment;
            return;
        }
        throw new IllegalStateException("Each DetailsSupportFragment is allowed to initialize DetailsSupportFragmentBackgroundController once");
    }

    public boolean canNavigateToVideoSupportFragment() {
        if (this.mPlaybackGlue != null) {
            return true;
        }
        return false;
    }

    PlaybackGlueHost createGlueHost() {
        PlaybackGlueHost onCreateGlueHost = onCreateGlueHost();
        if (this.mInitialControlVisible) {
            onCreateGlueHost.showControlsOverlay(false);
        } else {
            onCreateGlueHost.hideControlsOverlay(false);
        }
        return onCreateGlueHost;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean disableVideoParallax() {
        DetailsBackgroundVideoHelper detailsBackgroundVideoHelper = this.mVideoHelper;
        if (detailsBackgroundVideoHelper != null) {
            detailsBackgroundVideoHelper.stopParallax();
            return this.mVideoHelper.isVideoVisible();
        }
        return false;
    }

    public void enableParallax() {
        int i8 = this.mParallaxDrawableMaxOffset;
        if (i8 == 0) {
            i8 = this.mFragment.getContext().getResources().getDimensionPixelSize(R.dimen.lb_details_cover_drawable_parallax_movement);
        }
        FitWidthBitmapDrawable fitWidthBitmapDrawable = new FitWidthBitmapDrawable();
        enableParallax(fitWidthBitmapDrawable, new ColorDrawable(), new ParallaxTarget.PropertyValuesHolderTarget(fitWidthBitmapDrawable, PropertyValuesHolder.ofInt(FitWidthBitmapDrawable.PROPERTY_VERTICAL_OFFSET, 0, -i8)));
    }

    public final Fragment findOrCreateVideoSupportFragment() {
        return this.mFragment.findOrCreateVideoSupportFragment();
    }

    public final Drawable getBottomDrawable() {
        DetailsParallaxDrawable detailsParallaxDrawable = this.mParallaxDrawable;
        if (detailsParallaxDrawable == null) {
            return null;
        }
        return detailsParallaxDrawable.getBottomDrawable();
    }

    public final Bitmap getCoverBitmap() {
        return this.mCoverBitmap;
    }

    public final Drawable getCoverDrawable() {
        DetailsParallaxDrawable detailsParallaxDrawable = this.mParallaxDrawable;
        if (detailsParallaxDrawable == null) {
            return null;
        }
        return detailsParallaxDrawable.getCoverDrawable();
    }

    public final int getParallaxDrawableMaxOffset() {
        return this.mParallaxDrawableMaxOffset;
    }

    public final PlaybackGlue getPlaybackGlue() {
        return this.mPlaybackGlue;
    }

    @ColorInt
    public final int getSolidColor() {
        return this.mSolidColor;
    }

    public PlaybackGlueHost onCreateGlueHost() {
        return new VideoSupportFragmentGlueHost((VideoSupportFragment) findOrCreateVideoSupportFragment());
    }

    public Fragment onCreateVideoSupportFragment() {
        return new VideoSupportFragment();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onStart() {
        if (!this.mCanUseHost) {
            this.mCanUseHost = true;
            PlaybackGlue playbackGlue = this.mPlaybackGlue;
            if (playbackGlue != null) {
                playbackGlue.setHost(createGlueHost());
                this.mLastVideoSupportFragmentForGlueHost = findOrCreateVideoSupportFragment();
            }
        }
        PlaybackGlue playbackGlue2 = this.mPlaybackGlue;
        if (playbackGlue2 != null && playbackGlue2.isPrepared()) {
            this.mPlaybackGlue.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onStop() {
        PlaybackGlue playbackGlue = this.mPlaybackGlue;
        if (playbackGlue != null) {
            playbackGlue.pause();
        }
    }

    public final void setCoverBitmap(Bitmap bitmap) {
        this.mCoverBitmap = bitmap;
        Drawable coverDrawable = getCoverDrawable();
        if (coverDrawable instanceof FitWidthBitmapDrawable) {
            ((FitWidthBitmapDrawable) coverDrawable).setBitmap(this.mCoverBitmap);
        }
    }

    public final void setParallaxDrawableMaxOffset(int i8) {
        if (this.mParallaxDrawable == null) {
            this.mParallaxDrawableMaxOffset = i8;
            return;
        }
        throw new IllegalStateException("enableParallax already called");
    }

    public final void setSolidColor(@ColorInt int i8) {
        this.mSolidColor = i8;
        Drawable bottomDrawable = getBottomDrawable();
        if (bottomDrawable instanceof ColorDrawable) {
            ((ColorDrawable) bottomDrawable).setColor(i8);
        }
    }

    public void setupVideoPlayback(@NonNull PlaybackGlue playbackGlue) {
        PlaybackGlue playbackGlue2 = this.mPlaybackGlue;
        if (playbackGlue2 == playbackGlue) {
            return;
        }
        PlaybackGlueHost playbackGlueHost = null;
        if (playbackGlue2 != null) {
            PlaybackGlueHost host = playbackGlue2.getHost();
            this.mPlaybackGlue.setHost(null);
            playbackGlueHost = host;
        }
        this.mPlaybackGlue = playbackGlue;
        this.mVideoHelper.setPlaybackGlue(playbackGlue);
        if (this.mCanUseHost && this.mPlaybackGlue != null) {
            if (playbackGlueHost != null && this.mLastVideoSupportFragmentForGlueHost == findOrCreateVideoSupportFragment()) {
                this.mPlaybackGlue.setHost(playbackGlueHost);
            } else {
                this.mPlaybackGlue.setHost(createGlueHost());
                this.mLastVideoSupportFragmentForGlueHost = findOrCreateVideoSupportFragment();
            }
        }
    }

    public final void switchToRows() {
        this.mFragment.switchToRows();
    }

    public final void switchToVideo() {
        this.mFragment.switchToVideo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void switchToVideoBeforeCreate() {
        this.mVideoHelper.crossFadeBackgroundToVideo(true, true);
        this.mInitialControlVisible = true;
    }

    public void enableParallax(@NonNull Drawable drawable, @NonNull Drawable drawable2, @Nullable ParallaxTarget.PropertyValuesHolderTarget propertyValuesHolderTarget) {
        if (this.mParallaxDrawable != null) {
            return;
        }
        Bitmap bitmap = this.mCoverBitmap;
        if (bitmap != null && (drawable instanceof FitWidthBitmapDrawable)) {
            ((FitWidthBitmapDrawable) drawable).setBitmap(bitmap);
        }
        int i8 = this.mSolidColor;
        if (i8 != 0 && (drawable2 instanceof ColorDrawable)) {
            ((ColorDrawable) drawable2).setColor(i8);
        }
        if (this.mPlaybackGlue == null) {
            DetailsParallaxDrawable detailsParallaxDrawable = new DetailsParallaxDrawable(this.mFragment.getContext(), this.mFragment.getParallax(), drawable, drawable2, propertyValuesHolderTarget);
            this.mParallaxDrawable = detailsParallaxDrawable;
            this.mFragment.setBackgroundDrawable(detailsParallaxDrawable);
            this.mVideoHelper = new DetailsBackgroundVideoHelper(null, this.mFragment.getParallax(), this.mParallaxDrawable.getCoverDrawable());
            return;
        }
        throw new IllegalStateException("enableParallaxDrawable must be called before enableVideoPlayback");
    }
}
