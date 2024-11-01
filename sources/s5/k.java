package s5;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class k {
    public static final void a(Context context, ImageView ivLikes) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(ivLikes, "ivLikes");
        if (!UptodownApp.f29249C.S()) {
            ivLikes.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_heart_red));
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.like_bounce);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.like_bounce_back);
            j jVar = new j(0.2d, 10.0d);
            loadAnimation.setInterpolator(jVar);
            loadAnimation2.setInterpolator(jVar);
            loadAnimation.setAnimationListener(new a(ivLikes, loadAnimation2));
            ivLikes.startAnimation(loadAnimation);
        }
    }

    /* loaded from: classes5.dex */
    public static final class a implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f39144a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Animation f39145b;

        a(ImageView imageView, Animation animation) {
            this.f39144a = imageView;
            this.f39145b = animation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f39144a.startAnimation(this.f39145b);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
