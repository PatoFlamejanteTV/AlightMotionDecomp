package s5;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class l implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39146a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(TextView textView) {
            AbstractC3292y.i(textView, "<this>");
            textView.setOnTouchListener(new l());
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v8, MotionEvent event) {
        int action;
        boolean z8;
        AbstractC3292y.i(v8, "v");
        AbstractC3292y.i(event, "event");
        TextView textView = (TextView) v8;
        CharSequence text = textView.getText();
        AbstractC3292y.h(text, "getText(...)");
        if ((text instanceof Spanned) && ((action = event.getAction()) == 0 || action == 1)) {
            int x8 = (int) event.getX();
            int y8 = (int) event.getY();
            int totalPaddingLeft = x8 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y8 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            AbstractC3292y.h(layout, "getLayout(...)");
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            AbstractC3292y.f(clickableSpanArr);
            if (clickableSpanArr.length == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(textView);
                }
                return true;
            }
        }
        return false;
    }
}
