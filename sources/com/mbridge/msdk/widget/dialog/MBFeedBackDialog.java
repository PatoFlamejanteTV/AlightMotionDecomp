package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes4.dex */
public class MBFeedBackDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private Button f24420a;

    /* renamed from: b, reason: collision with root package name */
    private Button f24421b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f24422c;

    /* renamed from: d, reason: collision with root package name */
    private a f24423d;

    /* renamed from: e, reason: collision with root package name */
    private Button f24424e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f24425f;

    /* renamed from: g, reason: collision with root package name */
    private int f24426g;

    /* renamed from: h, reason: collision with root package name */
    private int f24427h;

    public MBFeedBackDialog(Context context, a aVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View inflate = LayoutInflater.from(context).inflate(v.a(context, "mbridge_cm_feedbackview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        setDialogWidthAndHeight(0.5f, 0.8f);
        this.f24423d = aVar;
        if (inflate != null) {
            setContentView(inflate);
            try {
                this.f24425f = (TextView) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e8) {
                ad.a("MBAlertDialog", e8.getMessage());
            }
            try {
                this.f24422c = (LinearLayout) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f24421b = (Button) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f24420a = (Button) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_cancel_button", "id"));
                this.f24424e = (Button) inflate.findViewById(v.a(context, "mbridge_video_common_alertview_private_action_button", "id"));
            } catch (Exception e9) {
                ad.a("MBAlertDialog", e9.getMessage());
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        Button button = this.f24420a;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBFeedBackDialog.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBFeedBackDialog.this.f24423d != null) {
                        MBFeedBackDialog.this.f24423d.a();
                    }
                    MBFeedBackDialog.this.dismiss();
                }
            });
        }
        Button button2 = this.f24421b;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBFeedBackDialog.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBFeedBackDialog.this.f24423d != null) {
                        MBFeedBackDialog.this.f24423d.b();
                    }
                    MBFeedBackDialog.this.dismiss();
                }
            });
        }
        Button button3 = this.f24424e;
        if (button3 != null) {
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBFeedBackDialog.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBFeedBackDialog.this.dismiss();
                    if (MBFeedBackDialog.this.f24423d != null) {
                        MBFeedBackDialog.this.f24423d.c();
                    }
                }
            });
        }
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.mbridge.msdk.widget.dialog.MBFeedBackDialog.4
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                if (MBFeedBackDialog.this.f24423d != null) {
                    MBFeedBackDialog.this.f24423d.b();
                }
            }
        });
    }

    public static boolean isScreenOrientationPortrait(Context context) {
        if (context.getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    public void clear() {
        if (this.f24423d != null) {
            this.f24423d = null;
        }
    }

    public a getListener() {
        return this.f24423d;
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            int i8 = Build.VERSION.SDK_INT;
            window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            if (i8 >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    public void setCancelButtonClickable(boolean z8) {
        Button button = this.f24420a;
        if (button != null) {
            button.setClickable(z8);
            if (z8) {
                this.f24420a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", c.m().g()));
                this.f24420a.setAlpha(1.0f);
            } else {
                this.f24420a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", c.m().g()));
                this.f24420a.setAlpha(0.4f);
            }
        }
    }

    public void setCancelText(String str) {
        Button button = this.f24420a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setConfirmText(String str) {
    }

    public void setContent(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.f24422c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = ai.a(c.m().c(), 16.0f);
            layoutParams.rightMargin = ai.a(c.m().c(), 16.0f);
            layoutParams.topMargin = ai.a(c.m().c(), 3.0f);
            layoutParams.bottomMargin = ai.a(c.m().c(), 3.0f);
            this.f24422c.addView(viewGroup, layoutParams);
        }
    }

    public void setDialogWidthAndHeight(float f8, float f9) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (isScreenOrientationPortrait(getContext())) {
            this.f24427h = displayMetrics.widthPixels;
            this.f24426g = displayMetrics.heightPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = (int) (this.f24426g * f9);
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            return;
        }
        this.f24427h = displayMetrics.heightPixels;
        this.f24426g = displayMetrics.widthPixels;
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.width = (int) (this.f24426g * f8);
        attributes2.height = -1;
        attributes2.gravity = 17;
        getWindow().setAttributes(attributes2);
    }

    public void setListener(a aVar) {
        this.f24423d = aVar;
    }

    public void setPrivacyText(String str) {
        Button button = this.f24424e;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f24425f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e8) {
            ad.b("MBAlertDialog", e8.getMessage());
            super.show();
        }
    }
}
