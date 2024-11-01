package Y4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class D0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12122a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f12123b;

    /* renamed from: c, reason: collision with root package name */
    public final YouTubePlayerView f12124c;

    private D0(RelativeLayout relativeLayout, FrameLayout frameLayout, YouTubePlayerView youTubePlayerView) {
        this.f12122a = relativeLayout;
        this.f12123b = frameLayout;
        this.f12124c = youTubePlayerView;
    }

    public static D0 a(View view) {
        int i8 = R.id.youtube_full_screen;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.youtube_full_screen);
        if (frameLayout != null) {
            i8 = R.id.youtube_view;
            YouTubePlayerView youTubePlayerView = (YouTubePlayerView) ViewBindings.findChildViewById(view, R.id.youtube_view);
            if (youTubePlayerView != null) {
                return new D0((RelativeLayout) view, frameLayout, youTubePlayerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static D0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static D0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.video_youtube, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12122a;
    }
}
