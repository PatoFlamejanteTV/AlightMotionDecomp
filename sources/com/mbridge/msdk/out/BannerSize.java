package com.mbridge.msdk.out;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class BannerSize {
    public static final int DEV_SET_TYPE = 5;
    public static final int LARGE_TYPE = 1;
    public static final int MEDIUM_TYPE = 2;
    public static final int SMART_TYPE = 3;
    public static final int STANDARD_TYPE = 4;
    private int height;
    private int width;

    public BannerSize(int i8, int i9, int i10) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 == 5) {
                            this.height = i10;
                            this.width = i9;
                            return;
                        }
                        return;
                    }
                    this.height = 50;
                    this.width = 320;
                    return;
                }
                setSmartMode();
                return;
            }
            this.height = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
            this.width = 300;
            return;
        }
        this.height = 90;
        this.width = 320;
    }

    private void setSmartMode() {
        if (z.g(c.m().c()) < 720) {
            this.height = 50;
            this.width = 320;
        } else {
            this.height = 90;
            this.width = 728;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
